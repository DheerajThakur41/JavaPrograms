package string_manupulation;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingArray {

	public static void main(String[] args) {
int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The size of Array ");
		int size=sc.nextInt();
		int[] numArray=new int[size];
		for(int i=0;i<size;i++){
			try{
				numArray[i]=sc.nextInt();
				count++;
			}
			catch(java.util.InputMismatchException e){
				System.out.println("Enter only Digit Try Again");
				break;
			}
		}
		//		int[] numArray={4,5,6,78,-5,4};

		int highest=Integer.MIN_VALUE;
		int secondhighest=Integer.MIN_VALUE;
		if((numArray.length!=0) && (count==size)){
			for(int i=0;i<numArray.length;i++){
				if(highest<numArray[i]){
					secondhighest=highest;
					highest=numArray[i];
				}
				else if(secondhighest<numArray[i]){
					secondhighest=numArray[i];
				}
			}
			System.out.println("Second Heighest Number"+secondhighest);
		}
		else{
			System.out.println("Array Is Empty");
		}
	}
}

































//
//for(int i=0;i<numArray.length;i++){
//	for(int j=i+1;j<numArray.length;j++){
//		if(numArray[i]<numArray[j]){
//			int temp=numArray[i];
//			numArray[i]=numArray[j];
//			numArray[j]=temp;
//		}
//	}
//}
//System.out.println(Arrays.toString(numArray));