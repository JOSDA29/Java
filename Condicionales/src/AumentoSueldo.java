/*De un empleado se conoce su sueldo actual. Si ´este es mayor o igual a $500.000, se le aumenta un 8%. 
 * En caso contrario, se le aumenta el 10%. Calcule el nuevo sueldo.*/

import javax.swing.JOptionPane;

public class AumentoSueldo {
	public static void main (String Josda[]) {
		double sueldo, sueldoFinal;
		String mensaje;
		sueldo= Double.parseDouble(JOptionPane.showInputDialog("Digite su sueldo actual"));
		if (sueldo>=500000) {
			sueldoFinal= sueldo*0.08+sueldo;
			mensaje= "AUMNETO SUELDO \n";
			mensaje+= "Sueldo Anterior: "+sueldo+"\n";
			mensaje+= "Sueldo Final: "+sueldoFinal;
			JOptionPane.showMessageDialog(null, mensaje, "AUMENTO SUELDO", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			sueldoFinal= sueldo*0.1+sueldo;
			mensaje= "AUMNETO SUELDO \n";
			mensaje+= "Sueldo Anterior: "+sueldo+"\n";
			mensaje+= "Sueldo Final: "+sueldoFinal;
			JOptionPane.showMessageDialog(null, mensaje, "AUMENTO SUELDO", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
