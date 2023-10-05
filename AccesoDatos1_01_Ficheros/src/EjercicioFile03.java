import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.swing.JOptionPane;

/* Crea un programa que pida por teclado la ruta de un fichero y la cantidad de números
aleatorios que queremos generar. Los números generados se guardarán en el fichero usando
DataOutputStream, en otro método los leeremos del fichero utilizando DataInputStream y los
mostraremos en pantalla.
El rango de los números aleatorios estará entre 0 y 100, incluyendo el 100.
Cada vez que ejecutemos la aplicación añadiremos números al fichero sin borrar los anteriores,
es decir, si creo el fichero añadiendo 10 números y después añadimos otros 10, al final el
fichero habrá 20 números que se mostrarán por pantalla.*/
public class EjercicioFile03 {
	
	static File file;
	static FileWriter fileWriter;
	static PrintWriter printWriter;
	static FileInputStream inputStream;
	static DataInputStream dataInputStream;
	static StringBuilder sb;
	static Random random;
	
	public static int generateRandomNumber() {
		random = new Random();
		return random.nextInt(101);
	}
	
	public static void writeFile(int executions) {
		try {
			fileWriter = new FileWriter(file, true);
			printWriter = new PrintWriter(fileWriter);
			for (int i = 0; i < executions; i++) {
				printWriter.println(generateRandomNumber());
			}
			printWriter.close();
			fileWriter.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Algo no ha salido como debia");
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void readFile(File file) {
		try {
			inputStream = new FileInputStream(file);
			dataInputStream = new DataInputStream(inputStream);
			
			sb = new StringBuilder();
			while (dataInputStream.available() > 0) {
				// se puede usar un BufferedReader pero no cumple con el enunciado
				sb.append(dataInputStream.readLine()).append("\n");
			}
			dataInputStream.close();
			inputStream.close();
			
			JOptionPane.showMessageDialog(null, sb.toString());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Algo no ha salido como debia");
		}
	}
	
	public static void main(String[] args) {
		file = new File("C:\\Users\\jogal\\eclipse-workspace\\AccesoDatos1_01_Ficheros\\src\\EjercicioFile03.txt");
		int numberOfExecutions = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros quieres generar"));
		
		writeFile(numberOfExecutions);
		readFile(file);
	}
	

}
