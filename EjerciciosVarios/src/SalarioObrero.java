/*Calcular el nuevo salario de un obrero si obtuvo un incremento del 25% sobre su salario anterior.*/

import javax.swing.JOptionPane;

public class SalarioObrero {
	public static void main (String Josda[]) {
		String mensaje;
		double salario, incremento, salarioTotal;
		salario=Double.parseDouble(JOptionPane.showInputDialog("Digite su salario"));
		incremento= salario*0.25;
		salarioTotal= salario+incremento;
		mensaje= "SALARIO CON INCREMENTO\n";
		mensaje+= "Salario actual: "+salario+"\n";
		mensaje+= "Salario con incremento: "+salarioTotal;
		System.out.print(mensaje);
	}
}
