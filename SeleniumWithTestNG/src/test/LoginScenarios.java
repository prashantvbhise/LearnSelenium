package test;

import org.testng.annotations.Test;

import commonPackage.BaseSelenium;
import pages.HomePage;
import pages.LoginPage;

public class LoginScenarios extends BaseSelenium {

	@Test
	public void verifyLoginToSiteWithWrongCredentials() {
		LoginPage lp = new LoginPage();
		lp.login("admin", "admin13");
		lp.verifyErrorMessage("Invalid credentials");
	}

	@Test
	public void verifySuccessfulLogin() {
		LoginPage lp = new LoginPage();
		lp.login("admin", "admin123");
		HomePage hp = new HomePage();
		hp.verifyWelcomeMessage("Welcome Chidambaram");

	}

}
