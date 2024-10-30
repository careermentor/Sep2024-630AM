package org.wipro.auto.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.uo.basePkg.InititaieNBrowser;
import org.wipro.auto.uo.pages.ThemeParkPage;

public class USF_TestScenario extends InititaieNBrowser
{

	@Test
	public void validate_usf_testcase1() throws Exception
	{
		ThemeParkPage usf =new ThemeParkPage(driver);
		
		usf.click_themeparks();
	}
	
}
