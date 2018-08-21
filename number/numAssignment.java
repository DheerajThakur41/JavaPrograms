package number;

public class numAssignment {

	public static void main(String[] args) {
		checkPrime(5);
		fact(5);
		fibonacci(6);
		digit_ArmStrong(371);// only support 3 digit
	}

	public static void checkPrime(int n){
		boolean flag=true;
		if(n==0||n==1){
			System.out.println("Dont enter 0 and 1");
		}
		else{
			for(int i=2;i<=(n/2)+1;i++){
				if(n%i==0){
					System.out.println(n+" is not a Prime Number");
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.println(n+" is a Prime Number");
			}
		}
	}
	public static void fact(int num)
	{ int n=1;
	for(int i=1;i<=num;i++){
		System.out.print(i+"*");
		n=n*i;
	}
	System.out.println("\nFactorial Is: "+n);
	}
	public static void fibonacci(int length){
		int a=0; int b=1;int c=0;
		for(int i=0;i<=length;i++){
			System.out.print(c+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
	
	public static void digit_ArmStrong(int num){
		int input=num;
		int n=0; 
		if(num!=0){
			while(num>0){
				n=n+(num%10)*(num%10)*(num%10);
				num=num/10;
			}
		}
		else{
			System.out.println("Zero is given in input");
		}
		if(n==input){
			System.out.println("Given Numner is Armstrong: "+n);
		}
		else{
			System.out.println("Given Numner is not Armstrong: "+n);
		}
	}


}
