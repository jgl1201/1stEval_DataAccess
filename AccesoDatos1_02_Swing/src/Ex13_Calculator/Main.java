package Ex13_Calculator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<String> comboBoxModes1;
	private JComboBox<String> comboBoxModes2;
	private JTextField textFieldOperator;

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
		setTitle("CALCULATOR");
		setBackground(new Color(25, 25, 25));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		String[] modes = {"Binary", "Decimal", "Octal", "Hexadecimal"};
		comboBoxModes1 = new JComboBox<>(modes);
		comboBoxModes1.setSelectedIndex(1);
		comboBoxModes1.setBackground(new Color(25, 25, 25));
		comboBoxModes1.setForeground(new Color(255, 255, 255));
		comboBoxModes1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		comboBoxModes1.setName("comboBoxModes1");
		menuBar.add(comboBoxModes1);
		
		comboBoxModes2 = new JComboBox<>(modes);
		comboBoxModes2.setSelectedIndex(1);
		comboBoxModes2.setBackground(new Color(25, 25, 25));
		comboBoxModes2.setForeground(new Color(255, 255, 255));
		comboBoxModes2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		comboBoxModes2.setName("comboBoxModes2");
		menuBar.add(comboBoxModes2);
				
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 25, 25));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextField textAreaInput1 = new JTextField();
		textAreaInput1.setName("textAreaInput1");
		textAreaInput1.setForeground(Color.BLACK);
		textAreaInput1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textAreaInput1.setBackground(Color.LIGHT_GRAY);
		textAreaInput1.setBounds(10, 10, 220, 27);
		contentPane.add(textAreaInput1);
		
		JTextField textAreaInput2 = new JTextField();
		textAreaInput2.setName("textAreaInput2");
		textAreaInput2.setForeground(Color.BLACK);
		textAreaInput2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textAreaInput2.setBackground(Color.LIGHT_GRAY);
		textAreaInput2.setBounds(256, 11, 220, 27);
		contentPane.add(textAreaInput2);
		
		textFieldOperator = new JTextField();
		textFieldOperator.setName("textFieldOperator");
		textFieldOperator.setVisible(false);
		textFieldOperator.setEditable(false);;
		textFieldOperator.setBounds(10, 47, 96, 19);
		contentPane.add(textFieldOperator);
		textFieldOperator.setColumns(10);
		
		JLabel lblOutput = new JLabel("");
		lblOutput.setName("lblOutput");
		lblOutput.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOutput.setForeground(Color.WHITE);
		lblOutput.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblOutput.setBounds(10, 42, 466, 27);
		contentPane.add(lblOutput);
		
		JPanel panelNumbers = new JPanel();
		panelNumbers.setBackground(new Color(25, 25, 25));
		panelNumbers.setBounds(246, 80, 230, 275);
		contentPane.add(panelNumbers);
		panelNumbers.setLayout(new GridLayout(4, 4, 5, 5));
		
		JButton btn07 = new JButton("7");
		btn07.setName("btn07");
		btn07.setForeground(new Color(255, 255, 255));
		btn07.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn07.setBackground(new Color(255, 128, 0));
		panelNumbers.add(btn07);
		
		JButton btn08 = new JButton("8");
		btn08.setName("btn08");
		btn08.setForeground(new Color(255, 255, 255));
		btn08.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn08.setBackground(new Color(255, 128, 0));
		panelNumbers.add(btn08);
		
		JButton btn09 = new JButton("9");
		btn09.setName("btn09");
		btn09.setForeground(new Color(255, 255, 255));
		btn09.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn09.setBackground(new Color(255, 128, 0));
		panelNumbers.add(btn09);
		
		JButton btnDivision = new JButton("/");
		btnDivision.setName("btnDivision");
		btnDivision.setForeground(new Color(255, 255, 255));
		btnDivision.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnDivision.setBackground(new Color(255, 128, 0));
		panelNumbers.add(btnDivision);
		
		JButton btn04 = new JButton("4");
		btn04.setName("btn04");
		btn04.setForeground(new Color(255, 255, 255));
		btn04.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn04.setBackground(new Color(255, 128, 0));
		panelNumbers.add(btn04);
		
		JButton btn05 = new JButton("5");
		btn05.setName("btn05");
		btn05.setForeground(new Color(255, 255, 255));
		btn05.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn05.setBackground(new Color(255, 128, 0));
		panelNumbers.add(btn05);
		
		JButton btn06 = new JButton("6");
		btn06.setName("btn06");
		btn06.setForeground(new Color(255, 255, 255));
		btn06.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn06.setBackground(new Color(255, 128, 0));
		panelNumbers.add(btn06);
		
		JButton btnMulti = new JButton("*");
		btnMulti.setName("btnMulti");
		btnMulti.setForeground(new Color(255, 255, 255));
		btnMulti.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnMulti.setBackground(new Color(255, 128, 0));
		panelNumbers.add(btnMulti);
		
		JButton btn01 = new JButton("1");
		btn01.setName("btn01");
		btn01.setForeground(new Color(255, 255, 255));
		btn01.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn01.setBackground(new Color(255, 128, 0));
		panelNumbers.add(btn01);
		
		JButton btn02 = new JButton("2");
		btn02.setName("btn02");
		btn02.setForeground(new Color(255, 255, 255));
		btn02.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn02.setBackground(new Color(255, 128, 0));
		panelNumbers.add(btn02);
		
		JButton btn03 = new JButton("3");
		btn03.setName("btn03");
		btn03.setForeground(new Color(255, 255, 255));
		btn03.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn03.setBackground(new Color(255, 128, 0));
		panelNumbers.add(btn03);
		
		JButton btnRest = new JButton("-");
		btnRest.setName("btnRest");
		btnRest.setForeground(new Color(255, 255, 255));
		btnRest.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnRest.setBackground(new Color(255, 128, 0));
		panelNumbers.add(btnRest);
		
		JButton btn00 = new JButton("0");
		btn00.setName("btn00");
		btn00.setForeground(new Color(255, 255, 255));
		btn00.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn00.setBackground(new Color(255, 128, 0));
		panelNumbers.add(btn00);
		
		JButton btnDot = new JButton(".");
		btnDot.setName("btnDot");
		btnDot.setForeground(new Color(255, 255, 255));
		btnDot.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnDot.setBackground(new Color(255, 128, 0));
		panelNumbers.add(btnDot);
		
		JButton btnClear = new JButton("C");
		btnClear.setName("btnClear");
		btnClear.setForeground(new Color(255, 255, 255));
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnClear.setBackground(new Color(255, 128, 0));
		panelNumbers.add(btnClear);
		
		JButton btnAddition = new JButton("+");
		btnAddition.setName("btnAddition");
		btnAddition.setForeground(new Color(255, 255, 255));
		btnAddition.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnAddition.setBackground(new Color(255, 128, 0));
		panelNumbers.add(btnAddition);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setBounds(246, 360, 230, 65);
		contentPane.add(btnEquals);
		btnEquals.setName("btnEquals");
		btnEquals.setForeground(new Color(255, 255, 255));
		btnEquals.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnEquals.setBackground(new Color(255, 128, 0));
		
		JPanel panelOperations = new JPanel();
		panelOperations.setBackground(new Color(25, 25, 25));
		panelOperations.setBounds(10, 80, 226, 345);
		contentPane.add(panelOperations);
		panelOperations.setLayout(new GridLayout(4, 3, 5, 5));
		
		JButton btnMod = new JButton("MOD");
		btnMod.setName("btnMod");
		btnMod.setBackground(new Color(50, 50, 50));
		btnMod.setForeground(new Color(255, 255, 255));
		btnMod.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panelOperations.add(btnMod);
		
		JButton btnExp = new JButton("EXP");
		btnExp.setName("btnExp");
		btnExp.setBackground(new Color(50, 50, 50));
		btnExp.setForeground(new Color(255, 255, 255));
		btnExp.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panelOperations.add(btnExp);
		
		JButton btnLn = new JButton("ln");
		btnLn.setName("btnLn");
		btnLn.setBackground(new Color(50, 50, 50));
		btnLn.setForeground(new Color(255, 255, 255));
		btnLn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panelOperations.add(btnLn);
		
		JButton btnSin = new JButton("sin");
		btnSin.setName("btnSin");
		btnSin.setBackground(new Color(50, 50, 50));
		btnSin.setForeground(new Color(255, 255, 255));
		btnSin.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panelOperations.add(btnSin);
		
		JButton btnPow = new JButton("x^y");
		btnPow.setName("btnPow");
		btnPow.setBackground(new Color(50, 50, 50));
		btnPow.setForeground(new Color(255, 255, 255));
		btnPow.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panelOperations.add(btnPow);
		
		JButton btnLog = new JButton("log");
		btnLog.setName("btnLog");
		btnLog.setBackground(new Color(50, 50, 50));
		btnLog.setForeground(new Color(255, 255, 255));
		btnLog.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panelOperations.add(btnLog);
		
		JButton btnCos = new JButton("cos");
		btnCos.setName("btnCos");
		btnCos.setBackground(new Color(50, 50, 50));
		btnCos.setForeground(new Color(255, 255, 255));
		btnCos.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panelOperations.add(btnCos);
		
		JButton btnThird = new JButton("x^3");
		btnThird.setName("btnThird");
		btnThird.setBackground(new Color(50, 50, 50));
		btnThird.setForeground(new Color(255, 255, 255));
		btnThird.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panelOperations.add(btnThird);
		
		JButton btnFactorial = new JButton("n!");
		btnFactorial.setName("btnFactorial");
		btnFactorial.setBackground(new Color(50, 50, 50));
		btnFactorial.setForeground(new Color(255, 255, 255));
		btnFactorial.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panelOperations.add(btnFactorial);
		
		JButton btnTan = new JButton("tan");
		btnTan.setName("btnTan");
		btnTan.setBackground(new Color(50, 50, 50));
		btnTan.setForeground(new Color(255, 255, 255));
		btnTan.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panelOperations.add(btnTan);
		
		JButton btnSquare = new JButton("x^2");
		btnSquare.setName("btnSquare");
		btnSquare.setBackground(new Color(50, 50, 50));
		btnSquare.setForeground(new Color(255, 255, 255));
		btnSquare.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panelOperations.add(btnSquare);
		
		JButton btnExtra = new JButton("1/x");
		btnExtra.setName("btnExtra");
		btnExtra.setBackground(new Color(50, 50, 50));
		btnExtra.setForeground(new Color(255, 255, 255));
		btnExtra.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panelOperations.add(btnExtra);
		
		// ActionListener, KeyListener, FocusListener
		textAreaInput1.addKeyListener(new TextFieldModesHandler(textAreaInput1, textAreaInput2, comboBoxModes1, comboBoxModes2));
		textAreaInput1.addKeyListener(new TextFieldDecimalHandler(textAreaInput1, comboBoxModes1));
		textAreaInput1.addFocusListener(new FocusHandler(textAreaInput1));
		textAreaInput2.addKeyListener(new TextFieldModesHandler(textAreaInput1, textAreaInput2, comboBoxModes1, comboBoxModes2));
		textAreaInput2.addKeyListener(new TextFieldDecimalHandler(textAreaInput2, comboBoxModes2));
		textAreaInput2.addFocusListener(new FocusHandler(textAreaInput2));
		btnEquals.addActionListener(new ButtonHandler(btnEquals, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btn00.addActionListener(new ButtonHandler(btn00, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btn01.addActionListener(new ButtonHandler(btn01, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btn02.addActionListener(new ButtonHandler(btn02, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btn03.addActionListener(new ButtonHandler(btn03, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btn04.addActionListener(new ButtonHandler(btn04, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btn05.addActionListener(new ButtonHandler(btn05, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btn06.addActionListener(new ButtonHandler(btn06, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btn07.addActionListener(new ButtonHandler(btn07, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btn08.addActionListener(new ButtonHandler(btn08, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btn09.addActionListener(new ButtonHandler(btn09, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btnDot.addActionListener(new ButtonHandler(btnDot, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btnAddition.addActionListener(new ButtonHandler(btnAddition, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btnRest.addActionListener(new ButtonHandler(btnRest, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btnMulti.addActionListener(new ButtonHandler(btnMulti, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btnDivision.addActionListener(new ButtonHandler(btnDivision, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btnClear.addActionListener(new ButtonHandler(btnClear, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btnMod.addActionListener(new ButtonHandler(btnMod, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btnExp.addActionListener(new ButtonHandler(btnExp, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btnLn.addActionListener(new ButtonHandler(btnLn, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btnSin.addActionListener(new ButtonHandler(btnSin, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btnPow.addActionListener(new ButtonHandler(btnPow, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btnLog.addActionListener(new ButtonHandler(btnLog, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btnCos.addActionListener(new ButtonHandler(btnCos, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btnThird.addActionListener(new ButtonHandler(btnThird, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btnFactorial.addActionListener(new ButtonHandler(btnFactorial, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btnTan.addActionListener(new ButtonHandler(btnTan, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btnSquare.addActionListener(new ButtonHandler(btnSquare, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
		btnExtra.addActionListener(new ButtonHandler(btnExtra, textAreaInput1, textAreaInput2, textFieldOperator, lblOutput, comboBoxModes1, comboBoxModes2));
	}
}
