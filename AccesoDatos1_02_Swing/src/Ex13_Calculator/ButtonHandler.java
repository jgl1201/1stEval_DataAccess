package Ex13_Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ButtonHandler implements ActionListener {

	private JButton button;
	private JTextField textFieldNumber1;
	private JTextField textFieldOperation;
	private JTextField textFieldNumber2;
	private JRadioButton rdbtnHex, rdbtnDec, rdbtnOct, rdbtnBin;
	private ButtonGroup group;

	public ButtonHandler(JButton button, JTextField textFieldNumber1, JTextField textFieldOperation,
			JTextField textFieldNumber2, JRadioButton rdbtnHex, JRadioButton rdbtnDec, JRadioButton rdbtnOct,
			JRadioButton rdbtnBin, ButtonGroup group) {
		super();
		this.button = button;
		this.textFieldNumber1 = textFieldNumber1;
		this.textFieldOperation = textFieldOperation;
		this.textFieldNumber2 = textFieldNumber2;
		this.rdbtnHex = rdbtnHex;
		this.rdbtnDec = rdbtnDec;
		this.rdbtnOct = rdbtnOct;
		this.rdbtnBin = rdbtnBin;
		this.group = group;
	}

	public JButton getButton() {
		return button;
	}

	public JTextField getTextFieldNumber1() {
		return textFieldNumber1;
	}

	public JTextField getTextFieldOperation() {
		return textFieldOperation;
	}

	public JTextField getTextFieldNumber2() {
		return textFieldNumber2;
	}

	public JRadioButton getRdbtnHex() {
		return rdbtnHex;
	}

	public JRadioButton getRdbtnDec() {
		return rdbtnDec;
	}

	public JRadioButton getRdbtnOct() {
		return rdbtnOct;
	}

	public JRadioButton getRdbtnBin() {
		return rdbtnBin;
	}

	public ButtonGroup getGroup() {
		return group;
	}

	public int factorial(int number) {
		if (number == 1) return 1;
		return number * factorial(number-1);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();

		// Buttons for textFields
		if (button.getName().equals("btn1")) {
			if (textFieldOperation.getText().equals("")) textFieldNumber1.setText(textFieldNumber1.getText() + "1");
			else textFieldNumber2.setText(textFieldNumber2.getText() + "1");
		}

		if (button.getName().equals("btn2")) {
			if (textFieldOperation.getText().equals("")) textFieldNumber1.setText(textFieldNumber1.getText() + "2");
			else textFieldNumber2.setText(textFieldNumber2.getText() + "2");
		}

		if (button.getName().equals("btn3")) {
			if (textFieldOperation.getText().equals("")) textFieldNumber1.setText(textFieldNumber1.getText() + "3");
			else textFieldNumber2.setText(textFieldNumber2.getText() + "3");
		}

		if (button.getName().equals("btn4")) {
			if (textFieldOperation.getText().equals("")) textFieldNumber1.setText(textFieldNumber1.getText() + "4");
			else textFieldNumber2.setText(textFieldNumber2.getText() + "4");
		}

		if (button.getName().equals("btn5")) {
			if (textFieldOperation.getText().equals("")) textFieldNumber1.setText(textFieldNumber1.getText() + "5");
			else textFieldNumber2.setText(textFieldNumber2.getText() + "5");
		}

		if (button.getName().equals("btn6")) {
			if (textFieldOperation.getText().equals("")) textFieldNumber1.setText(textFieldNumber1.getText() + "6");
			else textFieldNumber2.setText(textFieldNumber2.getText() + "6");
		}

		if (button.getName().equals("btn7")) {
			if (textFieldOperation.getText().equals("")) textFieldNumber1.setText(textFieldNumber1.getText() + "7");
			else textFieldNumber2.setText(textFieldNumber2.getText() + "7");
		}

		if (button.getName().equals("btn8")) {
			if (textFieldOperation.getText().equals("")) textFieldNumber1.setText(textFieldNumber1.getText() + "8");
			else textFieldNumber2.setText(textFieldNumber2.getText() + "8");
		}

		if (button.getName().equals("btn9")) {
			if (textFieldOperation.getText().equals("")) textFieldNumber1.setText(textFieldNumber1.getText() + "9");
			else textFieldNumber2.setText(textFieldNumber2.getText() + "9");
		}

		if (button.getName().equals("btn0")) {
			if (textFieldOperation.getText().equals("")) textFieldNumber1.setText(textFieldNumber1.getText() + "0");
			else textFieldNumber2.setText(textFieldNumber2.getText() + "0");
		}

		if (button.getName().equals("btn00")) {
			if (textFieldOperation.getText().equals("")) textFieldNumber1.setText(textFieldNumber1.getText() + "00");
			else textFieldNumber2.setText(textFieldNumber2.getText() + "00");
		}

		if (button.getName().equals("btnPoint")) {
			if (textFieldOperation.getText().equals("")) 
				if (!textFieldNumber1.getText().contains(".")) textFieldNumber1.setText(textFieldNumber1.getText() + ".");
			else if (!textFieldNumber2.getText().contains(".")) textFieldNumber2.setText(textFieldNumber2.getText() + ".");
			else JOptionPane.showMessageDialog(null, "Ya hay un punto");
		}

		if (button.getName().equals("btnAdd")) textFieldOperation.setText("+");
		if (button.getName().equals("btnRest")) textFieldOperation.setText("-");
		if (button.getName().equals("btnMulti")) textFieldOperation.setText("*");
		if (button.getName().equals("btnDivision")) textFieldOperation.setText("/");

		// RadioButtons
		if (rdbtnHex.isSelected()) {
			textFieldNumber2.setEnabled(false);
			textFieldOperation.setEnabled(false);
			if (button.getName().equals("btnEqual")) {
				try {
					int number = Integer.parseInt(textFieldNumber1.getText());
					JOptionPane.showMessageDialog(null, Integer.toHexString(number));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "ERROR \nComprueba que sea un número ENTERO");
				}
			} else JOptionPane.showMessageDialog(null, "Ese botón no se puede usar en modo hexadecimal");
		}
		
		if (rdbtnOct.isSelected()) {
			textFieldNumber2.setEnabled(false);
			textFieldOperation.setEnabled(false);
			if (button.getName().equals("btnEqual")) {
				try {
					int number = Integer.parseInt(textFieldNumber1.getText());
					JOptionPane.showMessageDialog(null, Integer.toOctalString(number));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "ERROR \nComprueba que sea un número ENTERO");
				}
			} else JOptionPane.showMessageDialog(null, "Ese botón no se puede usar en modo octal");
		}
		
		if (rdbtnBin.isSelected()) {
			textFieldNumber2.setEnabled(false);
			textFieldOperation.setEnabled(false);
			if (button.getName().equals("btnEqual")) {
				try {
					int number = Integer.parseInt(textFieldNumber1.getText());
					JOptionPane.showMessageDialog(null, Integer.toBinaryString(number));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "ERROR \nComprueba que sea un número ENTERO");
				}
			} else JOptionPane.showMessageDialog(null, "Ese botón no se puede usar en modo binario");
		}
		
		// Buttons for operations
		if (button.getName().equals("btnEqual")) {
			try {
				double number1 = Double.parseDouble(textFieldNumber1.getText());
				double number2 = Double.parseDouble(textFieldNumber2.getText());
				if (textFieldOperation.getText().equals("+")) JOptionPane.showMessageDialog(null, number1 + number2);
				if (textFieldOperation.getText().equals("-")) JOptionPane.showMessageDialog(null, number1 - number2);
				if (textFieldOperation.getText().equals("*")) JOptionPane.showMessageDialog(null, number1 * number2);
				if (textFieldOperation.getText().equals("/")) JOptionPane.showMessageDialog(null, number1 / number2);
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "ERROR de operación básica");
			}
		}
		
		if (button.getName().equals("btnMod")) {
			try {
				double number1 = Double.parseDouble(textFieldNumber1.getText());
				double number2 = Double.parseDouble(textFieldNumber2.getText());
				textFieldOperation.setText("");
				JOptionPane.showMessageDialog(null, "Resto de " + number1 + " / " + number2 + "\n" + number1 % number2);
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "ERROR de operación MOD");
			}
		}
		
		if (button.getName().equals("btnExp")) {
			try {
				double number1 = Double.parseDouble(textFieldNumber1.getText());
				double number2 = Double.parseDouble(textFieldNumber2.getText());
				textFieldOperation.setText("");
				JOptionPane.showMessageDialog(null, number1 + " * 10^" + number2 + "\n" + number1 * Math.pow(10, number2));
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "ERROR de operación EXP");
			}
		}
		
		if (button.getName().equals("btnLog")) {
			try {
				double number1 = Double.parseDouble(textFieldNumber1.getText());
				textFieldOperation.setText("");
				textFieldNumber2.setText("");
				JOptionPane.showMessageDialog(null, "Logaritmo en base 10 de " + number1 + "\n" + Math.log10(number1));
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "ERROR log");
			}
		}
		
		if (button.getName().equals("btnLn")) {
			try {
				double number1 = Double.parseDouble(textFieldNumber1.getText());
				textFieldOperation.setText("");
				textFieldNumber2.setText("");
				JOptionPane.showMessageDialog(null, "Logaritmo neperiano de " + number1 + "\n" + Math.log(number1));
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "ERROR ln");
			}
		}
		
		if (button.getName().equals("btnExtra")) {
			try {
				double number1 = Double.parseDouble(textFieldNumber1.getText());
				double number2 = Double.parseDouble(textFieldNumber2.getText());
				textFieldOperation.setText("");
				JOptionPane.showMessageDialog(null, number1 + " / 10^" + number2 + "\n" + number1 / Math.pow(10,  number2));
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "ERROR extra");
			}
		}
		
		if (button.getName().equals("btnSin")) {
			try {
				double number1 = Double.parseDouble(textFieldNumber1.getText());
				textFieldOperation.setText("");
				textFieldNumber2.setText("");
				JOptionPane.showMessageDialog(null, "Seno de " + number1 + "\n" + Math.sin(number1));
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "ERROR sin");
			}
		}
		
		if (button.getName().equals("btnCos")) {
			try {
				double number1 = Double.parseDouble(textFieldNumber1.getText());
				textFieldOperation.setText("");
				textFieldNumber2.setText("");
				JOptionPane.showMessageDialog(null, "Coseno de " + number1 + "\n" + Math.cos(number1));
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "ERROR cos");
			}
		}
		
		if (button.getName().equals("btnTan")) {
			try {
				double number1 = Double.parseDouble(textFieldNumber1.getText());
				textFieldOperation.setText("");
				textFieldNumber2.setText("");
				JOptionPane.showMessageDialog(null, "Tangente de " + number1 + "\n" + Math.tan(number1));
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "ERROR tan");
			}
		}
		
		if (button.getName().equals("btnSquare")) {
			try {
				double number1 = Double.parseDouble(textFieldNumber1.getText());
				textFieldOperation.setText("");
				textFieldNumber2.setText("");
				JOptionPane.showMessageDialog(null, "Cuadrado de " + number1 + "\n" + Math.pow(number1, 2));
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "ERROR sqare");
			}
		}
		
		if (button.getName().equals("btnThird")) {
			try {
				double number1 = Double.parseDouble(textFieldNumber1.getText());
				textFieldOperation.setText("");
				textFieldNumber2.setText("");
				JOptionPane.showMessageDialog(null, "Cubo de " + number1 + "\n" + Math.pow(number1, 3));
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "ERROR third");
			}
		}
		
		if (button.getName().equals("btnExponential")) {
			try {
				double number1 = Double.parseDouble(textFieldNumber1.getText());
				double number2 = Double.parseDouble(textFieldNumber2.getText());
				textFieldNumber2.setText("");
				JOptionPane.showMessageDialog(null, number1 + "^" + number2 + "\n" + Math.pow(number1, number2));
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "ERROR exponential");
			}
		}
		
		if (button.getName().equals("btnFactorial")) {
			try {
				int number1 = Integer.parseInt(textFieldNumber1.getText());
				textFieldOperation.setText("");
				textFieldNumber2.setText("");
				JOptionPane.showMessageDialog(null, "Factorial de " + number1 + "\n" + factorial(number1));
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "ERROR factorial");
			}
		}
		
	}

}
