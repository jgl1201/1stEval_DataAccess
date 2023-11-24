package Ex13_Calculator;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class TextFieldDecimalHandler implements KeyListener {
	
	private JTextField textField;
	private JComboBox<String> comboBoxModes;
	
	public TextFieldDecimalHandler(JTextField textField, JComboBox<String> comboBoxModes) {
		super();
		this.textField = textField;
		this.comboBoxModes = comboBoxModes;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		String mode = (String) comboBoxModes.getSelectedItem();
		if (mode.equalsIgnoreCase("decimal")) {
			if (Character.isDigit(e.getKeyChar()) || e.getKeyChar() == '.') {
				if (textField.getText().contains(".") && e.getKeyChar() == '.') {
					e.consume();
				}
				textField.setEditable(true);
			} else
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
