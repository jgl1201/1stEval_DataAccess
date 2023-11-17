package Ex15_SearchWord;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ButtonHandler implements ActionListener {

	private JButton button;
	private JTextField textField;
	private JTextArea textArea;

	public ButtonHandler(JButton button, JTextField textField, JTextArea textArea) {
		super();
		this.button = button;
		this.textField = textField;
		this.textArea = textArea;
	}

	public JButton getButton() {
		return button;
	}

	public JTextField getTextField() {
		return textField;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		
		try {
			String word = textField.getText();
			
			if (button.getName().equals("btnSearch")) {
				if (textArea.getText().toLowerCase().contains(word.toLowerCase())) JOptionPane.showMessageDialog(null, "La palabra existe en el archivo");
				else JOptionPane.showMessageDialog(null, "La palabra no existe en el archivo");
			}
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
	}

}
