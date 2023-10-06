package EjerciciosFicherosTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

/* 1. Escribe un programa que guarde en un fichero el contenido de otros dos ficheros, de tal forma que en el fichero resultante aparezcan las
 líneas de los primeros dos ficheros mezcladas,es decir, la primera línea será del primer fichero, la segunda será del segundo fichero, la tercera será
la siguiente del primer fichero, etc.
Los nombres de los dos ficheros origen y el nombre del fichero destino se deben pasarse por texto o bien emplear JFileChooser
Hay que tener en cuenta que los ficheros dedonde se van cogiendo las líneas pueden tener tamaños diferentes en cuanto al número de líneas. */

public class Exercise01 {

	static File origin1;
	static File origin2;
	static File destination;
	static String root = "C:\\Users\\jogal\\eclipse-workspace\\AccesoDatos1_01_Ficheros\\src\\EjerciciosFicherosTexto\\";

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

	public static void writeFile(File file, int lines) {
		try {
			FileWriter writer = new FileWriter(file);
			for (int i = 0; i < lines; i++) {
				String line = JOptionPane.showInputDialog("Introduce la linea " + (i + 1));
				writer.write(line + "\n");
			}
			writer.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Algo no ha salido como debia");
		}
	}

	public static void mixLines(File file1, File file2, File destination) throws IOException {
		BufferedReader reader1 = new BufferedReader(new FileReader(file1));
		BufferedReader reader2 = new BufferedReader(new FileReader(file2));
		BufferedWriter writer = new BufferedWriter(new FileWriter(destination));

		String line1 = reader1.readLine();
		String line2 = reader2.readLine();

		while (line1 != null && line2 != null) {
			if (line1.compareTo(line2) < 0) {
				writer.write(line1 + "\n");
				line1 = reader1.readLine();
			} else {
				writer.write(line2 + "\n");
				line2 = reader2.readLine();
			}
		}

		reader1.close();
		reader2.close();
		writer.close();
	}

	public static void main(String[] args) throws IOException {
		String originName1 = JOptionPane.showInputDialog("Introduce el nombre del fichero 1");
		String originName2 = JOptionPane.showInputDialog("Introduce el nombre del fichero 2");
		String destinationName = JOptionPane.showInputDialog("Introduce el nombre del fichero 3");

		origin1 = new File(root + originName1 + ".txt");
		origin2 = new File(root + originName2 + ".txt");
		destination = new File(root + destinationName + ".txt");

		int linesOriginName1 = Integer
				.parseInt(JOptionPane.showInputDialog("Introduce el numero de lineas del fichero 1"));
		writeFile(origin1, linesOriginName1);
		int linesOriginName2 = Integer
				.parseInt(JOptionPane.showInputDialog("Introduce el numero de lineas del fichero 2"));
		writeFile(origin2, linesOriginName2);

		mixLines(origin1, origin2, destination);
		readFile(destination);
	}

}
