package orange_Hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTestGecko {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		
		FirefoxDriver driver= new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		WebElement userName= driver.findElement(By.name("txtUsername"));
		userName.sendKeys("admin");

		WebElement password= driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");

		WebElement loginButton= driver.findElement(By.name("Submit"));
		
		loginButton.click();
		
		WebElement welcomeText = driver.findElement(By.xpath("//a[@id='welcome']"));
		
		boolean isDisplayed = welcomeText.isDisplayed();
		
		if(isDisplayed==false) 
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
		
		driver.quit();
	}

}
