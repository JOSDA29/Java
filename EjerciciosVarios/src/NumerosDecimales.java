/*Haga un algoritmo que sume 3 números decimales e imprima el resultado*/

import javax.swing.JOptionPane;

public class NumerosDecimales {
	public static void main (String Josda[]) {
		double numeroUno, numeroDos, numeroTres, resultado;
		String mensaje;
		numeroUno= Double.parseDouble(JOptionPane.showInputDialog("Digite el primer numero decimal"));
		numeroDos= Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo numero decimal"));
		numeroTres= Double.parseDouble(JOptionPane.showInputDialog("Digite el tecer numero decimal"));
		resultado= numeroUno+numeroDos+numeroTres;
		mensaje= "SUMA DECIMALES\n";
		mensaje+= "Numero 1: "+numeroUno+"\n";
		mensaje+= "Numero 2: "+numeroDos+"\n";
		mensaje+= "Numero 3: "+numeroTres+"\n";
		mensaje+= "RESULTADO: "+resultado;
		
		System.out.print(mensaje);
	}
}
