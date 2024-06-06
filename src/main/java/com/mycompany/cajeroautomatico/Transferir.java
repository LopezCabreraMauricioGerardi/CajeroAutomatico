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
import java.math.BigDecimal;
import java.math.RoundingMode;
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
 * esta clase Transferir representa una ventana de interfaz gráfica para realizar 
   transferencias de dinero entre cuentas, permite al usuario seleccionar un monto 
   predefinido o ingresar un monto personalizado y luego confirmar la transferencia.
 */

public class Transferir extends javax.swing.JFrame {

    private double monto;
    private final String ci;
    private final String cuenta;
    private final String cuentaT;
    private double conversion;
    private String cantidad;
    private ResourceBundle recursos;
    String idioma;
    String otroMonto;
    /** como siempre su constructor
       que recibe los parametros @param ci Identificación del usuario
     * @param ci
       @param cuenta cuenta de origen
       @param cuentaT cuenta de destino
       @param idioma el idioma seleccionado para la interfaz
     */

    public Transferir(String ci, String cuenta, String cuentaT, String idioma) {
        this.ci = ci;
        this.cuenta = cuenta;
        this.cuentaT = cuentaT;
        this.idioma = idioma;
        Locale locale = new Locale(idioma);
        ResourceBundle recursos = ResourceBundle.getBundle("textos", locale);
        initComponents();
        lblcuenta.setText(cuenta);
        lblcuentaT.setText(cuentaT);
        lblMonto.setText("0.0");
        this.setLocationRelativeTo(this);

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
        lblSalir = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblOtro = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        lblcuenta = new javax.swing.JLabel();
        lblcuentaT = new javax.swing.JLabel();
        lblOrigen = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();

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
        lblTitulo.setText("SELECCIONE EL MONTO A TRANSFERIR");

        lblConfirmar.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblConfirmar.setForeground(new java.awt.Color(0, 204, 51));
        lblConfirmar.setText("CONFIRMAR");

        lblSalir.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(0, 204, 51));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSalir.setText("SALIR");

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

        lblcuenta.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        lblcuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblcuentaT.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        lblcuentaT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblOrigen.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lblOrigen.setForeground(new java.awt.Color(0, 204, 51));
        lblOrigen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrigen.setText("ORIGEN");

        lblDestino.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lblDestino.setForeground(new java.awt.Color(0, 204, 51));
        lblDestino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDestino.setText("DESTINO");

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
                                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(lblMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcuentaT, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrigen)
                    .addComponent(lblDestino))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcuentaT, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addGap(112, 112, 112)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblOtro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmar)
                    .addComponent(lblSalir))
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
     aqui lee el saldo de la cuenta de origen desde un archivo
     @return aquie devuelve el saldo de la cuenta de origen de  usuario
     */
    private String leerSaldo() {
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
     esta parte lee el saldo de la cuenta de destino desde un archivo
     @return y nos retornara el saldo de la cuenta de destino ya sea propia o terceros
     */
    private String leerSaldoT() {
        String saldoGuardado = null;
        String ciTGuardado = null;
        try (BufferedReader br = new BufferedReader(new FileReader("src/Archivos/Saldo.txt"))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("N° DE CUENTA:") && linea.substring(linea.indexOf(":") + 1).trim().equals(cuentaT)) {
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
     y realiza la transferencia de dinero entre las cuentas
     */
    private void transferir() {
        cantidad = lblMonto.getText();
        String saldo = leerSaldo(); // Obtenemos el saldo actual
        String saldoT = leerSaldoT();
        double cantidadDouble = Double.parseDouble(cantidad);
        double saldoDouble = Double.parseDouble(saldo);
        if (cantidadDouble != 0.0) {
            if ((cantidadDouble < saldoDouble) && (cantidadDouble != 0)) {
                convertir(cantidadDouble, cuenta, cuentaT, saldoT);
                guardarTransferencia(saldo); // Pasamos el saldo actual al método guardarDeposito
                
            } else {
                JOptionPane optionPane = new JOptionPane("El monto a transferir es mayor al saldo disponible.", JOptionPane.ERROR_MESSAGE, JOptionPane.DEFAULT_OPTION);
                JDialog dialog = optionPane.createDialog("Mensaje");
                dialog.setVisible(true);
                return; // Salimos del método si el monto es mayor que el saldo
            }
        } else {
            JOptionPane optionPane = new JOptionPane("Ingrese un monto mayor a cero", JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Mensaje");
            dialog.setVisible(true);
        }

    }
 /**
     * Convierte el monto a transferir basado en las cuentas de origen y destino
     @param cantidad el monto a transferir
     @param cuenta la cuenta de origen(usuario)
     @param cuentaT la cuenta de destino propia o de terceros
     @param saldoT es el saldo de la cuenta de destino
     */
    private void convertir(double cantidad, String cuenta, String cuentaT, String saldoT) {
        char pDigito = cuenta.charAt(0);
        char pDigitoR = cuentaT.charAt(0);
        String str;
        double nCantidad;

        switch (pDigito) {
            case '1':
                switch (pDigitoR) {
                    case '1':
                        cantidad = cantidad * 1;
                        break;
                    case '2':
                        cantidad = cantidad / 6.97;
                        break;
                    case '3':
                        cantidad = cantidad / 7.48;
                        break;
                    default:
                        System.out.println("Número de cuenta inválido");
                        return; // No es necesario continuar si es inválido
                }
                break;
            case '2':
                switch (pDigitoR) {
                    case '1':
                        cantidad = cantidad * 6.97;
                        break;
                    case '2':
                        cantidad = cantidad * 1;
                        break;
                    case '3':
                        cantidad = cantidad * 0.92;
                        break;
                    default:
                        System.out.println("Número de cuenta inválido");
                        return;
                }
                break;
            case '3':
                switch (pDigitoR) {
                    case '1':
                        cantidad = cantidad * 7.42;
                        break;
                    case '2':
                        cantidad = cantidad / 1.09;
                        break;
                    case '3':
                        cantidad = cantidad * 1;
                        break;
                    default:
                        System.out.println("Número de cuenta inválido");
                        return;
                }
                break;
            default:
                System.out.println("Número de cuenta inválido");
                return;
        }
      
        BigDecimal bd = new BigDecimal(cantidad).setScale(2, RoundingMode.HALF_UP);
        nCantidad = bd.doubleValue();
        str = Double.toString(nCantidad);
        guardarTransferenciaT(str, saldoT);
    }
    /** guarda la transferencia realizada actual 
        @param saldo actualiza el saldo de la cuenta origen */
    private void guardarTransferencia(String saldo) {
        LocalDateTime now = LocalDateTime.now();
        LocalDate fecha = now.toLocalDate(); 
        LocalTime hora = now.toLocalTime(); 
        DateTimeFormatter fechaFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedFecha = fecha.format(fechaFormatter);
        String formattedHora = hora.format(horaFormatter);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/Archivos/Movimientos.txt", true))) {
            // Convertimos la cantidad a un tipo numérico para poder sumarla al saldo
            double cantidadDouble = Double.parseDouble(cantidad);
            double saldoDouble = Double.parseDouble(saldo);

            double nuevoSaldo = saldoDouble - cantidadDouble; // Calculamos el nuevo saldo

            bw.write("--------------------------------------------" + "\n"
                    + "FECHA: " + formattedFecha + "\n"
                    + "HORA: " + formattedHora + "\n"
                    + "N° DE CUENTA ORIGEN: " + cuenta + " \n"
                    + "N° DE CUENTA DESTINO: " + cuentaT + " \n"
                    + "TIPO DE MOVIMIENTO: TRANSFERENCIA" + "\n"
                    + "CANTIDAD: -" + cantidad + "\n"
                    + "--------------------------------------------");
            bw.newLine();

            // Actualizamos el saldo en el archivo Saldo.txt
            actualizarSaldoCuenta(nuevoSaldo);

        } catch (IOException ex) {
            Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex) {
            // Manejamos la excepción si no se puede convertir la cantidad a un número
            JOptionPane.showMessageDialog(null, "Error al convertir la cantidad a número.");
            Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /**
      aqui actualiza el saldo de la cuenta de origen luego de realizar la transferencia
      @param nuevoSaldo es el nuevo saldo de la cuenta de origen
     */
    private void actualizarSaldoCuenta(double nuevoSaldo) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/Archivos/Saldo.txt"))) {
            StringBuilder sb = new StringBuilder();
            String linea;

            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("N° DE CUENTA:") && linea.substring(linea.indexOf(":") + 1).trim().equals(cuenta)) {
                    sb.append(linea).append("\n"); // Agregamos la línea de la cuenta
                    br.readLine(); // Saltamos la línea del saldo anterior
                    sb.append("SALDO: ").append(nuevoSaldo).append("\n"); // Actualizamos el saldo
                } else {
                    sb.append(linea).append("\n"); // Conservamos las otras líneas
                }
            }

            // Escribimos el nuevo contenido en el archivo
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/Archivos/Saldo.txt"))) {
                bw.write(sb.toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Guarda la transferencia realizada hacia la cuenta de destino
     @param cantidad El monto transferido.
     @param saldoT El saldo actual de la cuenta de destino.
     */
    private void guardarTransferenciaT(String cantidad, String saldoT) {
        LocalDateTime now = LocalDateTime.now();
        LocalDate fecha = now.toLocalDate();
        LocalTime hora = now.toLocalTime();
        DateTimeFormatter fechaFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedFecha = fecha.format(fechaFormatter);
        String formattedHora = hora.format(horaFormatter);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/Archivos/Movimientos.txt", true))) {
            double cantidadDouble = Double.parseDouble(cantidad);
            double saldoDouble = Double.parseDouble(saldoT);
            double nuevoSaldo = saldoDouble + cantidadDouble;
            bw.write("--------------------------------------------" + "\n"
                    + "FECHA: " + formattedFecha + "\n"
                    + "HORA: " + formattedHora + "\n"
                    + "RECIBE DE N° DE CUENTA: " + cuenta + " \n"
                    + "A N° DE CUENTA: " + cuentaT + " \n"
                    + "TIPO DE MOVIMIENTO: TRANSFERENCIA" + "\n"
                    + "CANTIDAD: " + cantidad + "\n"
                    + "--------------------------------------------");
            bw.newLine();

            actualizarSaldoCuentaT(nuevoSaldo);

            JOptionPane optionPane = new JOptionPane("Se realizó la transferencia correctamente", JOptionPane.PLAIN_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
            JDialog dialog = optionPane.createDialog("Mensaje");
            Timer timer = new Timer(5000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dialog.dispose();
                }
            });
            timer.setRepeats(false);
            timer.start();
            dialog.setVisible(true);

        } catch (IOException ex) {
            Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error al convertir la cantidad a número.");
            Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
        }
        cantidad = "0.0";
        monto = 0;
    }
    /**
     el saldo de la cuenta de destino se actualiza luego de recibir la transferencia
     @param nuevoSaldo es el nuevo saldo de la cuenta de destino.
     */
    private void actualizarSaldoCuentaT(double nuevoSaldoT) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/Archivos/Saldo.txt"))) {
            StringBuilder sb = new StringBuilder();
            String linea;
            boolean cuentaEncontrada = false;

            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("N° DE CUENTA:") && linea.substring(linea.indexOf(":") + 1).trim().equals(cuentaT)) {
                    sb.append(linea).append("\n");
                    br.readLine(); // Skip the old saldo line
                    sb.append("SALDO: ").append(nuevoSaldoT).append("\n");
                    cuentaEncontrada = true;
                } else {
                    sb.append(linea).append("\n");
                }
            }

            if (!cuentaEncontrada) {
                throw new IOException("La cuenta no fue encontrada en el archivo.");
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/Archivos/Saldo.txt"))) {
                bw.write(sb.toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
        }
        Sesion sesion = new Sesion(ci, cuenta, idioma);
        sesion.cambiarIdioma(idioma);
        sesion.setVisible(true);
        dispose();
    }
     /**
      aqui cambia el idioma de la interfaz de usuario
     @param idioma El idioma al que se cambiará la interfaz.
     */
    public void cambiarIdioma(String idioma) {
        Locale locale = new Locale(idioma);
        recursos = ResourceBundle.getBundle("textos", locale);
        lblTitulo.setText(recursos.getString("etiqueta.tituloT"));
        lblOrigen.setText(recursos.getString("etiqueta.origen"));
        lblDestino.setText(recursos.getString("etiqueta.destino"));
        lblOtro.setText(recursos.getString("etiqueta.otro"));
        lblConfirmar.setText(recursos.getString("etiqueta.confirmar"));
        lblSalir.setText(recursos.getString("etiqueta.salir"));

    }
    /** aqui los eventos de los botones que deben realizar*/
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
        otroMonto = JOptionPane.showInputDialog(null, "Ingrese el monto:");
        double nMonto = Double.parseDouble(otroMonto);
        monto += nMonto;
        String val = String.valueOf(monto);
        lblMonto.setText(val);
        
    }//GEN-LAST:event_btnOtroActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        leerSaldo();
        transferir();
        lblMonto.setText("0.0");
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        ElegirT elegir = new ElegirT(ci, cuenta, idioma);
        elegir.cambiarIdioma(idioma);
        elegir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    
    /**
     sabemos que se establece la imagen de un botón
     @param buttonName es el nombre del botón al que se le establecerá la imagen
     @param root la ruta o direccion de la imagen
     */
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
    private javax.swing.JLabel lblConfirmar;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblOtro;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblcuenta;
    private javax.swing.JLabel lblcuentaT;
    // End of variables declaration//GEN-END:variables
}
