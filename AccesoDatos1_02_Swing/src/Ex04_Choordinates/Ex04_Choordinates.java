package Ex04_Choordinates;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex04_Choordinates extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldP1X;
	private JTextField textFieldP1Y;
	private JTextField textFieldP2X;
	private JTextField textFieldP3X;
	private JTextField textFieldP2Y;
	private JTextField textFieldP3Y;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex04_Choordinates frame = new Ex04_Choordinates();
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
	public Ex04_Choordinates() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblP1 = new JLabel("Ingresar el Punto 1");
		lblP1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblP1.setBounds(25, 82, 175, 25);
		contentPane.add(lblP1);
		
		JLabel lblP2 = new JLabel("Ingresar el Punto 2");
		lblP2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblP2.setBounds(25, 137, 175, 25);
		contentPane.add(lblP2);
		
		JLabel lblP3 = new JLabel("Ingresar el Punto 3");
		lblP3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblP3.setBounds(25, 192, 175, 25);
		contentPane.add(lblP3);
		
		textFieldP1X = new JTextField();
		textFieldP1X.setBounds(238, 84, 175, 25);
		contentPane.add(textFieldP1X);
		textFieldP1X.setColumns(10);
		
		JLabel lblCX = new JLabel("Coordenada X");
		lblCX.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCX.setBounds(238, 10, 175, 25);
		contentPane.add(lblCX);
		
		JLabel lblCY = new JLabel("Coordenada Y");
		lblCY.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCY.setBounds(498, 10, 175, 25);
		contentPane.add(lblCY);
		
		textFieldP1Y = new JTextField();
		textFieldP1Y.setColumns(10);
		textFieldP1Y.setBounds(509, 82, 175, 25);
		contentPane.add(textFieldP1Y);
		
		textFieldP2X = new JTextField();
		textFieldP2X.setColumns(10);
		textFieldP2X.setBounds(238, 137, 175, 25);
		contentPane.add(textFieldP2X);
		
		textFieldP3X = new JTextField();
		textFieldP3X.setColumns(10);
		textFieldP3X.setBounds(238, 192, 175, 25);
		contentPane.add(textFieldP3X);
		
		textFieldP2Y = new JTextField();
		textFieldP2Y.setColumns(10);
		textFieldP2Y.setBounds(509, 137, 175, 25);
		contentPane.add(textFieldP2Y);
		
		textFieldP3Y = new JTextField();
		textFieldP3Y.setColumns(10);
		textFieldP3Y.setBounds(509, 192, 175, 25);
		contentPane.add(textFieldP3Y);
		
		JLabel lblResult = new JLabel("El perímetro es: ");
		lblResult.setHorizontalAlignment(SwingConstants.LEFT);
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResult.setBounds(25, 371, 388, 25);
		contentPane.add(lblResult);
		
		JButton btnCalculate = new JButton("CALCULAR");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double x1 = Double.parseDouble(textFieldP1X.getText());
					double y1 = Double.parseDouble(textFieldP1Y.getText());
					double x2 = Double.parseDouble(textFieldP2X.getText());
					double y2 = Double.parseDouble(textFieldP2Y.getText());
					double x3 = Double.parseDouble(textFieldP3X.getText());
					double y3 = Double.parseDouble(textFieldP3Y.getText());
					
					double perimeter = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)) + Math.sqrt(Math.pow((x3-x2), 2) 
							+ Math.pow((y3-y2), 2)) + Math.sqrt(Math.pow((x1-x3), 2) + Math.pow((y1-y3), 2));
					lblResult.setText("El perimetro es: " + String.format("%.2f", perimeter));
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnCalculate.setName("btnCalculate");
		btnCalculate.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnCalculate.setBounds(25, 270, 175, 53);
		contentPane.add(btnCalculate);
		
		JButton btnRestart = new JButton("REINICIAR");
		btnRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldP1X.setText("");
				textFieldP1Y.setText("");
				textFieldP2X.setText("");
				textFieldP2Y.setText("");
				textFieldP3X.setText("");
				textFieldP3Y.setText("");
				lblResult.setText("El perímetro es: ");
			}
		});
		btnRestart.setName("btnRestart");
		btnRestart.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnRestart.setBounds(238, 270, 175, 53);
		contentPane.add(btnRestart);
		
		
	}
}
