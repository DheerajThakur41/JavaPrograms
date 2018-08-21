package string_manupulation;
import java.util.Scanner;

public class repetingWord {


	public static void main(String[] args) {
		System.out.println("Enter your string:\n");
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		String str="abcd efcd aeiou";
//		int ar[]={2,2,3,5,7,9,3,5};
		char[] character = word.toCharArray();
		for(int i=0;i<character.length;i++)
		{
			int count=0;
			for(int j=0;j<character.length;j++){
				if(j<i && character[i]==character[j]){
					break;					
				}
				if(character[i]==character[j]){
					count++;
				}
				if(j==character.length-1)
				{
					System.out.println("the character "+character[i]+"Appears "+count+" times");
				}
			}
		}
		

	}

}