/*Determine el valor de x obtenido para la siguiente ecuación: x=a+b2a*/

import javax.swing.JOptionPane;

public class NovenoPunto {
	public static void main (String Josda[]) {
		double valorA, valorB, valorX;
		String mensaje;
		valorA= Double.parseDouble(JOptionPane.showInputDialog("Digite un valor numerico para a"));
		valorB= Double.parseDouble(JOptionPane.showInputDialog("Digite unn valor numerico para b"));
		valorX= valorA+valorB*2*valorA;
		mensaje= "ECUACION x=a+b2a:\n";
		mensaje+= "Valor a: "+valorA+"\n";
		mensaje+= "Valor b: "+valorB+"\n";
		mensaje+= "Valor x: "+valorX;
		
		System.out.print(mensaje);
	}
}
