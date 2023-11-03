package Ex03_Triangle;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ex03_Triangle extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldSide1;
	private JTextField textFieldSide2;
	private JTextField textFieldSide3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex03_Triangle frame = new Ex03_Triangle();
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
	public Ex03_Triangle() {
		setTitle("Triangle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSide1 = new JLabel("Ingresar el Lado 1");
		lblSide1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSide1.setBounds(40, 40, 134, 23);
		contentPane.add(lblSide1);
		
		JLabel lblSide2 = new JLabel("Ingresar el Lado 2");
		lblSide2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSide2.setBounds(40, 100, 134, 23);
		contentPane.add(lblSide2);
		
		JLabel lblSide3 = new JLabel("Ingresar el Lado 3");
		lblSide3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSide3.setBounds(40, 160, 134, 23);
		contentPane.add(lblSide3);
		
		textFieldSide1 = new JTextField();
		textFieldSide1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (Character.isDigit(e.getKeyChar()) || e.getKeyChar() == '.') {
					textFieldSide1.setEditable(true);
					textFieldSide1.setBackground(Color.WHITE);
				} else {
					JOptionPane.showMessageDialog(null, "Introduce solo numeros, CARAECHIMBA");
					e.consume();
				}
			}
		});
		textFieldSide1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldSide1.setBounds(252, 44, 134, 23);
		contentPane.add(textFieldSide1);
		textFieldSide1.setColumns(10);
		
		textFieldSide2 = new JTextField();
		textFieldSide2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (Character.isDigit(e.getKeyChar()) || e.getKeyChar() == '.') {
					textFieldSide2.setEditable(true);
					textFieldSide2.setBackground(Color.WHITE);
				} else {
					JOptionPane.showMessageDialog(null, "Introduce solo numeros, CARAECHIMBA");
					e.consume();
				}
			}
		});
		textFieldSide2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldSide2.setColumns(10);
		textFieldSide2.setBounds(252, 100, 134, 23);
		contentPane.add(textFieldSide2);
		
		textFieldSide3 = new JTextField();
		textFieldSide3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (Character.isDigit(e.getKeyChar()) || e.getKeyChar() == '.') {
					textFieldSide3.setEditable(true);
					textFieldSide3.setBackground(Color.WHITE);
				} else {
					JOptionPane.showMessageDialog(null, "Introduce solo numeros, CARAECHIMBA");
					e.consume();
				}
			}
		});
		textFieldSide3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldSide3.setColumns(10);
		textFieldSide3.setBounds(252, 160, 134, 23);
		contentPane.add(textFieldSide3);
		
		JLabel lblResult = new JLabel("El area es: ");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResult.setBounds(40, 247, 346, 23);
		contentPane.add(lblResult);
		
		JButton btnCalculate = new JButton("CALCULAR");
		btnCalculate.setName("btnCalculate");
		btnCalculate.addActionListener(new ButtonHandler());
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCalculate.setBounds(409, 66, 123, 35);
		contentPane.add(btnCalculate);
		
		JButton btnRestart = new JButton("REINICIAR");
		btnRestart.setName("btnRestart");
		btnRestart.addActionListener(new ButtonHandler());
		btnRestart.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRestart.setBounds(409, 124, 123, 35);
		contentPane.add(btnRestart);
	}
}
