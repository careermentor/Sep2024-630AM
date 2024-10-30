package org.wipro.auto.uo.datagenerators;

import org.testng.annotations.DataProvider;

public class TestDataGen
{

	@DataProvider(name="ddf")
	public Object[][] testdata1()
	{
		//String data1 = "user1";
		//Object[] data2 = {"user1","pass1"};
		Object[][] data3 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
		return data3;
	}
	
	
	@DataProvider(name="sel")
	public Object[][] testdata2()
	{
		//String data1 = "user1";
		//Object[] data2 = {"user1","pass1"};
		Object[][] data3 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
		return data3;
	}
}
