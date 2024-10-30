package org.wipro.auto.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.uo.basePkg.InititaieNBrowser;
import org.wipro.auto.uo.pages.SignupPage;

public class SignupTestScenarios extends InititaieNBrowser
{

	@Test
	public void tc02_validsignvalidation() throws Exception
	{
		SignupPage sign =new SignupPage(driver);
		
		sign.click_createnewaccountbttn();
		sign.enter_firstname("John");
		sign.select_dob_day("18");
		sign.click_gender_male();
		sign.click_signupbttn();
		
	}
	
}
