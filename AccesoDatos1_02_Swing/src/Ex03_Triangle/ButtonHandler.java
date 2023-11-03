package Ex03_Triangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		if (button.getName().equals("btnCalculate")) {
			System.out.println("btnCalculate");
		} else if (button.getName().equals("btnRestart")) {
			System.out.println("btnRestart");
		}
	}
}
