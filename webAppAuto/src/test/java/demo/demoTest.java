package demo;

import org.testng.annotations.Test;

public class demoTest extends superTestNG{
	
	@Test
	public void openBrowser() {
		driver.get(propFile.getProperty("url"));
	}

}
