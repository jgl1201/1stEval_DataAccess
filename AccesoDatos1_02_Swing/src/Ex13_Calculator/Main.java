package Ex13_Calculator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textFieldNumber1;
	private JTextField textFieldOperation;
	private JTextField textFieldNumber2;

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
		setTitle("CALCULADORA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnHex = new JRadioButton("HEX");
		buttonGroup.add(rdbtnHex);
		rdbtnHex.setBackground(new Color(128, 255, 128));
		rdbtnHex.setName("rdbtnHex");
		rdbtnHex.setFont(new Font("Goudy Old Style", Font.BOLD, 16));
		rdbtnHex.setBounds(6, 6, 60, 21);
		contentPane.add(rdbtnHex);
		
		JRadioButton rdbtnDec = new JRadioButton("DEC", true);
		buttonGroup.add(rdbtnDec);
		rdbtnDec.setName("rdbtnDec");
		rdbtnDec.setFont(new Font("Goudy Old Style", Font.BOLD, 16));
		rdbtnDec.setBackground(new Color(128, 255, 128));
		rdbtnDec.setBounds(78, 6, 60, 21);
		contentPane.add(rdbtnDec);
		
		JRadioButton rdbtnBin = new JRadioButton("BIN");
		buttonGroup.add(rdbtnBin);
		rdbtnBin.setName("rdbtnBin");
		rdbtnBin.setFont(new Font("Goudy Old Style", Font.BOLD, 16));
		rdbtnBin.setBackground(new Color(128, 255, 128));
		rdbtnBin.setBounds(223, 6, 60, 21);
		contentPane.add(rdbtnBin);
		
		JRadioButton rdbtnOct = new JRadioButton("OCT");
		buttonGroup.add(rdbtnOct);
		rdbtnOct.setName("rdbtnOct");
		rdbtnOct.setFont(new Font("Goudy Old Style", Font.BOLD, 16));
		rdbtnOct.setBackground(new Color(128, 255, 128));
		rdbtnOct.setBounds(150, 6, 60, 21);
		contentPane.add(rdbtnOct);
		
		JLabel lblNumero1 = new JLabel("Número 1");
		lblNumero1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumero1.setName("lblNumero1");
		lblNumero1.setBounds(10, 33, 273, 50);
		lblNumero1.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		contentPane.add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("Número 2");
		lblNumero2.setName("lblNumero2");
		lblNumero2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumero2.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		lblNumero2.setBounds(510, 33, 273, 50);
		contentPane.add(lblNumero2);
		
		JLabel lblOperation = new JLabel("Operación");
		lblOperation.setName("lblOperation");
		lblOperation.setHorizontalAlignment(SwingConstants.CENTER);
		lblOperation.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		lblOperation.setBounds(325, 33, 140, 50);
		contentPane.add(lblOperation);
		
		textFieldNumber1 = new JTextField();
		textFieldNumber1.addKeyListener(new TextFieldHandler(textFieldNumber1));
		textFieldNumber1.addFocusListener(new FocusHandler(textFieldNumber1));
		textFieldNumber1.setBackground(new Color(192, 192, 192));
		textFieldNumber1.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
		textFieldNumber1.setName("textFieldNumber1");
		textFieldNumber1.setBounds(10, 93, 264, 50);
		contentPane.add(textFieldNumber1);
		textFieldNumber1.setColumns(10);
		
		textFieldOperation = new JTextField(1);
		textFieldOperation.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOperation.addKeyListener(new SymbolHandler(textFieldOperation));
		textFieldOperation.addFocusListener(new FocusHandler(textFieldOperation));
		textFieldOperation.setName("textFieldOperation");
		textFieldOperation.setFont(new Font("Goudy Old Style", Font.PLAIN, 30));
		textFieldOperation.setColumns(10);
		textFieldOperation.setBackground(Color.LIGHT_GRAY);
		textFieldOperation.setBounds(325, 93, 140, 50);
		contentPane.add(textFieldOperation);
		
		textFieldNumber2 = new JTextField();
		textFieldNumber2.addKeyListener(new TextFieldHandler(textFieldNumber2));
		textFieldNumber2.addFocusListener(new FocusHandler(textFieldNumber2));
		textFieldNumber2.setName("textFieldNumber2");
		textFieldNumber2.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
		textFieldNumber2.setColumns(10);
		textFieldNumber2.setBackground(Color.LIGHT_GRAY);
		textFieldNumber2.setBounds(520, 93, 263, 50);
		contentPane.add(textFieldNumber2);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ButtonHandler(btnAdd, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btnAdd.setForeground(new Color(255, 255, 255));
		btnAdd.setBackground(new Color(128, 0, 0));
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnAdd.setName("btnAdd");
		btnAdd.setBounds(325, 155, 60, 60);
		contentPane.add(btnAdd);
		
		JButton btnRest = new JButton("-");
		btnRest.addActionListener(new ButtonHandler(btnRest, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btnRest.setName("btnRest");
		btnRest.setForeground(Color.WHITE);
		btnRest.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnRest.setBackground(new Color(128, 0, 0));
		btnRest.setBounds(325, 225, 60, 60);
		contentPane.add(btnRest);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ButtonHandler(btnDivision, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btnDivision.setName("btnDivision");
		btnDivision.setForeground(Color.WHITE);
		btnDivision.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnDivision.setBackground(new Color(128, 0, 0));
		btnDivision.setBounds(405, 225, 60, 60);
		contentPane.add(btnDivision);
		
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ButtonHandler(btnMulti, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btnMulti.setName("btnMulti");
		btnMulti.setForeground(Color.WHITE);
		btnMulti.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnMulti.setBackground(new Color(128, 0, 0));
		btnMulti.setBounds(405, 155, 60, 60);
		contentPane.add(btnMulti);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ButtonHandler(btnEqual, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btnEqual.setName("btnEqual");
		btnEqual.setForeground(Color.WHITE);
		btnEqual.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnEqual.setBackground(new Color(128, 0, 0));
		btnEqual.setBounds(325, 365, 140, 60);
		contentPane.add(btnEqual);
		
		JButton btnMod = new JButton("MOD");
		btnMod.addActionListener(new ButtonHandler(btnMod, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btnMod.setName("btnMod");
		btnMod.setForeground(Color.WHITE);
		btnMod.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnMod.setBackground(new Color(128, 0, 0));
		btnMod.setBounds(325, 295, 140, 60);
		contentPane.add(btnMod);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ButtonHandler(btn1, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btn1.setName("btn1");
		btn1.setForeground(Color.WHITE);
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn1.setBackground(new Color(0, 64, 128));
		btn1.setBounds(520, 155, 80, 60);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");;
		btn2.addActionListener(new ButtonHandler(btn2, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btn2.setName("btn2");
		btn2.setForeground(Color.WHITE);
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn2.setBackground(new Color(0, 64, 128));
		btn2.setBounds(611, 155, 80, 60);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ButtonHandler(btn3, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btn3.setName("btn3");
		btn3.setForeground(Color.WHITE);
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn3.setBackground(new Color(0, 64, 128));
		btn3.setBounds(703, 155, 80, 60);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ButtonHandler(btn4, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btn4.setName("btn4");
		btn4.setForeground(Color.WHITE);
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn4.setBackground(new Color(0, 64, 128));
		btn4.setBounds(520, 225, 80, 60);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ButtonHandler(btn5, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btn5.setName("btn5");
		btn5.setForeground(Color.WHITE);
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn5.setBackground(new Color(0, 64, 128));
		btn5.setBounds(611, 225, 80, 60);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ButtonHandler(btn6, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btn6.setName("btn6");
		btn6.setForeground(Color.WHITE);
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn6.setBackground(new Color(0, 64, 128));
		btn6.setBounds(703, 225, 80, 60);
		contentPane.add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ButtonHandler(btn9, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btn9.setName("btn9");
		btn9.setForeground(Color.WHITE);
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn9.setBackground(new Color(0, 64, 128));
		btn9.setBounds(703, 295, 80, 60);
		contentPane.add(btn9);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ButtonHandler(btn7, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btn7.setName("btn7");
		btn7.setForeground(Color.WHITE);
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn7.setBackground(new Color(0, 64, 128));
		btn7.setBounds(520, 295, 80, 60);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ButtonHandler(btn8, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btn8.setName("btn8");
		btn8.setForeground(Color.WHITE);
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn8.setBackground(new Color(0, 64, 128));
		btn8.setBounds(611, 295, 80, 60);
		contentPane.add(btn8);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ButtonHandler(btn00, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btn00.setName("btn00");
		btn00.setForeground(Color.WHITE);
		btn00.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn00.setBackground(new Color(0, 64, 128));
		btn00.setBounds(703, 365, 80, 60);
		contentPane.add(btn00);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ButtonHandler(btn0, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btn0.setName("btn0");
		btn0.setForeground(Color.WHITE);
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn0.setBackground(new Color(0, 64, 128));
		btn0.setBounds(611, 365, 80, 60);
		contentPane.add(btn0);
		
		JButton btnPoint = new JButton(".");
		btnPoint.addActionListener(new ButtonHandler(btnPoint, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btnPoint.setName("btnPoint");
		btnPoint.setForeground(Color.WHITE);
		btnPoint.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnPoint.setBackground(new Color(0, 64, 128));
		btnPoint.setBounds(520, 365, 80, 60);
		contentPane.add(btnPoint);
		
		JButton btnExp = new JButton("EXP");
		btnExp.addActionListener(new ButtonHandler(btnExp, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btnExp.setName("btnExp");
		btnExp.setForeground(Color.WHITE);
		btnExp.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnExp.setBackground(new Color(255, 0, 128));
		btnExp.setBounds(10, 153, 80, 60);
		contentPane.add(btnExp);
		
		JButton btnLog = new JButton("log");
		btnLog.addActionListener(new ButtonHandler(btnLog, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btnLog.setName("btnLog");
		btnLog.setForeground(Color.WHITE);
		btnLog.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnLog.setBackground(new Color(255, 0, 128));
		btnLog.setBounds(101, 153, 80, 60);
		contentPane.add(btnLog);
		
		JButton btnLn = new JButton("ln");
		btnLn.addActionListener(new ButtonHandler(btnLn, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btnLn.setName("btnLn");
		btnLn.setForeground(Color.WHITE);
		btnLn.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnLn.setBackground(new Color(255, 0, 128));
		btnLn.setBounds(193, 153, 80, 60);
		contentPane.add(btnLn);
		
		JButton btnSin = new JButton("SIN");
		btnSin.addActionListener(new ButtonHandler(btnSin, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btnSin.setName("btnSin");
		btnSin.setForeground(Color.WHITE);
		btnSin.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnSin.setBackground(new Color(255, 0, 128));
		btnSin.setBounds(10, 223, 80, 60);
		contentPane.add(btnSin);
		
		JButton btnCos = new JButton("COS");
		btnCos.addActionListener(new ButtonHandler(btnCos, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btnCos.setName("btnCos");
		btnCos.setForeground(Color.WHITE);
		btnCos.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnCos.setBackground(new Color(255, 0, 128));
		btnCos.setBounds(101, 223, 80, 60);
		contentPane.add(btnCos);
		
		JButton btnTan = new JButton("TAN");
		btnTan.addActionListener(new ButtonHandler(btnTan, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btnTan.setName("btnTan");
		btnTan.setForeground(Color.WHITE);
		btnTan.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnTan.setBackground(new Color(255, 0, 128));
		btnTan.setBounds(193, 223, 80, 60);
		contentPane.add(btnTan);
		
		JButton btnSquare = new JButton("x^2");
		btnSquare.addActionListener(new ButtonHandler(btnSquare, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btnSquare.setName("btnSquare");
		btnSquare.setForeground(Color.WHITE);
		btnSquare.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnSquare.setBackground(new Color(255, 0, 128));
		btnSquare.setBounds(10, 293, 80, 60);
		contentPane.add(btnSquare);
		
		JButton btnThird = new JButton("x^3");
		btnThird.addActionListener(new ButtonHandler(btnThird, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btnThird.setName("btnThird");
		btnThird.setForeground(Color.WHITE);
		btnThird.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnThird.setBackground(new Color(255, 0, 128));
		btnThird.setBounds(101, 293, 80, 60);
		contentPane.add(btnThird);
		
		JButton btnExponential = new JButton("x^y");
		btnExponential.addActionListener(new ButtonHandler(btnExponential, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btnExponential.setName("btnExponential");
		btnExponential.setForeground(Color.WHITE);
		btnExponential.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnExponential.setBackground(new Color(255, 0, 128));
		btnExponential.setBounds(193, 293, 80, 60);
		contentPane.add(btnExponential);
		
		JButton btnFactorial = new JButton("n!");
		btnFactorial.addActionListener(new ButtonHandler(btnFactorial, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btnFactorial.setName("btnFactorial");
		btnFactorial.setForeground(Color.WHITE);
		btnFactorial.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnFactorial.setBackground(new Color(255, 0, 128));
		btnFactorial.setBounds(10, 365, 128, 60);
		contentPane.add(btnFactorial);
		
		JButton btnExtra = new JButton("1/x");
		btnExtra.addActionListener(new ButtonHandler(btnExtra, textFieldNumber1, textFieldOperation, textFieldNumber2,
				rdbtnHex, rdbtnDec, rdbtnBin, rdbtnOct, buttonGroup));
		btnExtra.setName("btnExtra");
		btnExtra.setForeground(Color.WHITE);
		btnExtra.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnExtra.setBackground(new Color(255, 0, 128));
		btnExtra.setBounds(150, 365, 128, 60);
		contentPane.add(btnExtra);
		
	}
}
