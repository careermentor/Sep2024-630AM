package oopsConcept;

public class RunDemoAbsClass extends DemoAbsClass
{

	
	public void meth4() 
	{
		System.out.println("this is my password");
		
	}
	
	public static void main(String[] args) 
	{
		
		RunDemoAbsClass rdac = new RunDemoAbsClass();
		rdac.meth1();
		rdac.meth2();
		rdac.meth3();
		rdac.meth4();
	}

	
	
	
}
