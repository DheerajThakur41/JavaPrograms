package string_manupulation;

public class Repeating_number {

	public static void main(StringOps[] args) {
		int ar[]={2,2,3,5,7,9,3,5};
		for(int i=0;i<ar.length;i++)
		{
			int count=0;
			for(int j=0;j<ar.length;j++){
				if(j<i && ar[i]==ar[j]){
					break;					
				}
				if(ar[i]==ar[j]){
					count++;
				}
				if(j==ar.length-1)
				{
					System.out.println("the Number "+ar[i]+"Appears "+count+" times");
				}
			}
		}
		

	}

}
