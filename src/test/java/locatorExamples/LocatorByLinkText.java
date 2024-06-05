package locatorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LocatorByLinkText extends BrowserDriverSetup{
	
	@BeforeClass
	public void open() throws InterruptedException {
		driver.get("https://www.bdjobs.com/");
		Thread.sleep(5000);
	}
	
/*	@Test
	public void locatorByLinkText() throws InterruptedException {
		WebElement contactUs = driver.findElement(By.linkText("Contact Us"));
		contactUs.click();
		Thread.sleep(5000);
}*/
	@Test
	public void locatorByPartialLinkText() throws InterruptedException {
		WebElement contactUs = driver.findElement(By.partialLinkText("Contact "));
		contactUs.click();
		Thread.sleep(5000);
}
	
	
}