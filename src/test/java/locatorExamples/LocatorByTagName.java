package locatorExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LocatorByTagName extends BrowserDriverSetup{
	
	@BeforeClass
	public void open() throws InterruptedException {
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(500);
	}
	
	@Test
	public void tagName() {
		
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		
		System.out.println("Tag Size:"+ tags.size());
		
	}
	

}
