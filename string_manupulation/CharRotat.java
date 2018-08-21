package string_manupulation;

import java.util.Arrays;
import java.util.Scanner;

//17. Write a java program to check whether one string is a rotation of another?
public class CharRotat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  String");
		String word=sc.nextLine();
		String result=rotatString(word,word.length()-1);
//		System.out.println(result);
		
	}
	public static String rotatString(String word,int times)
	{	char[] letter=word.toCharArray();
		while(times>=0){
			char f_word=letter[0];
			for(int i=0;i<letter.length-1;i++){
				letter[i]=letter[i+1];
			}
			letter[letter.length-1]=f_word;
			times--;
		System.out.println(Arrays.toString(letter));
		}
		return Arrays.toString(letter);
	}

}
