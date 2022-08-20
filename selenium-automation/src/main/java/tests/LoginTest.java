package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.BaseSelenium;
import common.IInvokedMethodListenerImpl;
import pages.LoginPage;
@Listeners(IInvokedMethodListenerImpl.class)
public class LoginTest extends BaseSelenium{
	
	@Test(dataProvider="CSVDataProvide") //(groups = {"Sanity", "Regression"})
	public void verifysuccessfulLogin(String username, String password,String welcomeText) {
		LoginPage lp = new LoginPage();
		lp.successfulLogin(username, password).verifyWelcomeMsg(welcomeText);
	}
	
	//@Test (groups = {"Sanity"})
	public void verifyUnscussefulLogin() {
		LoginPage lp = new LoginPage();
		lp.emptyCredential().verifyErrorMsg()
		.wrongPassword("adm", "1234r").verifyErrorMsg()
		.unsuccessfulLogin().verifyErrorMsg();
	}
	//@Test(groups = {"Sanity"})
	public void verifyPasswordResetting() {
		LoginPage lp= new LoginPage();
		lp.clickForgotPasswordLink().verifyResetPassword("Anolan");
	}
	//@Test (groups = {"Sanity"})
	public void verifyCancelResetting() {
		LoginPage lp= new LoginPage();
		lp.clickForgotPasswordLink().verifyCancellingReset();
	}


}
