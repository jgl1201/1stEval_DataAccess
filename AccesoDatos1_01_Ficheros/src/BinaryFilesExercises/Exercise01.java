package BinaryFilesExercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

/* Crea un fichero de texto con el nombre y contenido que tú quieras. Crea otro método para
leer el fichero anterior carácter a carácter mostrando su contenido en pantalla sin espacios y
escribiendo dicho contenido en otro fichero en el disco. Por ejemplo el fichero tiene el
siguiente texto: “Crea un fichero de texto con el nombre y contenido que tú quieras” deberá
mostrar por pantalla Creaunficherodetextoconelnombreycontenidoquetúquieras. */

public class Exercise01 {

	public static String getContent() {
		return JOptionPane.showInputDialog("Introduce una frase para guardar en el fichero");
	}

	public static void writeFile(File file) {
		try {
			FileWriter writer = new FileWriter(file);
			writer.write(getContent());
			writer.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL ESCRIBIR EL FICHERO");
		}
	}
	
	public static void getCharactersWithoutSpaces(File file) {
		try {
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			String content = "";
			String line;
			
			while ((line = br.readLine()) != null) {
				line = line.replaceAll(" ", "");
				content += line + "\n";
			}
			
			JOptionPane.showMessageDialog(null, content);
			
			br.close();
			reader.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL LEER EL FICHERO");
		}
	}

	public static void main(String[] args) {
		File file = new File("src/BinaryFilesExercises/Exercise01.txt");
		
		writeFile(file);
		getCharactersWithoutSpaces(file);
	}

}
