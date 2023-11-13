package Ex12_MathCalcs;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setTitle("MATH");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblaAsk = new JLabel("Ingresar un número entero");
		lblaAsk.setForeground(new Color(255, 255, 255));
		lblaAsk.setBackground(new Color(255, 128, 192));
		lblaAsk.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		lblaAsk.setBounds(10, 10, 766, 50);
		lblaAsk.setOpaque(true);
		contentPane.add(lblaAsk);
		
		textFieldNumber = new JTextField();
		textFieldNumber.addKeyListener(new TextFieldHandler(textFieldNumber));
		textFieldNumber.addFocusListener(new FocusHandler(textFieldNumber));
		textFieldNumber.setForeground(new Color(0, 0, 0));
		textFieldNumber.setBackground(new Color(192, 192, 192));
		textFieldNumber.setFont(new Font("Century Schoolbook", Font.BOLD, 28));
		textFieldNumber.setBounds(10, 70, 200, 50);
		contentPane.add(textFieldNumber);
		textFieldNumber.setColumns(10);
		
		JTextArea textAreaResult = new JTextArea();
		textAreaResult.setName("textAreaResult");
		textAreaResult.setEnabled(false);
		textAreaResult.setFont(new Font("Century Schoolbook", Font.PLAIN, 26));
		textAreaResult.setForeground(new Color(255, 255, 255));
		textAreaResult.setBackground(new Color(0, 128, 128));
		textAreaResult.setBounds(10, 130, 766, 273);
		contentPane.add(textAreaResult);
		
		JButton btnEvens = new JButton("PARES");
		btnEvens.addActionListener(new ButtonHandler(btnEvens, textFieldNumber, textAreaResult));
		btnEvens.setForeground(new Color(0, 0, 255));
		btnEvens.setBackground(new Color(255, 255, 0));
		btnEvens.setName("btnEvens");
		btnEvens.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 28));
		btnEvens.setBounds(220, 70, 147, 50);
		contentPane.add(btnEvens);
		
		JButton btnSerie = new JButton("SERIE");
		btnSerie.addActionListener(new ButtonHandler(btnSerie, textFieldNumber, textAreaResult));
		btnSerie.setName("btnSerie");
		btnSerie.setForeground(new Color(255, 128, 64));
		btnSerie.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 28));
		btnSerie.setBackground(new Color(0, 64, 0));
		btnSerie.setBounds(377, 69, 137, 50);
		contentPane.add(btnSerie);
		
		JButton btnFibonacci = new JButton("FIBONACCI");
		btnFibonacci.addActionListener(new ButtonHandler(btnFibonacci, textFieldNumber, textAreaResult));
		btnFibonacci.setName("btnFibonacci");
		btnFibonacci.setForeground(new Color(128, 128, 0));
		btnFibonacci.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 28));
		btnFibonacci.setBackground(new Color(0, 64, 64));
		btnFibonacci.setBounds(524, 70, 252, 50);
		contentPane.add(btnFibonacci);
		
		
	}
}
