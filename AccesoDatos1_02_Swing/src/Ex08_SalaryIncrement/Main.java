package Ex08_SalaryIncrement;

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
	private JTextField textFieldAmount;
	private JLabel lblLevel;

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
		setTitle("AUMENTO SALARIAL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAmount = new JLabel("Ingresar el importe salarial");
		lblAmount.setForeground(new Color(255, 255, 255));
		lblAmount.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblAmount.setBounds(10, 10, 320, 40);
		contentPane.add(lblAmount);

		textFieldAmount = new JTextField();
		textFieldAmount.addKeyListener(new TextFieldHandler(textFieldAmount));
		textFieldAmount.setName("textFieldAmount");
		textFieldAmount.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textFieldAmount.setBackground(new Color(128, 255, 255));
		textFieldAmount.setBounds(385, 10, 230, 40);
		contentPane.add(textFieldAmount);
		textFieldAmount.setColumns(10);

		lblLevel = new JLabel("NIVEL ACADÉMICO");
		lblLevel.setHorizontalAlignment(SwingConstants.CENTER);
		lblLevel.setForeground(new Color(0, 0, 255));
		lblLevel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblLevel.setBounds(10, 104, 666, 40);
		contentPane.add(lblLevel);

		JRadioButton rdbtnLincenciatura = new JRadioButton("LICENCIATURA");
		rdbtnLincenciatura.setName("rdbtnLincenciatura");
		rdbtnLincenciatura.setForeground(new Color(255, 255, 255));
		rdbtnLincenciatura.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));
		rdbtnLincenciatura.setBackground(new Color(255, 128, 128));
		rdbtnLincenciatura.setBounds(10, 150, 320, 40);
		contentPane.add(rdbtnLincenciatura);

		JRadioButton rdbtnEspecialidad = new JRadioButton("ESPECIALIDAD");
		rdbtnEspecialidad.setName("rdbtnEspecialidad");
		rdbtnEspecialidad.setForeground(Color.WHITE);
		rdbtnEspecialidad.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));
		rdbtnEspecialidad.setBackground(new Color(255, 128, 128));
		rdbtnEspecialidad.setBounds(356, 150, 320, 40);
		contentPane.add(rdbtnEspecialidad);

		JRadioButton rdbtnMaestria = new JRadioButton("MAESTRÍA");
		rdbtnMaestria.setName("rdbtnMaestria");
		rdbtnMaestria.setForeground(Color.WHITE);
		rdbtnMaestria.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));
		rdbtnMaestria.setBackground(new Color(255, 128, 128));
		rdbtnMaestria.setBounds(10, 202, 320, 40);
		contentPane.add(rdbtnMaestria);

		JRadioButton rdbtnDoctorado = new JRadioButton("DOCTORADO");
		rdbtnDoctorado.setName("rdbtnDoctorado");
		rdbtnDoctorado.setForeground(Color.WHITE);
		rdbtnDoctorado.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));
		rdbtnDoctorado.setBackground(new Color(255, 128, 128));
		rdbtnDoctorado.setBounds(356, 202, 320, 40);
		contentPane.add(rdbtnDoctorado);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnLincenciatura);
		buttonGroup.add(rdbtnEspecialidad);
		buttonGroup.add(rdbtnMaestria);
		buttonGroup.add(rdbtnDoctorado);

		JLabel lblBefore = new JLabel("Salario anterior");
		lblBefore.setForeground(Color.WHITE);
		lblBefore.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblBefore.setBounds(10, 275, 320, 40);
		contentPane.add(lblBefore);

		JLabel lblPercentage = new JLabel("% de Aumento");
		lblPercentage.setForeground(Color.WHITE);
		lblPercentage.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblPercentage.setBounds(356, 275, 320, 40);
		contentPane.add(lblPercentage);

		JLabel lblAfter = new JLabel("Salario final");
		lblAfter.setForeground(Color.WHITE);
		lblAfter.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblAfter.setBounds(10, 335, 320, 40);
		contentPane.add(lblAfter);

		JButton btnCalculate = new JButton("CALCULAR");
		btnCalculate.addActionListener(
				new ButtonHandler(btnCalculate, textFieldAmount, lblBefore, lblPercentage, lblAfter,
						rdbtnLincenciatura, rdbtnEspecialidad, rdbtnMaestria, rdbtnDoctorado, buttonGroup));
		btnCalculate.setForeground(new Color(255, 255, 255));
		btnCalculate.setBackground(new Color(64, 0, 64));
		btnCalculate.setName("btnCalculate");
		btnCalculate.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
		btnCalculate.setBounds(346, 329, 160, 46);
		contentPane.add(btnCalculate);

		JButton btnRestart = new JButton("REINICIAR");
		btnRestart.addActionListener(
				new ButtonHandler(btnRestart, textFieldAmount, lblBefore, lblPercentage, lblAfter,
						rdbtnLincenciatura, rdbtnEspecialidad, rdbtnMaestria, rdbtnDoctorado, buttonGroup));
		btnRestart.setName("btnRestart");
		btnRestart.setForeground(new Color(128, 255, 128));
		btnRestart.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
		btnRestart.setBackground(new Color(128, 0, 0));
		btnRestart.setBounds(516, 329, 160, 46);
		contentPane.add(btnRestart);

	}
}
