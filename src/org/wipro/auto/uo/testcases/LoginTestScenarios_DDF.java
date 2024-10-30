package org.wipro.auto.uo.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.auto.uo.basePkg.InititaieNBrowser;
import org.wipro.auto.uo.datagenerators.TestDataGen;
import org.wipro.auto.uo.pages.LoginPage;

public class LoginTestScenarios_DDF extends InititaieNBrowser
{

	@Test(dataProvider="sel",dataProviderClass=TestDataGen.class)
	public void tc01_validcredloginvalidation(String username, String password) throws Exception
	{
		LoginPage login =new LoginPage(driver);
		
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
	}
	
	
	
}
