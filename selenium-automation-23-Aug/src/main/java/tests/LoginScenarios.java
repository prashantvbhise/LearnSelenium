package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.BaseSelenium;
import common.IInvokedMethodListenerImpl;
import pages.LoginPage;

@Listeners(IInvokedMethodListenerImpl.class)
public class LoginScenarios extends BaseSelenium {
	
	@Test(dataProvider="CSVDataProvide")
	public void testLogin(String userName,String password,String welcomeText) {
		
		LoginPage lp= new LoginPage();
		
		lp.loginToOrangeHRM(userName, password).
		verifyWelcomeText(welcomeText);
		//lp.loginToOrangeHRM(userName, password).
		
		
	}

}
