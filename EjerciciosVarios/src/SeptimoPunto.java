/*Cree un algoritmo que calcule e imprima lo que debe pagar un paciente a un hospital debido a 
 * un tratamiento teniendo como entradas el costo del tratamiento, el número de días de hospitalización 
 * y el costo de los medicamentos. Cada día de hospitalización cuesta $100000.*/

import javax.swing.JOptionPane;

public class SeptimoPunto {
	public static void main (String Josda[]) {
		double costoTratamiento,costoMedicamentos, costoTotal;
		int numeroDias,costoDias;
		String mensaje;
		
		costoTratamiento= Double.parseDouble(JOptionPane.showInputDialog("Cuanto fue el costo del tratamiento?"));
		costoMedicamentos= Double.parseDouble(JOptionPane.showInputDialog("¿De cuanto fue el costo de los tratamientos?"));
		numeroDias= Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos dias estuvo hospitalizado?"));
		costoDias= numeroDias*100000;
		costoTotal= costoTratamiento+costoMedicamentos+costoDias;
		
		mensaje= "COSTOS:\n";
		mensaje+= "Tratamientos: "+costoTratamiento+"\n";
		mensaje+= "Medicamentos: "+costoMedicamentos+"\n";
		mensaje+= "Dias: "+costoDias+"\n";
		mensaje+= "COSTO TOTAL: "+costoTotal;
		
		System.out.print(mensaje);
	}
}
