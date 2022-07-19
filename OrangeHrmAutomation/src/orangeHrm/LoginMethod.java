package orangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginMethod {
	
@Test
	public void login() {
					
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		System.out.println("Login Successful");
		
	}
	@Test
	public void addJobType() 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		
				
	}

}
