package locatorExamples;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserDriverSetup {
	
	WebDriver driver;
	
	@BeforeSuite
	public void browser() {
		String browser ;
		
		/*Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter browser Name:");
		
		browser = scn.nextLine();*/
		
		browser = System.getProperty("browser","firefox");
		
		if (browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		
	}
	
	@AfterSuite
	public void close() {
		driver.close();
	}

	
}
