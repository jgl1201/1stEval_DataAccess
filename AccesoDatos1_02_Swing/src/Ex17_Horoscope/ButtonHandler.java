package Ex17_Horoscope;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ButtonHandler implements ActionListener {
	
	private JButton button;
	private JTextField textFieldDay;
	private JTextField textFieldMonth;
	private JLabel lblSigno;
	private JLabel lblIcon;
	private final static String ROOT = "src\\Ex17_Horoscope\\";

	public JButton getButton() {
		return button;
	}

	public JTextField getTextFieldDay() {
		return textFieldDay;
	}

	public JTextField getTextFieldMonth() {
		return textFieldMonth;
	}

	public JLabel getLblHoroscope() {
		return lblSigno;
	}

	public JLabel getLblSigno() {
		return lblSigno;
	}

	public JLabel getLblIcon() {
		return lblIcon;
	}

	public ButtonHandler(JButton button, JTextField textFieldDay, JTextField textFieldMonth, JLabel lblHoroscope, JLabel lblIcon) {
		super();
		this.button = button;
		this.textFieldDay = textFieldDay;
		this.textFieldMonth = textFieldMonth;
		this.lblSigno = lblHoroscope;
		this.lblIcon = lblIcon;
	}

	
	public boolean setAries(int day, int month) {
		return day >= 21 && month == 3 || day <= 20 && month == 4;
	}
	
	public boolean setTaurus(int day, int month) {
		return day >= 21 && month == 4 || day <= 20 && month == 5;
	}
	
	public boolean setGemini(int day, int month) {
		return day >= 21 && month == 5 || day <= 20 && month == 6;
	}
	
	public boolean setCancer(int day, int month) {
		return day >= 21 && month == 6 || day <= 22 && month == 7;
	}
	
	public boolean setLeo(int day, int month) {
		return day >= 23 && month == 7 || day <= 23 && month == 8;
	}
	
	public boolean setVirgo(int day, int month) {
		return day >= 24 && month == 8 || day <= 22 && month == 9;
	}
	
	public boolean setLibra(int day, int month) {
		return day >= 23 && month == 9 || day <= 23 && month == 10;
	}
	
	public boolean setScorpio(int day, int month) {
		return day >= 24 && month == 10 || day <= 22 && month == 11;
	}
	
	public boolean setSagittarius(int day, int month) {
		return day >= 23 && month == 11 || day <= 21 && month == 12;
	}
	
	public boolean setCapricorn(int day, int month) {
		return day >= 22 && month == 12 || day <= 20 && month == 1;
	}
	
	public boolean setAquarius(int day, int month) {
		return day >= 21 && month == 1 || day <= 19 && month == 2;
	}
	
	public boolean setPisces(int day, int month) {
		return day >= 20 && month == 2 || day <= 20 && month == 3;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		
		try {
			if (button.getName().equals("btnExit")) System.exit(0);
			
			if (button.getName().equals("btnFind")) {
				int day = Integer.parseInt(textFieldDay.getText());
				int month = Integer.parseInt(textFieldMonth.getText());
				
				// Exceptions
				if (day < 0 || day > 31) JOptionPane.showMessageDialog(null, "El día es incorrecto");
				if (month < 0 || month > 12) JOptionPane.showMessageDialog(null, "El mes es incorrecto");
				
				// Horoscope
				if (setAries(day, month)) {
					ImageIcon icon = new ImageIcon(ROOT + "aries.png");
					Image scaledImg = icon.getImage().getScaledInstance(126, 126, Image.SCALE_SMOOTH); 
					lblIcon.setIcon(new ImageIcon(scaledImg));
					lblSigno.setText("Aries");
				}
				if (setTaurus(day, month)) {
					ImageIcon icon = new ImageIcon(ROOT + "taurus.png");
					Image scaledImg = icon.getImage().getScaledInstance(126, 126, Image.SCALE_SMOOTH);
					lblIcon.setIcon(new ImageIcon(scaledImg));
					lblSigno.setText("Taurus");
				}
				if (setGemini(day, month)) {
					ImageIcon icon = new ImageIcon(ROOT + "gemini.png");
					Image scaledImg = icon.getImage().getScaledInstance(126, 126, Image.SCALE_SMOOTH);
					lblIcon.setIcon(new ImageIcon(scaledImg));
					lblSigno.setText("Gemini");
				}
				if (setCancer(day, month)) {
					ImageIcon icon = new ImageIcon(ROOT + "cancer.png");
					Image scaledImg = icon.getImage().getScaledInstance(126, 126, Image.SCALE_SMOOTH);
					lblIcon.setIcon(new ImageIcon(scaledImg));
					lblSigno.setText("Cancer");
				}
				if (setLeo(day, month)) {
					ImageIcon icon = new ImageIcon(ROOT + "leo.png");
					Image scaledImg = icon.getImage().getScaledInstance(126, 126, Image.SCALE_SMOOTH);
					lblIcon.setIcon(new ImageIcon(scaledImg));
					lblSigno.setText("Leo");
				}
				if (setVirgo(day, month)) {
					ImageIcon icon = new ImageIcon(ROOT + "virgo.png");
					Image scaledImg = icon.getImage().getScaledInstance(126, 126, Image.SCALE_SMOOTH);
					lblIcon.setIcon(new ImageIcon(scaledImg));
					lblSigno.setText("Virgo");
				}
				if (setLibra(day, month)) {
					ImageIcon icon = new ImageIcon(ROOT + "libra.png");
					Image scaledImg = icon.getImage().getScaledInstance(126, 126, Image.SCALE_SMOOTH);
					lblIcon.setIcon(new ImageIcon(scaledImg));
					lblSigno.setText("Libra");
				}
				if (setScorpio(day, month)) {
					ImageIcon icon = new ImageIcon(ROOT + "scorpio.png");
					Image scaledImg = icon.getImage().getScaledInstance(126, 126, Image.SCALE_SMOOTH);
					lblIcon.setIcon(new ImageIcon(scaledImg));
					lblSigno.setText("Scorpio");
				}
				if (setSagittarius(day, month)) {
					ImageIcon icon = new ImageIcon(ROOT + "sagittarius.png");
					Image scaledImg = icon.getImage().getScaledInstance(126, 126, Image.SCALE_SMOOTH);
					lblIcon.setIcon(new ImageIcon(scaledImg));
					lblSigno.setText("Sagittarius");
				}
				if (setCapricorn(day, month)) {
					ImageIcon icon = new ImageIcon(ROOT + "capricorn.png");
					Image scaledImg = icon.getImage().getScaledInstance(126, 126, Image.SCALE_SMOOTH);
					lblIcon.setIcon(new ImageIcon(scaledImg));
					lblSigno.setText("Capricorn");
				}
				if (setAquarius(day, month)) {
					ImageIcon icon = new ImageIcon(ROOT + "aquarius.png");
					Image scaledImg = icon.getImage().getScaledInstance(126, 126, Image.SCALE_SMOOTH);
					lblIcon.setIcon(new ImageIcon(scaledImg));
					lblSigno.setText("Aquarius");
				}
				if (setPisces(day, month)) {
					ImageIcon icon = new ImageIcon(ROOT + "pisces.png");
					Image scaledImg = icon.getImage().getScaledInstance(126, 126, Image.SCALE_SMOOTH);
					lblIcon.setIcon(new ImageIcon(scaledImg));
					lblSigno.setText("Pisces");
				}
								
			}
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
	}
	
	
}
