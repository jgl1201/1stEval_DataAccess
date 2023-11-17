package Ex14_GuessNumber;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

public class FocusHandler implements FocusListener {
	
	private JTextField textField;
	
	public FocusHandler(JTextField textField) {
		this.textField = textField;
	}
	
	public JTextField getTextField() {
		return textField;
	}

	@Override
	public void focusGained(FocusEvent e) {
		textField.setBackground(Color.GRAY);;
		textField.setForeground(Color.WHITE);
	}

	@Override
	public void focusLost(FocusEvent e) {
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setForeground(Color.BLACK);
	}

}
