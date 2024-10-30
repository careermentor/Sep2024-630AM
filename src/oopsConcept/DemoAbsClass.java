package oopsConcept;

public abstract class DemoAbsClass 
{
	

	//step1
	public void meth1()
	{
		System.out.println("this is a concrete method");
		final int a = 20;
		//a=30;
	}
	
	//step2
	public void meth2()
	{
		System.out.println("this is a concrete method");
	}
	
	//step3
	public void meth3()
	{
		System.out.println("this is a concrete method");
	}
	
	//step4 for password
	public abstract void meth4();
	
	public static void main(String[] args)
	{
	
	//	DemoAbsClass dac = new DemoAbsClass();
	//	dac.meth1();
		
	}
}
