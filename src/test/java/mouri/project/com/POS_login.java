package mouri.project.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import locatorExamples.BrowserDriverSetup;

public class POS_login extends BaseDriver{
	
	@BeforeClass
	public void browserOpen() throws InterruptedException {
		
		driver.get("https://pos.startexecution.com/login");
		Thread.sleep(5000);
		
	}
	
	@Test
	public void locateByemail() throws InterruptedException {
		WebElement email = driver.findElement(By.id(":r0:"));
		email.sendKeys("sarkermouritania1993@gmail.com");
		
		WebElement password = driver.findElement(By.id(":r1:"));
		password.sendKeys("Java@2024");
		
		WebElement loginButton = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
		loginButton.click();
		
		
		
		Thread.sleep(5000);
	}

}
