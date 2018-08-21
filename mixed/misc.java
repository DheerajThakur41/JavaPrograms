package mixed;

public class misc 
{
	static
	{
		System.out.println("no main method");
	}
	
	
	
	public static void main(String[] args) 
	{
		System.out.println("inside main method");
	}
	
	misc m= new misc();
	{
		System.out.println("this is non static blolck");
	}


	
	
}
