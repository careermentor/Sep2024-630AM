package org.wipro.auto.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.wipro.auto.uo.utilitiesPkg.ReadPropFiles;

public class LoginPage_PF 
{

	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	WebElement usernameField;
	
	public void enter_username(String uname) throws Exception
	{
		usernameField.sendKeys(uname);
	}
	
	@FindBy(name="pass")
	WebElement passwordField;
	
	public void enter_password(String pass) throws Exception
	{
		passwordField.sendKeys(pass);
	}
	
	public void click_loginbttn() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFiles.readelementdata("login_loginbttn_css"))).click();
	}
	
}
