/*Calcular el nuevo salario de un obrero si obtuvo un incremento del 25% sobre su salario anterior.*/

import javax.swing.JOptionPane;

public class QuintoPunto {
	public static void main(String Josda[]) {
		double salario, salarioFinal;
		final double INCREMENTO= 0.25;
		String mensaje;
		
		salario= Double.parseDouble(JOptionPane.showInputDialog("Digite su salario"));
		salarioFinal= (salario*INCREMENTO)+salario;
		mensaje ="Su salario actual es "+salario+"\n";
		mensaje+="Con un descuento del 25% su sueldo es "+salarioFinal;
		System.out.println(mensaje);
	}
}
