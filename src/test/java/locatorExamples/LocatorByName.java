package locatorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LocatorByName extends BrowserDriverSetup{
	
	@BeforeClass
	public void open() throws InterruptedException {
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(5000);
	}
	
	@Test
	public void locatorByName() throws InterruptedException {
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("check");
		Thread.sleep(5000);
	}

}
