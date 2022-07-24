package OrangeHrmDemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends CommonClass{
	
	@Test
	public void loginMethod() {
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();		
		
	}

}
