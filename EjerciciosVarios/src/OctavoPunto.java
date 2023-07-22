/*Halle el área de un triángulo rectángulo si su base y altura son de un valor desconocido (área=(base*altura)/2).*/

import javax.swing.JOptionPane;

public class OctavoPunto {
	public static void main (String Josda[]) {
		double base, altura, area;
		String mensaje;
		base= Double.parseDouble(JOptionPane.showInputDialog("Digite la base de su triangulo"));
		altura= Double.parseDouble(JOptionPane.showInputDialog("Digite la altura de su triangulo"));
		area= (base*altura)/2;
		
		mensaje="DATOS TRIANGULO \n";
		mensaje+="BASE: "+base+"\n";
		mensaje+="ALTURA: "+altura+"\n";
		mensaje+="AREA: "+area;
		
		System.out.print(mensaje);
	}
}
