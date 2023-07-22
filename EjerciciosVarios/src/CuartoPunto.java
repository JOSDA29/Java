/*Modificar el algoritmo anterior para que muestre el 15% de un valor ingresado por el usuario.*/

import javax.swing.JOptionPane;

public class CuartoPunto {
	public static void main(String Josda[]) {
		double valor, valorFinal;
		final double PORCENTAJE = 0.15;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite un valor numerico"));
		valorFinal = valor*PORCENTAJE;
		System.out.println("El 15% del valor "+valor+" es:"+valorFinal);
		
	}
}
