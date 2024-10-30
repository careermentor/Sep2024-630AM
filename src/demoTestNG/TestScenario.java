package demoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScenario 
{

	@Test(priority=1,groups="Sanity")
	public void first_testcase()
	{
		System.out.println("this is first test case");
		Assert.assertEquals("Hello", "Hello World");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("Hello", "Hello World");
	}
	
	@Test(groups="Smoke")
	public void second_testcase()
	{
		System.out.println("this is second test case");
		Assert.assertEquals(true, true);
	}
	
	@Test(groups={"Regression","Sanity"})
	public void third_testcase()
	{
		System.out.println("this is third test case");
	}
	
	@Test
	public void forth_testcase()
	{
		System.out.println("this is forth test case");
	}
	
	@Test(groups="Regression")
	public void fifth_testcase()
	{
		System.out.println("this is fifth test case");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("this is sixth test case");
	}
	
	
	
	
}
