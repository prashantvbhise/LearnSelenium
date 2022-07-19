package orangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddUserTest {

	public static void main(String[] args) {
		/*
		 * 1. Login to orange hrm 
		 * 2. Add user from Admin
		 * 3. Code should be chrome and firefox compatible
		 */
		//Open Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Login to OHRM
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin1");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		//Add User		
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		
		driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
		
		Select userRole= new Select(driver.findElement(By.id("systemUser_userType")));
		
		userRole.selectByVisibleText("Admin");
		
		WebElement empName = driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']"));
		empName.sendKeys("Nina Patel");
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='systemUser[userName]']"));
		userName.sendKeys("Ninja123");
		
		Select status= new Select(driver.findElement(By.name("systemUser[status]")));
		
		status.selectByVisibleText("Disabled");
				
		WebElement password = driver.findElement(By.xpath("//input[@id='systemUser_password']"));
		password.sendKeys("Ninja123");
		
		WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']"));
		confirmPassword.sendKeys("Ninja123");
				
		driver.findElement(By.xpath("//input[@type='button' and @value='Save']")).click();
		
		System.out.println("User addition done");
		
		driver.quit();

	}

}
