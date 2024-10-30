package oopsConcept;

public class QA4 extends QA2 implements QA3I
{
	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("div of a&b: " + c);
	}
	
	public static void main(String[] args) 
	{
		QA4 q4 = new QA4();
		q4.div(20, 10);
		q4.sub(40, 50);
		
		q4.sum(20, 30);
		q4.mqa3i();
		q4.mqa1i();
	}

	
	public void mqa3i() {
		System.out.println("QA3I method");
		
	}

}
