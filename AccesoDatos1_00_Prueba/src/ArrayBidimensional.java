import javax.swing.*;

public class ArrayBidimensional {
	
	private static boolean colorDisponible (int modelo, int color, boolean[][] valores) {
		return valores[modelo][color];
	}

	public static void main(String[] args) {

		//array de 3*3
		//boolean [][] combinaciones = new boolean[3][3];
		boolean [][] combinaciones = {{true, true, true}, {false, true, false}, {false, true, true}};
		
		//filas
		System.out.println(combinaciones.length);
		//columnas
		System.out.println(combinaciones.length);
		for (int i = 0; i < combinaciones[0].length; i++) {
			for (int j = 0; j < combinaciones[0].length; j++) {
				System.out.print(combinaciones[i][j] + " ");
			}
			System.out.println();
		}
		boolean modeloCorrecto = true, colorCorrecto = true;
		int indiceModelo = 0, indiceColor = 0;
		String modelo = "";
		String color = "";
		
		do {
			modelo = JOptionPane.showInputDialog("Introduzca modelo").toLowerCase();
			switch(modelo) {
			case "ibiza":
				indiceModelo = 0;
				modeloCorrecto = true;
				break;
			case "cordoba":
				indiceModelo = 1;
				modeloCorrecto = true;
				break;
			case "toledo":
				indiceModelo = 2;
				modeloCorrecto = true;
				break;
			default:
				modeloCorrecto = false;
				JOptionPane.showMessageDialog(null, "Modelo incorrecto, intentelo de nuevo");
			}
		} while (!modeloCorrecto);
		
		
		
		do {
			color = JOptionPane.showInputDialog("Introduzca color").toLowerCase();
			switch(color) {
			case "blanco":
				indiceColor = 0;
				colorCorrecto = true;
				break;
			case "amarillo":
				indiceColor = 1;
				colorCorrecto = true;
				break;
			case "rojo":
				indiceColor = 2;
				colorCorrecto = true;
				break;
			default:
				colorCorrecto = false;
				JOptionPane.showMessageDialog(null, "Color incorrecto, intentelo de nuevo");
			}
		} while (!colorCorrecto);
		
		if(colorDisponible(indiceModelo, indiceColor, combinaciones) )
			JOptionPane.showMessageDialog(null, "Combinacion valida");
		else JOptionPane.showMessageDialog(null, color);
		
	}

}
