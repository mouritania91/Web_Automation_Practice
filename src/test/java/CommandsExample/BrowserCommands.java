package CommandsExample;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrowserCommands extends BrowserDriverSetupForC{
	
	@BeforeClass
	public void open() throws InterruptedException {
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		Thread.sleep(5000);
		
	}
	
	@Test
	public void browserCommands() throws InterruptedException {
		
		System.out.println(driver.getTitle());
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Selenium Practice - Student Registration Form";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Both are same");
		}else {
			System.out.println("not match.");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		
		
	}

}
