package ExampleActionManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
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
	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOMBRE:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(43, 64, 105, 26);
		contentPane.add(lblNewLabel);
		
		textFieldName = new JTextField();
		textFieldName.setToolTipText("Introduce tu nombre");
		textFieldName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldName.setBounds(199, 64, 162, 26);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		JButton btnSaludar = new JButton("SALUDAR");
		btnSaludar.setName("btnSaludar");
		btnSaludar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSaludar.setBounds(68, 157, 116, 26);
		btnSaludar.addActionListener(new ButtonManager(textFieldName));
		contentPane.add(btnSaludar);
		
		JButton btnInsult = new JButton("INSULTAR");
		btnInsult.setName("btnInsult");
		btnInsult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnInsult.setBounds(238, 157, 116, 26);
		btnInsult.addActionListener(new ButtonManager(textFieldName));
		contentPane.add(btnInsult);
	}
}
