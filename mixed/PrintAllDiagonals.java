package mixed;

public class PrintAllDiagonals {

	public static void main(String[] args) 
	{
		int line=5;
		int eI=0;
		int sI=0;
		int steps=(line)+(line-1);
		int arr[][]= new int[line][line];
		int n=1;
		for(int k=0; k<line;k++)
		{
			for(int k1=0; k1<line; k1++)
			{
				arr[k][k1]=n++;
				
			}
		}
		System.out.print("Array is : ");
		System.out.println();
		for(int k=0; k<line;k++)
		{
			for(int k1=0; k1<line; k1++)
			{
				System.out.print(arr[k][k1]);
				System.out.print("  ");
				
			}
			System.out.println();
		}
		
		for(int i=0; i<steps;i++)//7
		{
			System.out.print((i+1)+" diagonal is : ");
			int maxI=eI;
			
			
			for(int j=sI;j<=eI;j++)
			{
				
				System.out.print(arr[maxI][j]);
				System.out.print(" , ");
				maxI--;	
				
				
				
			}
			System.out.println();
			if(eI<line-1)
			{
			eI++;
			}
			else
			{
				sI++;
			}
			
			
			
		}

	}

}
