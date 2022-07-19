package paraBankApplication;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends CommonMethod {

	@Test
	public void loginParaBank() {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("john");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");

		driver.findElement(By.xpath("//input[@value='Log In']")).click();

		System.out.println(driver.getTitle());
		
		String successfulLogon= driver.findElement(By.xpath("//h1[text()='Accounts Overview']")).getText();
		
		Assert.assertEquals(successfulLogon, "Accounts Overview");

			}

}
