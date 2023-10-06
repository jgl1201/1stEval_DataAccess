package EjerciciosFicherosTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/* Crea un programa en Java que lea el contenido de un archivo que indique el usuario y reemplace todas las ocurrencias de una
palabra por otra. Ambas palabras serán solicitadas al usuario.
El resultado debe guardarse en otro archivo de texto llamado "reemplazo.txt" */
 
public class Exercise03 {
	
	static BufferedReader reader;
	static BufferedWriter writer;
	
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
	
	public static void replaceWord(JFileChooser chooser) {
		File file = chooser.getSelectedFile();
		String word = JOptionPane.showInputDialog("Introduce la palabra");
		String newWord = JOptionPane.showInputDialog("Introduce la nueva palabra");
		
		try {
			reader = new BufferedReader(new FileReader(file));
			String line = reader.readLine();
			String content = "";
			
			while (line != null) {
				content += line + "\n";
				line = reader.readLine();
			}
			
			reader.close();
			
			String newContent = content.replaceAll(word, newWord);
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(newContent);
			writer.close();
			
			JOptionPane.showMessageDialog(null, "La palabra " + word + " se ha reemplazado por " + newWord);
			
		} catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer o escribir el archivo.");
        }
	}
	
	public static void main(String[] args) {
		JFileChooser chooser = new JFileChooser();
		int option = chooser.showOpenDialog(null);
		if (option == JFileChooser.APPROVE_OPTION) {
			replaceWord(chooser);
			readFile(chooser.getSelectedFile());
		} else JOptionPane.showMessageDialog(null, "Seleción cancelada");
		
	}

}
