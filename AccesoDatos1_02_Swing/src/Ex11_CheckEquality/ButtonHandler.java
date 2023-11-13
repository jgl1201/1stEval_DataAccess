package Ex11_CheckEquality;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonHandler implements ActionListener {

	private JButton button;
	private JTextField textFieldT;
	private JTextField textFieldP;
	private JTextField textFieldN;
	private JLabel lblResult;

	public ButtonHandler(JButton button, JTextField textFieldT, JTextField textFieldP, JTextField textFieldN,
			JLabel lblResult) {
		super();
		this.button = button;
		this.textFieldT = textFieldT;
		this.textFieldP = textFieldP;
		this.textFieldN = textFieldN;
		this.lblResult = lblResult;
	}

	public JButton getButton() {
		return button;
	}

	public JTextField getTextFieldT() {
		return textFieldT;
	}

	public JTextField getTextFieldP() {
		return textFieldP;
	}

	public JTextField getTextFieldN() {
		return textFieldN;
	}

	public JLabel getLblResult() {
		return lblResult;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		
		if (button.getName().equals("btnCalculate")) {
			try {
				double t = Double.parseDouble(textFieldT.getText());
				double p = Double.parseDouble(textFieldP.getText());
				double n = Double.parseDouble(textFieldN.getText());
				
				if (p == 0)
					lblResult.setText("P DEBE SER DIFERENTE DE 0");
				else {
					lblResult.setText("<html>Valor de T: " + t + "<br>Valor de P: " + p + "<br>Valor de N: " + n +
							"<br>Resultado Ecuación 1: " + (Math.pow(t, n) / p) + 
							"<br>Resultado ecuación 2: " + (Math.pow(t,  n) / Math.pow(p, n)) + "</html>");
				}
			
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} 
		
		if (button.getName().equals("btnRestart")) {
			textFieldT.setText("");
			textFieldP.setText("");
			textFieldN.setText("");
			lblResult.setText("");
		}
		
	}

}
