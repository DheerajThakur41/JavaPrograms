package string_manupulation;
//Write a program to reverse a String
public class Rev_String {

	public static void main(String[] args) {
		String s="Hello in my java prog ";
		reverseString(s);
	}
public static void reverseString(String s){
//	String[] words = s.split(" ");
	for(int i=s.length()-1;i>=0;i--){
		System.out.print(s.toCharArray()[i]);
	}
}
}
