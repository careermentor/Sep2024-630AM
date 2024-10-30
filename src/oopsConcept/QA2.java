package oopsConcept;

public class QA2 extends QA1
{
	
	int x = 100;
	
	public void printVal()
	{
		final int x = 200;
		//x=300;
		System.out.println(x); //200
		
		System.out.println(this.x); //100
		
		System.out.println(super.x);
		
		super.sum(20, 30);
		
	}
	
	
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("Sum of a&b: " + c);
		
		
	}
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("Sub of a&b: " + c);
	}
	
	public static void main(String[] args) 
	{
		QA2 q2 = new QA2();
		q2.sub(30, 20);
		
		
		
		q2.sum(20, 30);
		
		//QA1 abc = new QA1();
		//abc.sum(20, 40);
		q2.mqa1i();
		q2.printVal();
	}


	public void mqa1i() {
		System.out.println("method of QA1I");
	}

}
