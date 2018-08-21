package string_manupulation;
	import java.util.Arrays;

	public class ReverseStringByRecursion {
	static int i=0;
		public static void main(String[] args) {
			String s="Hello Ravi hi i am here";
			String[] words = s.split(" ");
//			System.out.println(words.length);
			rev(words,i);
			
		}
		public static void rev(String[] s,int i) {
			if(i==s.length) {
				System.out.println(Arrays.toString(s));
				return;
			}
			String first=s[0];
			for(int j=0;j<s.length-1;j++) {
			s[j]=s[j+1];
			}
			s[s.length-1]=first; 
			i=i+1;
			rev(s,i);
		}
		
	}