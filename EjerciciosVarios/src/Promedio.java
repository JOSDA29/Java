/*Crea un algoritmo que calcule e imprima el promedio de 3 notas parciales*/

import javax.swing.JOptionPane;

public class Promedio {
	public static void main (String Josda[]) {
		double notaUno, notaDos, notaTres, promedio;
		String mensaje;
		notaUno= Double.parseDouble(JOptionPane.showInputDialog("Digite su primera nota"));
		notaDos= Double.parseDouble(JOptionPane.showInputDialog("Digite su segunda nota"));
		notaTres= Double.parseDouble(JOptionPane.showInputDialog("Digite su tecera nota"));
		promedio= (notaUno+notaDos+notaTres)/3;
		mensaje= "NOTAS PARCIALES\n";
		mensaje+= "Parcial 1: "+notaUno+"\n";
		mensaje+= "Parcial 2: "+notaDos+"\n";
		mensaje+= "Parcial 3: "+notaTres+"\n";
		mensaje+= "PROMEDIO: "+promedio;
		
		System.out.print(mensaje);
	}
}
