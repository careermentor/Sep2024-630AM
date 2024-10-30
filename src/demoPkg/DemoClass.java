package demoPkg;


public class DemoClass
{
	int f = 100;
	

	public void printVal()
	{
		int a=10;
		char b = 'X';
		float c = 20.5f;
		String d = "Java";
		boolean e = false;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}
	
	public static void main(String[] args)
	{
		DemoClass abc = new DemoClass();  //abc - object of the class
		
		abc.printVal();
		
		System.out.println(abc.f);
	}
	
	
	
}
