package number;

public class Array_assignment {

	public static void main(String[] args) {
		int[] num={8,12,58,66,2};
		int[] num1={8,12,58,66,2};
		int[] num2={8,12,58,66,2};
		System.out.print("Given Array is: ");
		for(int i = 0; i <num.length; i++){
			System.out.print(num[i]+"  ");
		}
		System.out.println();





		array_sort(num);
		largestIndex(array_sort(num),2);
		array_max_min(num);
		find_Equal_Array(num1,num2);
		int[] duplicateArray={1,2,3,4,6,8,3,3,6};
		duplicate_array(duplicateArray);

	}
	public static int[] array_sort(int[] num){

		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++){
				int temp=0;
				if(num[i]<num[j]){
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		for(int i = 0; i <num.length; i++){
			System.out.print(num[i]+"  ");
		}
		return num;
	}
	public static void largestIndex(int[] sortedArray,int position){
		System.out.println(+position+"Largest Number is: "+sortedArray[position-1]);
	}

	public static int[] array_max_min(int[] num){
		int max=num[0]; 
		int min=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(max<num[i]){
				max=num[i];
			}
			if(min>num[i])
			{
				min=num[i];
			}
		}
		System.out.println("\nMax: "+max+"\nMin Number:"+min);
		return num;
	}

	public static void find_Equal_Array(int[] arr1,int arr2[]){
		
			boolean flag=true;
			for(int i=0;i<arr1.length;i++)
			{
//				System.out.println("First array"+arr1[i]+" Second array "+arr2[i]);
				if(arr1[i]!=arr2[i])
				{
					flag=false;
					break;
				}
				
			}
			if(flag){
				System.out.println("Both array are equal");
			}
			else{
				System.out.println("Arrays are not equal");
			}
		}
		
	public static int[] duplicate_array(int[] num){
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++){
//				int count=0;
				if(num[i]==num[j]){
//					 int x=
//					count=count+1;
					System.out.println("The number "+num[i]);
				}
			}
		}
		for(int i = 0; i <num.length; i++){
			System.out.print(num[i]+"  ");
		}
		return num;
	}
	}








