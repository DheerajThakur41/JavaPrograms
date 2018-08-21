package string_manupulation;

import java.util.Scanner;

public class Remove_WhiteSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String str="";
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)==' '){
				continue;
			}
			str=str+input.charAt(i);
		}
		System.out.println(str);
	}

}
