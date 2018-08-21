package string_manupulation;

import java.util.Scanner;

public class StringPertcentage {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String input=sc.nextLine();
		String str="Hello @how -2 are 1 you 45 24 &";
		System.out.println(str);
		int length=str.length();
		String num=str.replaceAll("[^0-9]+", "");
		
		System.out.println("Length of number "+num+": "+num.length()+" and percentage= "+((num.length()*100)/length));
		String uppercaseWord=str.replaceAll("[^A-Z]+", "");
		System.out.println("Length of UpperCase "+uppercaseWord+": "+uppercaseWord.length()+" and percentage= "+((uppercaseWord.length()*100)/length));
		String lowercaseWord=str.replaceAll("[^a-z]+", "");
		System.out.println("Length of LowerrCase "+lowercaseWord+": "+lowercaseWord.length()+" and percentage= "+((lowercaseWord.length()*100)/length));
		String specialCharacter=str.replaceAll("[A-Za-z0-9]"," ");
//		System.out.println("Length of specialCharacter "+specialCharacter+": "+specialCharacter.length()+" and percentage= "+((specialCharacter.length()*100)/length));
		
	}

}
