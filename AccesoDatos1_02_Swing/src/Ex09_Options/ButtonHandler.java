package Ex09_Options;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ButtonHandler implements ActionListener {

	private JButton button;
	private JTextField textFieldT;
	private JLabel labelResult;
	private JComboBox<String> comboBox;
	
	public ButtonHandler(JButton button, JTextField textFieldT, JLabel labelResult, JComboBox<String> comboBox) {
		this.button = button;
		this.textFieldT = textFieldT;
		this.labelResult = labelResult;
		this.comboBox = comboBox;
	}

	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public JButton getButton() {
		return button;
	}

	public JTextField getTextFieldT() {
		return textFieldT;
	}

	public JLabel getTextFieldResult() {
		return labelResult;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		
		if (button.getName().equals("btnCalculate")) {
			try {
				double t = Double.parseDouble(textFieldT.getText());
				int option = comboBox.getSelectedIndex();
				
				if (t <= 0) {
					JOptionPane.showMessageDialog(null, "Ingrese un número mayor a 0");
				} else {
					if (option == 0)
						labelResult.setText("Resultado: " + (t / 5));
					if (option == 1) 
						labelResult.setText("Resultado: " + (Math.pow(t, 2) ));
					if (option == 2) 
						labelResult.setText("Resultado: " + (6 * t/2 ));
				}
					
				
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
		}
		
		if (button.getName().equals("btnRestart")) {
			textFieldT.setText("");
			labelResult.setText("Resultado");
			comboBox.setSelectedIndex(0);
		}
		
	}
	
}
