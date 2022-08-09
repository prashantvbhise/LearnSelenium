package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.IInvokedMethodListenerImpl;
import pages.LoginPage;

@Listeners(IInvokedMethodListenerImpl.class)
public class LoginTest {
	@Test (groups = {"Sanity", "Regression"})
	public void verifysuccessfulLogin() {

		LoginPage lp = new LoginPage();
		lp.successfulLogin("admin", "admin123").verifyWelcomeMsg();

	}
	@Test (groups = {"Sanity"})
	public void verifyUnscussefulLogin() {
		LoginPage lp = new LoginPage();
		lp.emptyCredential().verifyErrorMsg()
		.wrongPassword("adm", "1234r").verifyErrorMsg()
		.unsuccessfulLogin().verifyErrorMsg();

	}
	@Test(groups = {"Sanity"})
	public void verifyPasswordResetting() {

		LoginPage lp= new LoginPage();

		lp.clickForgotPasswordLink().verifyResetPassword("Anolan");
	}

	@Test (groups = {"Sanity"})
	public void verifyCancelResetting() {

		LoginPage lp= new LoginPage();

		lp.clickForgotPasswordLink().verifyCancellingReset();
	}


}
