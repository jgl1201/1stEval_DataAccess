package Ex07_UserData;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ContinueFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContinueFrame frame = new ContinueFrame();
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
	public ContinueFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 319);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDataSent = new JLabel("DATOS ENVIADOS!!!!");
		lblDataSent.setForeground(new Color(255, 0, 0));
		lblDataSent.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblDataSent.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataSent.setBounds(10, 10, 446, 54);
		contentPane.add(lblDataSent);
		
		JButton btnBack = new JButton("VOLVER");
		btnBack.addActionListener(new ButtonHandler());
		btnBack.setName("btnBack");
		btnBack.setBackground(new Color(0, 64, 0));
		btnBack.setForeground(new Color(0, 255, 0));
		btnBack.setFont(new Font("Tahoma", Font.ITALIC, 25));
		btnBack.setBounds(10, 127, 192, 54);
		contentPane.add(btnBack);
		
		JButton btnClose = new JButton("CERRAR");
		btnClose.addActionListener(new ButtonHandler());
		btnClose.setName("btnClose");
		btnClose.setForeground(new Color(255, 0, 0));
		btnClose.setFont(new Font("Tahoma", Font.ITALIC, 25));
		btnClose.setBackground(new Color(128, 0, 0));
		btnClose.setBounds(264, 127, 192, 54);
		contentPane.add(btnClose);
	}
}
