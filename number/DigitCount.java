package number;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=s.nextInt();
		System.out.println("Given Digit is "+n);
		digitCount(n);
		digit_sum(n);
		digit_reverse(n);
		digit_multiply(n);
		digit_Palindrome(n);//12321 is palindrome
		digit_ArmStrong(n);//371 is armstrong


	}
	public static void digitCount(int num){
		int n=0; int count=0;
		if(num!=0){
			while(num>0){
				System.out.print(num%10+" || ");
				count=count+1;
				num=num/10;
			}
			System.out.println("The Total Number of Digit: "+count);
		}
		else
			System.out.println("Zero is given in input");
	}
	public static void digit_sum(int num){
		int n=0; 
		if(num!=0){
			while(num>0){
				n=n+num%10;
				num=num/10;
			}
		}
		else{
			System.out.println("Zero is given in input");
		}
		System.out.println("Sum Of Number: "+n);
	}
	public static void digit_reverse(int num){
		int n=0; 
		if(num!=0){
			while(num>0){
				n=n*10+num%10;
				num=num/10;
			}
		}
		else{
			System.out.println("Zero is given in input");
		}
		System.out.println("Reverse Of Number: "+n);
	}
	public static void digit_multiply(int num){
		int n=1; 
		if(num!=0){
			while(num>0){
				n=n*(num%10);
				num=num/10;
			}
		}
		else{
			System.out.println("Zero is given in input");
		}
		System.out.println("Multilication Of Number: "+n);
	}
	public static void digit_Palindrome(int num){
		int input=num;
		int n=0; 
		if(num!=0){
			while(num>0){
				n=n*10+(num%10);
				num=num/10;
			}
		}
		else{
			System.out.println("Zero is given in input");
		}
		if(n==input){
			System.out.println("Given Numner is palindrome: "+input);
		}
		else{
			System.out.println("Given Numner is not palindrome: "+input);
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
