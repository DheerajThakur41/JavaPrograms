package Pattern;

public class PatternPractice {
	public static void main(String[] args) {
		rightTraiangle(4);
		Mirror_rightTraiangle(4);
		//		reverse_angle(8);
		triangle(5);
		//		System.out.println("");
		rev_triangle(4);
		hollow_Box(4);
		triangle_Border(4);
		reverse_triangle_Border(4);
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

	/**
	 *  @description code not working
	 * @param height
	 */
	public static void reverse_angle(int height){
		for (int i = 0; i < height; i++) {
			for(i=0;i<=height;i++){
				System.out.print("*");
			}
			for(i=1;i<=height;i++){
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
	}
	public static void triangle(int height){
		for (int i = 1; i <=height; i++) {
			for(int j=1;j<=height-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i)-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void rev_triangle(int height){
		for (int i = height; i >=1; i--) {
			System.out.print(" ");
			for(int j=1;j<=height-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i)-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void hollow_Box(int height){
		for (int i =1; i<=height; i++) {
			if(i==1||i==height){
				for(int j=1;j<=height;j++){
					System.out.print("*");
				}
			}
			else{
				for(int k=1;k<=height;k++){
					if(k==1||k==height)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void triangle_Border(int height){
		for (int i = 1; i <=height; i++) {
			for(int j=1;j<=height-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i)-1;k++){
				if(k==1||k==(2*i)-1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void reverse_triangle_Border(int height){
		for (int i = height; i>=1; i--) {
			for(int j=1;j<=height-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i)-1;k++){
				if(k==1||k==(2*i)-1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}





}
