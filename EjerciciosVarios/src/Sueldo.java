/*Algoritmo que reciba como entrada el sueldo de una persona y sus horas extras trabajadas y luego imprima 
 * el Sueldo Total de esta persona dado que cada hora extra vale $3000.*/

import javax.swing.JOptionPane;

public class Sueldo {
	public static void main (String Josda[]) {
		String mensaje;
		double sueldo, cantidadHoras, totalHoras, sueldoTotal;
		final int valorHoras =3000;
		sueldo=Double.parseDouble(JOptionPane.showInputDialog("Digite su sueldo"));
		cantidadHoras=Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad de horas trabajadas"));
		totalHoras= cantidadHoras*valorHoras;
		sueldoTotal= sueldo+totalHoras;
		mensaje= "SUELDO Y HORAS EXTRA\n";
		mensaje+= "Horas extra trabajadas: "+cantidadHoras+"\n";
		mensaje+= "Valor horas extra: "+totalHoras+"\n";
		mensaje+= "Sueldo: "+sueldo+"\n";
		mensaje+= "SUELDO TOTAL: "+sueldoTotal;
		System.out.print(mensaje);
	}
}
