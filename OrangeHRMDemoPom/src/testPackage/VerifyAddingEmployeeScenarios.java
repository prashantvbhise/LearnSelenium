package testPackage;

import org.testng.annotations.Test;

import commonPackage.BaseSelenium;
import pageObjects.LoginPage;

public class VerifyAddingEmployeeScenarios extends BaseSelenium {
	
	@Test
	public void addEmployeeWithLogin() throws InterruptedException {
		
		LoginPage lp= new LoginPage();		
		lp.successfulLogin("admin", "admin123")
			.clickPimLinks()
				.clickonAddEmployeeButton()
					.verifyAddingEmployee("Rajesh", "Damodar", "Singh", 
							"C:\\Users\\Pooja\\Desktop\\Downloads\\Image123.jpg",
							"Rajesh123", "Rajesh123", "Rajesh123", "Enabled");
		
		
				
	}
	@Test
	public void addEmployeeWithoutLogin() throws InterruptedException {
		
		LoginPage lp= new LoginPage();
		lp.successfulLogin("admin", "admin123")
			.clickPimLinks()
				.clickonAddEmployeeButton()
					.verifyAddingEmployeeWithoutLogin("Rajesh", "Damodar", "Singh", 
							"C:\\Users\\Pooja\\Desktop\\Downloads\\Image123.jpg");	
				
	}

}
