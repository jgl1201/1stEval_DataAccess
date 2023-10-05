import javax.swing.*;

public class Bisiesto {
	
	public static boolean isBisiesto (int ano) {
		return (ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0));
	}
	
	public static void main(String[] args) {
		String ano = JOptionPane.showInputDialog("Año");
		try {
			int year = Integer.parseInt(ano);
			JOptionPane.showMessageDialog(null, isBisiesto(year));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
