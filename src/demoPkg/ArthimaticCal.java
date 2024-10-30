package demoPkg;

public class ArthimaticCal 
{
	public int addition()
	{
		int a=20;
		int b = 30;
		int c = a+b;
		
		System.out.println("Addition of 2 numbers: " + c);
		return c;
			
	}
	
	public int sum(int a, int b)
	{
		int c = a+b;
		System.out.println("sum of 2 numbers: " + c);
		return c;
	}
	
	public static void main(String[] args) 
	{
		ArthimaticCal obj = new ArthimaticCal();
		
		obj.sum(30, 40);
		obj.addition();

	}

}
