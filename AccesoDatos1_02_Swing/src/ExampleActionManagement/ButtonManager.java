package ExampleActionManagement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ButtonManager implements ActionListener {

	private JButton button;
	private JTextField textField;
	
	
	/**
	 * Constructor
	 * @param textField necessary to recieve the content from the text field
	 * 	on the Window class
	 */
	public ButtonManager(JTextField textField) {
		this.textField = textField;
		
	}
	
	/**
	 * Function to manage the actions of the buttons
	 * 	on the Window class
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		button = (JButton) e.getSource();
		
		if(button.getName() == "btnSaludar") {
			JOptionPane.showMessageDialog(null, "Hola " + textField.getText());
		}
		
		if(button.getName() == "btnInsult") {
			JOptionPane.showMessageDialog(null, textField.getText() + " eres un puto gilipollas de mierda, trozo de caca");
		}
	}
	
}
