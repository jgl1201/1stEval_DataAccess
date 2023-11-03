package Ex06_CheckBox;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Ex06_CheckBox extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex06_CheckBox frame = new Ex06_CheckBox();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ex06_CheckBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTittle = new JLabel("Practica 6");
		lblTittle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTittle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTittle.setBounds(10, 10, 766, 50);
		contentPane.add(lblTittle);
		
		JCheckBox chckbxHola = new JCheckBox("Hola a todos");
		chckbxHola.setName("chckbxHola");
		chckbxHola.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxHola.setBounds(284, 219, 240, 50);
		contentPane.add(chckbxHola);
		
		JCheckBox chckbxWelcome = new JCheckBox("Bienvenidos a mi página");
		chckbxWelcome.setName("chckbxWelcome");
		chckbxWelcome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxWelcome.setBounds(284, 290, 240, 50);
		contentPane.add(chckbxWelcome);
		
		JButton btnHola = new JButton("Hola a todos");
		btnHola.setName("btnHola");
		btnHola.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnHola.addActionListener(new ButtonHandler(chckbxHola, chckbxWelcome));
		btnHola.setBounds(10, 110, 356, 50);
		contentPane.add(btnHola);
		
		JButton btnWelcome = new JButton("Bienvenidos a mi página");
		btnWelcome.setName("btnWelcome");
		btnWelcome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnWelcome.addActionListener(new ButtonHandler(chckbxHola, chckbxWelcome));
		btnWelcome.setBounds(420, 110, 356, 50);
		contentPane.add(btnWelcome);
	}
}
