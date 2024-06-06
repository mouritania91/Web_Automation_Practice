package locatorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class XpathLocator extends BrowserDriverSetup{

	@BeforeClass
	public void open() throws InterruptedException {
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		Thread.sleep(5000);
		
	}
	
	/*@Test (priority = 0)
	public void xpathLocator1() throws InterruptedException {
		
		WebElement xpathCheck1 = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	    xpathCheck1.sendKeys("Mouri Tania Sarker");
	    Thread.sleep(5000);
	
	}
	
	@Test (priority = 1)
	public void xpathLocator2() throws InterruptedException {
		
		WebElement xpathCheck2 = driver.findElement(By.xpath("//*[@placeholder='First Name']"));
	    xpathCheck2.sendKeys("Mouri Tania Sarker");
	    Thread.sleep(5000);
	
	}*/

	@Test
	public void mobile() throws InterruptedException {
		
		WebElement number = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[2]/input[1]"));
		number.click();
		Thread.sleep(5000);
		
	}
	
}
