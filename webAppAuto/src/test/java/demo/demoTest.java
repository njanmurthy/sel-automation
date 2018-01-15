package demo;

import org.testng.annotations.Test;

public class demoTest extends superTestNG{
	
	@Test
	public void openBrowser() {
		driver.get(propFile.getProperty("url"));
		test = extent.createTest("Verify automation hompage");
		System.out.println("Report path: " + filePath );
		test.info("Home page displayed");
		test.pass("Home page success");
	}

}
