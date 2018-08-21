package number;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacci(5);
	}
	public static void fibonacci(int length){
		int a=0; int b=1;int c=0;
		for(int i=0;i<=length;i++){
			System.out.println(c);
			c=a+b;
			a=b;
			b=c;
		}
		
}
}
