import java.util.Scanner;

@SuppressWarnings("serial")
class GreaterThanTenException extends Exception {

	public GreaterThanTenException(String message) {
		super(message);
	}
}

@SuppressWarnings("serial")
class DivisionByZero extends Exception {

	public DivisionByZero(String message) {
		super(message);
	}

}

public class EjemploExcepciones {

	public static void getNumber(int number) throws GreaterThanTenException {
		if (number > 10)
			throw new GreaterThanTenException("El numero es mayor que 10");
		else
			System.out.println("Has introducido el numero: " + number);
	}

	public static int divide(int number, int denominator) throws DivisionByZero {
		if (denominator == 0)
			throw new DivisionByZero("No se puede dividir entre 0");
		else
			return number / denominator;
	}

	public static void main(String[] args) throws GreaterThanTenException, DivisionByZero {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int number = sc.nextInt();

		try {
			getNumber(number);
		} catch (GreaterThanTenException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Introduce otro numero");
		int denominator = sc.nextInt();
		try {
			divide(number, denominator);
		} catch (DivisionByZero e) {
			System.out.println("No se puede dividir entre 0, subnormal");
		}

		sc.close();
	}

}
