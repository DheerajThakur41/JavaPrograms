package string_manupulation;

public class StringCharDuplicate {

	public static void main(String[] args) {
		duplicateCharTeller("Hello")
	}
public static void duplicateCharTeller(String s){
	int count=0;
	outerloop:
	for(int i=0;i<s.length();i++){
		innerloop:
		for(int j=0;j<s.length();j++){
			if(i>j&&s.charAt(i)==s.charAt(j)){
				break innerloop;
			}
			if(s.charAt(i)==s.charAt(j))
				count++;
			if(count==s.length()-1)
				System.out.println("The Char : "+s.charAt(i)+" occur "+count+" Times");
		}
	}
}
}
