package Ex14_GuessNumber;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class TextFieldHandler implements KeyListener {
	
	private JTextField textField;
	
	public TextFieldHandler(JTextField textField) {
		this.textField = textField;
	}
	
	public JTextField getTextField() {
		return textField;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		if (!Character.isDigit(e.getKeyChar()) || textField.getText().length() >= 2) e.consume();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
