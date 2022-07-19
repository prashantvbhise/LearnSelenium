package loginScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyLoginScenario extends BaseSelenium {

	@Test
	public void verifySuccessfulLogin() {

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		System.out.println(driver.getTitle());

		String pageTitle = driver.getTitle();
		
		Assert.assertEquals(pageTitle, "OrangeHRM");

		/*
		 * if (pageTitle.contains("OrangeHRM")) {
		 * System.out.println("verifySuccessfulLogin test- passed"); }
		 */

	}

	@Test
	public void verifyEmptyCrdential() {

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(" ");

		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(" ");

		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		boolean errorMessageDisplay = driver.findElement(By.xpath("//span[@id='spanMessage']")).isDisplayed();
		
		Assert.assertEquals(errorMessageDisplay, true);

		/*
		 * if (errorMessageDisplay == true) {
		 * System.out.println("verifyEmptyCrdential Test Case pass"); } else {
		 * System.out.println("verifyEmptyCrdential Test case fail"); }
		 */

	}

	@Test
	public void verifyWrongUsernameAndPassword() {

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("test");

		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123d");

		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		String wrongCredentialMessage = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		
		Assert.assertEquals(wrongCredentialMessage, "Invalid credentials");

		/*if (wrongCredentialMessage.contains("Invalid credentials")) {
			System.out.println("verifyWrongUsernameAndPassword test passed");
		} else {
			System.out.println("verifyWrongUsernameAndPassword test failed");
		}*/

	}

	@Test
	public void verifyLogout() throws InterruptedException {

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		driver.findElement(By.xpath("//a[@id='welcome']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[text()='Logout']")).click();

		String logoutURL = driver.getCurrentUrl();

		System.out.println(driver.getCurrentUrl());

		String loginURL = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		
		Assert.assertEquals(logoutURL, loginURL);

		/*
		 * if (logoutURL.contains(loginURL)) {
		 * 
		 * System.out.println("verifyLogout test- Successful"); } else {
		 * System.out.println("verifyLogout test- unsuccessful"); }
		 */

	}

	@Test
	public void verifyFortgotPassword() {

		driver.findElement(By.xpath("//a[contains(@href,'requestPasswordResetCode')]")).click();

		String actualPageHeading = driver.findElement(By.xpath("//h1[text()='Forgot Your Password?']")).getText();

		System.out.println(actualPageHeading);

		String expectedPageHeading = "Forgot Your Password?";
		
		Assert.assertEquals(actualPageHeading, expectedPageHeading);

		/*
		 * if (actualPageHeading.contains(expectedPageHeading)) {
		 * 
		 * System.out.println("verifyFortgotPassword test passed"); } else {
		 * System.out.println("verifyFortgotPassword test failed"); }
		 */

	}

}
