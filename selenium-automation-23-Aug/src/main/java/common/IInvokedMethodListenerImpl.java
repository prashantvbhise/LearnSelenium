package common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class IInvokedMethodListenerImpl implements IInvokedMethodListener{

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
		
		System.out.println("**********************beforeInvocation**********************");
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriverFactory.setDriver(new ChromeDriver());
		
		WebDriverFactory.getDriver().manage().window().maximize();
		
		WebDriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
		
		WebDriverFactory.getDriver().quit();
		
		System.out.println("**********************afterInvocation**********************");
		
	}

}
