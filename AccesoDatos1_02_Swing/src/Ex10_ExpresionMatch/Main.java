package Ex10_ExpresionMatch;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldR;
	private JTextField textFieldT;
	private JTextField textFieldQ;

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
		setTitle("<820");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 64, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblR = new JLabel("Ingresar Valor de R");
		lblR.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		lblR.setForeground(new Color(255, 255, 128));
		lblR.setBounds(10, 10, 320, 53);
		contentPane.add(lblR);
		
		JLabel lblT = new JLabel("Ingresar Valor de T");
		lblT.setForeground(new Color(255, 255, 128));
		lblT.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		lblT.setBounds(10, 80, 320, 53);
		contentPane.add(lblT);
		
		JLabel lblQ = new JLabel("Ingresar Valor de Q");
		lblQ.setForeground(new Color(255, 255, 128));
		lblQ.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		lblQ.setBounds(10, 157, 320, 53);
		contentPane.add(lblQ);
		
		textFieldR = new JTextField();
		textFieldR.addFocusListener(new FocusHandler(textFieldR));
		textFieldR.addKeyListener(new TextFieldhandler(textFieldR));
		textFieldR.setBackground(new Color(192, 192, 192));
		textFieldR.setName("textFieldR");
		textFieldR.setFont(new Font("Tempus Sans ITC", Font.ITALIC, 20));
		textFieldR.setBounds(390, 10, 220, 53);
		contentPane.add(textFieldR);
		textFieldR.setColumns(10);
		
		textFieldT = new JTextField();
		textFieldT.addFocusListener(new FocusHandler(textFieldT));
		textFieldT.addKeyListener(new TextFieldhandler(textFieldT));
		textFieldT.setBackground(new Color(192, 192, 192));
		textFieldT.setName("textFieldT");
		textFieldT.setFont(new Font("Tempus Sans ITC", Font.ITALIC, 20));
		textFieldT.setColumns(10);
		textFieldT.setBounds(390, 80, 220, 53);
		contentPane.add(textFieldT);
		
		textFieldQ = new JTextField();
		textFieldQ.addFocusListener(new FocusHandler(textFieldQ));
		textFieldQ.addKeyListener(new TextFieldhandler(textFieldQ));
		textFieldQ.setBackground(new Color(192, 192, 192));
		textFieldQ.setName("textFieldQ");
		textFieldQ.setFont(new Font("Tempus Sans ITC", Font.ITALIC, 20));
		textFieldQ.setColumns(10);
		textFieldQ.setBounds(390, 157, 220, 53);
		contentPane.add(textFieldQ);
		
		JLabel lblResult = new JLabel("");
		lblResult.setName("lblResult");
		lblResult.setBackground(new Color(0, 128, 64));
		lblResult.setForeground(new Color(255, 255, 255));
		lblResult.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
		lblResult.setVerticalAlignment(SwingConstants.TOP);
		lblResult.setBounds(10, 284, 766, 169);
		lblResult.setOpaque(true);
		contentPane.add(lblResult);
		
		JButton btnCalculate = new JButton("CALCULAR");
		btnCalculate.addActionListener(new ButtonHandler(textFieldR, textFieldT, textFieldQ, btnCalculate, lblResult));
		btnCalculate.setBackground(new Color(0, 64, 0));
		btnCalculate.setForeground(new Color(128, 255, 0));
		btnCalculate.setName("btnCalculate");
		btnCalculate.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 30));
		btnCalculate.setBounds(10, 220, 320, 54);
		contentPane.add(btnCalculate);
		
		JButton btnRestart = new JButton("REINICIAR");
		btnRestart.addActionListener(new ButtonHandler(textFieldR, textFieldT, textFieldQ, btnRestart, lblResult));
		btnRestart.setForeground(new Color(255, 128, 128));
		btnRestart.setBackground(new Color(64, 0, 0));
		btnRestart.setName("btnRestart");
		btnRestart.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 30));
		btnRestart.setBounds(456, 220, 320, 54);
		contentPane.add(btnRestart);
		
		
	}
}
