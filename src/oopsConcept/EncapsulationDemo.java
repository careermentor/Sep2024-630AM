package oopsConcept;

public class EncapsulationDemo
{

	int age;
	String name;
	
	public int getAge() 
	{
		System.out.println(age);
		return age;
	}
	
	
	public void setAge(int age)
	{
		this.age = age;
		System.out.println(age);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args)
	{
	
		EncapsulationDemo ed = new EncapsulationDemo();
		ed.setAge(20);
		
		
	}
	
}
