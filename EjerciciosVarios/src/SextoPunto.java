/*Cree un algoritmo que reciba como entrada el sueldo de una persona y sus horas extras trabajadas y 
 * luego imprima el Sueldo total de esta persona dado que cada hora extra vale $3000.*/

import javax.swing.JOptionPane;

public class SextoPunto {
	public static void main (String Josda[]) {
		double sueldo,totalExtras,sueldoTotal;
		int horaExtTrab;
		final double VAL_EXTRA=3000;
		String mensaje, nombre;
		
		nombre=JOptionPane.showInputDialog("Ingrese su Nombre");
		
		horaExtTrab=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas extras trabajadas"));
		sueldo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo actual"));
		totalExtras=horaExtTrab*VAL_EXTRA;
		sueldoTotal=sueldo+totalExtras;
		
		mensaje="<<<<<<<<<< RESULTADO PARA "+nombre.toUpperCase()+">>>>>>>>>>\n";
		mensaje+="Su sueldo es: $"+sueldo+" y trabajÃ³ "+horaExtTrab+" horas extras\n";
		mensaje+="El total de horas extras trabajadas es: $"+totalExtras+"\n";
		mensaje+="El total a pagar es: $"+sueldoTotal+"\n";
		mensaje+="*********************************";
		
		System.out.println(mensaje);
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
