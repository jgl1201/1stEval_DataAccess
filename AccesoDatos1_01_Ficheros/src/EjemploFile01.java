import java.io.File;
import java.io.IOException;

public class EjemploFile01 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\jogal\\eclipse-workspace\\AccesoDatos1_01_Ficheros\\src\\EjemploFile01.txt");
		File f2 = new File("C:\\Users\\jogal\\eclipse-workspace\\AccesoDatos1_01_Ficheros\\src" + File.separator + "EjemploFile02.txt");
		try {
			file.createNewFile();
			f2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
