import javax.swing.*;

public class Switch {

	public static void main(String[] args) {
		String day = JOptionPane.showInputDialog("Type a week's day");
		// JOptionPane.showMessageDialog(null, "Me llamo " + name);
		day = day.toLowerCase();
		
		switch (day) {
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			JOptionPane.showMessageDialog(null, "Dia laborable");
			break;
		case "sabado":
		case "domingo":
			JOptionPane.showMessageDialog(null, "Finde");
			break;
		default: JOptionPane.showMessageDialog(null, "Dia inexistente");
		}
		
		
	}
	
}
