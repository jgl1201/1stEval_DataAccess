package Troll3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Main {

	public static void main(String[] args) {
		mostrarMensaje();
	}

	public static void mostrarMensaje() {
		String[] mensajes = { "¡ERROR! ¡EL SISTEMA HA DETECTADO QUE NO ME HAS PUESTO 10!",
				"¡Felicidades! Has sido seleccionado como el programador que más usa ChatGPT.",
				"VIRUS TERRIBLE DETECTADO.",
				"¡Alerta! Se ha detectado una sobrecarga en el sistema.",
				"¡ENHORABUENA! se te conoce como sr. ctrl+c ctrl+v.",
				"¡alerta por subnormal! ¡alerta por subnormal!",};

		Random rand = new Random();
		int indiceMensaje = rand.nextInt(mensajes.length);

		// Crear un JFrame y establecer el tamaño igual al tamaño de la pantalla
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true); // Sin bordes
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());

		// Crear un panel y establecer su diseño
		JPanel panel = new JPanel(new BorderLayout());
		panel.setBackground(new Color(0, 0, 255)); // Color de fondo

		// Crear una etiqueta con el mensaje y agregarla al panel
		JLabel label = new JLabel(mensajes[indiceMensaje].toUpperCase());
		label.setForeground(Color.WHITE); // Color del texto
		label.setHorizontalAlignment(SwingConstants.CENTER); // Centrar el texto
		panel.add(label, BorderLayout.CENTER);

		// Agregar el panel al frame y hacerlo visible
		frame.add(panel);
		frame.setVisible(true);

		
	}

}
