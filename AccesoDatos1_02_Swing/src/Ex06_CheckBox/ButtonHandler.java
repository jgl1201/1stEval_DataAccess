package Ex06_CheckBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;

public class ButtonHandler implements ActionListener {

	private JCheckBox checkBoxHola;
	private JCheckBox checkBoxWelcome;

	public ButtonHandler(JCheckBox checkBoxHola, JCheckBox checkBoxWelcome) {
		this.checkBoxHola = checkBoxHola;
		this.checkBoxWelcome = checkBoxWelcome;

	}

	public JCheckBox getCheckBoxHola() {
		return checkBoxHola;
	}

	public JCheckBox getCheckBoxWelcome() {
		return checkBoxWelcome;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();

		if (button.getName().equals("btnHola")) {
			if (!checkBoxHola.isSelected())
				checkBoxHola.setSelected(true);
			else
				checkBoxHola.setSelected(false);
		} else if (button.getName().equals("btnWelcome")) {
			if (!checkBoxWelcome.isSelected())
				checkBoxWelcome.setSelected(true);
			else
				checkBoxWelcome.setSelected(false);
		}

	}

}
