package Ex16_CheckWordTimes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

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
				StringTokenizer st = new StringTokenizer(textArea.getText());
				int occurrences = 0;
				if (textArea.getText().toLowerCase().contains(word.toLowerCase())) {
					while (st.hasMoreTokens()) {
						String token = st.nextToken();
						if (token.equalsIgnoreCase(word)) occurrences++;
					}
					JOptionPane.showMessageDialog(null, "La palabra existe en el archivo " + occurrences + " veces");
				}
				else JOptionPane.showMessageDialog(null, "La palabra no existe en el archivo");
			}
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
	}

}
