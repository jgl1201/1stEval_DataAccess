package Ex10_ExpresionMatch;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonHandler implements ActionListener {

	private JTextField textFieldR;
	private JTextField textFieldT;
	private JTextField textFieldQ;
	private JButton button;
	private JLabel labelResult;
	

	public ButtonHandler(JTextField textFieldR, JTextField textFieldT, JTextField textFieldQ, JButton button,
			JLabel labelResult) {
		this.textFieldR = textFieldR;
		this.textFieldT = textFieldT;
		this.textFieldQ = textFieldQ;
		this.button = button;
		this.labelResult = labelResult;
	}
	
	public JTextField getTextFieldR() {
		return textFieldR;
	}

	public JTextField getTextFieldT() {
		return textFieldT;
	}

	public JTextField getTextFieldQ() {
		return textFieldQ;
	}

	public JButton getButton() {
		return button;
	}

	public JLabel getLabelResult() {
		return labelResult;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		
		if (button.getName().equals("btnCalculate")) {
			try {
				double r = Double.parseDouble(textFieldR.getText());
				double t = Double.parseDouble(textFieldT.getText());
				double q = Double.parseDouble(textFieldQ.getText());
				double result = Math.pow(r, 4) - Math.pow(t, 3) + 4 * Math.pow(q, 2);
				
				labelResult.setText("<html>Valor de R: " + r + "<br>Valor de T: " + t + "<br>Valor de Q: "
				+ q + "<br>Resultado de la ecuación: " + result + "</html>");
				
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
		}
		
		if (button.getName().equals("btnRestart")) {
			textFieldR.setText("");
			textFieldT.setText("");
			textFieldQ.setText("");
			labelResult.setText("");
		}
		
	}


}
