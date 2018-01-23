package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectRepo.demoHomePage;

public class demoHomePageTest extends superTestNG{
	
	public static Logger log =LogManager.getLogger(demoHomePageTest.class.getName());
	
	@Test
	public void verifyHomePage() {
		test = extent.createTest("Verify home page");
		this.HomePage();
//		log.info("Home page test");
//		driver.get(propFile.getProperty("url"));
//		test.info("Navigated to home page");
//		demoHomePage homePage = new demoHomePage(driver);
//		Assert.assertTrue(homePage.getSignInBtn().isDisplayed(), "Home page is displayed");
//		test.pass("Home page is displayed");
//		log.info("Home page is displayed");
//		homePage.getEnterImg().click();
//		test.info("Clicked on ENTER image");
//		driver.navigate().back();
//		Assert.assertTrue(homePage.getSignInBtn().isDisplayed(), "Home page is displayed");
//		test.info("Back to home page");
	}
	
	public void HomePage() {
		log.info("Home page test");
		driver.get(propFile.getProperty("url"));
		test.info("Navigated to home page");
		demoHomePage homePage = new demoHomePage(driver);
		Assert.assertTrue(homePage.getSignInBtn().isDisplayed(), "Home page is displayed");
		test.pass("Home page is displayed");
		log.info("Home page is displayed");
		homePage.getEnterImg().click();
		test.info("Clicked on ENTER image");
		driver.navigate().back();
		Assert.assertTrue(homePage.getSignInBtn().isDisplayed(), "Home page is displayed");
		test.info("Back to home page");
	}

}
