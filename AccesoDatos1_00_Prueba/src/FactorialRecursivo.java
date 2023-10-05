
public class FactorialRecursivo {

	public static int factorial(int numero) {
		if (numero <= 1) return 1;
		return numero * factorial(numero - 1);
	}
	
	public static int fibonacci(int n) {
		if (n == 0) return 0;
		else if (n == 1) return 1;
		else return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		System.out.println(	factorial(5));
		
		System.out.println(fibonacci(10));
	}

}
