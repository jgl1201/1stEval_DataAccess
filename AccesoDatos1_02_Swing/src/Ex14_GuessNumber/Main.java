package Ex14_GuessNumber;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldGuess;


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
		setTitle("GUESS THE NUMBER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Adivina el Número");
		lblTitle.setForeground(new Color(0, 0, 0));
		lblTitle.setFont(new Font("Snap ITC", Font.PLAIN, 40));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(10, 10, 766, 55);
		contentPane.add(lblTitle);
		
		JLabel lblInstruction = new JLabel("Número [ 1 - 50 ]:");
		lblInstruction.setForeground(new Color(0, 0, 0));
		lblInstruction.setFont(new Font("Snap ITC", Font.PLAIN, 20));
		lblInstruction.setBounds(10, 100, 300, 45);
		contentPane.add(lblInstruction);
		
		textFieldGuess = new JTextField();
		textFieldGuess.setBackground(new Color(192, 192, 192));
		textFieldGuess.setFont(new Font("Snap ITC", Font.PLAIN, 20));
		textFieldGuess.addFocusListener(new FocusHandler(textFieldGuess));
		textFieldGuess.addKeyListener(new TextFieldHandler(textFieldGuess));
		textFieldGuess.setBounds(10, 170, 300, 45);
		contentPane.add(textFieldGuess);
		textFieldGuess.setColumns(10);
		
		JLabel lblTrys = new JLabel("");
		lblTrys.setForeground(new Color(255, 0, 0));
		lblTrys.setFont(new Font("Snap ITC", Font.PLAIN, 20));
		lblTrys.setBounds(10, 353, 766, 45);
		contentPane.add(lblTrys);
		
		JTextArea textAreaHints = new JTextArea();
		textAreaHints.setBounds(346, 100, 430, 241);
		textAreaHints.setFont(new Font("Snap ITC", Font.PLAIN, 20));
		textAreaHints.setEditable(false);
		contentPane.add(textAreaHints);
		
		JButton btnCheck = new JButton("COMPROBAR");
		btnCheck.addActionListener(new ButtonHandler(btnCheck, textFieldGuess, textAreaHints, lblTrys));
		btnCheck.setBackground(new Color(255, 128, 0));
		btnCheck.setForeground(new Color(128, 255, 255));
		btnCheck.setName("btnCheck");
		btnCheck.setFont(new Font("Snap ITC", Font.PLAIN, 30));
		btnCheck.setBounds(10, 408, 766, 45);
		contentPane.add(btnCheck);
		
		
	}
}
