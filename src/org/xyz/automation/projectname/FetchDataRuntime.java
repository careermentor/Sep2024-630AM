package org.xyz.automation.projectname;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchDataRuntime 
{
	
	WebDriver driver;
	
	@Test
	public void signupPagevalidation() 
	{
		
		//step1
		driver= new ChromeDriver();  //launch the chrome browser
		String ExpURL = "https://www.facebook.com";
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		driver.get(ExpURL);
		
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
	//	Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
		
		//Assert.assertEquals(ActURL, ExpURL);  //hard assertion
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActURL, ExpURL);  
		
		System.out.println("step 1 got failed");
		
		//Step2
		String ExpPageTitle = "Facebook – log in or sign up";
		String ActPageTitle = driver.getTitle();
		
		Point loginloc = driver.findElement(By.name("login")).getLocation();
		System.out.println(loginloc);
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(ActPageTitle);
		
		Assert.assertEquals(ActPageTitle, ExpPageTitle);
		
		//step3:
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		String ExpSignupPage = "Sign up for Facebook";
		String ActSignupPage = driver.getTitle();
		
		Assert.assertEquals(ActSignupPage, ExpSignupPage);
		
		//step4
		String expfirstname = "First name";
		String actfirtname = driver.findElement(By.name("firstname")).getAttribute("aria-label");
		System.out.println(actfirtname);
		
		Assert.assertEquals(actfirtname, expfirstname);
		
		//step5
		String expSignup = "Sign Up";
		String actSignup = driver.findElement(By.name("websubmit")).getText();
		System.out.println(actSignup);
		
		Assert.assertEquals(actSignup, expSignup);
		
		//String actiphone16 = driver.findElement(By.xpath("//span[contains(text(),'I16 ProMax Smartphone Unlocked Cell Phone')]")).getText();
		
		//String expiphone16 = "I16 ProMax Smartphone Unlocked Cell Phone, 6.99“ HD Screen5G Phone, 12+512GB phone unlocked, Android 13.0, 68+108MP Zoom Camera, Fingerprint Button Unlock-and take photos,Dual SIM, Face ID(Gold)";
		
		boolean actloginenabled = driver.findElement(By.name("login")).isEnabled();
		Assert.assertEquals(actloginenabled, true);
		
		sa.assertAll();
	}
	
}
