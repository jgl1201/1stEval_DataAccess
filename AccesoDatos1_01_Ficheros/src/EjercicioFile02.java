import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import javax.swing.JOptionPane;

/* Codificar un programa en Java que muestre un menú con 3 opciones:
1. En la primera deberá crear un fichero (con el nombre que se quiera) en el que
indicaremos en líneas diferentes tu nombre, tus apellidos, tu ciudad de nacimiento.
2. En la segunda opción deberá mostrar por pantalla el contenido del fichero creado.
3. En la tercera opción crearemos un fichero cuyo nombre y contenido introducimos por
teclado. Después de crear el fichero con la información introducida, se deberá mostrar
por pantalla el texto del fichero variando entre mayúsculas y minúsculas. Por ejemplo, si
escribo Bienvenidos a Vigo deberá mostrar bIENVENIDOS A vIGO.*/
public class EjercicioFile02 {

	public static void readFile(String fileName) throws IOException {
		File file = new File("C:\\Users\\jogal\\eclipse-workspace\\AccesoDatos1_01_Ficheros\\src\\" + fileName + ".txt");
		FileReader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		String line;
		String content = "";

		while ((line = br.readLine()) != null) {
			content += line + "\n";
		}

		JOptionPane.showMessageDialog(null, content);

		br.close();
	}

	public static void createFileWithName(String fileName) throws IOException {
		File file = new File(
				"C:\\Users\\jogal\\eclipse-workspace\\AccesoDatos1_01_Ficheros\\src\\" + fileName + ".txt");
		FileWriter writer = new FileWriter(file);

		String name = JOptionPane.showInputDialog("Introduce tu nombre");
		String surname1 = JOptionPane.showInputDialog("Introduce tu primer apellido");
		String surname2 = JOptionPane.showInputDialog("Introduce tu segundo apellido");
		String city = JOptionPane.showInputDialog("Introduce tu ciudad de nacimiento");

		writer.write(name + "\n");
		writer.write(surname1 + "\n");
		writer.write(surname2 + "\n");
		writer.write(city + "\n");
		
		writer.close();
	}

	public static void createFileWithContent(String fileName) throws IOException {
		File file = new File(
			"C:\\Users\\jogal\\eclipse-workspace\\AccesoDatos1_01_Ficheros\\src\\" + fileName + ".txt");
		FileWriter writer = new FileWriter(file);
		
		String inputContent = JOptionPane.showInputDialog("Introduce el contenido del fichero");
		
		writer.write(randomizeCharacters(inputContent));
		
		writer.close();
	}
	
	public static String randomizeCharacters(String content) throws IOException {
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (char letter : content.toCharArray()) {
			if (random.nextBoolean()) {
				sb.append(Character.toUpperCase(letter));
			} else {
				sb.append(Character.toLowerCase(letter));
			}
		}
		return sb.toString();
	}
	
	public static String changeCase(String content) {
		for (char letter : content.toCharArray()) {
			if (Character.isUpperCase(letter)) {
				letter = Character.toLowerCase(letter);
			} else {
				letter = Character.toUpperCase(letter);
			}
		}
		return content;
	}

	public static void main(String[] args) {
		int option = Integer.parseInt(JOptionPane.showInputDialog("1. Crear fichero con datos personales.\n"
				+ "2. Mostrar datos del fichero.\n" + "3. Introducir contenido en un nuevo fichero."));

		String name = "";
		switch (option) {
		case 1:
			name = JOptionPane.showInputDialog("Introduce el nombre del fichero");
			try {
				createFileWithName(name);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			break;
		case 2:
			try {
				name = JOptionPane.showInputDialog("Introduce el nombre del fichero");
				readFile(name);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			break;
		case 3:
			name = JOptionPane.showInputDialog("Introduce el nombre del fichero");
			try {
				createFileWithContent(name);
				readFile(name);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opción no válida");
			break;
		}
	}

}
