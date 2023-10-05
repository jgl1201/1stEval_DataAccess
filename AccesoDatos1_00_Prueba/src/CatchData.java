import java.util.Scanner;

public class CatchData {

	private Scanner sc;

	public CatchData() {
		sc = new Scanner(System.in);
	}

	public int catchInt() {
		int entero = 0;
		boolean keep;
		
		do {
			try {
				keep = false;
				System.out.println("Introduzca entero");
				entero = sc.nextInt();
				keep = false;
			} catch (java.util.InputMismatchException e) {
				keep = true;
				sc.nextLine();
			}
		} while (keep);
		
		return entero;
	}

}
