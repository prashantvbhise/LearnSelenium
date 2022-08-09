package common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class IInvokedMethodListenerImpl implements IInvokedMethodListener{

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
		// TODO Auto-generated method stub
		//IInvokedMethodListener.super.afterInvocation(method, testResult, context);
		System.out.println("***********afterInvocation***********");
		
		WebDriverFactory.getDriver().quit();
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
		// TODO Auto-generated method stub
		//IInvokedMethodListener.super.beforeInvocation(method, testResult, context);
		
		System.out.println("***********beforeInvocation***********");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriverFactory.setDriver(new ChromeDriver());

		WebDriverFactory.getDriver().manage().window().maximize();

		WebDriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/");
	}

}
