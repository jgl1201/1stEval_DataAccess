
public class EjemploStrings {

	public static void main(String[] args) {
		String cad1 = "Soy una cadena";
		String cad2 = new String("Soy una cadena");
		
		System.out.println(cad1);
		System.out.println(cad2);
		
		if (cad1.length() == cad2.length()) {
			for (int i = 0; i < cad1.length(); i++) {
				if (cad1.charAt(i) != cad2.charAt(i)) {
					i = cad1.length()-1;
					System.out.println("Las cadenas no son iguales");
				}
			} System.out.println("Las cadenas son iguales");
		} else System.out.println("Las cadenas no son iguales");
				
	}
	
}
