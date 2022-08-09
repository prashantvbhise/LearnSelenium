package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import common.IInvokedMethodListenerImpl;
import pages.LoginPage;

@Listeners(IInvokedMethodListenerImpl.class)
public class AddEmployeeTest  {
	
	@Test (groups = {"Sanity", "Regression"})
	public void addEmployeeWithLogin() throws InterruptedException {
		
		LoginPage lp= new LoginPage();		
		lp.successfulLogin("admin", "admin123")
			.clickPimLinks()
				.clickonAddEmployeeButton()
					.verifyAddingEmployee("Rajesh", "Damodar", "Singh", 
							"C:\\Users\\Pooja\\Desktop\\Downloads\\Image123.jpg",
							"Rajesh123", "Rajesh123", "Rajesh123", "Enabled");
		
		
				
	}
	@Test (groups = {"Sanity"})
	public void addEmployeeWithoutLogin() throws InterruptedException {
		
		LoginPage lp= new LoginPage();
		lp.successfulLogin("admin", "admin123")
			.clickPimLinks()
				.clickonAddEmployeeButton()
					.verifyAddingEmployeeWithoutLogin("Rajesh", "Damodar", "Singh", 
							"C:\\Users\\Pooja\\Desktop\\Downloads\\Image123.jpg");	
				
	}

}
