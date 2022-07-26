package testPackage;

import org.testng.annotations.Test;
import commonPackage.BaseClass;
import pageObject.FindTransaction;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.TransactionDetails;

public class SearchTransactionScenarios extends BaseClass {

	@Test
	public void findTransactionById() throws InterruptedException {
		
		LoginPage lp= new LoginPage();
		lp.loginToParaBank("john", "demo");
		
		HomePage hp = new HomePage();
		hp.clickOnFindTransction();

		FindTransaction ft= new FindTransaction();
		
		ft.searchTransactionbyId("14365");
		
		Thread.sleep(1000);

		TransactionDetails td= new TransactionDetails();
		
		td.verifyResultPage();

	}

	@Test
	public void findTransactionByDate() throws InterruptedException {
		LoginPage lp= new LoginPage();
		lp.loginToParaBank("john", "demo");
		
		HomePage hp = new HomePage();
		hp.clickOnFindTransction();

		FindTransaction ft= new FindTransaction();
		
		ft.searchTransactionbyDate("07-26-2022");

		Thread.sleep(1000);

		TransactionDetails td= new TransactionDetails();
		
		td.verifyResultPage();

	}

	@Test
	public void findTransactionByDateRange() throws InterruptedException {
		LoginPage lp= new LoginPage();
		lp.loginToParaBank("john", "demo");
		
		HomePage hp = new HomePage();
		hp.clickOnFindTransction();

		FindTransaction ft= new FindTransaction();
		
		ft.searchTransactionbyDateRange("07-26-2022", "07-27-2022");
		
		Thread.sleep(1000);

		TransactionDetails td= new TransactionDetails();
		
		td.verifyResultPage();

	}

	@Test
	public void findTransactionByAmount() throws InterruptedException {
		LoginPage lp= new LoginPage();
		lp.loginToParaBank("john", "demo");
		
		HomePage hp = new HomePage();
		hp.clickOnFindTransction();

		FindTransaction ft= new FindTransaction();
		
		ft.searchTransactionbyAmount("1000");
		
		Thread.sleep(1000);

		TransactionDetails td= new TransactionDetails();
		
		td.verifyResultPage();

	}

}
