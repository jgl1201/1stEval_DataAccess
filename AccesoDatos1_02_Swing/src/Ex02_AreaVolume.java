import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ex02_AreaVolume extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldRadius;
	private JTextField textFieldHeight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex02_AreaVolume frame = new Ex02_AreaVolume();
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
	public Ex02_AreaVolume() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblRadius = new JLabel("Ingrese el radio:");
		lblRadius.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblRadius.setBounds(42, 62, 170, 40);
		contentPane.add(lblRadius);

		JLabel lblHeight = new JLabel("Ingrese la altura:");
		lblHeight.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblHeight.setBounds(42, 143, 170, 40);
		contentPane.add(lblHeight);

		JLabel lblVolume = new JLabel("Volumen: ");
		lblVolume.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblVolume.setBounds(42, 240, 320, 40);
		contentPane.add(lblVolume);

		JLabel lblArea = new JLabel("Area: ");
		lblArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblArea.setBounds(42, 321, 320, 40);
		contentPane.add(lblArea);

		textFieldRadius = new JTextField();
		textFieldRadius.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("BIENVENIDO");
			}
			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("CHAO");
			}
		});
		textFieldRadius.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println(e.getKeyChar());
				
				if (Character.isDigit(e.getKeyChar()) || e.getKeyChar() == '.') {
					textFieldRadius.setEditable(true);
					textFieldRadius.setBackground(Color.WHITE);
				} else {
					textFieldRadius.setBackground(Color.RED);
					JOptionPane.showMessageDialog(null, "Introduce solo números, CARAECHIMBA");
					e.consume();
				}
				
			}
		});
		textFieldRadius.setBounds(222, 62, 140, 40);
		contentPane.add(textFieldRadius);
		textFieldRadius.setColumns(10);

		textFieldHeight = new JTextField();
		textFieldHeight.setColumns(10);
		textFieldHeight.setBounds(222, 143, 140, 40);
		contentPane.add(textFieldHeight);
		textFieldHeight.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println(e.getKeyChar());
				
				if (Character.isDigit(e.getKeyChar()) || e.getKeyChar() == '.') {
					textFieldHeight.setEditable(true);
					textFieldHeight.setBackground(Color.WHITE);
				} else {
					textFieldHeight.setBackground(Color.RED);
					JOptionPane.showMessageDialog(null, "Introduce solo números, CARAECHIMBA");
					e.consume();
				}
				
			}
		});
		
		JButton btnCalculate = new JButton("Calcular");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double radio = Double.parseDouble(textFieldRadius.getText());
					double altura = Double.parseDouble(textFieldHeight.getText());
					double area = (Math.PI * Math.pow(radio, 2)) + (2*Math.PI * radio * altura);
					double volumen = Math.PI * Math.pow(radio, 2) * altura;
					
					lblArea.setText("Area: " + area);
					lblVolume.setText("Volumen: " + volumen);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Introduce solo numeros, MAMAWEBO");
				}
			}
		});
		btnCalculate.setBackground(new Color(128, 255, 255));
		btnCalculate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCalculate.setBounds(433, 62, 170, 40);
		contentPane.add(btnCalculate);

		JButton btnRestart = new JButton("Reiniciar");
		btnRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldRadius.setText("");
				textFieldHeight.setText("");
				lblArea.setText("Area: ");
				lblVolume.setText("Volumen: ");
			}
		});
		btnRestart.setBackground(new Color(128, 255, 255));
		btnRestart.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnRestart.setBounds(433, 143, 170, 40);
		contentPane.add(btnRestart);

	}
}
