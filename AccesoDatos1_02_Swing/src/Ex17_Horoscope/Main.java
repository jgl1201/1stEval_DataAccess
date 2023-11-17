package Ex17_Horoscope;

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
	private JTextField textFieldDay;
	private JTextField textFieldMonth;

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
		setTitle("ZODIAC SIGN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 540);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 64, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("New label");
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setFont(new Font("Lucida Calligraphy", Font.BOLD, 40));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(10, 10, 866, 50);
		contentPane.add(lblTitle);
		
		JLabel lblDay = new JLabel("Día de Nacimiento");
		lblDay.setForeground(new Color(255, 255, 255));
		lblDay.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 30));
		lblDay.setBounds(10, 80, 325, 50);
		contentPane.add(lblDay);
		
		JLabel lblMonth = new JLabel("Mes de Nacimiento");
		lblMonth.setForeground(Color.WHITE);
		lblMonth.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 30));
		lblMonth.setBounds(10, 151, 325, 50);
		contentPane.add(lblMonth);
		
		JLabel lblResult = new JLabel("Signo del Zodiaco");
		lblResult.setForeground(Color.WHITE);
		lblResult.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 30));
		lblResult.setBounds(10, 350, 278, 103);
		contentPane.add(lblResult);
		
		textFieldDay = new JTextField();
		textFieldDay.addKeyListener(new TextFieldHandler(textFieldDay));
		textFieldDay.addFocusListener(new FocusHandler(textFieldDay));
		textFieldDay.setBackground(new Color(192, 192, 192));
		textFieldDay.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 30));
		textFieldDay.setBounds(345, 80, 531, 50);
		contentPane.add(textFieldDay);
		textFieldDay.setColumns(10);
		
		textFieldMonth = new JTextField();
		textFieldMonth.addKeyListener(new TextFieldHandler(textFieldMonth));
		textFieldMonth.addFocusListener(new FocusHandler(textFieldMonth));
		textFieldMonth.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 30));
		textFieldMonth.setColumns(10);
		textFieldMonth.setBackground(Color.LIGHT_GRAY);
		textFieldMonth.setBounds(345, 151, 531, 50);
		contentPane.add(textFieldMonth);
		
		JLabel lblSigno = new JLabel("");
		lblSigno.setForeground(new Color(255, 255, 255));
		lblSigno.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 25));
		lblSigno.setBounds(692, 350, 184, 103);
		contentPane.add(lblSigno);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setForeground(Color.WHITE);
		lblIcon.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 25));
		lblIcon.setBounds(345, 350, 337, 126);
		contentPane.add(lblIcon);
		
		JButton btnFind = new JButton("AVERIGUAR");
		btnFind.addActionListener(new ButtonHandler(btnFind, textFieldDay, textFieldMonth, lblSigno, lblIcon));
		btnFind.setBackground(new Color(0, 128, 0));
		btnFind.setForeground(new Color(128, 255, 0));
		btnFind.setName("btnFind");
		btnFind.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30));
		btnFind.setBounds(10, 225, 866, 50);
		contentPane.add(btnFind);
		
		JButton btnExit = new JButton("SALIR");
		btnExit.addActionListener(new ButtonHandler(btnExit, textFieldDay, textFieldMonth, lblSigno, lblIcon));
		btnExit.setForeground(new Color(255, 0, 0));
		btnExit.setBackground(new Color(128, 0, 0));
		btnExit.setName("btnExit");
		btnExit.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30));
		btnExit.setBounds(10, 290, 866, 50);
		contentPane.add(btnExit);		
	}
}
