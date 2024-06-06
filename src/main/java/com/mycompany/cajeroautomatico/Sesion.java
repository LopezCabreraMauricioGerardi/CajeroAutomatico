/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cajeroautomatico;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/** la clase Sesion representa la ventana de sesion en una aplicacion bancaria y
    proporciona funcionalidades como ver detalles de la cuenta, depositar, retirar, transferir */
public class Sesion extends javax.swing.JFrame {
    
    // nuestras variables para almacenar informacion de la cuenta
    private String numeroCuenta;
    private String carnet;
    private String ci;
    private ResourceBundle recursos;
    String idioma;
     /** su constructor para la clase Sesion
      @param ci es el numero de identificacion del usuario
      @param numeroCuenta el numero de cuenta del usuario
      @param idioma la preferencia de idioma del usuario */
    
    public Sesion(String ci, String numeroCuenta , String idioma) {
         // aqui inicializa las variables de instancia
        this.idioma = idioma;
        this.ci = ci;
        Locale locale = new Locale(idioma);
        ResourceBundle recursos = ResourceBundle.getBundle("textos", locale);
        initComponents(); 
        this.numeroCuenta = numeroCuenta;
        obtenerNombreYActualizarLabels();
        this.setLocationRelativeTo(this);
        
         //en esta parte establecemos imagenes para los botones
        
        setImageButton(btnSaldo, "src/Imgenes/b1.png");
        btnSaldo.setOpaque(false);
        btnSaldo.setContentAreaFilled(false);
        btnSaldo.setBorderPainted(false);

        setImageButton(btnRetiro, "src/Imgenes/b1.png");
        btnRetiro.setOpaque(false);
        btnRetiro.setContentAreaFilled(false);
        btnRetiro.setBorderPainted(false);

        setImageButton(btnDeposito, "src/Imgenes/b1.png");
        btnDeposito.setOpaque(false);
        btnDeposito.setContentAreaFilled(false);
        btnDeposito.setBorderPainted(false);

        setImageButton(btnTransferencia, "src/Imgenes/b1.png");
        btnTransferencia.setOpaque(false);
        btnTransferencia.setContentAreaFilled(false);
        btnTransferencia.setBorderPainted(false);

        setImageButton(btnCambiar, "src/Imgenes/b1.png");
        btnCambiar.setOpaque(false);
        btnCambiar.setContentAreaFilled(false);
        btnCambiar.setBorderPainted(false);

        setImageButton(btnSalir, "src/Imgenes/b1.png");
        btnSalir.setOpaque(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setBorderPainted(false);
        
        setImageButton(btnadd, "src/Imgenes/add.png");
        btnadd.setOpaque(false);
        btnadd.setContentAreaFilled(false);
        btnadd.setBorderPainted(false);

    }
      
     //** esto es un metodo para leer la informacion de la cuenta desde un archivo y actualizar las etiquetas */
   private void obtenerNombreYActualizarLabels() {
    try (BufferedReader br = new BufferedReader(new FileReader("src/Archivos/Datos.txt"))) {
        String linea;
        String nombreGuardado = null;
        String apellidoGuardado = null;
        String carnetGuardado = null;

        while ((linea = br.readLine()) != null) {
             /*  Si encontramos el número de cuenta */
            if (linea.startsWith("N° DE CUENTA:") && linea.substring(linea.indexOf(":") + 1).trim().equals(numeroCuenta)) {
                br.close();
        } try(BufferedReader br2 = new BufferedReader(new FileReader("src/Archivos/Datos.txt"))){
                while ((linea = br2.readLine()) != null ) {
                    if (linea.startsWith("CI:")) {
                        /* Obtenemos el nombre asociado a la cuenta */
                        carnetGuardado = linea.substring(linea.indexOf(":") + 1).trim();
                    }else if (linea.startsWith("NOMBRE:")) {
                        /* Obtenemos el nombre asociado a la cuenta */
                        nombreGuardado = linea.substring(linea.indexOf(":") + 1).trim();
                    }else if (linea.startsWith("APELLIDO:")) {
                        /* Obtenemos el nombre asociado a la cuenta */
                        apellidoGuardado = linea.substring(linea.indexOf(":") + 1).trim();
                    }
                }
                carnet = carnetGuardado;
                /* salimos del bucle una vez que encontramos la cuenta */
                break; 
            }
        }

        /* si encontramos la cuenta, actualizamos los labels */
        if (nombreGuardado != null) {
            lblNombre.setText(nombreGuardado + " " + apellidoGuardado);
            lblCuenta.setText(numeroCuenta);
        } else {
             /* si no encontramos la cuenta, mostramos un mensaje */
            lblNombre.setText("Nombre: No encontrado");
            lblCuenta.setText("Cuenta: " + numeroCuenta);
        }

    } catch (IOException e) {
        e.printStackTrace();
        lblNombre.setText("Error al leer el archivo");
        lblCuenta.setText("Cuenta: " + numeroCuenta);
    }
}
   /**este metodo es para cambiar el idioma de la interfaz
       y el idioma que se establecerá @param idioma
     * @param idioma */
    
   public void cambiarIdioma(String idioma) {
        Locale locale = new Locale(idioma);
        recursos = ResourceBundle.getBundle("textos", locale);
          // aqui es donde se atualiza las etiquetas con textos especificos del idioma
        lblTitular.setText(recursos.getString("etiqueta.titular"));
        lblNcuenta.setText(recursos.getString("etiqueta.Ncuenta"));
        lblAgregar.setText(recursos.getString("etiqueta.agregar"));
        lblConsultarS.setText(recursos.getString("etiqueta.consultarS"));
        lblRetirar.setText(recursos.getString("etiqueta.retirar"));
        lblDepositar.setText(recursos.getString("etiqueta.depositar"));
        lblTransferir.setText(recursos.getString("etiqueta.transferir"));
        lblCambiarC.setText(recursos.getString("etiqueta.cambiarC"));
        lblSalir.setText(recursos.getString("etiqueta.salir"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRetiro = new javax.swing.JButton();
        btnTransferencia = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnSaldo = new javax.swing.JButton();
        btnDeposito = new javax.swing.JButton();
        btnCambiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblRetirar = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblCuenta = new javax.swing.JLabel();
        lblCambiarC = new javax.swing.JLabel();
        lblNcuenta = new javax.swing.JLabel();
        lblConsultarS = new javax.swing.JLabel();
        lblTransferir = new javax.swing.JLabel();
        lblDepositar = new javax.swing.JLabel();
        lblTitular = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        lblAgregar = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));

        btnRetiro.setMaximumSize(new java.awt.Dimension(80, 80));
        btnRetiro.setMinimumSize(new java.awt.Dimension(80, 80));
        btnRetiro.setPreferredSize(new java.awt.Dimension(80, 80));
        btnRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiroActionPerformed(evt);
            }
        });

        btnTransferencia.setMaximumSize(new java.awt.Dimension(80, 80));
        btnTransferencia.setMinimumSize(new java.awt.Dimension(80, 80));
        btnTransferencia.setPreferredSize(new java.awt.Dimension(80, 80));
        btnTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciaActionPerformed(evt);
            }
        });

        btnSalir.setMaximumSize(new java.awt.Dimension(80, 80));
        btnSalir.setMinimumSize(new java.awt.Dimension(80, 80));
        btnSalir.setPreferredSize(new java.awt.Dimension(80, 80));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(btnRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 0));

        btnSaldo.setMaximumSize(new java.awt.Dimension(80, 80));
        btnSaldo.setMinimumSize(new java.awt.Dimension(80, 80));
        btnSaldo.setOpaque(true);
        btnSaldo.setPreferredSize(new java.awt.Dimension(80, 80));
        btnSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldoActionPerformed(evt);
            }
        });

        btnDeposito.setMaximumSize(new java.awt.Dimension(80, 80));
        btnDeposito.setMinimumSize(new java.awt.Dimension(80, 80));
        btnDeposito.setPreferredSize(new java.awt.Dimension(80, 80));
        btnDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositoActionPerformed(evt);
            }
        });

        btnCambiar.setMaximumSize(new java.awt.Dimension(80, 80));
        btnCambiar.setMinimumSize(new java.awt.Dimension(80, 80));
        btnCambiar.setPreferredSize(new java.awt.Dimension(80, 80));
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnCambiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(btnSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(504, 600));
        jPanel3.setMinimumSize(new java.awt.Dimension(504, 600));
        jPanel3.setPreferredSize(new java.awt.Dimension(504, 600));

        lblRetirar.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblRetirar.setForeground(new java.awt.Color(0, 204, 51));
        lblRetirar.setText("RETIRAR");

        lblSalir.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(0, 204, 51));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSalir.setText("SALIR");

        lblCuenta.setBackground(new java.awt.Color(255, 255, 255));
        lblCuenta.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblCambiarC.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblCambiarC.setForeground(new java.awt.Color(0, 204, 51));
        lblCambiarC.setText("CAMBIAR CUENTA");

        lblNcuenta.setText("N° CUENTA");

        lblConsultarS.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblConsultarS.setForeground(new java.awt.Color(0, 204, 51));
        lblConsultarS.setText("CONSULTAR SALDO");

        lblTransferir.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblTransferir.setForeground(new java.awt.Color(0, 204, 51));
        lblTransferir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTransferir.setText("TRANSFERIR");

        lblDepositar.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblDepositar.setForeground(new java.awt.Color(0, 204, 51));
        lblDepositar.setText("DEPOSITAR");

        lblTitular.setText("NOMBRE TITULAR");

        btnadd.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnadd.setContentAreaFilled(false);
        btnadd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnadd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        lblAgregar.setText("AGREGAR CUENTA");

        lblNombre.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(105, 105, 105)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(lblAgregar)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(lblConsultarS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblRetirar))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblDepositar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblCambiarC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAgregar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(lblNcuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRetirar)
                    .addComponent(lblConsultarS))
                .addGap(107, 107, 107)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTransferir)
                    .addComponent(lblDepositar))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(lblSalir)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCambiarC)
                        .addGap(47, 47, 47))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   //** el boton de accion salir en esta ventana*/
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       VIdioma idioma = new VIdioma();
       idioma.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    
    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        String Cuenta = lblCuenta.getText();
        Agregar add = new Agregar(carnet, Cuenta, idioma);
        add.cambiarIdioma(idioma);
        add.setLocation(575, 200);
        add.setVisible(true);

    }//GEN-LAST:event_btnaddActionPerformed
      //** el boton de accion depositar en esta ventana*/
    private void btnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoActionPerformed
       String Cuenta = lblCuenta.getText();
       Deposito deposito = new Deposito(ci, Cuenta, idioma);
       deposito.cambiarIdioma(idioma);
       deposito.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnDepositoActionPerformed
          //** el boton de accion saldo en esta ventana*/
    private void btnSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldoActionPerformed
        Historial hist = new Historial(ci, numeroCuenta, idioma);
        hist.cambiarIdioma(idioma);
        hist.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnSaldoActionPerformed
          //** el boton de accion retiro en esta ventana*/
    private void btnRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiroActionPerformed
       String Cuenta = lblCuenta.getText();
       Retiro retiro = new Retiro(ci, Cuenta, idioma);
       retiro.cambiarIdioma(idioma);
       retiro.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnRetiroActionPerformed
       //** el boton de accion transferir en esta ventana*/
    private void btnTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferenciaActionPerformed
        String cuenta = lblCuenta.getText();
        ElegirT t = new ElegirT(carnet, cuenta, idioma);
        t.cambiarIdioma(idioma);
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTransferenciaActionPerformed
       //** el boton de accion cambiar en esta ventana*/
    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        Cuentas cuenta = new Cuentas(ci, idioma);
        cuenta.cambiarIdioma(idioma);
        cuenta.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCambiarActionPerformed
  
     //** el boton donde se le asigna una imagen al boton*/

    private void setImageButton(JButton buttonName, String root) {
    ImageIcon image = new ImageIcon(root);
    Icon icon = new ImageIcon(image.getImage().getScaledInstance(buttonName.getWidth(), buttonName.getHeight(), Image.SCALE_DEFAULT));
    buttonName.setIcon(icon);
    this.repaint();
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnRetiro;
    private javax.swing.JButton btnSaldo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTransferencia;
    private javax.swing.JButton btnadd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblCambiarC;
    private javax.swing.JLabel lblConsultarS;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblDepositar;
    private javax.swing.JLabel lblNcuenta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRetirar;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblTitular;
    private javax.swing.JLabel lblTransferir;
    // End of variables declaration//GEN-END:variables

    void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
