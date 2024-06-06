package CommandsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import locatorExamples.BrowserDriverSetup;

public class NavigationCommands extends BrowserDriverSetupForC{
	
	@BeforeClass
	public void open() throws InterruptedException {
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		Thread.sleep(5000);
		
	}
	
	@Test
	public void navigateTo() throws InterruptedException {
		WebElement login = driver.findElement(By.xpath("//a[@href='login.php']"));
		login.click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		
		Thread.sleep(5000);
	}

}
