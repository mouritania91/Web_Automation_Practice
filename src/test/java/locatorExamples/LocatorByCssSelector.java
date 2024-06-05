package locatorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LocatorByCssSelector extends BrowserDriverSetup{
	
	@BeforeClass
	public void open() throws InterruptedException {
		driver.get("https://www.daraz.com.bd/?_mkt_tracker=g&_mkt_campaign=211036165&_mkt_adgroup=19723046965&_mkt_creative=603571363097&_mkt_src=gg&isdl=y&aff_short_key=_7agwc&gad_source=1&gclid=CjwKCAjw5ImwBhBtEiwAFHDZxzDcMOTU2xwziIzpFaUTRVnuS6l4B3Pfv8D0WD2Xsk2K0qH1x0LSJBoCHXwQAvD_BwE#");
		Thread.sleep(5000);
	}
	
	@Test
	public void locatorByCSSselector() throws InterruptedException {
		WebElement login = driver.findElement(By.cssSelector("a.bld-txt"));
		login.click();
		Thread.sleep(5000);
	

}
}