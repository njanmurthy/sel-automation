package demo;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pageObjectRepo.demoHomePage;
import pageObjectRepo.demoRegisterPage;
import resources.baseWebdriver;

public class demoRegisterHeadingTest extends superTestNG {
	
	@Test
	public void verifyRegisterHeading() {
		test = extent.createTest("Verify Register heading");
		driver.get(propFile.getProperty("url"));
		demoHomePage homePage = new demoHomePage(driver);
		Assert.assertTrue(homePage.getSignInBtn().isDisplayed(), "Home page is displayed");
		test.info("Home page displayed");
		homePage.getEnterImg().click();
		test.info("Clicked on ENTER image");
		
		demoRegisterPage registerPage = new demoRegisterPage(driver);
		Assert.assertEquals(registerPage.getRegisterEle().getText(), "Register");
		test.pass("validated Register header");
	}
	
}
