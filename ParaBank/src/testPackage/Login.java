package testPackage;

import org.testng.annotations.Test;
import commonPackage.BaseClass;
import pageObject.HomePage;
import pageObject.LoginPage;

public class Login extends BaseClass {

	@Test
	public void loginParaBank() {
		
		LoginPage lp= new LoginPage();
		lp.loginToParaBank("john", "demo");
		
		HomePage hp= new HomePage();
		hp.verifyLoginSuccess("Accounts Overview");
		}

}
