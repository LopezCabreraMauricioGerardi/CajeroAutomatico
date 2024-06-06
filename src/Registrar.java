import javax.swing.*;
import java.awt.*;

public class Registrar extends JFrame {
    private JPanel panelPrincipal;
    private JPanel panelPantalla;
    private JPanel panelDatos;
    private JPanel panelTexto;
    private JPanel panelBotones1;
    private JPanel panelBotones2;
    private JButton btniniciarSesion, btnRegistrarse, btnUno, btnDos, btnTres, btnCuatro, btnSalir;
    private JLabel lblCI, lblNombre, lblApellido, lblDireccion, lblEmail, lblCelular;
    private JTextField txtCI, txtNombre, txtApellido, txtDireccion, txtEmail, txtCelular;

    public Registrar() {
        setTitle("Registrar");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear ImageIcons para los botones
        ImageIcon iconUno = new ImageIcon("b1.png"); // Cambia la ruta de la imagen
        ImageIcon iconIniciarSesion = new ImageIcon("b1.png"); // Cambia la ruta de la imagen
        ImageIcon iconTres = new ImageIcon("b1.png"); // Cambia la ruta de la imagen
        ImageIcon iconDos = new ImageIcon("b1.png"); // Cambia la ruta de la imagen
        ImageIcon iconRegistrarse = new ImageIcon("b1.png"); // Cambia la ruta de la imagen
        ImageIcon iconSalir = new ImageIcon("b1.png"); // Cambia la ruta de la imagen

        // Redimensionar las imágenes
        Image imgUno = iconUno.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        Image imgIniciarSesion = iconIniciarSesion.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        Image imgTres = iconTres.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        Image imgDos = iconDos.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        Image imgRegistrarse = iconRegistrarse.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        Image imgSalir = iconSalir.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);

        // Convertir las imágenes redimensionadas a ImageIcon
        ImageIcon resizedIconUno = new ImageIcon(imgUno);
        ImageIcon resizedIconIniciarSesion = new ImageIcon(imgIniciarSesion);
        ImageIcon resizedIconTres = new ImageIcon(imgTres);
        ImageIcon resizedIconDos = new ImageIcon(imgDos);
        ImageIcon resizedIconRegistrarse = new ImageIcon(imgRegistrarse);
        ImageIcon resizedIconSalir = new ImageIcon(imgSalir);

        // Inicializar botones y asignar imágenes
        btnUno = new JButton(resizedIconUno);
        btniniciarSesion = new JButton(resizedIconIniciarSesion);
        btnTres = new JButton(resizedIconTres);
        btnDos = new JButton(resizedIconDos);
        btnRegistrarse = new JButton(resizedIconRegistrarse);
        btnSalir = new JButton(resizedIconSalir);

        // Establecer tamaño deseado para los botones
        Dimension buttonSize = new Dimension(80, 80); // Tamaño de los botones
        btnUno.setPreferredSize(buttonSize);
        btniniciarSesion.setPreferredSize(buttonSize);
        btnTres.setPreferredSize(buttonSize);
        btnDos.setPreferredSize(buttonSize);
        btnRegistrarse.setPreferredSize(buttonSize);
        btnSalir.setPreferredSize(buttonSize);

        // Establecer los fondos de los botones como transparentes
        btnUno.setOpaque(false);
        btnUno.setContentAreaFilled(false);
        btnUno.setBorderPainted(false);

        btniniciarSesion.setOpaque(false);
        btniniciarSesion.setContentAreaFilled(false);
        btniniciarSesion.setBorderPainted(false);

        btnTres.setOpaque(false);
        btnTres.setContentAreaFilled(false);
        btnTres.setBorderPainted(false);

        btnDos.setOpaque(false);
        btnDos.setContentAreaFilled(false);
        btnDos.setBorderPainted(false);

        btnRegistrarse.setOpaque(false);
        btnRegistrarse.setContentAreaFilled(false);
        btnRegistrarse.setBorderPainted(false);

        btnSalir.setOpaque(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setBorderPainted(false);

        // Panel principal
        panelPrincipal = new JPanel();
        panelPrincipal.setBackground(Color.BLUE);
        panelPrincipal.setLayout(new BorderLayout());

        // Panel de la pantalla
        panelPantalla = new JPanel();
        panelPantalla.setBackground(Color.WHITE);
        panelPantalla.setLayout(new GridLayout(2, 1)); // GridLayout con 2 filas y 1 columna
        panelPrincipal.add(panelPantalla, BorderLayout.CENTER);

        // Panel de datos
        panelDatos = new JPanel();
        panelDatos.setLayout(new BorderLayout()); // GridLayout con 5 filas y 2 columnas
        panelPantalla.add(panelDatos); // Agregado al panel principal

        //Campo CI
        JPanel panelCI = new JPanel();
        panelCI.setLayout(new BorderLayout());
        lblCI = new JLabel("CI:");
        txtCI = new JTextField(20); // Ajusta el tamaño según necesites
        panelCI.add(lblCI, BorderLayout.WEST);
        panelCI.add(txtCI, BorderLayout.CENTER);
        panelDatos.add(panelCI, BorderLayout.NORTH); // Colocamos en la parte superior

        // Campo Nombre y apellido
        JPanel panelNombre = new JPanel();
        panelCI.setLayout(new BorderLayout());
        lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(20); // Ajusta el tamaño según necesites
        panelNombre.add(lblNombre, BorderLayout.WEST);
        panelNombre.add(txtNombre, BorderLayout.CENTER);
        panelDatos.add(panelNombre, BorderLayout.CENTER); // Colocamos en la parte superior

        JPanel panelApellido = new JPanel();
        panelApellido.setLayout(new BorderLayout());
        lblApellido = new JLabel("Apellido:");
        txtApellido = new JTextField(20); // Ajusta el tamaño según necesites
        panelApellido.add(lblApellido, BorderLayout.WEST);
        panelApellido.add(txtApellido, BorderLayout.CENTER);
        panelDatos.add(panelApellido, BorderLayout.CENTER); // Colocamos en la parte superior

        //Campo Direccion
        JPanel panelDireccion = new JPanel();
        panelDireccion.setLayout(new BorderLayout());
        lblDireccion = new JLabel("CI:");
        txtDireccion = new JTextField(20); // Ajusta el tamaño según necesites
        panelDireccion.add(lblDireccion, BorderLayout.WEST);
        panelDireccion.add(txtDireccion, BorderLayout.CENTER);
        panelDatos.add(panelDireccion, BorderLayout.CENTER); // Colocamos en la parte superior

        //Campo EmAil
        JLabel lblEmail = new JLabel("Email:");
        txtEmail = new JTextField(20); // Ajusta el tamaño según necesites
        panelDatos.add(lblEmail);
        panelDatos.add(txtEmail);

        //Campo Celular
        JLabel lblCelular = new JLabel("Celular:");
        txtCelular = new JTextField(20); // Ajusta el tamaño según necesites
        panelDatos.add(lblCelular);
        panelDatos.add(txtCelular);

        // Panel de Textos
        panelTexto = new JPanel();
        panelTexto.setLayout(new BorderLayout()); // GridLayout con 1 fila y 4 columnas
        panelPantalla.add(panelTexto); // Agregado al panel principal

        // JLabels para separación
        JLabel lblSeparador1 = new JLabel("ATRAS");
        JLabel lblSeparador2 = new JLabel("SIGUIENTE");
        JLabel lblSeparador3 = new JLabel("CONFIRMAR");
        JLabel lblSeparador4 = new JLabel("SALIR");
        panelTexto.add(lblSeparador1, BorderLayout.EAST);
        panelTexto.add(lblSeparador2, BorderLayout.WEST);
        panelTexto.add(lblSeparador3, BorderLayout.EAST);
        panelTexto.add(lblSeparador4, BorderLayout.WEST);

        // Panel de botones 1
        panelBotones1 = new JPanel();
        panelBotones1.setLayout(new BoxLayout(panelBotones1, BoxLayout.Y_AXIS));
        panelBotones1.setOpaque(false);
        panelPrincipal.add(panelBotones1, BorderLayout.WEST);

        // Panel de botones 2
        panelBotones2 = new JPanel();
        panelBotones2.setLayout(new BoxLayout(panelBotones2, BoxLayout.Y_AXIS));
        panelBotones2.setOpaque(false);
        panelPrincipal.add(panelBotones2, BorderLayout.EAST);

        panelBotones1.add(Box.createVerticalStrut(230));
        panelBotones1.add(Box.createVerticalGlue()); // Agregado para centrar los botones
        panelBotones1.add(btnUno);
        panelBotones1.add(Box.createVerticalStrut(30)); // Espacio entre botones
        panelBotones1.add(btniniciarSesion);
        panelBotones1.add(Box.createVerticalStrut(30)); // Espacio entre botones
        panelBotones1.add(btnTres);
        panelBotones1.add(Box.createVerticalGlue()); // Agregado para centrar los botones

        panelBotones2.add(Box.createVerticalStrut(230));
        panelBotones2.add(Box.createVerticalGlue()); // Agregado para centrar los botones
        panelBotones2.add(btnDos);
        panelBotones2.add(Box.createVerticalStrut(30)); // Espacio entre botones
        panelBotones2.add(btnRegistrarse);
        panelBotones2.add(Box.createVerticalStrut(30)); // Espacio entre botones
        panelBotones2.add(btnSalir);
        panelBotones2.add(Box.createVerticalGlue()); // Agregado para centrar los botones

        getContentPane().add(panelPrincipal);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Registrar registro = new Registrar();
                registro.setVisible(true); // Utilizar la instancia de "registro" en lugar de crear una nueva
            }
        });
    }
}
