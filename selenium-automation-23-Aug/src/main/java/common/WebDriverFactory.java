package common;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
	
	//private static WebDriver driver;
	
	private static ThreadLocal<WebDriver> threadLocalStrorage= new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver() {
		
		return threadLocalStrorage.get();
		
	}
	
	public static void setDriver(WebDriver localDriver) {
		
		threadLocalStrorage.set(localDriver);
	}

}
