package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectRepo.demoHomePage;

public class demoHomePageTest extends superTestNG{
	
	@Test
	public void verifyHomePage() {
		test = extent.createTest("Verify home page");
		driver.get(propFile.getProperty("url"));
		test.info("Navigated to home page");
		demoHomePage homePage = new demoHomePage(driver);
		Assert.assertTrue(homePage.getSignInBtn().isDisplayed(), "Home page is displayed");
		test.pass("Home page is displayed");
		homePage.getEnterImg().click();
		test.info("Clicked on ENTER image");
	}

}
