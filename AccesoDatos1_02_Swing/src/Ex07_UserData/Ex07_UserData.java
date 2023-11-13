package Ex07_UserData;

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

public class Ex07_UserData extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldSurname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex07_UserData frame = new Ex07_UserData();
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
	public Ex07_UserData() {
		setTitle("SEND YOUR DATA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTittle = new JLabel("USER DATA");
		lblTittle.setForeground(new Color(255, 0, 0));
		lblTittle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTittle.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblTittle.setBounds(10, 10, 666, 40);
		contentPane.add(lblTittle);
		
		JLabel lblName = new JLabel("NOMBRE");
		lblName.setForeground(new Color(255, 0, 128));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setBounds(20, 90, 150, 40);
		contentPane.add(lblName);
		
		JLabel lblSurname = new JLabel("APELLIDOS");
		lblSurname.setForeground(new Color(255, 0, 128));
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSurname.setBounds(20, 156, 150, 40);
		contentPane.add(lblSurname);
		
		JLabel lblSex = new JLabel("SEXO");
		lblSex.setForeground(new Color(255, 0, 128));
		lblSex.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSex.setBounds(20, 220, 150, 40);
		contentPane.add(lblSex);
		
		textFieldName = new JTextField();
		textFieldName.addKeyListener(new TextFieldHandler(textFieldName));
		textFieldName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldName.setBounds(180, 95, 496, 40);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldSurname = new JTextField();
		textFieldSurname.addKeyListener(new TextFieldHandler(textFieldSurname));
		textFieldSurname.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldSurname.setColumns(10);
		textFieldSurname.setBounds(180, 156, 496, 40);
		contentPane.add(textFieldSurname);
		
		JRadioButton rdbtnSexM = new JRadioButton("Male");
		rdbtnSexM.setForeground(new Color(255, 128, 0));
		rdbtnSexM.setBackground(new Color(0, 255, 255));
		rdbtnSexM.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnSexM.setBounds(180, 224, 150, 40);
		contentPane.add(rdbtnSexM);
		
		JRadioButton rdbtnSexF = new JRadioButton("Female");
		rdbtnSexF.setForeground(new Color(255, 128, 0));
		rdbtnSexF.setBackground(new Color(0, 255, 255));
		rdbtnSexF.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnSexF.setBounds(375, 224, 150, 40);
		contentPane.add(rdbtnSexF);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnSexM);
		buttonGroup.add(rdbtnSexF);
		
		JButton btnContinue = new JButton("CONTINUAR");
		btnContinue.addActionListener(new ButtonHandler(textFieldName, textFieldSurname, buttonGroup));
		btnContinue.setBackground(new Color(0, 64, 0));
		btnContinue.setName("btnContinue");
		btnContinue.setFont(new Font("Tahoma", Font.ITALIC, 20));
		btnContinue.setForeground(new Color(0, 255, 0));
		btnContinue.setBounds(85, 324, 225, 40);
		contentPane.add(btnContinue);
		
		JButton btnExit = new JButton("SALIR");
		btnExit.addActionListener(new ButtonHandler(textFieldName, textFieldSurname, buttonGroup));
		btnExit.setName("btnExit");
		btnExit.setForeground(new Color(255, 0, 0));
		btnExit.setFont(new Font("Tahoma", Font.ITALIC, 20));
		btnExit.setBackground(new Color(128, 0, 0));
		btnExit.setBounds(375, 324, 225, 40);
		contentPane.add(btnExit);
	}
}
