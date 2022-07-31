package testPackage;

import org.testng.annotations.Test;

import commonPackage.BaseSelenium;
import pageObjects.LoginPage;

public class VerifyLoginScenarios extends BaseSelenium {
	@Test
	public void verifysuccessfulLogin() {

		LoginPage lp = new LoginPage();
		lp.successfulLogin("admin", "admin123").verifyWelcomeMsg();

	}
	@Test
	public void verifyUnscussefulLogin() {
		LoginPage lp = new LoginPage();
		lp.emptyCredential().verifyErrorMsg()
		.wrongPassword("adm", "1234r").verifyErrorMsg()
		.unsuccessfulLogin().verifyErrorMsg();

	}
	@Test
	public void verifyPasswordResetting() {

		LoginPage lp= new LoginPage();

		lp.clickForgotPasswordLink().verifyResetPassword("Anolan");
	}

	@Test
	public void verifyCancelResetting() {

		LoginPage lp= new LoginPage();

		lp.clickForgotPasswordLink().verifyCancellingReset();
	}


}
