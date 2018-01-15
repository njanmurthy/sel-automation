package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class baseWebdriver extends extentReport {
	
	public static WebDriver driver;
	public Properties propFile;
	public WebDriver initializeDriver() throws IOException {
		propFile = new Properties();
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "\\data.properties");
		propFile.load(fs);
		String browserName = propFile.getProperty("browser").toLowerCase();
		switch (browserName) {
		case "chrome":
				File file = new File("chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
				driver = new ChromeDriver();
			break;
		case "firefox":
				driver = new FirefoxDriver();
			break;
		case "internet explorer":
				driver = new InternetExplorerDriver();
			break;

		default:
			break;
		}
		return driver;
	}
}
