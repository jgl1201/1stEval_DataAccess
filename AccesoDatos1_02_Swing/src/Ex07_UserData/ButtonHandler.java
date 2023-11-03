package Ex07_UserData;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ButtonHandler implements ActionListener {
	
	private JTextField textFieldName;
	private JTextField textFieldSurname;
	private ButtonGroup group;
	
	public ButtonHandler() {
		this.textFieldName = new JTextField();
		this.textFieldSurname = new JTextField();
		this.group = new ButtonGroup();
	}
	
	public ButtonHandler(JTextField textFieldName, JTextField textFieldSurname, ButtonGroup group) {
		this.textFieldName = textFieldName;
		this.textFieldSurname = textFieldSurname;
		this.group = group;
	}

	public JTextField getTextFieldName() {
		return textFieldName;
	}

	public JTextField getTextFieldSurname() {
		return textFieldSurname;
	}

	public ButtonGroup getGroup() {
		return group;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		
		if(button.getName().equals("btnContinue")) {
			if(textFieldName.getText().equals("") || textFieldSurname.getText().equals("") || group.getSelection() == null) {
				JOptionPane.showMessageDialog(null, "Rellena todos los campos");
			} else {
				ContinueFrame frame = new ContinueFrame();
				frame.setVisible(true);
			}
		}
		
		if(button.getName().equals("btnExit") || button.getName().equals("btnClose")) {
			System.exit(0);
		}
		
		if(button.getName().equals("btnBack")) {
			Ex07_UserData frame = new Ex07_UserData();
			frame.setVisible(true);
		}
	}

}
