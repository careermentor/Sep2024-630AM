package demoPkg;

public class DemoConst
{


	DemoConst dc = new DemoConst(5);
	
	String x = "Java";
	
	
	public DemoConst(int a)
	{
		
		int b = a*a;
		System.out.println(b);
		
		
	}
	
	public int sum(int a, int b)
	{
		
		int c = a+b;
		
		System.out.println("value of c: " + c);
		
		return a;
	}
	
	
	public static void main(String[] args)
	{
		DemoConst dc = new DemoConst(5);
		//DemoConst dc1 = new DemoConst();
		
		dc.sum(20,30);

	}

}
