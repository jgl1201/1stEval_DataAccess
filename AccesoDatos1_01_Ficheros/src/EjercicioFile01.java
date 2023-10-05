import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

/*Realizar un programa Java que utiliza la clase File. Deberá crear un directorio, dentro de dicho
directorio creará dos ficheros, hay que comprobar si existe; a uno de los ficheros le cambiará de
nombre y el otro se eliminará. Además mostrará los ficheros de un directorio. El nombre del
directorio se pasará al programa desde el teclado al ejecutarlo. El programa deberá mostrar también
información de un fichero cuyo nombre también se introducirá por teclado.*/

public class EjercicioFile01 {

	public static void main(String[] args) {
		String directoryName, firstFileName, secondFileName, newFirstFileName;

		directoryName = JOptionPane.showInputDialog("Introduce el nombre del directorio que quieres crear");
		File directory = new File(
				"C:\\Users\\jogal\\eclipse-workspace\\AccesoDatos1_01_Ficheros\\src\\" + directoryName);
		try {
			if (!directory.exists()) {
				try {
					directory.mkdir();
					JOptionPane.showMessageDialog(null, "Directorio creado");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else
				JOptionPane.showMessageDialog(null, "Ya existe un directorio con ese nombre");

			firstFileName = JOptionPane.showInputDialog("Introduce el nombre del primer fichero");
			secondFileName = JOptionPane.showInputDialog("Introduce el nombre del segundo fichero");
			File firstFile = new File("C:\\Users\\jogal\\eclipse-workspace\\AccesoDatos1_01_Ficheros\\src\\"
					+ directoryName + "\\" + firstFileName + ".txt");
			File secondFile = new File("C:\\Users\\jogal\\eclipse-workspace\\AccesoDatos1_01_Ficheros\\src\\"
					+ directoryName + "\\" + secondFileName + ".txt");
			if (!firstFile.exists() && !secondFile.exists()) {
				try {
					firstFile.createNewFile();
					secondFile.createNewFile();
					JOptionPane.showMessageDialog(null, "Ficheros creados");
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			} else
				JOptionPane.showMessageDialog(null, "Ya existe un fichero con ese nombre");

			JOptionPane.showMessageDialog(null, "Mostando contenido del directorio");
			if (directory.isDirectory()) {
				String[] content = directory.list();
				String contentStr = String.join("\n", content);

				JOptionPane.showMessageDialog(null, contentStr);
			}

			newFirstFileName = JOptionPane.showInputDialog("Introduce el nuevo nombre para " + firstFileName);
			File newFirstFile = new File("C:\\Users\\jogal\\eclipse-workspace\\AccesoDatos1_01_Ficheros\\src\\"
					+ directoryName + "\\" + newFirstFileName + ".txt");
			if (firstFile.renameTo(newFirstFile))
				JOptionPane.showMessageDialog(null, "Fichero renombrado exitosamente");
			else
				JOptionPane.showMessageDialog(null, "No se ha podido renombrar el fichero");

			JOptionPane.showMessageDialog(null, "Eliminando fichero " + secondFileName);
			if (secondFile.delete())
				JOptionPane.showMessageDialog(null, "Fichero eliminado exitosamente");
			else
				JOptionPane.showMessageDialog(null, "No se ha podido eliminar el fichero");

			JOptionPane.showMessageDialog(null, "Mostando contenido actualizado del directorio");
			if (directory.isDirectory()) {
				String[] content = directory.list();
				String contentStr = String.join("\n", content);

				JOptionPane.showMessageDialog(null, contentStr);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
