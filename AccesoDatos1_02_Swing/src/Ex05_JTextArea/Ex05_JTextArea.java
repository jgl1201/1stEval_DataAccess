package Ex05_JTextArea;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Ex05_JTextArea extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JTextArea textArea;
	private static boolean isVisible = true;
	private static String storedText = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex05_JTextArea frame = new Ex05_JTextArea();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		String text = textArea.getText();

		if (button.getName().equals("btnHide")) {
			if (isVisible) {
				storedText = text;
				textArea.setText("");
				isVisible = false;
			} else
				JOptionPane.showMessageDialog(null, "No hay nada que ocultar");
		} else if (button.getName().equals("btnShow")) {
			if (!isVisible) {
				textArea.setText(storedText);
				isVisible = true;
			} else
				JOptionPane.showMessageDialog(null, "No hay nada que mostrar");
		}

	}

	/**
	 * Create the frame.
	 */
	public Ex05_JTextArea() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textArea = new JTextArea();
		textArea.setBounds(35, 34, 517, 317);
		contentPane.add(textArea);

		JButton btnHide = new JButton("HIDE");
		btnHide.setName("btnHide");
		btnHide.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnHide.setBounds(119, 361, 130, 55);
		contentPane.add(btnHide);
		btnHide.addActionListener(this);

		JButton btnShow = new JButton("SHOW");
		btnShow.setName("btnShow");
		btnShow.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnShow.setBounds(350, 361, 130, 55);
		contentPane.add(btnShow);
		btnShow.addActionListener(this);

		setVisible(true);
	}

}