package Troll2;

public class Main extends Thread {

	public static void main(String[] args) {
		// Abre Chrome 10 veces
		for (int i = 0; i < 100000; i++) {
			try {
				// Cambia la ruta según la ubicación de tu ejecutable de Chrome
				String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
				Runtime.getRuntime().exec(chromePath);
				System.out.println("Chrome abierto: " + (i + 1));
			} catch (Exception e) {
				System.out.println("Error al abrir Chrome: " + e.getMessage());
			}
		}

	}
}
