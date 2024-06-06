package CommandsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import locatorExamples.BrowserDriverSetup;

public class WebElementCommands extends BrowserDriverSetupForC{

	
	@BeforeClass
	public void open() throws InterruptedException {
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		Thread.sleep(5000);
		
	}
	
	@Test
	public void webElementCommands() throws InterruptedException {
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("Mir Ahmed iraj");
		Thread.sleep(3000);
		
		name.clear();
		Thread.sleep(3000);
		
		name.sendKeys("Mouri Tania Sarker");
		Thread.sleep(3000);
		
		WebElement gender = driver.findElement(By.xpath("//form[@id='practiceForm']/div[3]/div[1]/div[1]/div[2]/input"));
		gender.click();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		
		Thread.sleep(3000);
	}
	
	
}
