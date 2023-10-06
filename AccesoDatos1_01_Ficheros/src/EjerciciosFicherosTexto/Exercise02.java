package EjerciciosFicherosTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

/*Realiza un programa en Java donde introduzcas la ruta de un fichero por teclado y un texto que queramos a
escribir en el fichero con JOptionPane.showInputDialog Posteriormente, muestra el contenido del fichero.
Haz una versión alternativa empleando JFileChooser
 */

public class Exercise02 {

	public static String root() {
		return JOptionPane.showInputDialog("Introduce la ruta del archivo");
	}

	public static String name() {
		return JOptionPane.showInputDialog("Introduce el nombre del fichero");
	}

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
		root();
		name();
		File file = new File(root() + name() + ".txt");

		writeFile(file);
		readFile(file);
	}

}
