package Ex09_Options;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldT;

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
		setTitle("CALC YOUR EXPRESION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTValue = new JLabel("Ingrese el valor de T");
		lblTValue.setFont(new Font("Snap ITC", Font.BOLD, 20));
		lblTValue.setBounds(10, 10, 270, 50);
		contentPane.add(lblTValue);
		
		JLabel lblOption = new JLabel("Opción");
		lblOption.setFont(new Font("Snap ITC", Font.BOLD, 20));
		lblOption.setBounds(10, 80, 270, 50);
		contentPane.add(lblOption);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Snap ITC", Font.BOLD, 20));
		lblResultado.setBounds(10, 265, 666, 50);
		contentPane.add(lblResultado);
		
		textFieldT = new JTextField();
		textFieldT.addKeyListener(new TextFieldHandler(textFieldT));
		textFieldT.setFont(new Font("Snap ITC", Font.PLAIN, 18));
		textFieldT.setBounds(338, 10, 270, 50);
		contentPane.add(textFieldT);
		textFieldT.setColumns(10);
		
		JComboBox<String> comboBoxOption = new JComboBox<>();
		comboBoxOption.addItem("Opcion 1");
		comboBoxOption.addItem("Opcion 2");
		comboBoxOption.addItem("Opcion 3");
		comboBoxOption.setName("comboBoxOption");
		comboBoxOption.setFont(new Font("Snap ITC", Font.PLAIN, 18));
		comboBoxOption.setBounds(338, 80, 270, 50);
		getContentPane().add(comboBoxOption);
		contentPane.add(comboBoxOption);
		
		JButton btnCalculate = new JButton("CALCULAR");
		btnCalculate.addActionListener(new ButtonHandler(btnCalculate, textFieldT, lblResultado, comboBoxOption));
		btnCalculate.setForeground(new Color(255, 255, 255));
		btnCalculate.setBackground(new Color(128, 64, 0));
		btnCalculate.setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 40));
		btnCalculate.setName("btnCalculate");
		btnCalculate.setBounds(10, 140, 320, 115);
		contentPane.add(btnCalculate);
		
		JButton btnRestart = new JButton("REINICIAR");
		btnRestart.addActionListener(new ButtonHandler(btnRestart, textFieldT, lblResultado, comboBoxOption));
		btnRestart.setName("btnRestart");
		btnRestart.setForeground(Color.WHITE);
		btnRestart.setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 40));
		btnRestart.setBackground(new Color(128, 0, 0));
		btnRestart.setBounds(356, 140, 320, 115);
		contentPane.add(btnRestart);
		
	}
}
