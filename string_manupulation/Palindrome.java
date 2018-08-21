package string_manupulation;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String reverse="";
		for(int i=input.length()-1;i>=0;i--){
			reverse=reverse+input.charAt(i);
		}
		if(reverse.equals(input)){
			System.out.println("Given Word is Palindrome: "+input);
		}
		else{
			System.out.println("Given Word is not Palindrome");
		}
	}

}
