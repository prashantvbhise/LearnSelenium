package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseSelenium {

	public static String path= "C:\\Users\\Pooja\\SeleniumClass\\selenium-automation\\src\\main\\resources\\testdata.txt";
	
	//@BeforeMethod (groups = {"Sanity", "Regression"})
	public void beforeEveryMethod() {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriverFactory.setDriver(new ChromeDriver());

		WebDriverFactory.getDriver().manage().window().maximize();

		WebDriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/");
	}

	//@AfterMethod (groups ={"Sanity", "Regression"})
	public void afterEveryMethod() {

		WebDriverFactory.getDriver().quit();
	}

	@DataProvider(name="CSVDataProvide")
	public String[][] getDataFromCSVFile() throws IOException {
		File file= new File(path);
		
		FileReader fr= new FileReader(file);
		
		BufferedReader br= new BufferedReader(fr);
		
		String st;
		
		int numberOfRows = getNumberOfRows();
		int numberOfColoum = getNumberOfColoumns();
				
		String loginData[][]= new String [numberOfRows][numberOfColoum];
		int i=0;			
		while((st=br.readLine()) !=null) {
			String[] lineArray= st.split(",");
			loginData[i]=lineArray;
			i=i+1;
		}	
		System.out.println(loginData);
		return loginData;
	}

	private static int getNumberOfRows() throws IOException {
		
		File file= new File(path);
		
		FileReader fr= new FileReader(file);
		
		BufferedReader br= new BufferedReader(fr);
		
		 	String st;
		
		int rows =0;
		
		while((st=br.readLine()) !=null) {
			//String[] lineArray= st.split(",");
			rows=rows+1;		
		}return rows;
		
			
	}

	private static int getNumberOfColoumns() throws IOException {
		int columns =0;
		
		File file= new File(path);
		
		FileReader fr= new FileReader(file);
		
		BufferedReader br= new BufferedReader(fr);
		
		//String st;
		
		return  br.readLine().split(",").length;
		 
		
		/*
		 * while((st=br.readLine()) !=null) { String[] lineArray= st.split(","); columns
		 * =lineArray.length; break; }return columns;
		 */
	}

}
