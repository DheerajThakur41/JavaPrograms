import java.util.Scanner;

import string_manupulation.StringOps;

public class Mixed {

	@SuppressWarnings("resource")
	public static void main(StringOps[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a,b;
		System.out.println("Enter First Number");
		a=s.nextInt();//4
		System.out.println("Enter Second Number");
		b=s.nextInt();//5
		while(b>0)
		{
			a++;
			b--;
		}
		System.out.println(a);

	}

}
