package number;

public class Num_Swap {

	public static void main(String[] args) {
		swap_withTemp(3,4);
		System.out.println("\t*******************************\t");
		swap_withoutTemp(3,4);
	}
	public static void swap_withTemp(int a, int b){
		int c;
		System.out.println("Value of a:"+a+"\n Value of b:"+b);
		c=a;a=b;b=c;
		System.out.println("Value of a:"+a+"\nValue of b:"+b);
	}
	public static void swap_withoutTemp(int a, int b){
		System.out.println("Value of a:"+a+"\n Value of b:"+b);
		a=a+b;b=a-b;a=a-b;
		System.out.println("Value of a:"+a+"\nValue of b:"+b);
	}
	
	}
