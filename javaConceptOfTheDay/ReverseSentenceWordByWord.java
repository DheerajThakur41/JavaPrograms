package javaConceptOfTheDay;

public class ReverseSentenceWordByWord {

	public static void main(String[] args) 
	{
		
		String[] s={"Hi","This","is","Shreya"};
		System.out.println("Original sentence is : ");
		for(String k : s)
		{
			System.out.print(k);
			System.out.print(" ");
		}
		System.out.println();
		String[] s1=reverseSentence(s);
		System.out.println("Reverse sentence is : ");
		for(String k1 : s1)
		{
			System.out.print(k1);
			System.out.print(" ");
		}
		
		

	}
	
	public static String[] reverseSentence(String[] s)
	{
		int size=s.length;
		String[] sNew = new String[size];
		int k=size-1;
		for(int i=0; i<size; i++)
		{
			s[i]=reverse(s[i]);
			sNew[k]=s[i];
			k--;
			
		}
		
		return sNew;
	}
	
	public static String reverse(String s)
	{
		String str="";
		for(int i=s.length()-1;i>=0;i--)
		{
			str=str+s.charAt(i);
		}
		
		return str;
	}

}
