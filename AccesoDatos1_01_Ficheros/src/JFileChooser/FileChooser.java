package JFileChooser;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FileChooser {
	
	public static void main(String[] args) {
		
		JFileChooser fileChooser = new JFileChooser();
		int selection = fileChooser.showOpenDialog(null);
		if(selection == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			JOptionPane.showMessageDialog(null, file.getName());
		}
	}

}
