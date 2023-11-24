package ExercisesLauncher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import Ex01_ChangeBackground.Ex01_ChangeBackground;
import Ex02_AreaVolume.Ex02_AreaVolume;
import Ex03_Triangle.Ex03_Triangle;
import Ex04_Choordinates.Ex04_Choordinates;
import Ex05_JTextArea.Ex05_JTextArea;
import Ex06_CheckBox.Ex06_CheckBox;
import Ex07_UserData.Ex07_UserData;

public class ButtonHandler implements ActionListener {

	JButton button;
	JFrame frame;
	
	public ButtonHandler(JButton button) {
		this.button = button;
	}
	
	public JButton getButton() {
		return button;
	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		
		if (button.getName().equals("btn01")) {
			frame = new Ex01_ChangeBackground();
			frame.setVisible(true);
		}
		
		if (button.getName().equals("btn02")) {
			frame = new Ex02_AreaVolume();
			frame.setVisible(true);
		}
		
		if (button.getName().equals("btn03")) {
			frame = new Ex03_Triangle();
			frame.setVisible(true);
		}
		
		if (button.getName().equals("btn04")) {
			frame = new Ex04_Choordinates();
			frame.setVisible(true);
		}
		
		if (button.getName().equals("btn05")) {
			frame = new Ex05_JTextArea();
			frame.setVisible(true);
		}
		
		if (button.getName().equals("btn06")) {
			frame = new Ex06_CheckBox();
			frame.setVisible(true);
		}
		
		if (button.getName().equals("btn07")) {
			frame = new Ex07_UserData();
			frame.setVisible(true);
		}
		
		if (button.getName().equals("btn08")) {
			frame = new Ex08_SalaryIncrement.Main();
			frame.setVisible(true);
		}
		
		if (button.getName().equals("btn09")) {
			frame = new Ex09_Options.Main();
			frame.setVisible(true);
		}
		
		if (button.getName().equals("btn10")) {
			frame = new Ex10_ExpresionMatch.Main();
			frame.setVisible(true);
		}
		
		if (button.getName().equals("btn11")) {
			frame = new Ex11_CheckEquality.Main();
			frame.setVisible(true);
		}
		
		if (button.getName().equals("btn12")) {
			frame = new Ex12_MathCalcs.Main();
			frame.setVisible(true);
		}
		
		if (button.getName().equals("btn13")) {
			frame = new Ex13_Calculator.Main();
			frame.setVisible(true);
		}
		
		if (button.getName().equals("btn14")) {
			frame = new Ex14_GuessNumber.Main();
			frame.setVisible(true);
		}
		
		if (button.getName().equals("btn15")) {
			frame = new Ex15_SearchWord.Main();
			frame.setVisible(true);
		}
		
		if (button.getName().equals("btn16")) {
			frame = new Ex16_CheckWordTimes.Main();
			frame.setVisible(true);
		}
		
		if (button.getName().equals("btn17")) {
			frame = new Ex17_Horoscope.Main();
			frame.setVisible(true);
		}
		
		if (button.getName().equals("btn18")) {
			frame = new Ex18_TextEditor.Main();
			frame.setSize(500, 500);
			frame.setVisible(true);
		}
		
		if (button.getName().equals("btnTroll")) {
			Troll1.Main troll = new Troll1.Main();
			troll.main(null);
		}
		
		if (button.getName().equals("btnTroll2")) {
			Troll2.Main troll = new Troll2.Main();
			troll.main(null);
		}
		
		if (button.getName().equals("btnTroll3")) {
			Troll3.Main troll = new Troll3.Main();
			troll.main(null);
		}
		
		if (button.getName().equals("btnTroll4")) {
			Troll4.Main troll = new Troll4.Main();
			troll.main(null);
		}
		
	}

}
