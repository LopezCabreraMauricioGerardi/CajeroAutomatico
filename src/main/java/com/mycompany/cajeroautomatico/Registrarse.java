/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cajeroautomatico;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
/** esta es la clase que representa la ventana de registro del usuarios */

public class Registrarse extends javax.swing.JFrame {
    // las declaracioones de variables de instancia
    
    String numeroDeCuenta;
    String ci;
    String nombre;
    String apellido;
    String direccion;
    String email;
    String telefono;
    String tipoCuenta;
    String contraseña;
    String verificar;
    String saldo;
    String contraseñaEncriptada;
    private ResourceBundle recursos;
    String idioma;
     private static final String ALGORITHM = "AES";
    private static final String KEY = "mysecretpassword"; // Clave secreta para el cifrado

   
    /** el constructor de la clase
     tiene como parametro @param idioma el idioma en el que se mostraran los textos
     * @param idioma */
    public Registrarse(String idioma) {
        // la inicializacion de componentes y configuracion de la localizacion
        initComponents();
        this.setLocationRelativeTo(this);
        this.idioma = idioma;
        Locale locale = new Locale(idioma);
        recursos = ResourceBundle.getBundle("textos", locale);
    // la coonfiguracion de los botones
        setImageButton(btnUno, "src/Imgenes/b1.png");
        btnUno.setOpaque(false);
        btnUno.setContentAreaFilled(false);
        btnUno.setBorderPainted(false);

        setImageButton(btnDos, "src/Imgenes/b1.png");
        btnDos.setOpaque(false);
        btnDos.setContentAreaFilled(false);
        btnDos.setBorderPainted(false);

        setImageButton(btnIniciarSesion, "src/Imgenes/b1.png");
        btnIniciarSesion.setOpaque(false);
        btnIniciarSesion.setContentAreaFilled(false);
        btnIniciarSesion.setBorderPainted(false);

        setImageButton(btnRegistrase, "src/Imgenes/b1.png");
        btnRegistrase.setOpaque(false);
        btnRegistrase.setContentAreaFilled(false);
        btnRegistrase.setBorderPainted(false);

        setImageButton(btnConfirmar, "src/Imgenes/b1.png");
        btnConfirmar.setOpaque(false);
        btnConfirmar.setContentAreaFilled(false);
        btnConfirmar.setBorderPainted(false);

        setImageButton(btnAtras, "src/Imgenes/b1.png");
        btnAtras.setOpaque(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setBorderPainted(false);

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDos = new javax.swing.JButton();
        btnRegistrase = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnUno = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblCi = new javax.swing.JLabel();
        txtCarnet = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblConfirmar = new javax.swing.JLabel();
        lblAtras = new javax.swing.JLabel();
        lblTCuenta = new javax.swing.JLabel();
        bol = new javax.swing.JCheckBox();
        dol = new javax.swing.JCheckBox();
        eur = new javax.swing.JCheckBox();
        lblNCuenta = new javax.swing.JLabel();
        lCuenta = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        contra2 = new javax.swing.JPasswordField();
        contra1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));

        btnDos.setMaximumSize(new java.awt.Dimension(80, 80));
        btnDos.setMinimumSize(new java.awt.Dimension(80, 80));
        btnDos.setPreferredSize(new java.awt.Dimension(80, 80));

        btnRegistrase.setMaximumSize(new java.awt.Dimension(80, 80));
        btnRegistrase.setMinimumSize(new java.awt.Dimension(80, 80));
        btnRegistrase.setPreferredSize(new java.awt.Dimension(80, 80));

        btnAtras.setMaximumSize(new java.awt.Dimension(80, 80));
        btnAtras.setMinimumSize(new java.awt.Dimension(80, 80));
        btnAtras.setPreferredSize(new java.awt.Dimension(80, 80));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnRegistrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 0));

        btnUno.setMaximumSize(new java.awt.Dimension(80, 80));
        btnUno.setMinimumSize(new java.awt.Dimension(80, 80));
        btnUno.setOpaque(true);
        btnUno.setPreferredSize(new java.awt.Dimension(80, 80));

        btnIniciarSesion.setMaximumSize(new java.awt.Dimension(80, 80));
        btnIniciarSesion.setMinimumSize(new java.awt.Dimension(80, 80));
        btnIniciarSesion.setPreferredSize(new java.awt.Dimension(80, 80));

        btnConfirmar.setMaximumSize(new java.awt.Dimension(80, 80));
        btnConfirmar.setMinimumSize(new java.awt.Dimension(80, 80));
        btnConfirmar.setPreferredSize(new java.awt.Dimension(80, 80));
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(504, 600));
        jPanel3.setMinimumSize(new java.awt.Dimension(504, 600));
        jPanel3.setPreferredSize(new java.awt.Dimension(504, 600));

        lblCi.setText("CI :");

        lblNombre.setText("NOMBRE :");

        lblApellido.setText("APELLIDO :");

        lblDireccion.setText("DIRECCION :");

        lblEmail.setText("EMAIL :");

        lblCelular.setText("CELULAR :");

        lblTitulo.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 204, 51));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("POR FAVOR INGRESE SUS DATOS");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblConfirmar.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblConfirmar.setForeground(new java.awt.Color(0, 204, 51));
        lblConfirmar.setText("CONFIRMAR");

        lblAtras.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblAtras.setForeground(new java.awt.Color(0, 204, 51));
        lblAtras.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAtras.setText("ATRAS");

        lblTCuenta.setText("TIPO CUENTA :");

        bol.setText("BOLIVIANOS");
        bol.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                bolItemStateChanged(evt);
            }
        });

        dol.setText("DOLARES");
        dol.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dolItemStateChanged(evt);
            }
        });

        eur.setText("EUROS");
        eur.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                eurItemStateChanged(evt);
            }
        });

        lblNCuenta.setText("N° CUENTA");

        lCuenta.setBackground(new java.awt.Color(255, 255, 255));
        lCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblContraseña.setText("CONTRESEÑA :  ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblTCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dol, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bol)
                            .addComponent(eur, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(236, 236, 236))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(lblCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(lblCi, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblNCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(contra2)
                                    .addComponent(contra1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))))
                        .addContainerGap(76, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCi)
                    .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelular)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTCuenta)
                    .addComponent(bol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNCuenta)
                    .addComponent(lCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña)
                    .addComponent(contra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmar)
                    .addComponent(lblAtras))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     /** este es un  metodo para generar un numero de cuenta para los usuarios
     como parametro @param inicio el inicio del número de cuenta  */
    private void generarNumeroDeCuenta(int inicio) {
        // Crear un numero aleatorio de 8 dígitos
        Random random = new Random();
        int numeroAleatorio = random.nextInt(90000000) + 10000000;

        // Concatenar el inicio y el numero aleatorio para formar el número de cuenta
        numeroDeCuenta = String.valueOf(inicio) + String.valueOf(numeroAleatorio);
        lCuenta.setText(numeroDeCuenta);
    }

     /** este metodo _es para obtener los datos ingresados por el usuario */
    public void obtenerDatos() {
        ci = txtCarnet.getText();
        nombre = jTextField2.getText();
        apellido = jTextField3.getText();
        direccion = jTextField4.getText();
        email = jTextField5.getText();
        telefono = jTextField6.getText();
        contraseña = new String(contra1.getPassword());
        verificar = new String(contra2.getPassword());
        saldo = "0.0";
    }

    
    /** este otro metodo es para guardar los datos ingresados por el usuario.
     */
   private void guardarDatos() {
        // luego pasa a aqui para verificar que todos los campos esten completos
    if ((!ci.trim().isEmpty()) && (!nombre.trim().isEmpty()) && (!apellido.trim().isEmpty()) && (!direccion.trim().isEmpty()) && (!telefono.trim().isEmpty()) && (tipoCuenta != null) && (!contraseña.trim().isEmpty()) && (!verificar.trim().isEmpty())) {
        if (contraseña.equals(verificar)) {
            // luego de verificacion realiza la encriptacion de la contraseña
          contraseñaEncriptada = encriptarContraseña(contraseña);

            try {
                // Crear un FileWriter con el modo de agregar al archivo (true)
                FileWriter fileWriter = new FileWriter("src/Archivos/Datos.txt", true);

                // Crear un BufferedWriter para escribir en el archivo
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                // Escribir los datos en el archivo separados por comas
                bufferedWriter.write("--------------------------------------------\n"
                        + "CI: " + ci + "\n"
                        + "NOMBRE: " + nombre + "\n"
                        + "APELLIDO: " + apellido + "\n"
                        + "DIRECCION: " + direccion + "\n"
                        + "EMAIL: " + email + "\n"
                        + "TELEFONO: " + telefono + "\n"
                        + "TIPO DE CUENTA: " + tipoCuenta + "\n"
                        + "N° DE CUENTA: " + numeroDeCuenta + "\n"
                        + "SALDO CUENTA:" + saldo + "\n"
                        + "CONTRASEÑA: " + contraseñaEncriptada + "\n"
                        + "--------------------------------------------");
                // agregar un salto de línea al final
                bufferedWriter.newLine();

                // cerrar el BufferedWriter
                bufferedWriter.close();
                guardarDatos2();
                guardarDatos3();
                Pantalla1 p1 = new Pantalla1(idioma);
                p1.cambiarIdioma(idioma);
                p1.setVisible(true);
                dispose();

            } catch (IOException e) {
                System.err.println("Error al guardar los datos en el archivo: " + e.getMessage());
            }
            limpiarDatos();

        } else {
           // aqui mostrara un mensaje de error si las contraseñas no coinciden
            JOptionPane optionPane = new JOptionPane("Contraseña no identica", JOptionPane.ERROR_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
            JDialog dialog = optionPane.createDialog("Mensaje");
            Timer timer = new Timer(5000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dialog.dispose();
                }
            });
            
            /* Para que se ejecute solo una vez   */
            timer.setRepeats(false);
            timer.start();
            dialog.setVisible(true);
        }
    } else {
          // aqui mostrara el mensaje de error si no se completaron todos los campos
        JOptionPane optionPane = new JOptionPane("Llene todos los espacios", JOptionPane.ERROR_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
        JDialog dialog = optionPane.createDialog("Mensaje");
        Timer timer = new Timer(5000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
            
        /* Para que se ejecute solo una vez */
        timer.setRepeats(false); 
        timer.start();
        dialog.setVisible(true);
    }
}
    /** aqui guarda los datos de la cuenta en un archivo de texto */

    private void guardarDatos2() {

        try {
            /* Crear un FileWriter con el modo de agregar al archivo (true) */
           
            FileWriter fileWriter = new FileWriter("src/Archivos/DatosCuenta.txt", true);

            /* crear un BufferedWriter para escribir en el archivo¨*/
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            /* Escribir los datos en el archivo separados por comas */
            bufferedWriter.write("--------------------------------------------\n"
                    + "CI: " + ci + "\n"
                    + "N° DE CUENTA: " + numeroDeCuenta + "\n"
                    + "CONTRASEÑA: " + contraseñaEncriptada + "\n"
                    + "--------------------------------------------");
            /*Agregar un salto de línea al final */
            bufferedWriter.newLine();

            /* cerrar el BufferedWriter */
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Error al guardar los datos en el archivo: " + e.getMessage());
        }

    }
     /** aqui igual guardara los datos del saldo en un archivo de texto.
     */

    private void guardarDatos3() {

        try {
            /* Crear un FileWriter con el modo de agregar al archivo (true)*/
            FileWriter fileWriter = new FileWriter("src/Archivos/Saldo.txt", true);

            /* Crear un BufferedWriter para escribir en el archivo */
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            /* Escribir los datos en el archivo separados por comas */
            bufferedWriter.write("--------------------------------------------\n"
                    + "N° DE CUENTA: " + numeroDeCuenta + "\n"
                    + "CI: " + ci + "\n"
                    + "SALDO: " + saldo + "\n"
                    + "--------------------------------------------");
            /* agregar un salto de línea al final */
            bufferedWriter.newLine();

            /* cerrar el BufferedWriter */
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Error al guardar los datos en el archivo: " + e.getMessage());
        }

    }
/** en esta parte limpia los campos de entrada de datos */
    private void limpiarDatos() {
        txtCarnet.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        bol.setSelected(false);
        dol.setSelected(false);
        eur.setSelected(false);
        lCuenta.setText("");
        jTextField6.setText("");
        contra1.setText("");
        contra2.setText("");
    }
    /** aqui el metodo para cambiar el idioma de la interfaz de usuario 
      y como parametro: @param idioma el nuevo idioma a establecer deacuerdo a la seleccion del usuari
     * @param idiomao*/
    
    public void cambiarIdioma(String idioma) {
        Locale locale = new Locale(idioma);
        recursos = ResourceBundle.getBundle("textos", locale);
        
        // en esta parte se actualizara los textos de los componentes de la interfaz de usuario
        //osea esta todo los nombres de cada boton, titulos,todo con lo que el usuario va interactuar 
        //para que entienda en su idioma
        
        lblTitulo.setText(recursos.getString("etiqueta.titulo"));
        lblCi.setText(recursos.getString("etiqueta.ci"));
        lblNombre.setText(recursos.getString("etiqueta.nombre"));
        lblApellido.setText(recursos.getString("etiqueta.apellido"));
        lblCelular.setText(recursos.getString("etiqueta.celular"));
        lblDireccion.setText(recursos.getString("etiqueta.direccion"));
        lblEmail.setText(recursos.getString("etiqueta.email"));
        lblNCuenta.setText(recursos.getString("etiqueta.Ncuenta"));
        lblTCuenta.setText(recursos.getString("etiqueta.Tcuenta"));
        lblContraseña.setText(recursos.getString("etiqueta.contraseña"));
        lblConfirmar.setText(recursos.getString("etiqueta.confirmar"));
        lblAtras.setText(recursos.getString("etiqueta.atras"));
        bol.setText(recursos.getString("etiqueta.bolivianos"));
        dol.setText(recursos.getString("etiqueta.dolares"));
        eur.setText(recursos.getString("etiqueta.euros"));
    }
    
    
/** este es metodo para encriptar una contraseña utilizando AES.
 como parametro @param password la contraseña a encriptar y
     * @param password
 @return y nos retrona a contraseña encriptada en formato Base64 */
    
    public static String encriptarContraseña(String password) {
        try {
            SecretKeySpec secretKey = new SecretKeySpec(KEY.getBytes(StandardCharsets.UTF_8), ALGORITHM);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = cipher.doFinal(password.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    } 
    
 //**el boton donde pasara a la siguiente accion, primero obtendra y verificara los datos*/
    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
    obtenerDatos();
    guardarDatos();
    

    }//GEN-LAST:event_btnConfirmarActionPerformed
     //** el boton de volver atras para que pueda cambiar de idioma */
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Pantalla1 p1 = new Pantalla1(idioma);
        p1.cambiarIdioma(idioma);
        p1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed
    //** la imagen del boton*/
    private void setImageButton(JButton buttonName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(buttonName.getWidth(), buttonName.getHeight(), Image.SCALE_DEFAULT));
        buttonName.setIcon(icon);
        this.repaint();
    }
    
     //** el item de la moneda en bolivamos*/
    private void bolItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_bolItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            /* si se marca la casilla de verificación de la moneda en bolivianos, deshabilitara las demas opciones */
            generarNumeroDeCuenta(1);
            tipoCuenta = "Bolivianos";
            dol.setEnabled(false);
            eur.setEnabled(false);

        } else {
           /* si se desmarca la casilla de verificacion de la moneda en bolivianos, habilitara las otras opciones */
            dol.setEnabled(true);
            eur.setEnabled(true);
            lCuenta.setText(" ");
        }
    }//GEN-LAST:event_bolItemStateChanged
    //** el item de la moneda en dolares*/
    private void dolItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dolItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            /* si se marca la casilla de verificación de la moneda en dolares, deshabilitara las demas opciones */
            generarNumeroDeCuenta(2);
            tipoCuenta = "Dolares";
            bol.setEnabled(false);
            eur.setEnabled(false);

        } else {
            /* si se desmarca la casilla de verificacion de la moneda en dolares, habilitara las otras opciones */
            bol.setEnabled(true);
            eur.setEnabled(true);
            lCuenta.setText(" ");
        }
    }//GEN-LAST:event_dolItemStateChanged
    //** el item de la moneda en euros*/
    private void eurItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_eurItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
           /* si se marca la casilla de verificación de la moneda en euros, deshabilitara las demas opciones */
            generarNumeroDeCuenta(3);
            tipoCuenta = "Euros";
            bol.setEnabled(false);
            dol.setEnabled(false);

        } else {
             /* si se desmarca la casilla de verificacion de la moneda en euros, habilitara las otras opciones */
            bol.setEnabled(true);
            dol.setEnabled(true);
            lCuenta.setText(" ");
        }
    }//GEN-LAST:event_eurItemStateChanged

    /* @param args los argumentos de la línea de comando */


    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox bol;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistrase;
    private javax.swing.JButton btnUno;
    private javax.swing.JPasswordField contra1;
    private javax.swing.JPasswordField contra2;
    private javax.swing.JCheckBox dol;
    private javax.swing.JCheckBox eur;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lCuenta;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCi;
    private javax.swing.JLabel lblConfirmar;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNCuenta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTCuenta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCarnet;
    // End of variables declaration//GEN-END:variables
}
