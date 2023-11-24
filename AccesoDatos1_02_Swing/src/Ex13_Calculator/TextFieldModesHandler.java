package Ex13_Calculator;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

@SuppressWarnings("unused")
public class TextFieldModesHandler implements KeyListener {

	private JTextField textField1;
	private JTextField textField2;
	private JComboBox<String> comboBoxModes1;
	private JComboBox<String> comboBoxModes2;

	public TextFieldModesHandler(JTextField textField1, JTextField textField2, JComboBox<String> comboBoxModes1,
			JComboBox<String> comboBoxModes2) {
		this.textField1 = textField1;
		this.textField2 = textField2;
		this.comboBoxModes1 = comboBoxModes1;
		this.comboBoxModes2 = comboBoxModes2;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		String mode1 = (String) comboBoxModes1.getSelectedItem();
		//String mode2 = (String) comboBoxModes2.getSelectedItem();

		if (mode1.equalsIgnoreCase("binary")) {
			textField1.setEditable(true);
			textField2.setEditable(false);
			if (c == '0' || c == '1') {
				textField1.setEditable(true);
				textField2.setEditable(false);
			} else
				e.consume();
		}

		if (mode1.equalsIgnoreCase("octal")) {
			textField1.setEditable(true);
			textField2.setEditable(false);
			if (!(c >= '0' && c <= '7'))
				e.consume();
		}

		if (mode1.equalsIgnoreCase("hexadecimal")) {
			textField1.setEditable(true);
			textField2.setEditable(false);
			if (!((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F') || c >= 'a' && c <= 'f'))
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
