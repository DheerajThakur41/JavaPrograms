package string_manupulation;

public class CaptializeWord {

	
	public static void main(String[] args) {
		captialize("Hello there hi bye");
	}
public static void captialize(String s){
	char[] ch = s.toCharArray();
	ch[0]=Character.toUpperCase(ch[0]);
	for(int i=0;i<ch.length;i++){
	if(ch[i]==' '){
		ch[i+1]=Character.toUpperCase(ch[i+1]);
	}	
	}
	System.out.println(ch);
}
}
