package javaConceptOfTheDay;
/**
 * 
 * @author Dheeraj Kumar
 * @created 1Aug2017
 * 
 *
 */
public class RevString {

	public static void main(String[] args) {
     String s="Hello i am here";
     reverse(s);
    		 
	}
	public  static void reverse(String s){
		String word[]=s.split(" ");
		for(String t:word){
			for(int i=t.length()-1;i>=0;i--){
				System.out.print(t.charAt(i));
			}
			System.out.print(" ");
		}
	}

}
