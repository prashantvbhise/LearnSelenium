package orangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		/*
		 * 1. Login to orange hrm 
		 * 2. check welcome message 
		 * 3. Use xPath only
		 * 4. Code should be chrome and firefox compatible
		 */

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		WebElement userName= driver.findElement(By.xpath("//input[@name='txtUsername']"));
		
		userName.sendKeys("admin");
		
		WebElement password= driver.findElement(By.xpath("//input[@id='txtPassword']"));
		
		password.sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		System.out.println("Login Successful");
		
		driver.quit();
				
		
	}

}
