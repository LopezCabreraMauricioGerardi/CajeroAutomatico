/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cajeroautomatico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/*  @author Grupo Anonimo */

/**
 *
 * @author Asus VivoBook S15
 */
public class Agregar extends javax.swing.JFrame {

    private String carnet;
    private String Cuenta;
    String numeroDeCuenta;
    String nombre;
    String apellido;
    String direccion;
    String email;
    String telefono;
    String tipoCuenta;
    String contraseña;
    String saldo = "0.0";
    private ResourceBundle recursos;
    String idioma;

    /**
     *
     * @param carnet
     * @param Cuenta
     * @param idioma
     */
    public Agregar(String carnet, String Cuenta, String idioma) {
        this.carnet = carnet;
        this.Cuenta = Cuenta;
        this.idioma = idioma;
        Locale locale = new Locale(idioma);
        recursos = ResourceBundle.getBundle("textos", locale);
        initComponents();
    }

    private void generarNumeroDeCuenta(int inicio) {
        // Crear un número aleatorio de 8 dígitos
        Random random = new Random();
        int numeroAleatorio = random.nextInt(90000000) + 10000000;

        // Concatenar el inicio y el número aleatorio para formar el número de cuenta
        numeroDeCuenta = String.valueOf(inicio) + String.valueOf(numeroAleatorio);
        lCuenta.setText(numeroDeCuenta);
    }

    private void leerDatos() {
        String nombreGuardado = null;
        String apellidoGuardado = null;
        String direccionGuardada = null;
        String emailGuardado = null;
        String telefonoGuardado = null;
        String contraseñaGuardada = null;
        try (BufferedReader br = new BufferedReader(new FileReader("src/Archivos/Datos.txt"))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("CI:") && linea.substring(linea.indexOf(":") + 1).trim().equals(carnet)) {
                    while ((linea = br.readLine()) != null) {
                        if (linea.startsWith("NOMBRE:")) {
                            nombreGuardado = linea.substring(linea.indexOf(":") + 1).trim();
                            nombre = nombreGuardado;
                        } else if (linea.startsWith("APELLIDO:")) {
                            apellidoGuardado = linea.substring(linea.indexOf(":") + 1).trim();
                            apellido = apellidoGuardado;
                        } else if (linea.startsWith("DIRECCION:")) {
                            direccionGuardada = linea.substring(linea.indexOf(":") + 1).trim();
                            direccion = direccionGuardada;
                        } else if (linea.startsWith("EMAIL:")) {
                            emailGuardado = linea.substring(linea.indexOf(":") + 1).trim();
                            email = emailGuardado;
                        } else if (linea.startsWith("TELEFONO:")) {
                            telefonoGuardado = linea.substring(linea.indexOf(":") + 1).trim();
                            telefono = telefonoGuardado;
                        } else if (linea.startsWith("CONTRASEÑA:")) {
                            contraseñaGuardada = linea.substring(linea.indexOf(":") + 1).trim();
                            contraseña = contraseñaGuardada;
                            break; // No necesitamos continuar leyendo después de la contraseña
                        }
                    }
                    break; // Salimos del bucle una vez que encontramos la cuenta
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void guardarDatos() {
        if (tipoCuenta != null) {
            try {
                // Crear un FileWriter con el modo de agregar al archivo (true)
                FileWriter fileWriter = new FileWriter("src/Archivos/Datos.txt", true);

                // Crear un BufferedWriter para escribir en el archivo
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                // Escribir los datos en el archivo separados por comas
                bufferedWriter.write("--------------------------------------------\n"
                        + "CI: " + carnet + "\n"
                        + "NOMBRE: " + nombre + "\n"
                        + "APELLIDO: " + apellido + "\n"
                        + "DIRECCION: " + direccion + "\n"
                        + "EMAIL: " + email + "\n"
                        + "TELEFONO: " + telefono + "\n"
                        + "TIPO DE CUENTA: " + tipoCuenta + "\n"
                        + "N° DE CUENTA: " + numeroDeCuenta + "\n"
                        + "SALDO CUENTA:" + saldo + "\n"
                        + "CONTRASEÑA: " + contraseña + "\n"
                        + "--------------------------------------------");
                // Agregar un salto de línea al final
                bufferedWriter.newLine();

                // Cerrar el BufferedWriter
                bufferedWriter.close();
                guardarDatos2();
                guardarDatos3();

            } catch (IOException e) {
                System.err.println("Error al guardar los datos en el archivo: " + e.getMessage());
            }
            limpiarDatos();
            

        } else {
            JOptionPane optionPane = new JOptionPane("Llene todos los campos", JOptionPane.PLAIN_MESSAGE);
            JDialog dialog = optionPane.createDialog("Mensaje");
            Timer timer = new Timer(5000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dialog.dispose();
                }
            });
            timer.setRepeats(false); // Para que se ejecute solo una vez
            timer.start();
            dialog.setVisible(true);
        }
    }

    private void guardarDatos2() {

        try {
            // Crear un FileWriter con el modo de agregar al archivo (true)
            FileWriter fileWriter = new FileWriter("src/Archivos/DatosCuenta.txt", true);

            // Crear un BufferedWriter para escribir en el archivo
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Escribir los datos en el archivo separados por comas
            bufferedWriter.write("--------------------------------------------\n"
                    + "CI: " + carnet + "\n"
                    + "N° DE CUENTA: " + numeroDeCuenta + "\n"
                    + "CONTRASEÑA: " + contraseña + "\n"
                    + "--------------------------------------------");
            // Agregar un salto de línea al final
            bufferedWriter.newLine();

            // Cerrar el BufferedWriter
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Error al guardar los datos en el archivo: " + e.getMessage());
        }

    }

    private void guardarDatos3() {

        try {
            // Crear un FileWriter con el modo de agregar al archivo (true)
            FileWriter fileWriter = new FileWriter("src/Archivos/Saldo.txt", true);

            // Crear un BufferedWriter para escribir en el archivo
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Escribir los datos en el archivo separados por comas
            bufferedWriter.write("--------------------------------------------\n"
                    + "CI: " + carnet + "\n"
                    + "N° DE CUENTA: " + numeroDeCuenta + "\n"
                    + "SALDO: " + saldo + "\n"
                    + "--------------------------------------------");
            // Agregar un salto de línea al final
            bufferedWriter.newLine();

            // Cerrar el BufferedWriter
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Error al guardar los datos en el archivo: " + e.getMessage());
        }

    }

    private void limpiarDatos() {
        bol.setSelected(false);
        dol.setSelected(false);
        eur.setSelected(false);
        lCuenta.setText("");
    }
    
    /**
     *
     * @param idioma
     */
    public void cambiarIdioma(String idioma) {
        Locale locale = new Locale(idioma);
        recursos = ResourceBundle.getBundle("textos", locale);
        
        lblNCuenta.setText(recursos.getString("etiqueta.Ncuenta"));
        lblTCuenta.setText(recursos.getString("etiqueta.Tcuenta"));
        btnConfirmar.setText(recursos.getString("etiqueta.confirmar"));
        btnCancelar.setText(recursos.getString("etiqueta.cancelar"));
        bol.setText(recursos.getString("etiqueta.bolivianos"));
        dol.setText(recursos.getString("etiqueta.dolares"));
        eur.setText(recursos.getString("etiqueta.euros"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTCuenta = new javax.swing.JLabel();
        bol = new javax.swing.JCheckBox();
        dol = new javax.swing.JCheckBox();
        eur = new javax.swing.JCheckBox();
        lblNCuenta = new javax.swing.JLabel();
        lCuenta = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(370, 390));
        setMinimumSize(new java.awt.Dimension(370, 390));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(370, 390));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(370, 390));

        lblTCuenta.setFont(new java.awt.Font("Myanmar Text", 1, 16)); // NOI18N
        lblTCuenta.setForeground(new java.awt.Color(0, 204, 0));
        lblTCuenta.setText("SELECCIONE TIPO DE CUENTA:");

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

        lblNCuenta.setText("N° DE CUENTA:");

        lCuenta.setBackground(new java.awt.Color(255, 255, 255));
        lCuenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        btnConfirmar.setBackground(new java.awt.Color(0, 204, 51));
        btnConfirmar.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("CONFIRMAR");
        btnConfirmar.setMaximumSize(new java.awt.Dimension(116, 50));
        btnConfirmar.setMinimumSize(new java.awt.Dimension(116, 50));
        btnConfirmar.setPreferredSize(new java.awt.Dimension(116, 50));
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(0, 204, 51));
        btnCancelar.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setMaximumSize(new java.awt.Dimension(116, 50));
        btnCancelar.setMinimumSize(new java.awt.Dimension(116, 50));
        btnCancelar.setPreferredSize(new java.awt.Dimension(116, 50));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblNCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblTCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dol, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eur, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bol)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblTCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eur)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNCuenta)
                    .addComponent(lCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        leerDatos();
        guardarDatos();
        dispose();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void bolItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_bolItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            // Si se selecciona la casilla de verificación de bolivianos, deshabilita las otras0
            generarNumeroDeCuenta(1);
            tipoCuenta = "Bolivianos";
            dol.setEnabled(false);
            eur.setEnabled(false);

        } else {
            // Si se deselecciona la casilla de verificación de bolivianos, habilita las otras
            dol.setEnabled(true);
            eur.setEnabled(true);
            lCuenta.setText(" ");
        }
    }//GEN-LAST:event_bolItemStateChanged

    private void dolItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dolItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            // Si se selecciona la casilla de verificación de bolivianos, deshabilita las otras
            generarNumeroDeCuenta(2);
            tipoCuenta = "Dolares";
            bol.setEnabled(false);
            eur.setEnabled(false);

        } else {
            // Si se deselecciona la casilla de verificación de bolivianos, habilita las otras
            bol.setEnabled(true);
            eur.setEnabled(true);
            lCuenta.setText(" ");
        }
    }//GEN-LAST:event_dolItemStateChanged

    private void eurItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_eurItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            // Si se selecciona la casilla de verificación de bolivianos, deshabilita las otras
            generarNumeroDeCuenta(3);
            tipoCuenta = "Euros";
            bol.setEnabled(false);
            dol.setEnabled(false);

        } else {
            // Si se deselecciona la casilla de verificación de bolivianos, habilita las otras
            bol.setEnabled(true);
            dol.setEnabled(true);
            lCuenta.setText(" ");
        }
    }//GEN-LAST:event_eurItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox bol;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JCheckBox dol;
    private javax.swing.JCheckBox eur;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lCuenta;
    private javax.swing.JLabel lblNCuenta;
    private javax.swing.JLabel lblTCuenta;
    // End of variables declaration//GEN-END:variables
}
