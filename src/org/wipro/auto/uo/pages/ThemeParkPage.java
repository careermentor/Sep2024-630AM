package org.wipro.auto.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.wipro.auto.uo.utilitiesPkg.ReadPropFiles;

public class ThemeParkPage 
{

	WebDriver driver;
	
	public ThemeParkPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	
	public void click_themeparks() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelementdata("home_themepark_xpath"))).click();
	}

	
	
}
