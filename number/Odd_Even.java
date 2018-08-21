package number;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		System.out.println("Enter Number to check For Odd Even");
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		if(check_Odd_Even(n)){
			System.out.println(n+" is Odd Number");
		}
		else{
			System.out.println(n+" is even Number");
		}
		s.close();
	}
	public static boolean check_Odd_Even(int n){
		boolean flag=true;
		if(n%2==0){
			flag=false;
		}
		return flag;
	}

}
