package mouri.project.com;

import org.testng.annotations.Test;

public class OpenUrl extends BaseDriver{
	
	
	@Test
	public void open() throws InterruptedException {
		driver.get("https://www.bdjobs.com/");	
		Thread.sleep(5000);
	}
	
	

}
