package org.wipro.auto.uo.utilitiesPkg;


import java.io.FileReader;
import java.util.Properties;

public class ReadPropFiles 
{

	public static String readconfigdata(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/config.properties");
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
	
	public static String readelementdata(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/element.properties");
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
	
}
