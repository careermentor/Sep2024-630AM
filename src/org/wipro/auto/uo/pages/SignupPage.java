package org.wipro.auto.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.auto.uo.utilitiesPkg.ReadPropFiles;

public class SignupPage 
{

	WebDriver driver;
	
	public SignupPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void click_createnewaccountbttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelementdata("login_createnewaccount_xpath"))).click();
	}

	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropFiles.readelementdata("signup_firstname_name"))).sendKeys(fname);
	}
	
	public void select_dob_day(String dob_day) throws Exception
	{
		Select dob_d = new Select(driver.findElement(By.name(ReadPropFiles.readelementdata("signup_dob_day_name"))));
		dob_d.selectByVisibleText(dob_day);
	}
	
	public void click_gender_male() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelementdata("signup_gender_male_xpath"))).click();
	}
	
	public void click_signupbttn() throws Exception
	{
		driver.findElement(By.name(ReadPropFiles.readelementdata("signup_signupBttn_name"))).click();
	}
	
}
