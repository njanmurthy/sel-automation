package pageObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class demoRegisterPage {
	
	WebDriver driver = null;
	
	By headingEle = By.cssSelector("h1");
	By registerEle = By.xpath("//h2");
	By firstNameEle = By.xpath("//input[@placeholder='First Name']");
	By lastNameEle = By.xpath("//input[@placeholder='Last Name']");
	By phoneEle = By.xpath("//input[@type='tel']");
	
	public demoRegisterPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public WebElement getHeadingEle() {
		return driver.findElement(headingEle);
	}
	
	public WebElement getRegisterEle() {
		return driver.findElement(registerEle);
	}
	
	public WebElement getFirstNameEle() {
		return driver.findElement(firstNameEle);
	}
	
	public WebElement getLastNameEle() {
		return driver.findElement(lastNameEle);
	}
	
	public WebElement getPhoneEle() {
		return driver.findElement(phoneEle);
	}
}
