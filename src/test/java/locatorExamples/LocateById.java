package locatorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LocateById extends BrowserDriverSetup{
	
	@BeforeClass
	public void browserOpen() throws InterruptedException {
		
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(5000);
		
	}
	
	@Test
	public void locateById() throws InterruptedException {
		
		WebElement emailID = driver.findElement(By.id("email"));
		emailID.sendKeys("mouri.iraj@gmail.com");
		Thread.sleep(5000);
	}
	

}
