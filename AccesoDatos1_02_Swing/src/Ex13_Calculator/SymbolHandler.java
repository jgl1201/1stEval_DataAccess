package Ex13_Calculator;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class SymbolHandler implements KeyListener {

	private JTextField textField;
	
	public SymbolHandler(JTextField textField) {
		this.textField = textField;
	}
	
	public JTextField getTextField() {
		return textField;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//char inputChar = e.getKeyChar();
	    if (e.getKeyChar() == '+' || e.getKeyChar() == '-' || e.getKeyChar() == '*' || e.getKeyChar() == '/') {
	    	if (!textField.getText().isEmpty()) {
	    		e.consume();
	    	}
	        textField.setEditable(true);
	    } else {
	        e.consume();
	    }
		
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
