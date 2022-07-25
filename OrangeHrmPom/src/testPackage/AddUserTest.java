package testPackage;

import org.testng.annotations.Test;

import commonPackage.BaseSelenium;
import pageObjectPackage.AddUserPage;
import pageObjectPackage.AdminPage;
import pageObjectPackage.HomePage;
import pageObjectPackage.LoginPage;

public class AddUserTest extends BaseSelenium{
	
	@Test
	public void verifyAddingAdminUser() {
		
		LoginPage lp= new LoginPage();
		lp.login("admin", "admin123");
		
		HomePage hp= new HomePage();
		hp.verifyClickingAdminLink();
		
		AdminPage ap= new AdminPage();		
		ap.clickAddUser();
		
		AddUserPage aup= new AddUserPage();
		aup.verifyAddUserTest(
		"Admin", "Nina Patel", "npm123", "Enabled", "npnp0123", "npnp0123");
		
	}

}
