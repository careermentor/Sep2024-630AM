package org.xyz.automation.projectname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserControl 
{
	
	WebDriver driver;
	
	@Test
	public void differentcontrol() throws Exception
	{
		
		driver= new EdgeDriver();  //launch the chrome browser
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/");  //passing the URL
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		//driver.close();   //one window at a time
		driver.quit(); //all the window
		
	}
	
}
