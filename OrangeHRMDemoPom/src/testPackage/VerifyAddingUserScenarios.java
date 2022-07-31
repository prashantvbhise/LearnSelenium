package testPackage;

import org.testng.annotations.Test;

import commonPackage.BaseSelenium;
import pageObjects.LoginPage;

public class VerifyAddingUserScenarios extends BaseSelenium {

	@Test
	public void verifyAdduserEss() {

		LoginPage lp = new LoginPage();

		lp.successfulLogin("admin", "admin123").clickAdminLinks().clickonAddUserButton().verifyAddUserTest("ESS",
				"Nina Patel", "Ninapatel123", "Enabled", "Ninapatel123", "Ninapatel123");
	}

	@Test
	public void verifyAdduserAdmin() {

		LoginPage lp = new LoginPage();

		lp.successfulLogin("admin", "admin123").clickAdminLinks().clickonAddUserButton().verifyAddUserTest("Admin",
				"Nina Patel", "Ninapatel321", "Disabled", "Ninapatel321", "Ninapatel321");
	}

}
