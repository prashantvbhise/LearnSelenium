package orange_Hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoginTestIe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * System.setProperty("webdriver.ie.driver",
		 * "C:\\Selenium\\IEDriverServer.exe"); InternetExplorerDriver driver = new
		 * InternetExplorerDriver();
		 */

		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe"); 
		FirefoxDriver driver= new FirefoxDriver();


		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		//Find Element on Login Page
		WebElement userName= driver.findElement(By.xpath("//input[@name='txtUsername']"));
		WebElement password= driver.findElement(By.xpath("//input[@id='txtPassword']"));
		WebElement submit= driver.findElement(By.xpath("//input[@value='LOGIN']"));

		//Enter Data Login Page
		userName.sendKeys("admin");
		password.sendKeys("admin123");
		submit.click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		//Find element in Dashboard Page
		WebElement welcomeText= driver.findElement(By.xpath("//a[@id='welcome']"));
		boolean isWelcomeNoteDisplayed =welcomeText.isDisplayed();

		String actualwelcomeText= welcomeText.getText();

		if (isWelcomeNoteDisplayed==true)
		{
			System.out.println("Test case pass");
		}else
		{
			System.out.println("Test case Fail");
		}
		if (actualwelcomeText.contains("Welcome Paul"))
		{
			System.out.println("Test case pass - "+actualwelcomeText);
		}else
		{
			System.out.println("Test case fail - "+actualwelcomeText);
		}

		driver.close();

	}

}
