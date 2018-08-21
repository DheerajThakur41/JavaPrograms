package string_manupulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountingWordInString {

	public static void main(String[] args) {
		countChar("          Hello how are      you           ");
	}
public static void countChar(String s){
	int count=0;
//	System.out.println("Length of String With Space: "+s.length());
//	s=s.replaceAll(" ","");
//	for(int i=0;i<s.length();i++){
//		if(s.charAt(i)==' '){
//			count++;
//		}
//	}
//	System.out.println("Words in String "+count);
	
	Pattern pattern = Pattern.compile("[a-zA-Z0-9]*[^\\s]");
	Matcher matcher = pattern.matcher(s);
	while(matcher.find()){
		System.out.println(matcher.group());
		count++;
	}
	System.out.println(count);
	

}
}
