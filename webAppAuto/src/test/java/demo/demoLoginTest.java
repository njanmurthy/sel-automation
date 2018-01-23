package demo;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjectRepo.demoHomePage;
import pageObjectRepo.demoLoginPage;
import demo.*;

public class demoLoginTest extends superTestNG {
	
	public static Logger log =LogManager.getLogger(demoLoginTest.class.getName());
	public excelApi xlApi = null;
	

//	@Test(dependsOnMethods= {"navigateToHomePage"}, dataProvider = "loginData")
	@Test( dataProvider = "loginData")
	public void loginTest(String userName, String password) {
		test = extent.createTest("Verify login page");
		this.login(userName, password);
	}
	
	public void login(String userName, String password) {
		demoHomePageTest hmpage = new demoHomePageTest();
		hmpage.HomePage();
		demoHomePage homePage = new demoHomePage(driver);
		homePage.getSignInBtn().click();
		log.info("Clicked on sign-in button");
		demoLoginPage loginPage = new demoLoginPage(driver);
		log.info("Login page displayed");
		test.info("Login page displayed");
		loginPage.getUserName().sendKeys(userName);
		loginPage.getPassword().sendKeys(password);
		loginPage.getEnterBtn().click();
		String actualMsg = loginPage.getErrMsg().getText().trim();
		String expectedMsg = "Invalid User Name or PassWord";
		Assert.assertEquals(actualMsg, expectedMsg);
		test.pass("Error message displayed"+ "\n" + "Actual Message: " 
				+ actualMsg + "\n" + "Expected Message: " +  expectedMsg);
		log.info("Error message displayed"+ "\n" + "Actual Message: " 
				+ actualMsg + "\n" + "Expected Message: " +  expectedMsg);
	}
	
	@DataProvider(name="loginData")
	public Object[][] loginTestdata() throws Exception {
		xlApi = new excelApi(System.getProperty("user.dir")+"\\TestData\\test.xlsx");
		Object[][] data = xlApi.testData(System.getProperty("user.dir")+"\\TestData\\test.xlsx", "Sheet1");
		return data;
	}

}
