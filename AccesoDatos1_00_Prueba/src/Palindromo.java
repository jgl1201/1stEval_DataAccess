import javax.swing.JOptionPane;

public class Palindromo {

	public static boolean isPalidrome(String cad1, String cad2) {
		return cad1.equalsIgnoreCase(cad2);
	}

	public static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String reversedStr = sb.toString();
		return str.equals(reversedStr);
	}

	public static void main(String[] args) {
		String cad1 = JOptionPane.showInputDialog("Introduzca una frase");
		cad1 = cad1.replaceAll(" ", "");

		String cad2 = "";
		for (int i = cad1.length() - 1; i >= 0; i--)
			cad2 += cad1.charAt(i);

		if (isPalidrome(cad1, cad2))
			System.out.println("Palindromo");
		else
			System.out.println("No palindromo");

		String str = "racecar";
		boolean isPal = isPalindrome(str);
		System.out.println(str + " is a palindrome: " + isPal);
	}

}
