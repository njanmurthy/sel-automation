package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectRepo.demoHomePage;
import pageObjectRepo.demoRegisterPage;
import resources.baseWebdriver;

public class demoAutomationHeadingTest extends superTestNG{
	
	public static Logger log =LogManager.getLogger(demoAutomationHeadingTest.class.getName());
	
	@Test
	public void verifyAutomationHeading() {
		driver.get(propFile.getProperty("url"));
		test = extent.createTest("Verify automation heading");
		log.info("Verify automation header");
		test.info("Navigated to home page");
		demoHomePage homePage = new demoHomePage(driver);
		Assert.assertTrue(homePage.getSignInBtn().isDisplayed(), "Home page is displayed");
		test.info("Home page is displayed");
		homePage.getEnterImg().click();
		test.info("Clicked on ENTER image");
		demoRegisterPage registerPage = new demoRegisterPage(driver);
//		test.addScreenCaptureFromPath(captureScreenshot());
		Assert.assertEquals(registerPage.getHeadingEle().getText(), "Automation Demo Site");
		test.pass("Validated automation heding text");
	}

}
