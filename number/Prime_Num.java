package number;

import java.util.ArrayList;

public class Prime_Num {

	public static void main(String[] args) {
		ArrayList<Integer> prime=new ArrayList<Integer>();
		ArrayList<Integer> non_prime=new ArrayList<Integer>();
		for(int i=2;i<=100;i++){
			if(checkPrime(i)){
				prime.add(i);
			}
			else{
				non_prime.add(i);
			}
		}
		System.out.println("Prime Numbers are "+prime+" Total Number: "+prime.size());
		System.out.println("Prime Numbers are "+non_prime+" Total Number: "+non_prime.size());
		
	}

	public static boolean checkPrime(int n){
		boolean flag=true;
		if(n==0||n==1){
			System.out.println("Dont enter 0 and 1");
			flag= false;
		}
		else{
			for(int i=2;i<=(n/2)+1;i++){
				if(n%i==0){
					System.out.println(n+" is not a Prime Number");
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.println(n+" is a Prime Number");
			}
		}
		return flag;
	}
	
	}
