
public class Operadores {
	public static void main(String[]args) {
		int x = 14;
		int y = 2;
		System.out.println("Valor x="+x+" Valor y ="+y);
		
		int suma= x+y;
		System.out.println("x+y ="+suma);
		int resta= x-y;
		System.out.println("x-y ="+resta);
		int multiplicacion= x*y;
		System.out.println("x*y ="+multiplicacion);
		int division= x/y;
		System.out.println("x/y ="+division);
		int modulo= x%y;
		System.out.println("x%y ="+modulo);
		int moduloDos= x%3;
		System.out.println("x%3 ="+moduloDos);
		
		x=14;
		int incrementoPostFijo= x++;
		System.out.println("incremento x++ ="+incrementoPostFijo);
		x=14;
		int incrementoPreeFijo= ++x;
		System.out.println("incremento ++x ="+incrementoPreeFijo);
		
		x=14;
		int decrementoPostFijo= x--;
		System.out.println("decremento x-- ="+decrementoPostFijo);
		x=14;
		int decrementoPreeFijo= --x;
		System.out.println("decremento --x ="+decrementoPreeFijo);
	}
}
