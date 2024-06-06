import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CajeroInterfaz extends JFrame implements ActionListener {
    private JButton btnRetirar, btnDepositar, btnConsultarSaldo, btnSalir;
    private JPanel panelActividad;
    private JLabel lblMensaje;

    public CajeroInterfaz() {
        setTitle("Cajero Automático");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear componentes
        btnRetirar = new JButton("Retirar");
        btnDepositar = new JButton("Depositar");
        btnConsultarSaldo = new JButton("Consultar saldo");
        btnSalir = new JButton("Salir");

        // Panel para la actividad
        panelActividad = new JPanel();
        panelActividad.setLayout(new BorderLayout());
        lblMensaje = new JLabel("Seleccione una opción", SwingConstants.CENTER);
        panelActividad.add(lblMensaje, BorderLayout.CENTER);

        // Panel para los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4, 1));
        panelBotones.add(btnRetirar);
        panelBotones.add(btnDepositar);
        panelBotones.add(btnConsultarSaldo);
        panelBotones.add(btnSalir);

        // Establecer diseño de la interfaz
        setLayout(new BorderLayout());
        add(panelActividad, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.WEST);

        // Agregar escuchadores de eventos a los botones
        btnRetirar.addActionListener(this);
        btnDepositar.addActionListener(this);
        btnConsultarSaldo.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    // Método para manejar eventos de botones
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRetirar) {
            lblMensaje.setText("Retirar dinero");
            // Aquí puedes agregar la lógica para retirar dinero
        } else if (e.getSource() == btnDepositar) {
            lblMensaje.setText("Depositar dinero");
            // Aquí puedes agregar la lógica para depositar dinero
        } else if (e.getSource() == btnConsultarSaldo) {
            lblMensaje.setText("Consultar saldo");
            // Aquí puedes agregar la lógica para consultar saldo
        } else if (e.getSource() == btnSalir) {
            lblMensaje.setText("¡Gracias por usar nuestro cajero!");
            // Cerrar la aplicación
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        CajeroInterfaz cajero = new CajeroInterfaz();
        cajero.setVisible(true);
    }
}
