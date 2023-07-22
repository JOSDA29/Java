import javax.swing.JOptionPane;

public class Principal {
	public static void main(String josda[]) {
		double sueldo,totalExtra,sueldoTotal;
		int horasExtraTrabajadas;
		final double VALOR_EXTRA=3000;
		horasExtraTrabajadas=2;
		sueldo=100000;
		totalExtra= horasExtraTrabajadas*VALOR_EXTRA;
		sueldoTotal= totalExtra+sueldo;
		
		System.out.println(" sueldo es"+sueldo+"y trabajo"+horasExtraTrabajadas+"horas extra");
		System.out.println("El total a pagar es:"+sueldoTotal);
		System.out.println("El total a pagar es:"+sueldoTotal);
	}
	
}
