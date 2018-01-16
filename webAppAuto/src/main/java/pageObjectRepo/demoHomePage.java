package pageObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class demoHomePage {
	
	WebDriver driver = null;
	
	By enterImg = By.cssSelector("img#enterimg");
	By signInBtn = By.xpath("//button[@id='btn1']");
	By skipSignInBtn = By.xpath("//button[@id='btn2']");
	
	public demoHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public WebElement getEnterImg() {
		return driver.findElement(enterImg);
	}
	
	public WebElement getSignInBtn() {
		return driver.findElement(signInBtn);
	}
	
	public WebElement getSkipSignInBtn() {
		return driver.findElement(skipSignInBtn);
	}
}
