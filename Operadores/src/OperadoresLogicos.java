
public class OperadoresLogicos {
	public static void main (String [] args) {
		int x=-1;
		boolean operacionUno= (x>0 && x<=6);
		System.out.println(operacionUno);
		boolean operacionDos= (x<0 || x>6);
		System.out.println(operacionDos);
		
		x=4;
		boolean operacionTresA= (x<0);
		System.out.println(operacionTresA);
		boolean operacionTresB= !(x<0);
		System.out.print(operacionTresB);
	}
	
}
