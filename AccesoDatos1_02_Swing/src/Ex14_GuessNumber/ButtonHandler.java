package Ex14_GuessNumber;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ButtonHandler implements ActionListener {

	private JButton button;
	private JTextField textFieldGuess;
	private JTextArea textAreaHints;
	private JLabel lblTrys;
	private final int NUMBER = new Random().nextInt(51);
	private int trys = 1;


	public ButtonHandler(JButton button, JTextField textFieldGuess, JTextArea textAreaHints, JLabel lblTrys) {
		this.button = button;
		this.textFieldGuess = textFieldGuess;
		this.textAreaHints = textAreaHints;
		this.lblTrys = lblTrys;
	}

	public JButton getButton() {
		return button;
	}

	public JTextField getTextFieldGuess() {
		return textFieldGuess;
	}

	public JTextArea getTextAreaHints() {
		return textAreaHints;
	}

	public JLabel getLblTrys() {
		return lblTrys;
	}

	public int getNUMBER() {
		return NUMBER;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		try {
			int guess = Integer.parseInt(textFieldGuess.getText());

			if (button.getName().equals("btnCheck")) {

				if (guess > NUMBER) {
					textAreaHints.append("El número es menor que " + guess + "\n");
					trys++;
				}
				else if (guess < NUMBER) {
					textAreaHints.append("El número es mayor que " + guess + "\n");
					trys++;
				}
				else {
					lblTrys.setText("Correcto!!! Has acertado en " + trys + " intentos");
				}
			}

		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}

	}
}
