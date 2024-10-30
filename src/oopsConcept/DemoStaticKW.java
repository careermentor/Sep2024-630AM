package oopsConcept;

public class DemoStaticKW 
{
	static int a = 20;

	public static void meth1()
	{
		
		System.out.println(a);
	}
	
	
	public void meth2()
	{
		System.out.println("non static method");
	}
	
	public static void main(String[] args)
	{
		DemoStaticKW ds = new DemoStaticKW();
		ds.meth2();
		
		meth1();
		main(20);
	}
	
	public static void main(int a)
	{
		System.out.println("this is main general method");
	}
}
