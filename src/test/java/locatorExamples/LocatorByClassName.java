package locatorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LocatorByClassName extends BrowserDriverSetup{
	
	@BeforeClass
	public void open() throws InterruptedException {
		driver.get("https://www.bdjobs.com/");
		Thread.sleep(5000);
	}
	
	@Test
	public void locatorByClass() throws InterruptedException {
		WebElement contact = driver.findElement(By.className("contact-btn"));
		contact.click();   
		Thread.sleep(5000);
	

}
}