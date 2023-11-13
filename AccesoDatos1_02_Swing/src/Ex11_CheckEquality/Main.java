package Ex11_CheckEquality;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldT;
	private JTextField textFieldP;
	private JTextField textFieldN;
	private JLabel lblResult;
	private JButton btnRestart;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblT = new JLabel("Ingresar Valor de T");
		lblT.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 22));
		lblT.setForeground(new Color(255, 255, 255));
		lblT.setBackground(new Color(255, 128, 192));
		lblT.setBounds(10, 10, 240, 50);
		lblT.setOpaque(true);
		contentPane.add(lblT);
		
		JLabel lblP = new JLabel("Ingresar Valor de P");
		lblP.setOpaque(true);
		lblP.setForeground(Color.WHITE);
		lblP.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 22));
		lblP.setBackground(new Color(255, 128, 192));
		lblP.setBounds(10, 85, 240, 50);
		contentPane.add(lblP);
		
		JLabel lblN = new JLabel("Ingresar Valor de n");
		lblN.setOpaque(true);
		lblN.setForeground(Color.WHITE);
		lblN.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 22));
		lblN.setBackground(new Color(255, 128, 192));
		lblN.setBounds(10, 160, 240, 50);
		contentPane.add(lblN);
		
		textFieldT = new JTextField();
		textFieldT.setBackground(new Color(192, 192, 192));
		textFieldT.addKeyListener(new TextFieldHandler(textFieldT));
		textFieldT.addFocusListener(new FocusHandler(textFieldT));
		textFieldT.setFont(new Font("Rockwell", Font.BOLD, 20));
		textFieldT.setName("textFieldT");
		textFieldT.setBounds(280, 10, 240, 50);
		contentPane.add(textFieldT);
		textFieldT.setColumns(10);
		
		textFieldP = new JTextField();
		textFieldP.setBackground(new Color(192, 192, 192));
		textFieldP.addKeyListener(new TextFieldHandler(textFieldP));
		textFieldP.addFocusListener(new FocusHandler(textFieldP));
		textFieldP.setName("textFieldP");
		textFieldP.setFont(new Font("Rockwell", Font.BOLD, 20));
		textFieldP.setColumns(10);
		textFieldP.setBounds(280, 85, 240, 50);
		contentPane.add(textFieldP);
		
		textFieldN = new JTextField();
		textFieldN.setBackground(new Color(192, 192, 192));
		textFieldN.addKeyListener(new TextFieldHandler(textFieldN));
		textFieldN.addFocusListener(new FocusHandler(textFieldN));
		textFieldN.setName("textFieldN");
		textFieldN.setFont(new Font("Rockwell", Font.BOLD, 20));
		textFieldN.setColumns(10);
		textFieldN.setBounds(280, 160, 240, 50);
		contentPane.add(textFieldN);
		
		lblResult = new JLabel("");
		lblResult.setOpaque(true);
		lblResult.setForeground(Color.WHITE);
		lblResult.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 22));
		lblResult.setBackground(new Color(128, 0, 64));
		lblResult.setBounds(10, 234, 716, 219);
		contentPane.add(lblResult);
		
		JButton btnCalculate = new JButton("CALCULAR");
		btnCalculate.addActionListener(new ButtonHandler(btnCalculate, textFieldT, textFieldP, textFieldN, lblResult));
		btnCalculate.setForeground(new Color(128, 255, 128));
		btnCalculate.setBackground(new Color(0, 128, 0));
		btnCalculate.setName("btnCalculate");
		btnCalculate.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 25));
		btnCalculate.setBounds(550, 10, 176, 75);
		contentPane.add(btnCalculate);
		
		btnRestart = new JButton("REINICIAR");
		btnRestart.addActionListener(new ButtonHandler(btnRestart, textFieldT, textFieldP, textFieldN, lblResult));
		btnRestart.setName("btnRestart");
		btnRestart.setForeground(new Color(255, 128, 128));
		btnRestart.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 25));
		btnRestart.setBackground(new Color(128, 0, 0));
		btnRestart.setBounds(550, 135, 176, 75);
		contentPane.add(btnRestart);
	}
}
