package common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokedMethodListenerImpl implements IInvokedMethodListener {

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		
	//Use of Property files
		Properties obj = new Properties();
		
		FileInputStream objfile = null;
		try {
			objfile = new FileInputStream("C:\\Users\\Pooja\\SeleniumClass\\Selenium-automation-1-sept\\src\\main\\resources\\property.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			obj.load(objfile);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String BrowserName = obj.getProperty("Browser");
		
		if(BrowserName.contains("Chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriverFactory.setDriver(new ChromeDriver());
		
		}else {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
			
			WebDriverFactory.setDriver(new FirefoxDriver());
		}
		WebDriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebDriverFactory.getDriver().manage().window().maximize();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		
		WebDriverFactory.getDriver().quit();
		 
	}

}
