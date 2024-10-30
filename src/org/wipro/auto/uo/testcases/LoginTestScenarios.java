package org.wipro.auto.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.uo.basePkg.InititaieNBrowser;
import org.wipro.auto.uo.pages.LoginPage;

public class LoginTestScenarios extends InititaieNBrowser
{

	@Test
	public void tc01_validcredloginvalidation() throws Exception
	{
		LoginPage login =new LoginPage(driver);
		
		login.enter_username("user1");
		login.enter_password("pass");
		login.click_loginbttn();
		
		//"this.driver" is null
	}
	
}
