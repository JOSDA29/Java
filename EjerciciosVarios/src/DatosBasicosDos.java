/*Crear un algoritmo que imprima el nombre, apellido, documento de identidad, edad y profesión, teléfono de una persona de la siguiente manera: 

Datos Ingresados:
Nombre Completo: Pepito Pérez
Edad: 23
Documento: 109456788
Profesión: Estudiante
Teléfono: 3113841824
*/

import javax.swing.JOptionPane;

public class DatosBasicosDos {
	public static void main (String Josda[]) {
		String nombre, profesion, mensaje;
		int edad, documento, telefono;
		nombre= JOptionPane.showInputDialog("Digite su nombre completo");
		documento= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de su documento de identidad"));
		edad= Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
		telefono= Integer.parseInt(JOptionPane.showInputDialog("Digite su telefono"));
		profesion= JOptionPane.showInputDialog("Digite su profesion");
		mensaje= "DATOS INGRESADOS\n";
		mensaje+= "Nombre completo: "+nombre+"\n";
		mensaje+= "Edad: "+edad+"\n";
		mensaje+= "Documento: "+documento+"\n";
		mensaje+= "Profesion: "+profesion+"\n";
		mensaje+= "Telefono: "+telefono;
		System.out.print(mensaje);
	}
}
