package Ex13_Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("unused")
public class ButtonHandler implements ActionListener {

	private JButton button;
	private JTextField textFieldInput1;
	private JTextField textFieldInput2;
	private JTextField textFieldOperator;
	private JLabel labelOutput;
	private JComboBox<String> comboBox1;
	private JComboBox<String> comboBox2;

	public ButtonHandler(JButton button, JTextField textFieldInput1, JTextField textFieldInput2, JTextField textFieldOperator, JLabel labelOutput,
			JComboBox<String> comboBox1, JComboBox<String> comboBox2) {
		super();
		this.button = button;
		this.textFieldInput1 = textFieldInput1;
		this.textFieldInput2 = textFieldInput2;
		this.textFieldOperator = textFieldOperator;
		this.labelOutput = labelOutput;
		this.comboBox1 = comboBox1;
		this.comboBox2 = comboBox2;
	}
	
	private void setTextFieldsAsEditables() {
		textFieldInput1.setEditable(true);
		textFieldInput2.setEditable(true);
		textFieldOperator.setEditable(true);
	}
	
	private int factorial(int n) {
		if (n == 1) return 1;
		else return n * factorial(n - 1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		String mode1 = (String) comboBox1.getSelectedItem();
		String mode2 = (String) comboBox2.getSelectedItem();

		// Numbers
		if (button.getName().equals("btn00")) {
			if (textFieldOperator.getText().isEmpty() || textFieldOperator.getText().equals("")) textFieldInput1.setText(textFieldInput1.getText() + "0");
			else textFieldInput2.setText(textFieldInput2.getText() + "0");
		}
		if (button.getName().equals("btn01")) {
			if (textFieldOperator.getText().isEmpty() || textFieldOperator.getText().equals("")) textFieldInput1.setText(textFieldInput1.getText() + "1");
			else textFieldInput2.setText(textFieldInput2.getText() + "1");
		}
		if (button.getName().equals("btn02")) {
			if (textFieldOperator.getText().isEmpty() || textFieldOperator.getText().equals("")) textFieldInput1.setText(textFieldInput1.getText() + "2");
			else textFieldInput2.setText(textFieldInput2.getText() + "2");
		}
		if (button.getName().equals("btn03")) {
			if (textFieldOperator.getText().isEmpty() || textFieldOperator.getText().equals("")) textFieldInput1.setText(textFieldInput1.getText() + "3");
			else textFieldInput2.setText(textFieldInput2.getText() + "3");
		}
		if (button.getName().equals("btn04")) {
			if (textFieldOperator.getText().isEmpty() || textFieldOperator.getText().equals("")) textFieldInput1.setText(textFieldInput1.getText() + "4");
			else textFieldInput2.setText(textFieldInput2.getText() + "4");
		}
		if (button.getName().equals("btn05")) {
			if (textFieldOperator.getText().isEmpty() || textFieldOperator.getText().equals("")) textFieldInput1.setText(textFieldInput1.getText() + "5");
			else textFieldInput2.setText(textFieldInput2.getText() + "5");
		}
		if (button.getName().equals("btn06")) {
			if (textFieldOperator.getText().isEmpty() || textFieldOperator.getText().equals("")) textFieldInput1.setText(textFieldInput1.getText() + "6");
			else textFieldInput2.setText(textFieldInput2.getText() + "6");
		}
		if (button.getName().equals("btn07")) {
			if (textFieldOperator.getText().isEmpty() || textFieldOperator.getText().equals("")) textFieldInput1.setText(textFieldInput1.getText() + "7");
			else textFieldInput2.setText(textFieldInput2.getText() + "7");
		}
		if (button.getName().equals("btn08")) {
			if (textFieldOperator.getText().isEmpty() || textFieldOperator.getText().equals("")) textFieldInput1.setText(textFieldInput1.getText() + "8");
			else textFieldInput2.setText(textFieldInput2.getText() + "8");
		}
		if (button.getName().equals("btn09")) {
			if (textFieldOperator.getText().isEmpty() || textFieldOperator.getText().equals("")) textFieldInput1.setText(textFieldInput1.getText() + "9");
			else textFieldInput2.setText(textFieldInput2.getText() + "9");
		}
		if (button.getName().equals("btnDot")) {
			if ((textFieldOperator.getText().isEmpty() || textFieldOperator.getText().equals(""))
					&& !textFieldInput1.getText().contains(".")) textFieldInput1.setText(textFieldInput1.getText() + ".");
			else if (!textFieldInput2.getText().contains(".")) textFieldInput2.setText(textFieldInput2.getText() + ".");
		}
		
		// Operators
		if (button.getName().equals("btnAddition")) textFieldOperator.setText("+");
		if (button.getName().equals("btnRest")) textFieldOperator.setText("-");
		if (button.getName().equals("btnMulti")) textFieldOperator.setText("*");
		if (button.getName().equals("btnDivision")) textFieldOperator.setText("/");
		if (button.getName().equals("btnEquals")) {
			if (mode1.equalsIgnoreCase("decimal") && mode2.equalsIgnoreCase("decimal")) {
				try {
					double n1 = Double.parseDouble(textFieldInput1.getText());
					double n2 = Double.parseDouble(textFieldInput2.getText());
					if (textFieldOperator.getText().equals("+")) labelOutput.setText(n1 + n2 + "");
					if (textFieldOperator.getText().equals("-")) labelOutput.setText(n1 - n2 + "");
					if (textFieldOperator.getText().equals("*")) labelOutput.setText(n1 * n2 + "");
					if (textFieldOperator.getText().equals("/")) labelOutput.setText(n1 / n2 + "");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Error de OPERATORS");
				}
			}
		}
		
		// Clear
		if (button.getName().equals("btnClear")) {
			textFieldInput1.setText("");
			textFieldInput2.setText("");
			textFieldOperator.setText("");
			labelOutput.setText("");
			setTextFieldsAsEditables();
		}
		
		// Advanced Operations
		if (button.getName().equals("btnMod")) {
			try {
				double n1 = Double.parseDouble(textFieldInput1.getText());
				double n2 = Double.parseDouble(textFieldInput2.getText());
				labelOutput.setText(n1 % n2 + "");
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Error de MOD, comprueba todos los campos");
			} finally {
				setTextFieldsAsEditables();
			}
		}
		if (button.getName().equals("btnExp")) {
			try {
				int n1 = Integer.parseInt(textFieldInput1.getText());
				int n2 = Integer.parseInt(textFieldInput2.getText());
				labelOutput.setText((n1 * Math.pow(10, n2)) + "");
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Error de MOD, comprueba todos los campos");
			} finally {
				setTextFieldsAsEditables();
			}
		}
		if (button.getName().equals("btnLn")) {
			textFieldInput2.setText("");
			textFieldOperator.setText("");
			textFieldInput2.setEditable(false);
			try {
				double n1 = Double.parseDouble(textFieldInput1.getText());
				labelOutput.setText(Math.log(n1) + "");
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Error de MOD, comprueba todos los campos");
			} finally {
				setTextFieldsAsEditables();
			}
		}
		if (button.getName().equals("btnSin")) {
			textFieldInput2.setText("");
			textFieldOperator.setText("");
			textFieldInput2.setEditable(false);
			try {
				double n1 = Double.parseDouble(textFieldInput1.getText());
				labelOutput.setText(Math.sin(n1) + "");
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Error de MOD, comprueba todos los campos");
			} finally {
				setTextFieldsAsEditables();
			}
		}
		if (button.getName().equals("btnCos")) {
			textFieldInput2.setText("");
			textFieldOperator.setText("");
			textFieldInput2.setEditable(false);
			try {
				double n1 = Double.parseDouble(textFieldInput1.getText());
				labelOutput.setText(Math.cos(n1) + "");
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Error de MOD, comprueba todos los campos");
			} finally {
				setTextFieldsAsEditables();
			}
		}
		if (button.getName().equals("btnTan")) {
			textFieldInput2.setText("");
			textFieldOperator.setText("");
			textFieldInput2.setEditable(false);
			try {
				double n1 = Double.parseDouble(textFieldInput1.getText());
				labelOutput.setText(Math.tan(n1) + "");
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Error de MOD, comprueba todos los campos");
			} finally {
				setTextFieldsAsEditables();
			}
		}
		if (button.getName().equals("btnPow")) {
			try {
				double n1 = Double.parseDouble(textFieldInput1.getText());
				double n2 = Double.parseDouble(textFieldInput2.getText());
				labelOutput.setText(Math.pow(n1, n2) + "");
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Error de MOD, comprueba todos los campos");
			} finally {
				setTextFieldsAsEditables();
			}
		}
		if (button.getName().equals("btnThird")) {
			textFieldInput2.setText("");
			textFieldOperator.setText("");
			textFieldInput2.setEditable(false);
			try {
				double n1 = Double.parseDouble(textFieldInput1.getText());
				labelOutput.setText(Math.pow(n1, 3) + "");
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Error de MOD, comprueba todos los campos");
			} finally {
				setTextFieldsAsEditables();
			}
		}
		if (button.getName().equals("btnSquare")) {
			textFieldInput2.setText("");
			textFieldOperator.setText("");
			textFieldInput2.setEditable(false);
			try {
				double n1 = Double.parseDouble(textFieldInput1.getText());
				labelOutput.setText(Math.pow(n1, 2) + "");
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Error de MOD, comprueba todos los campos");
			} finally {
				setTextFieldsAsEditables();
			}
		}
		if (button.getName().equals("btnLog")) {
			try {
				double n1 = Double.parseDouble(textFieldInput1.getText());
				double n2 = Double.parseDouble(textFieldInput2.getText());
				labelOutput.setText(Math.log(n1) / Math.log(n2) + "");
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Error de MOD, comprueba todos los campos");
			} finally {
				setTextFieldsAsEditables();
			}
		}
		if (button.getName().equals("btnFactorial")) {
			textFieldInput2.setText("");
			textFieldOperator.setText("");
			textFieldInput2.setEditable(false);
			try {
				double n1 = Double.parseDouble(textFieldInput1.getText());
				labelOutput.setText(Math.log(n1) + "");
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Error de MOD, comprueba todos los campos");
			} finally {
				setTextFieldsAsEditables();
			}
		}
		if (button.getName().equals("btnExtra")) {
			try {
				double n1 = Double.parseDouble(textFieldInput1.getText());
				double n2 = Double.parseDouble(textFieldInput2.getText());
				labelOutput.setText((n1 / Math.pow(10, n2)) + "");
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Error de MOD, comprueba todos los campos");
			} finally {
				setTextFieldsAsEditables();
			}
		}
		
		// Modes
		if (button.getName().equals("btnEquals")) {
			// Binary Mode
			if (mode1.equalsIgnoreCase("binary") && mode2.equalsIgnoreCase("binary"))
				labelOutput.setText(textFieldInput1.getText());
			if (mode1.equalsIgnoreCase("binary") && mode2.equalsIgnoreCase("decimal"))
				labelOutput.setText(String.valueOf(Integer.parseInt(textFieldInput1.getText(), 2)));
			if (mode1.equalsIgnoreCase("binary") && mode2.equalsIgnoreCase("octal"))
				labelOutput.setText(Integer.toOctalString(Integer.parseInt(textFieldInput1.getText(), 2)));
			if (mode1.equalsIgnoreCase("binary") && mode2.equalsIgnoreCase("hexadecimal"))
				labelOutput.setText(Integer.toHexString(Integer.parseInt(textFieldInput1.getText(), 2)));

			// Decimal Mode
			if (mode1.equalsIgnoreCase("decimal") && mode2.equalsIgnoreCase("binary"))
				labelOutput.setText(Integer.toBinaryString(Integer.parseInt(textFieldInput1.getText())));
			if (mode1.equalsIgnoreCase("decimal") && mode2.equalsIgnoreCase("octal"))
				labelOutput.setText(Integer.toOctalString(Integer.parseInt(textFieldInput1.getText())));
			if (mode1.equalsIgnoreCase("decimal") && mode2.equalsIgnoreCase("hexadecimal"))
				labelOutput.setText(Integer.toHexString(Integer.parseInt(textFieldInput1.getText())));

			// Octal Mode
			if (mode1.equalsIgnoreCase("octal") && mode2.equalsIgnoreCase("binary"))
				labelOutput.setText(Integer.toBinaryString(Integer.parseInt(textFieldInput1.getText(), 8)));
			if (mode1.equalsIgnoreCase("octal") && mode2.equalsIgnoreCase("decimal"))
				labelOutput.setText(String.valueOf(Integer.parseInt(textFieldInput1.getText(), 8)));
			if (mode1.equalsIgnoreCase("octal") && mode2.equalsIgnoreCase("octal"))
				labelOutput.setText(textFieldInput1.getText());
			if (mode1.equalsIgnoreCase("octal") && mode2.equalsIgnoreCase("hexadecimal"))
				labelOutput.setText(Integer.toHexString(Integer.parseInt(textFieldInput1.getText(), 8)));

			// Hexadecimal Mode
			if (mode1.equalsIgnoreCase("hexadecimal") && mode2.equalsIgnoreCase("binary"))
				labelOutput.setText(Integer.toBinaryString(Integer.parseInt(textFieldInput1.getText(), 16)));
			if (mode1.equalsIgnoreCase("hexadecimal") && mode2.equalsIgnoreCase("decimal"))
				labelOutput.setText(String.valueOf(Integer.parseInt(textFieldInput1.getText(), 16)));
			if (mode1.equalsIgnoreCase("hexadecimal") && mode2.equalsIgnoreCase("octal"))
				labelOutput.setText(Integer.toOctalString(Integer.parseInt(textFieldInput1.getText(), 16)));
			if (mode1.equalsIgnoreCase("hexadecimal") && mode2.equalsIgnoreCase("hexadecimal"))
				labelOutput.setText(textFieldInput1.getText());
		}

	}
}
