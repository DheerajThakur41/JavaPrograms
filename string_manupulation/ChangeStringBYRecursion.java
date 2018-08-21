package string_manupulation;

public class ChangeStringBYRecursion {
public static void main(String[] args) {
	String s="Hello Sobhit";
	int len=s.length()-1;
	recerse(s,len);
}
public static void recerse(String s, int len){
	if(len<0)
		return;
	System.out.print(s.charAt(len));
	len--;
	recerse(s,len);
}
	
}
