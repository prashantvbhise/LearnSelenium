package orangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddEmployee {

	public static void main(String[] args) {
		/*
		 * 1. Login to orange hrm 
		 * 2. Add Employee
		 * 3. Code should be chrome and firefox compatible
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Launch url and Login to orange hrm 
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		//Adding Employee
		
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Add Employee')]")).click();
		
		//driver.findElement(By.xpath("//input[contains(@name,'btnAdd')]")).click();
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Rama");
		
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Rahul");
		
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Shetti");
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Pooja\\Desktop\\Downloads\\Image123.jpg");
		
		driver.findElement(By.xpath("//input[@type='checkbox' and @name='chkLogin']")).click();
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("Rama123");
		
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Akshay123");
		
		driver.findElement(By.xpath("//input[@id='re_password']")).sendKeys("Akshay123");
		
		Select status= new Select(driver.findElement(By.name("status")));
		
		status.selectByValue("Disabled");
		
		driver.findElement(By.xpath("//input[@type='button' and @value='Save']")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@id='btnSave']")).isEnabled());
		
		String employeeId=driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']")).getAttribute("value");
		
		//Timeout issue
		System.out.println("EmployeeID for employee added is - "+employeeId);
		
		driver.quit();

	}

}
