package JFileChooser;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooser {

	public static void main(String[] args) {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		File archivo = null;
		String extension="";
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto","txt","doc","docx");
		fileChooser.setFileFilter(filter);
		do {
			int seleccion = fileChooser.showOpenDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
			    archivo = fileChooser.getSelectedFile();
			    String fileName = archivo.getName();
			    extension = fileName.substring(fileName.lastIndexOf(".") + 1);			}
		}while(!extension.equals("txt"));
	}

}