package string_manupulation;

public class CountingWordWithoutSplit {

	public static void main(String[] args) {
		countWord("My    Name is             imran Khan and          ");
	}
	public static void countWord(String s){
		s=s.trim();
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '&& s.charAt(i+1)==' '){
				continue;
			}
			else if(s.charAt(i)==' '){
				count++;
			}
		}
		System.out.println("Words in String "+(count+1));
	}

}
