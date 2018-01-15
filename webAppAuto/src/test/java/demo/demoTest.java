package demo;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoTest {
	
	@Test
	public void openBrowser() {
		File file = new File("chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");
		driver.close();
	}

}
