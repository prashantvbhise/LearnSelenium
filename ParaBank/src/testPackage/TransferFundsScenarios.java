package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonPackage.BaseClass;
import commonPackage.WebDriverFactory;

public class TransferFundsScenarios extends BaseClass {

	@Test
	public void defaultAccountsTransferFunds() throws InterruptedException {

		WebDriverFactory.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("john");

		WebDriverFactory.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("demo");

		WebDriverFactory.getDriver().findElement(By.xpath("//input[@value='Log In']")).click();

		WebDriverFactory.getDriver().findElement(By.xpath("//a[text()='Transfer Funds']")).click();

		Thread.sleep(1000);

		WebDriverFactory.getDriver().findElement(By.id("amount")).sendKeys("100");

		WebDriverFactory.getDriver().findElement(By.xpath("//input[@value='Transfer']")).click();

		Thread.sleep(1000);

		boolean successMessageCondition = WebDriverFactory.getDriver().findElement(By.xpath("//h1[text()='Transfer Complete!']")).isDisplayed();
		
		Assert.assertEquals(successMessageCondition, true);

		/*
		 * if (successMessage == true) {
		 * 
		 * String ammount = driver.findElement(By.id("amount")).getText();
		 * 
		 * String message = driver.findElement(By.
		 * xpath("//*[text()=' has been transferred from account #']")) .getText();
		 * 
		 * System.out.println(message);
		 * 
		 * String fromAccountId = driver.findElement(By.id("fromAccountId")).getText();
		 * 
		 * String toAccountId = driver.findElement(By.id("toAccountId")).getText();
		 * 
		 * System.out.println(ammount + " has been transferred from account " +
		 * "From account " + fromAccountId + " TO account " + toAccountId);
		 * 
		 * }
		 */

	}

	@Test
	public void intraTransferFund() throws InterruptedException {
		WebDriverFactory.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("john");

		WebDriverFactory.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("demo");

		WebDriverFactory.getDriver().findElement(By.xpath("//input[@value='Log In']")).click();

		WebDriverFactory.getDriver().findElement(By.xpath("//a[text()='Transfer Funds']")).click();

		Thread.sleep(1000);

		WebDriverFactory.getDriver().findElement(By.id("amount")).sendKeys("100");

		Select fromAccount = new Select(WebDriverFactory.getDriver().findElement(By.id("fromAccountId")));

		//fromAccount.selectByValue("13677");
		
		fromAccount.selectByIndex(0);

		Select toAccount = new Select(WebDriverFactory.getDriver().findElement(By.id("toAccountId")));

		//toAccount.selectByVisibleText("14787");
		
		toAccount.selectByIndex(1);

		WebDriverFactory.getDriver().findElement(By.xpath("//input[@value='Transfer']")).click();

		Thread.sleep(1000);

		boolean successMessageCondition = WebDriverFactory.getDriver().findElement(By.xpath("//h1[text()='Transfer Complete!']")).isDisplayed();

		Assert.assertEquals(successMessageCondition, true);
		
		/*
		 * if (successMessage == true) {
		 * 
		 * String ammount = driver.findElement(By.id("amount")).getText();
		 * 
		 * String message = driver.findElement(By.
		 * xpath("//*[text()=' has been transferred from account #']")) .getText();
		 * 
		 * System.out.println(message);
		 * 
		 * String fromAccountId = driver.findElement(By.id("fromAccountId")).getText();
		 * 
		 * String toAccountId = driver.findElement(By.id("toAccountId")).getText();
		 * 
		 * System.out.println(ammount + " has been transferred from account " +
		 * "From account " + fromAccountId + " TO account " + toAccountId);
		 * 
		 * }
		 */

	}

	//@Test
	public void emptyAmountTransfer() throws InterruptedException {

		WebDriverFactory.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("john");

		WebDriverFactory.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("demo");

		WebDriverFactory.getDriver().findElement(By.xpath("//input[@value='Log In']")).click();

		WebDriverFactory.getDriver().findElement(By.xpath("//a[text()='Transfer Funds']")).click();

		Thread.sleep(1000);

		WebDriverFactory.getDriver().findElement(By.xpath("//input[@value='Transfer']")).click();

		Thread.sleep(1000);

		boolean errorMessage = WebDriverFactory.getDriver().findElement(By.id("amount.errors")).isDisplayed();
		
		Assert.assertEquals(errorMessage, true);

		/*
		 * if (errorMessage == true) {
		 * 
		 * String actualErrorMessage =
		 * driver.findElement(By.id("amount.errors")).getText();
		 * 
		 * System.out.println(actualErrorMessage); }
		 */

	}
}
