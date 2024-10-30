package demoPkg;


 public class Calculations 
{
	int a = 100;  //global variable
	//a=200;
	
	 public void sum()
	{
		final int a = 20;  //local variable //constant
		//a=200;
		int b = 30;
		int c = a+b;
		System.out.println(c);
		
	}
	
	public void printVal()
	{
		System.out.println(a);
	}
	
	String name = "Automation";
	
	public static void main(String[] args) throws Exception
	{
		System.out.println("this is main method");
		
		Calculations cal = new Calculations();
		cal.sum();
		
		System.out.println(cal.a);
		
		cal.printVal();
		
		ExcelFileHandling.readexcel();
		
	}
	
	
	
	
	
}
