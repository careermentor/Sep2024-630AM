package org.wipro.auto.uo.basePkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.auto.uo.utilitiesPkg.ReadPropFiles;

public class InititaieNBrowser 
{
	
	public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		if(ReadPropFiles.readconfigdata("BrowserName").equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(ReadPropFiles.readconfigdata("BrowserName").equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
			
		}
		
		else if(ReadPropFiles.readconfigdata("BrowserName").equalsIgnoreCase("Safari"))
		{
			driver = new SafariDriver();
			
		}
		
		else
		{
			driver = new ChromeDriver();
		}
		
		driver.get(ReadPropFiles.readconfigdata("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}

	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
	
}
