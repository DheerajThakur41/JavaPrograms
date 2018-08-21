package number;

public class Factorial {

	public static void main(String[] args) {
		fact(6);
	}
	public static void fact(int num)
	{ int n=1;
		for(int i=1;i<=num;i++){
			System.out.print(i+"*");
			n=n*i;
		}
		System.out.println("\nFactorial Is: "+n);
	}

}
