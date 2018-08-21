package Pattern;

public class NumberPattern {

	public static void main(String[] args) 
	{
		int length=7;
		pattern1(length);
		System.out.println();
		
		System.out.println("------------------------------------------");
		System.out.println();
		pattern2(length);
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println();
		pattern3(length);
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println();
		pattern4(length);
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println();
		pattern5(length);
		

	}
	
	public static void pattern1(int length)
	{
		int rounds=1;
		
		for(int i=0; i<length; i++)
		{
			int k=rounds;
			for(int j=0; j<=i; j++)
			{
				System.out.print(k);
				k--;
			}
			System.out.println();
			rounds++;
		}
	}
	public static void pattern2(int length)
	{
		int k=length;
		for(int i=0; i<length; i++)
		{
			int n=length;
			for(int j=0; j<k; j++)
			{
				System.out.print(n--);
			}
			System.out.println();
			k--;
		}
	}
	
	public static void pattern3(int length)
	{
		int k=length;
		for(int i=0; i<length; i++)
		{
			int n=1;
			for(int j=0; j<k; j++)
			{
				System.out.print(n++);
			}
			System.out.println();
			k--;
		}
	}
	
	public static void pattern4(int length)
	{
		int[][] arr=new int[length][length];
		int sI=0;
		int eI=length;
		int n=1;
		for(int i=0; i<length; i++)
		{
			for(int j=sI; j<eI; j++)
			{
				arr[j][sI]=n++;
				
				
			}
			sI++;
		}
		
		for(int a=0 ; a<length; a++)
		{
			for(int b=0; b<=a; b++)
			{
				System.out.print(arr[a][b]);
				System.out.print("  ");
				if(arr[a][b]>9)
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern5(int length)
	{
		for(int i=1; i<=length; i++)
		{
			for(int j=1; j<=length; j++)
			{
				if(j<=length-i)
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(i);
				}
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
