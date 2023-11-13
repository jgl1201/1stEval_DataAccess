package Ex10_ExpresionMatch;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class TextFieldhandler implements KeyListener {
	
	private JTextField textField;
	
	public TextFieldhandler(JTextField textField) {
		this.textField = textField;
	}
	
	public JTextField getTextField() {
		return textField;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		if (Character.isDigit(e.getKeyChar()) || e.getKeyChar() == '.') {
			if (textField.getText().contains(".") && e.getKeyChar() == '.') {
				e.consume();
			}
			textField.setEditable(true);
		} else
			e.consume();
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
