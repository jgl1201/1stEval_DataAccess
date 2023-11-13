package Ex08_SalaryIncrement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ButtonHandler implements ActionListener {

	private JButton button;
	private JTextField textFieldAmount;
	private JLabel lblBefore;
	private JLabel lblPercentage;
	private JLabel lblAfter;
	private JRadioButton rdbtn1, rdbtn2, rdbtn3, rdbtn4;
	private ButtonGroup group;

	public ButtonHandler(JButton button, JTextField textFieldAmount, JLabel lblBefore, JLabel lblPercentage,
			JLabel lblAfter, JRadioButton rdbtn1, JRadioButton rdbtn2, JRadioButton rdbtn3, JRadioButton rdbtn4,
			ButtonGroup group) {
		this.button = button;
		this.textFieldAmount = textFieldAmount;
		this.lblBefore = lblBefore;
		this.lblPercentage = lblPercentage;
		this.lblAfter = lblAfter;
		this.rdbtn1 = rdbtn1;
		this.rdbtn2 = rdbtn2;
		this.rdbtn3 = rdbtn3;
		this.rdbtn4 = rdbtn4;
		this.group = group;
	}

	public ButtonGroup getGroup() {
		return group;
	}

	public JRadioButton getRdbtn1() {
		return rdbtn1;
	}

	public JRadioButton getRdbtn2() {
		return rdbtn2;
	}

	public JRadioButton getRdbtn3() {
		return rdbtn3;
	}

	public JRadioButton getRdbtn4() {
		return rdbtn4;
	}

	public JLabel getLblBefore() {
		return lblBefore;
	}

	public JLabel getLblPercentage() {
		return lblPercentage;
	}

	public JLabel getLblAfter() {
		return lblAfter;
	}

	public JButton getButton() {
		return button;
	}

	public JTextField getTextFieldAmount() {
		return textFieldAmount;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();

		if (button.getName().equals("btnCalculate")) {
			try {
				double amount = Double.parseDouble(textFieldAmount.getText());
				
				lblBefore.setText("Salario anterior " + amount + "€");

				if (!rdbtn1.isSelected() && !rdbtn2.isSelected() && !rdbtn3.isSelected() && !rdbtn4.isSelected()) {
					JOptionPane.showMessageDialog(null, "Selecciona un nivel académico");
				}
				
				if (rdbtn1.isSelected()) {
					lblPercentage.setText("% de Aumento 3.5%");
					lblAfter.setText("Salario final " + (amount + (amount * 0.035)) + "€");
				}

				if (rdbtn2.isSelected()) {
					lblPercentage.setText("% de Aumento 4.6%");
					lblAfter.setText("Salario final " + (amount + (amount * 0.046)) + "€");
				}

				if (rdbtn3.isSelected()) {
					lblPercentage.setText("% de Aumento 5.3%");
					lblAfter.setText("Salario final " + (amount + (amount * 0.053)) + "€");
				}

				if (rdbtn4.isSelected()) {
					lblPercentage.setText("% de Aumento 6.8%");
					lblAfter.setText("Salario final " + (amount + (amount * 0.068)) + "€");
				}

			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Algo no ha salido como debía \nComprueba que tengas todos los campos cubiertos");
				System.out.println(e1.getMessage());
			}
		}

		if (button.getName().equals("btnRestart")) {
			textFieldAmount.setText("");
			group.clearSelection();
			lblBefore.setText("Salario anterior");
			lblPercentage.setText("% de Aumento");
			lblAfter.setText("Salario final");
		}

	}

}
