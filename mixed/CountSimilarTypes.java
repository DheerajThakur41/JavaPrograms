package mixed;

import java.util.HashMap;
import java.util.Scanner;

//Count how many upper case, Lower Case, Vowels, consonants, digits,symbols are present in given sentence
public class CountSimilarTypes {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the line");
		String str=s.nextLine();
		String str1=str.replaceAll(" ", "");
		System.out.println(str1);
		char[] arr=new char[str1.length()];
		for(int i=0; i<str1.length();i++)
		{
			arr[i]=str1.charAt(i);
		}
		
		HashMap<String,Integer> hm1=countAllGivenTypes(arr);
		System.out.println(hm1);
//		int n='z';
//		System.out.println(n);
		

	}
	public static HashMap<String,Integer> countAllGivenTypes(char[] arr)
	{
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			int n=arr[i];	
			String s1=""+arr[i];
			if(n>=65 && n<=90)
			{
				
				if(hm.containsKey("Upper Case"))
				{
					int k=hm.get("Upper Case");
					k++;
					hm.put("Upper Case", k);					
				}
				else
				{
					hm.put("Upper Case", 1);
				}
			}
			
			if(n>=97 && n<=122)
			{
				if(hm.containsKey("Lower Case"))
				{
					int k1=hm.get("Lower Case");
					k1++;
					hm.put("Lower Case", k1);					
				}
				else
				{
					hm.put("Lower Case", 1);
				}
			}
			if(arr[i]=='A'|| arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U' || arr[i]=='a'|| arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u')
			{
				if(hm.containsKey("Vowels"))
				{
					int k2=hm.get("Vowels");
					k2++;
					hm.put("Vowels", k2);
				}
				else
				{
					hm.put("Vowels", 1);
				}
			}
			if(!(arr[i]=='A'|| arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U' || arr[i]=='a'|| arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'))
			{
				if(hm.containsKey("Consonants"))
				{
					int k3=hm.get("Consonants");
					k3++;
					hm.put("Consonants", k3);
				}
				else
				{
					hm.put("Consonants", 1);
				}
			}
			
			
						
		}
		
		return hm;
	}

}
