package org.wipro.auto.uo.utilitiesPkg;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshotResult
{

	public static void testresults(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot) driver;  //prnt sc
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./ScreenshotResults/" + name + ".png");
		
		FileUtils.copyFile(f, fd);
		
	}
	
}
