package EjerciciosFicherosTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Exercise02Chooser {
	
	public static void readFile(File file) {
		try {
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			String line;
			String content = "";

			while ((line = br.readLine()) != null) {
				content += line + "\n";
			}

			JOptionPane.showMessageDialog(null, content);

			br.close();
			reader.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Algo no ha salido como debia");
		}
	}
	
	public static void writeFile(File file) {

		String text = "";

		while (true) {
			String line = JOptionPane.showInputDialog("Introduce el texto");
			if (line.equals("")) {
				break;
			}
			text += line + "\n";
		}

		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(text);

			bw.close();
			fw.close();
			JOptionPane.showMessageDialog(null, "El fichero ha sido escrito");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Algo no ha salido como debia \n" + e.getMessage());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Algo no ha salido como debia \n" + e.getMessage());
		}

	}

	public static void main(String[] args) {
		// Instancia del "explorador de archivos"
		JFileChooser chooser = new JFileChooser();
		// Abre el explorador de archivos
		int selection = chooser.showSaveDialog(null);
		
		// Comprueba si el fichero tiene nombre y si se pulsa Save
		if (selection == JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			writeFile(file);
			readFile(file);
		}
	}
}
