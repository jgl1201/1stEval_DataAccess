package Ex10_ExpresionMatch;

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
		textField.setBackground(Color.PINK);;
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		textField.setBackground(Color.LIGHT_GRAY);
		
	}

}
