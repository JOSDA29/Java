/*Modifique el algoritmo anterior para que al resultado se le multiplique por 2.*/

import javax.swing.JOptionPane;

public class NumerosDecimalesDos {
	public static void main (String Josda[]) {
		double numeroUno, numeroDos, numeroTres, resultado;
		String mensaje;
		numeroUno= Double.parseDouble(JOptionPane.showInputDialog("Digite el primer numero decimal"));
		numeroDos= Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo numero decimal"));
		numeroTres= Double.parseDouble(JOptionPane.showInputDialog("Digite el tecer numero decimal"));
		resultado= (numeroUno+numeroDos+numeroTres)*2;
		mensaje= "SUMA DECIMALES\n";
		mensaje+= "Numero 1: "+numeroUno+"\n";
		mensaje+= "Numero 2: "+numeroDos+"\n";
		mensaje+= "Numero 3: "+numeroTres+"\n";
		mensaje+= "RESULTADO: "+resultado;
		
		System.out.print(mensaje);
	}
}
