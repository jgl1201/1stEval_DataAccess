package ExercisesLauncher;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

public class ExercisesLauncher extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExercisesLauncher frame = new ExercisesLauncher();
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
	public ExercisesLauncher() {
		setTitle("LANZADOR DE EJERCICIOS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 507, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 25, 25));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{95, 95, 95, 95, 95, 0};
		gbl_contentPane.rowHeights = new int[]{113, 113, 113, 113, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btn01 = new JButton("Ex 01");
		btn01.addActionListener(new ButtonHandler(btn01));
		btn01.setForeground(new Color(255, 255, 255));
		btn01.setBackground(new Color(255, 128, 128));
		btn01.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btn01.setName("btn01");
		GridBagConstraints gbc_btn01 = new GridBagConstraints();
		gbc_btn01.fill = GridBagConstraints.BOTH;
		gbc_btn01.insets = new Insets(0, 0, 5, 5);
		gbc_btn01.gridx = 0;
		gbc_btn01.gridy = 0;
		contentPane.add(btn01, gbc_btn01);
		
		JButton btn02 = new JButton("Ex 02");
		btn02.addActionListener(new ButtonHandler(btn02));
		btn02.setForeground(new Color(255, 255, 255));
		btn02.setBackground(new Color(255, 255, 128));
		btn02.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btn02.setName("btn02");
		GridBagConstraints gbc_btn02 = new GridBagConstraints();
		gbc_btn02.fill = GridBagConstraints.BOTH;
		gbc_btn02.insets = new Insets(0, 0, 5, 5);
		gbc_btn02.gridx = 1;
		gbc_btn02.gridy = 0;
		contentPane.add(btn02, gbc_btn02);
		
		JButton btn03 = new JButton("Ex 03");
		btn03.addActionListener(new ButtonHandler(btn03));
		btn03.setForeground(new Color(255, 255, 255));
		btn03.setBackground(new Color(128, 255, 128));
		btn03.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btn03.setName("btn03");
		GridBagConstraints gbc_btn03 = new GridBagConstraints();
		gbc_btn03.fill = GridBagConstraints.BOTH;
		gbc_btn03.insets = new Insets(0, 0, 5, 5);
		gbc_btn03.gridx = 2;
		gbc_btn03.gridy = 0;
		contentPane.add(btn03, gbc_btn03);
		
		JButton btn04 = new JButton("Ex 04");
		btn04.addActionListener(new ButtonHandler(btn04));
		btn04.setForeground(new Color(255, 255, 255));
		btn04.setBackground(new Color(128, 255, 255));
		btn04.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btn04.setName("btn04");
		GridBagConstraints gbc_btn04 = new GridBagConstraints();
		gbc_btn04.fill = GridBagConstraints.BOTH;
		gbc_btn04.insets = new Insets(0, 0, 5, 5);
		gbc_btn04.gridx = 3;
		gbc_btn04.gridy = 0;
		contentPane.add(btn04, gbc_btn04);
		
		JButton btn05 = new JButton("Ex 05");
		btn05.addActionListener(new ButtonHandler(btn05));
		btn05.setForeground(new Color(255, 255, 255));
		btn05.setBackground(new Color(255, 128, 255));
		btn05.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btn05.setName("btn05");
		GridBagConstraints gbc_btn05 = new GridBagConstraints();
		gbc_btn05.fill = GridBagConstraints.BOTH;
		gbc_btn05.insets = new Insets(0, 0, 5, 0);
		gbc_btn05.gridx = 4;
		gbc_btn05.gridy = 0;
		contentPane.add(btn05, gbc_btn05);
		
		JButton btn06 = new JButton("Ex 06");
		btn06.addActionListener(new ButtonHandler(btn06));
		btn06.setForeground(new Color(255, 255, 255));
		btn06.setBackground(new Color(255, 0, 0));
		btn06.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btn06.setName("btn06");
		GridBagConstraints gbc_btn06 = new GridBagConstraints();
		gbc_btn06.fill = GridBagConstraints.BOTH;
		gbc_btn06.insets = new Insets(0, 0, 5, 5);
		gbc_btn06.gridx = 0;
		gbc_btn06.gridy = 1;
		contentPane.add(btn06, gbc_btn06);
		
		JButton btn07 = new JButton("Ex 07");
		btn07.addActionListener(new ButtonHandler(btn07));
		btn07.setForeground(new Color(255, 255, 255));
		btn07.setBackground(new Color(255, 255, 0));
		btn07.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btn07.setName("btn07");
		GridBagConstraints gbc_btn07 = new GridBagConstraints();
		gbc_btn07.fill = GridBagConstraints.BOTH;
		gbc_btn07.insets = new Insets(0, 0, 5, 5);
		gbc_btn07.gridx = 1;
		gbc_btn07.gridy = 1;
		contentPane.add(btn07, gbc_btn07);
		
		JButton btn08 = new JButton("Ex 08");
		btn08.addActionListener(new ButtonHandler(btn08));
		btn08.setForeground(new Color(255, 255, 255));
		btn08.setBackground(new Color(128, 255, 0));
		btn08.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btn08.setName("btn08");
		GridBagConstraints gbc_btn08 = new GridBagConstraints();
		gbc_btn08.fill = GridBagConstraints.BOTH;
		gbc_btn08.insets = new Insets(0, 0, 5, 5);
		gbc_btn08.gridx = 2;
		gbc_btn08.gridy = 1;
		contentPane.add(btn08, gbc_btn08);
		
		JButton btn09 = new JButton("Ex 09");
		btn09.addActionListener(new ButtonHandler(btn09));
		btn09.setForeground(new Color(255, 255, 255));
		btn09.setBackground(new Color(0, 255, 255));
		btn09.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btn09.setName("btn09");
		GridBagConstraints gbc_btn09 = new GridBagConstraints();
		gbc_btn09.fill = GridBagConstraints.BOTH;
		gbc_btn09.insets = new Insets(0, 0, 5, 5);
		gbc_btn09.gridx = 3;
		gbc_btn09.gridy = 1;
		contentPane.add(btn09, gbc_btn09);
		
		JButton btn10 = new JButton("Ex 10");
		btn10.addActionListener(new ButtonHandler(btn10));
		btn10.setForeground(new Color(255, 255, 255));
		btn10.setBackground(new Color(255, 0, 255));
		btn10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btn10.setName("btn10");
		GridBagConstraints gbc_btn10 = new GridBagConstraints();
		gbc_btn10.fill = GridBagConstraints.BOTH;
		gbc_btn10.insets = new Insets(0, 0, 5, 0);
		gbc_btn10.gridx = 4;
		gbc_btn10.gridy = 1;
		contentPane.add(btn10, gbc_btn10);
		
		JButton btn11 = new JButton("Ex 11");
		btn11.addActionListener(new ButtonHandler(btn11));
		btn11.setForeground(new Color(255, 255, 255));
		btn11.setBackground(new Color(128, 0, 0));
		btn11.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btn11.setName("btn11");
		GridBagConstraints gbc_btn11 = new GridBagConstraints();
		gbc_btn11.fill = GridBagConstraints.BOTH;
		gbc_btn11.insets = new Insets(0, 0, 5, 5);
		gbc_btn11.gridx = 0;
		gbc_btn11.gridy = 2;
		contentPane.add(btn11, gbc_btn11);
		
		JButton btn12 = new JButton("Ex 12");
		btn12.addActionListener(new ButtonHandler(btn12));
		btn12.setForeground(new Color(255, 255, 255));
		btn12.setBackground(new Color(255, 128, 0));
		btn12.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btn12.setName("btn12");
		GridBagConstraints gbc_btn12 = new GridBagConstraints();
		gbc_btn12.fill = GridBagConstraints.BOTH;
		gbc_btn12.insets = new Insets(0, 0, 5, 5);
		gbc_btn12.gridx = 1;
		gbc_btn12.gridy = 2;
		contentPane.add(btn12, gbc_btn12);
		
		JButton btn13 = new JButton("Ex 13");
		btn13.addActionListener(new ButtonHandler(btn13));
		btn13.setForeground(new Color(255, 255, 255));
		btn13.setBackground(new Color(0, 128, 0));
		btn13.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btn13.setName("btn13");
		GridBagConstraints gbc_btn13 = new GridBagConstraints();
		gbc_btn13.fill = GridBagConstraints.BOTH;
		gbc_btn13.insets = new Insets(0, 0, 5, 5);
		gbc_btn13.gridx = 2;
		gbc_btn13.gridy = 2;
		contentPane.add(btn13, gbc_btn13);
		
		JButton btn14 = new JButton("Ex 14");
		btn14.addActionListener(new ButtonHandler(btn14));
		btn14.setForeground(new Color(255, 255, 255));
		btn14.setBackground(new Color(0, 0, 255));
		btn14.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btn14.setName("btn14");
		GridBagConstraints gbc_btn14 = new GridBagConstraints();
		gbc_btn14.fill = GridBagConstraints.BOTH;
		gbc_btn14.insets = new Insets(0, 0, 5, 5);
		gbc_btn14.gridx = 3;
		gbc_btn14.gridy = 2;
		contentPane.add(btn14, gbc_btn14);
		
		JButton btn15 = new JButton("Ex 15");
		btn15.addActionListener(new ButtonHandler(btn15));
		btn15.setForeground(new Color(255, 255, 255));
		btn15.setBackground(new Color(128, 0, 255));
		btn15.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btn15.setName("btn15");
		GridBagConstraints gbc_btn15 = new GridBagConstraints();
		gbc_btn15.fill = GridBagConstraints.BOTH;
		gbc_btn15.insets = new Insets(0, 0, 5, 0);
		gbc_btn15.gridx = 4;
		gbc_btn15.gridy = 2;
		contentPane.add(btn15, gbc_btn15);
		
		JButton btn16 = new JButton("Ex 16");
		btn16.addActionListener(new ButtonHandler(btn16));
		btn16.setForeground(new Color(255, 255, 255));
		btn16.setBackground(new Color(64, 0, 0));
		btn16.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btn16.setName("btn16");
		GridBagConstraints gbc_btn16 = new GridBagConstraints();
		gbc_btn16.fill = GridBagConstraints.BOTH;
		gbc_btn16.insets = new Insets(0, 0, 0, 5);
		gbc_btn16.gridx = 0;
		gbc_btn16.gridy = 3;
		contentPane.add(btn16, gbc_btn16);
		
		JButton btn17 = new JButton("Ex 17");
		btn17.addActionListener(new ButtonHandler(btn17));
		btn17.setForeground(new Color(255, 255, 255));
		btn17.setBackground(new Color(128, 64, 0));
		btn17.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btn17.setName("btn17");
		GridBagConstraints gbc_btn17 = new GridBagConstraints();
		gbc_btn17.fill = GridBagConstraints.BOTH;
		gbc_btn17.insets = new Insets(0, 0, 0, 5);
		gbc_btn17.gridx = 1;
		gbc_btn17.gridy = 3;
		contentPane.add(btn17, gbc_btn17);
		
		JButton btn18 = new JButton("Ex 18");
		btn18.addActionListener(new ButtonHandler(btn18));
		btn18.setForeground(new Color(255, 255, 255));
		btn18.setBackground(new Color(0, 64, 0));
		btn18.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btn18.setName("btn18");
		GridBagConstraints gbc_btn18 = new GridBagConstraints();
		gbc_btn18.fill = GridBagConstraints.BOTH;
		gbc_btn18.insets = new Insets(0, 0, 0, 5);
		gbc_btn18.gridx = 2;
		gbc_btn18.gridy = 3;
		contentPane.add(btn18, gbc_btn18);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(25, 25, 25));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 3;
		gbc_panel.gridy = 3;
		contentPane.add(panel, gbc_panel);
		panel.setLayout(new GridLayout(2, 1, 5, 5));
		
		JButton btnTroll = new JButton("Ex 19");
		panel.add(btnTroll);
		btnTroll.addActionListener(new ButtonHandler(btnTroll));
		btnTroll.setForeground(new Color(255, 255, 255));
		btnTroll.setBackground(new Color(0, 0, 128));
		btnTroll.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnTroll.setName("btnTroll");
		
		JButton btnTroll2 = new JButton("Ex 20");
		btnTroll2.setName("btnTroll2");
		btnTroll2.addActionListener(new ButtonHandler(btnTroll2));
		btnTroll2.setForeground(Color.WHITE);
		btnTroll2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnTroll2.setBackground(new Color(0, 0, 64));
		panel.add(btnTroll2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(25, 25, 25));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 4;
		gbc_panel_1.gridy = 3;
		contentPane.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new GridLayout(2, 1, 5, 5));
		
		JButton btnTroll3 = new JButton("Ex 21");
		btnTroll3.addActionListener(new ButtonHandler(btnTroll3));
		btnTroll3.setName("btnTroll3");
		btnTroll3.setForeground(Color.WHITE);
		btnTroll3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnTroll3.setBackground(new Color(128, 0, 128));
		panel_1.add(btnTroll3);
		
		JButton btnTroll4 = new JButton("Ex 22");
		btnTroll4.addActionListener(new ButtonHandler(btnTroll4));
		btnTroll4.setName("btnTroll4");
		btnTroll4.setForeground(Color.WHITE);
		btnTroll4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnTroll4.setBackground(new Color(64, 0, 64));
		panel_1.add(btnTroll4);
		
		
		
	}

}
