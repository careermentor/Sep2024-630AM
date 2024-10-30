package org.xyz.automation.projectname;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DropDownCalendar 
{
	
	WebDriver driver;
	
	@Test
	public void dropdownDemo() throws Exception
	{
		
		driver= new ChromeDriver();  //launch the chrome browser
		
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("datepicker")).sendKeys("07/18/1981");
		driver.findElement(By.xpath("//a[text()='18']")).click();
		
		Select gen = new Select(driver.findElement(By.name("sex")));
		gen.selectByVisibleText("Male");
		//gen.selectByValue("2");
		//gen.selectByIndex(1);
		//select country
		Thread.sleep(5000);
		//select states
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Arizona"));
		
		st.selectByVisibleText("Florida");
		
	}
	
}
