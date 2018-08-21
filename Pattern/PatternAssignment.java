package Pattern;

public class PatternAssignment {

	public static void main(String[] args) {
		box(6);
		rightTraiangle(4);
		Mirror_rightTraiangle(4);
		num_triag(4);
		alphabet_triag(4);
		java_triag();
	}
	public static void box(int height){
		for(int i=1;i<=height;i++){
			for (int j = 1; j <=height; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void rightTraiangle(int height){
		for(int i=1;i<=height;i++){
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void Mirror_rightTraiangle(int height){
		for(int i=1;i<=height;i++){
			for (int j =1; j <=height-i; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void num_triag(int height){
		int num=0;
		for(int i=1;i<=height;i++){
			 num=num+i;
			 int x=num;
			for (int j = 1; j <=i; j++) {
				System.out.print(x+" ");
				x=x-1;
			}
			System.out.println();
		}
	}
	public static void alphabet_triag(int height){
		int num=65;
		char c;
		for(int i=0;i<=height;i++){
			for (int j = 0; j <=i; j++) {
				c=(char)(num+j);
				System.out.print(c);
			}
			
			System.out.println();
		}
	}
	public static void java_triag(){
		String s="JAVA";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++){
			for (int j = 0; j <=i; j++) {
				System.out.print(c[j]);
			}
			System.out.println();
		}
	}

}
