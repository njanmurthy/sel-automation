package pageObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class demoLoginPage {
WebDriver driver = null;
	

	By userName = By.xpath("//input[@placeholder='E mail']");
	By password = By.xpath("//input[@placeholder='Password']");
	By enterBtn = By.xpath("//img[@id='enterbtn']");
	By errMsg = By.cssSelector("label#errormsg");
	
	public demoLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public WebElement getUserName() {
		return driver.findElement(userName);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getEnterBtn() {
		return driver.findElement(enterBtn);
	}
	
	public WebElement getErrMsg() {
		return driver.findElement(errMsg);
	}

}
