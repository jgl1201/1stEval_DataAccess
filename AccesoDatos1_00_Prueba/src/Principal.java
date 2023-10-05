
public class Principal {

	public static void main(String[] args) {
		// Run -> run configurations -> arguments -> Hola, soy Jorge
		System.out.println(args.length);

		for (int i = 0; i < args.length; i++)
			System.out.println(args[i]);

		for (String word : args)
			System.out.println(word);

		try {
			int j = 0;
			do {
				System.out.println(args[j]);
				j++;
			} while (j < args.length);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("NO SE MUESTRA NADA");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		int k = 0;
		while (k < args.length) {
			System.out.println(args[k]);
			k++;
		}

		// Recoger una array por args de numeros
		double suma = 0;
		for (String num : args) {
			try {
				suma += Double.parseDouble(num);
			} catch (NumberFormatException nbe) {
				System.out.println(nbe.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println(suma);
	}

}
