import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pantalla1 extends JFrame {
    private JPanel panelPrincipal; 
    private JPanel panelPantalla;
    private JPanel panelBotones1;
    private JPanel panelBotones2;
    private JButton btniniciarSesion, btnRegistrarse, btnUno, btnDos, btnTres, btnCuatro, btnSalir;
    private JLabel lblIniciarSesion, lblRegistrarse, lblTitulo;

    public Pantalla1(){
        setTitle("Cajero Automatico");
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
        btniniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    IniciarSesion sesion = new IniciarSesion();
                    sesion.setVisible(true);
                    dispose();

            }
        });

        btnTres = new JButton(resizedIconTres);
        btnDos = new JButton(resizedIconDos);
        btnRegistrarse = new JButton(resizedIconRegistrarse);
        btnRegistrarse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    Registrar registro = new Registrar();
                    registro.setVisible(true);
                    dispose();

            }
        });
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
        panelPrincipal.add(panelPantalla, BorderLayout.CENTER);

        // Panel de botones 1
        panelBotones1 = new JPanel();
        panelBotones1.setLayout(new BoxLayout(panelBotones1, BoxLayout.Y_AXIS)); // Cambio aquí
        panelBotones1.setOpaque(false);
        panelPrincipal.add(panelBotones1, BorderLayout.WEST);

        // Panel de botones 2
        panelBotones2 = new JPanel();
        panelBotones2.setLayout(new BoxLayout(panelBotones2, BoxLayout.Y_AXIS)); // Cambio aquí
        panelBotones2.setOpaque(false);
        panelPrincipal.add(panelBotones2, BorderLayout.EAST);

        // JLabels en el panelPantalla
        Font font = new Font("Arial", Font.BOLD, 16);
        lblIniciarSesion = new JLabel(" INICIAR SESION ");
        lblIniciarSesion.setFont(font);
        lblIniciarSesion.setForeground(Color.BLUE);
        lblRegistrarse = new JLabel(" REGISTRARSE ");
        lblRegistrarse.setFont(font);
        lblRegistrarse.setForeground(Color.BLUE);
        lblTitulo = new JLabel();
        ImageIcon imageIcon = new ImageIcon("t2.png"); // Ruta de la imagen
        lblTitulo.setIcon(imageIcon);
        lblTitulo.setHorizontalAlignment(JLabel.CENTER);
        
        panelPantalla.setLayout(new BorderLayout());
        panelPantalla.add(lblTitulo, BorderLayout.NORTH);
        panelPantalla.add(lblIniciarSesion, BorderLayout.WEST);
        panelPantalla.add(lblRegistrarse, BorderLayout.EAST);
        // Agregar botones a los paneles de botones
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
        Pantalla1 pantalla = new Pantalla1();
        pantalla.setVisible(true);
    }
}
