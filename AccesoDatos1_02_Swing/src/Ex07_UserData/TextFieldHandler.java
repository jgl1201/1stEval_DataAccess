package Ex07_UserData;

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
		if(!Character.isLetter(e.getKeyChar())) {
			e.consume();
		} else
			textField.setEditable(true);
		
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
