/*Cree un algoritmo imprima el nombre, apellido, documento de identidad, edad y 
 * profesión de una persona de la siguiente manera Datos ingresados:
Nombre completo: Pepito Pérez
Documento: 10934566
Edad= 21
Profesión: Estudiante

Bienvenido!!!
*/

import javax.swing.JOptionPane;

public class DatosBasicos {
	public static void main (String Josda[]) {
		String nombre, documento, edad, profesion, mensaje;
		nombre= JOptionPane.showInputDialog("Digite su nombre completo");
		documento= JOptionPane.showInputDialog("Digite el numero de su documento de identidad");
		edad= JOptionPane.showInputDialog("Digite su edad");
		profesion= JOptionPane.showInputDialog("Digite su profesion");
		mensaje= "DATOS BASICOS\n";
		mensaje+= "Nombre completo: "+nombre+"\n";
		mensaje+= "Documento: "+documento+"\n";
		mensaje+= "Edad: "+edad+"\n";
		mensaje+= "Profesion: "+profesion+"\n";
		mensaje+= "\n";
		mensaje+= "¡BIENVENIDO! :D";
		
		System.out.print(mensaje);
	}
}
