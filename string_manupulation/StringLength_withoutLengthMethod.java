package string_manupulation;

public class StringLength_withoutLengthMethod {
	public static void main(String[] args) {
		int count=0;
		int space=1;
		String s="abcdefghijk lmnopqrst";
		for(char ch:s.toCharArray()){
			System.out.print(ch);
			count=count+1;
			if(ch==' '){
				space=space+1;
			}
		}
		System.out.println("\nNumber of Word "+count);
		System.out.println("Total Number of word :"+space);
	}
}
