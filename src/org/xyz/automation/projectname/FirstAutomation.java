package org.xyz.automation.projectname;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation 
{
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		
		driver= new EdgeDriver();  //launch the chrome browser
		driver.get("https://www.facebook.com/");  //passing the URL
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
	
	}
	
	@Test(enabled=false)
	public void validate_loginfunctionality()
	{
		
		driver.findElement(By.id("email")).sendKeys("user1");
		driver.findElement(By.name("pass")).sendKeys("pass1234");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
	}
	
	@Test
	public void validate_signupfunctionality()
	{
		
		int a = 20;
		String b = "Java";
		
		WebElement c = driver.findElement(By.linkText("Create new account"));
		c.click();
		
		WebElement d = driver.findElement(By.name("firstname"));
		d.sendKeys("Selenium");
		
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("Michael");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
	}
	
}
