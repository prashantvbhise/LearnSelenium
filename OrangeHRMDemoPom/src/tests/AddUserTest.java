package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.BaseSelenium;
import common.IInvokedMethodListenerImpl;
import pages.LoginPage;

@Listeners(IInvokedMethodListenerImpl.class)
public class AddUserTest  {

	@Test (groups = {"Sanity", "Regression"})
	public void verifyAdduserEss() {

		LoginPage lp = new LoginPage();

		lp.successfulLogin("admin", "admin123").clickAdminLinks().clickonAddUserButton().verifyAddUserTest("ESS",
				"Nina Patel", "Ninapatel123", "Enabled", "Ninapatel123", "Ninapatel123");
	}

	//@Test (groups = {"Sanity"})
	public void verifyAdduserAdmin() {

		LoginPage lp = new LoginPage();

		lp.successfulLogin("admin", "admin123").clickAdminLinks().clickonAddUserButton().verifyAddUserTest("Admin",
				"Nina Patel", "Ninapatel321", "Disabled", "Ninapatel321", "Ninapatel321");
	}

}
