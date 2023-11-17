package Ex16_CheckWordTimes;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldWord;

	
	private static void fillTextArea(JTextArea textArea) {
		textArea.append("casa" + "\n");
		textArea.append("palabra" + "\n");
		textArea.append("adios" + "\n");
		textArea.append("hola" + "\n");
		textArea.append("perro" + "\n");
		textArea.append("gato" + "\n");
		textArea.append("cerdo" + "\n");
		textArea.append("caballo" + "\n");
		textArea.append("vaca" + "\n");
		textArea.append("perro" + "\n");
		textArea.append("gato" + "\n");
		textArea.append("cerdo" + "\n");
		textArea.append("caballo" + "\n");
		textArea.append("vaca" + "\n");
		textArea.append("perro" + "\n");
		textArea.append("gato" + "\n");
	}

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
		setTitle("SEARCH WORD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 530);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setForeground(new Color(0, 0, 0));
		textArea.setFont(new Font("Poor Richard", Font.PLAIN, 20));
		textArea.setBackground(new Color(128, 255, 128));
		textArea.setBounds(10, 10, 566, 330);
		fillTextArea(textArea);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("Palabra a buscar:");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Poor Richard", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 350, 140, 30);
		contentPane.add(lblNewLabel);
		
		textFieldWord = new JTextField();
		textFieldWord.addFocusListener(new FocusHandler(textFieldWord));
		textFieldWord.setBackground(new Color(192, 192, 192));
		textFieldWord.setFont(new Font("Poor Richard", Font.PLAIN, 20));
		textFieldWord.setBounds(165, 350, 411, 30);
		contentPane.add(textFieldWord);
		textFieldWord.setColumns(10);
		
		JButton btnSearch = new JButton("BUSCAR");
		btnSearch.addActionListener(new ButtonHandler(btnSearch, textFieldWord, textArea));
		btnSearch.setName("btnSearch");
		btnSearch.setBackground(new Color(128, 0, 128));
		btnSearch.setForeground(new Color(128, 255, 255));
		btnSearch.setFont(new Font("Poor Richard", Font.BOLD, 30));
		btnSearch.setBounds(165, 403, 250, 80);
		contentPane.add(btnSearch);
	}

}
