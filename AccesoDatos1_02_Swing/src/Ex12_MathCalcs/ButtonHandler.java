package Ex12_MathCalcs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ButtonHandler implements ActionListener {
	
	private JButton button;
	private JTextField textFieldNumber;
	private JTextArea textAreaResult;
	
	public ButtonHandler(JButton button, JTextField textFieldNumber, JTextArea textAreaResult) {
		super();
		this.button = button;
		this.textFieldNumber = textFieldNumber;
		this.textAreaResult = textAreaResult;
	}

	public JButton getButton() {
		return button;
	}

	public JTextField getTextFieldNumber() {
		return textFieldNumber;
	}

	public JTextArea getLblResult() {
		return textAreaResult;
	}

	public int fibonacci(int n) {
		if (n == 0) return 0;
		else if (n == 1) return 1;
		else return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		
		try {
			int number = Integer.parseInt(textFieldNumber.getText());
			
			if (button.getName().equals("btnEvens")) {
				StringBuilder sb = new StringBuilder();
				int total = 0;
				
				for (int i = 0; i <= number; i++) {
					sb.append(i * 2 + ", ");
					total += i * 2;
				}
				
				String result = sb.toString();
				textAreaResult.setText(number + " Números Pares" + "\n" + result + "\nTotal = " + total);
				
			}
			
			if (button.getName().equals("btnSerie")) {
				StringBuilder sb = new StringBuilder();
				double total = 0.0;
				
				for (int i = 1; i <= number; i++) {
					sb.append("1/" + i*2 + ", ");
					total += 1/(double) (i*2);
				}
				
				String result = sb.toString();
				textAreaResult.setText(number + " Números de la Serie" + "\n" + result + "\nTotal = " + total);
			}
			
			if (button.getName().equals("btnFibonacci")) {
				StringBuilder sb = new StringBuilder();
				int total = 0;
				
				for (int i = 0; i <= number; i++) {
					sb.append(fibonacci(i) + ", ");
					total += fibonacci(i);
				}	
				
				String result = sb.toString();
				textAreaResult.setText(number + " Número de Fibonacci" + "\n" + result + "\nTotal = " + total);
			}
			
		} catch (Exception e1) {
			e1.getMessage();
		}
		
		
	}
	
}
