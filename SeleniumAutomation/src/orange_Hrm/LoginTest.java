package orange_Hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		ChromeDriver chrome= new ChromeDriver();

		chrome.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		WebElement userName= chrome.findElement(By.id("txtUsername"));
		userName.sendKeys("admin");

		WebElement password= chrome.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");

		WebElement loginButton= chrome.findElement(By.id("btnLogin"));
		
		loginButton.click();
		
		WebElement welcomeText = chrome.findElement(By.id("welcome"));
		
		boolean isDisplayed = welcomeText.isDisplayed();
		
		if(isDisplayed==true) 
		{
			System.out.println("Test case is passed");
			
		}else
		{
			System.out.println("Test case is fail");
		}	
		
		String strActualWelcomeText = welcomeText.getText();
		
		if(strActualWelcomeText.contains("Welcome"))
		{
			System.out.println("Test case Pass-"+strActualWelcomeText);
		}else
		{
			System.out.println("Test case fail-"+strActualWelcomeText);
		}
		
		chrome.quit();


	}

}
