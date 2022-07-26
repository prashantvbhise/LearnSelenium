package testPackage;

import org.testng.annotations.Test;

import commonPackage.BaseSelenium;
import pageObjectPackage.HomePage;
import pageObjectPackage.LoginPage;

public class LoginTest extends BaseSelenium{
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
	@Test
	public void verifyWrongUsername() {
		
		LoginPage lp = new LoginPage();
		lp.login("admi", "admin123");
		lp.verifyErrorMessage("Invalid credentials");
	}
	@Test
	public void verifyWrongPassword() {
		
		LoginPage lp = new LoginPage();
		lp.login("admin", "admin1234");
		lp.verifyErrorMessage("Invalid credentials");
	}

}
