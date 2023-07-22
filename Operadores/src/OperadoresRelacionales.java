
public class OperadoresRelacionales {
	public static void main(String [] args) {
		int x=4;
		int y=5;
		
		boolean menorQue=(x<y);
		System.out.println("4<5 ="+menorQue);
		
		boolean mayorQue=(x>y);
		System.out.println("4>5 ="+mayorQue);
		
		boolean mayorIgualQue=(x>=y);
		System.out.println("4>=5 ="+mayorIgualQue);
		
		boolean menorIgualQue=(x<=y);
		System.out.println("4<=5 ="+menorIgualQue);
		
		boolean igualQue= (x==y);
		System.out.println("4==5 ="+igualQue);
		
		boolean diferenteDe= (x!=y);
		System.out.println("4!=5 ="+diferenteDe);
		
		x=16;
		y=16;
		boolean igualQueDos =(x==y);
		System.out.println("16==16 ="+igualQueDos);
		boolean diferenteDeDos =(x!=y);
		System.out.println("16!=16 ="+diferenteDeDos);
		
		x=-29;
		y=29;
		boolean mayorQueDos= (x>y);
		System.out.println("-29>29 ="+mayorQueDos);
		boolean menorQueDos= (x<y);
		System.out.println("-29<29 ="+menorQueDos);
	}
}
