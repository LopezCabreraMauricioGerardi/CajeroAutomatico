/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cajeroautomatico;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
   -la clase Deposito representa la interfaz gráfica para realizar depósitos en una 
   cuenta bancaria, permite al usuario seleccionar el monto a depositar y realizar 
   la operación, actualizando el saldo y guardando el registro del depósitoen un 
   archivo de registro ,esta clase extiende de javax.swing.JFrame y contiene métodos 
   para inicializar la interfaz, gestionar acciones del usuario, y realizar operaciones
   de depósito.
 */
public class Deposito extends javax.swing.JFrame {
//los atributos de la clase
    private double monto;
    private final String ci;
    private final String cuenta;
    private String cantidad;
    private ResourceBundle recursos;
    String idioma;
     
    /**
     aquie esta el constructor de la clase Deposito
     los paramaetros que se utilizan:
     * @param ci
     * @param cuenta
     * @param idioma
     @param (ci) es el número de identificación del cliente.
     @param (cuenta) el número de cuenta en la que se realizará el depósito
     @param (idioma) el idioma utilizado para localizar los recursos de texto
     */

    public Deposito(String ci, String cuenta, String idioma) {
        //inicialisando los atributos
        this.ci = ci;
        this.cuenta = cuenta;
        this.idioma = idioma;
         // la configuración de la localización y recursos de texto
        Locale locale = new Locale(idioma);
        ResourceBundle recursos = ResourceBundle.getBundle("textos", locale);
        // este es la inicialización de los componentes de la interfaz grafica
        initComponents();
        // configuración de la información de la cuenta en la interfaz
        lblNCuenta.setText(cuenta);
        lblMonto.setText("0.0");
        this.setLocationRelativeTo(this);
  
// aqui la configuración de las imágenes de los botones
        setImageButton(btnDoscientos, "src/Imgenes/b1.png");
        btnDoscientos.setOpaque(false);
        btnDoscientos.setContentAreaFilled(false);
        btnDoscientos.setBorderPainted(false);

        setImageButton(btnCien, "src/Imgenes/b1.png");
        btnCien.setOpaque(false);
        btnCien.setContentAreaFilled(false);
        btnCien.setBorderPainted(false);

        setImageButton(btnCincuenta, "src/Imgenes/b1.png");
        btnCincuenta.setOpaque(false);
        btnCincuenta.setContentAreaFilled(false);
        btnCincuenta.setBorderPainted(false);

        setImageButton(btnOtro, "src/Imgenes/b1.png");
        btnOtro.setOpaque(false);
        btnOtro.setContentAreaFilled(false);
        btnOtro.setBorderPainted(false);

        setImageButton(btnConfirmar, "src/Imgenes/b1.png");
        btnConfirmar.setOpaque(false);
        btnConfirmar.setContentAreaFilled(false);
        btnConfirmar.setBorderPainted(false);

        setImageButton(btnSalir, "src/Imgenes/b1.png");
        btnSalir.setOpaque(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setBorderPainted(false);

    }
    // Método initComponents() y otros métodos generados por el diseñador gráfico...
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCien = new javax.swing.JButton();
        btnOtro = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnDoscientos = new javax.swing.JButton();
        btnCincuenta = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblConfirmar = new javax.swing.JLabel();
        lblAtras = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblOtro = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        lblNCuenta = new javax.swing.JLabel();
        lblCuenta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));

        btnCien.setMaximumSize(new java.awt.Dimension(80, 80));
        btnCien.setMinimumSize(new java.awt.Dimension(80, 80));
        btnCien.setPreferredSize(new java.awt.Dimension(80, 80));
        btnCien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCienActionPerformed(evt);
            }
        });

        btnOtro.setMaximumSize(new java.awt.Dimension(80, 80));
        btnOtro.setMinimumSize(new java.awt.Dimension(80, 80));
        btnOtro.setPreferredSize(new java.awt.Dimension(80, 80));
        btnOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtroActionPerformed(evt);
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
                    .addComponent(btnOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(btnCien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 0));

        btnDoscientos.setMaximumSize(new java.awt.Dimension(80, 80));
        btnDoscientos.setMinimumSize(new java.awt.Dimension(80, 80));
        btnDoscientos.setOpaque(true);
        btnDoscientos.setPreferredSize(new java.awt.Dimension(80, 80));
        btnDoscientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoscientosActionPerformed(evt);
            }
        });

        btnCincuenta.setMaximumSize(new java.awt.Dimension(80, 80));
        btnCincuenta.setMinimumSize(new java.awt.Dimension(80, 80));
        btnCincuenta.setPreferredSize(new java.awt.Dimension(80, 80));
        btnCincuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincuentaActionPerformed(evt);
            }
        });

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
                    .addComponent(btnDoscientos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCincuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(btnDoscientos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnCincuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(504, 600));
        jPanel3.setMinimumSize(new java.awt.Dimension(504, 600));
        jPanel3.setPreferredSize(new java.awt.Dimension(504, 600));

        lblTitulo.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 204, 0));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("SELECCIONE EL MONTO A DEPOSITAR");

        lblConfirmar.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblConfirmar.setForeground(new java.awt.Color(0, 204, 51));
        lblConfirmar.setText("CONFIRMAR");

        lblAtras.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblAtras.setForeground(new java.awt.Color(0, 204, 51));
        lblAtras.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAtras.setText("ATRAS");

        jLabel12.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 51));
        jLabel12.setText("200");

        jLabel13.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 51));
        jLabel13.setText("50");

        jLabel14.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 204, 51));
        jLabel14.setText("100");

        lblOtro.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblOtro.setForeground(new java.awt.Color(0, 204, 51));
        lblOtro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOtro.setText("OTRO");

        lblMonto.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblMonto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMonto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblNCuenta.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N

        lblCuenta.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lblCuenta.setForeground(new java.awt.Color(0, 204, 51));
        lblCuenta.setText("N° CUENTA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(lblMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addGap(112, 112, 112)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblOtro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
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

    
    /**
     esta parte es el método para leer el saldo actual de la cuenta desde un archivo 
     @return y retorna el saldo actual de la cuenta como una cadena de texto
     */
    private String leerSaldo() {
          // Implementación del método...
        String saldoGuardado = null;
        try (BufferedReader br = new BufferedReader(new FileReader("src/Archivos/Saldo.txt"))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("N° DE CUENTA:") && linea.substring(linea.indexOf(":") + 1).trim().equals(cuenta)) {
                    while ((linea = br.readLine()) != null) {
                        if (linea.startsWith("SALDO:")) {
                            // Obtenemos el saldo asociado a la cuenta
                            saldoGuardado = linea.substring(linea.indexOf(":") + 1).trim();
                            break; // Salimos del bucle una vez que encontramos el saldo
                        }
                    }
                    break; // Salimos del bucle una vez que encontramos la cuenta
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return saldoGuardado;
    }
     /**
     método para realizar el depósito en la cuenta
     */
    private void depositar() {
         // Implementación del método...
        cantidad = lblMonto.getText();
        String saldo = leerSaldo(); // Obtenemos el saldo actual
        if (cantidad == "0.0") {
            JOptionPane optionPane = new JOptionPane("Ingrese un monto mayor a cero", JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Mensaje");
            dialog.setVisible(true);
        } else {
            guardarDeposito(saldo); // Pasamos el saldo actual al método guardarDeposito
        }

    }
/**
   guarda los detalles de un depósito en el archivo de movimientos y actualiza el 
   saldo en el archivo de saldo 
   @param (saldo) El saldo actual de la cuenta como cadena de texto.
 */
    private void guardarDeposito(String saldo) {
        // Obtiene la fecha y hora actuales
        LocalDateTime now = LocalDateTime.now();
        LocalDate fecha = now.toLocalDate(); 
        LocalTime hora = now.toLocalTime(); 
          // Formatea la fecha y hora
        DateTimeFormatter fechaFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedFecha = fecha.format(fechaFormatter);
        String formattedHora = hora.format(horaFormatter);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/Archivos/Movimientos.txt", true))) {
            // Convertimos la cantidad a un tipo numérico para poder sumarla al saldo
            double cantidadDouble = Double.parseDouble(cantidad);
            double saldoDouble = Double.parseDouble(saldo);

            double nuevoSaldo = cantidadDouble + saldoDouble; // Calculamos el nuevo saldo
             // Escribe los detalles del depósito en el archivo de movimientos
            bw.write("--------------------------------------------" + "\n"
                    + "FECHA: " + formattedFecha + "\n"
                    + "HORA: " + formattedHora + "\n"
                    + "N° DE CUENTA: " + cuenta + " \n"
                    + "TIPO DE MOVIMIENTO: DEPOSITO" + "\n"
                    + "CANTIDAD: " + cantidad + "\n"
                    + "--------------------------------------------");
            bw.newLine();
            // Muestra un mensaje de confirmación
            JOptionPane optionPane = new JOptionPane("Se realizó el depósito correctamente", JOptionPane.PLAIN_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
            JDialog dialog = optionPane.createDialog("Mensaje");
            Timer timer = new Timer(6000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dialog.dispose();
                }
            });
            timer.setRepeats(false); // Para que se ejecute solo una vez
            timer.start();
            dialog.setVisible(true);
            // Actualizamos el saldo en el archivo Saldo.txt
            actualizarSaldoEnArchivo(nuevoSaldo);

        } catch (IOException ex) {
            Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex) {
            // Manejamos la excepción si no se puede convertir la cantidad a un número
            JOptionPane optionPane = new JOptionPane("Error al convertir la cantidad a número.", JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Error");
            Timer timer = new Timer(1500, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dialog.dispose();
                }
            });
            Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
        }
        cantidad = "0.0";
        monto = 0;
    }
/**
    actualiza el saldo de una cuenta en el archivo(saldo)
    @param nuevoSaldo el nuevo saldo de la cuenta
 */
    private void actualizarSaldoEnArchivo(double nuevoSaldo) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/Archivos/Saldo.txt"))) {
            StringBuilder sb = new StringBuilder();
            String linea;

            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("N° DE CUENTA:") && linea.substring(linea.indexOf(":") + 1).trim().equals(cuenta)) {
                    sb.append(linea).append("\n"); // agregamos la línea de la cuenta
                    br.readLine(); // saltamos la línea del saldo anterior
                    sb.append("SALDO: ").append(nuevoSaldo).append("\n"); // Actualizamos el saldo
                } else {
                    sb.append(linea).append("\n"); // Conservamos las otras líneas
                }
            }

            // escribimos el nuevo contenido en el archivo
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/Archivos/Saldo.txt"))) {
                bw.write(sb.toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
        }
          // Crea una nueva instancia de la clase Sesion y actualiza su idioma
        Sesion sesion = new Sesion(ci, cuenta, idioma);
        sesion.cambiarIdioma(idioma);
        sesion.setVisible(true);
        dispose();
    }
     /**
     metodo para cambiar el idioma de la interfaz gráfica 
     @param idioma el nuevo idioma a utilizar.
     */
    public void cambiarIdioma(String idioma) {
        Locale locale = new Locale(idioma);
        recursos = ResourceBundle.getBundle("textos", locale);
        lblTitulo.setText(recursos.getString("etiqueta.tituloD"));
        lblCuenta.setText(recursos.getString("etiqueta.Ncuenta"));
        lblOtro.setText(recursos.getString("etiqueta.otro"));
        lblConfirmar.setText(recursos.getString("etiqueta.confirmar"));
        lblAtras.setText(recursos.getString("etiqueta.atras"));
    }
     /**
     método para establecer una imagen en un botón
     @param (buttonName) el botón al que se le asignará la imagen
     @param (root) la ruta o direccion de la imagen en el sistema de archivos
     */
    private void btnDoscientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoscientosActionPerformed
        monto += 200.0;
        String val = String.valueOf(monto);
        lblMonto.setText(val);
    }//GEN-LAST:event_btnDoscientosActionPerformed

    private void btnCienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCienActionPerformed
        monto += 100.0;
        String val = String.valueOf(monto);
        lblMonto.setText(val);
    }//GEN-LAST:event_btnCienActionPerformed

    private void btnCincuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincuentaActionPerformed
        monto += 50.0;
        String val = String.valueOf(monto);
        lblMonto.setText(val);
    }//GEN-LAST:event_btnCincuentaActionPerformed

    private void btnOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtroActionPerformed
        String OtroMonto = JOptionPane.showInputDialog(null, "Ingrese el monto:");
        double nMonto = Double.parseDouble(OtroMonto);
        monto += nMonto;
        String val = String.valueOf(monto);
        lblMonto.setText(val);
    }//GEN-LAST:event_btnOtroActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        leerSaldo();
        depositar();
        lblMonto.setText("0.0");

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Sesion sesion = new Sesion(ci, cuenta, idioma);
        sesion.cambiarIdioma(idioma);
        sesion.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void setImageButton(JButton buttonName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(buttonName.getWidth(), buttonName.getHeight(), Image.SCALE_DEFAULT));
        buttonName.setIcon(icon);
        this.repaint();
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCien;
    private javax.swing.JButton btnCincuenta;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnDoscientos;
    private javax.swing.JButton btnOtro;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblConfirmar;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblNCuenta;
    private javax.swing.JLabel lblOtro;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
