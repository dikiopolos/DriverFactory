package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverFactory {

	// This method will return a WebDriver object
	public static WebDriver open(String browserType) {
		
		// Code for Firefox
		if (browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\MYS\\Desktop\\Selenium WebDriver Software\\geckodriver.exe");
			return new FirefoxDriver();
		}
		// Code for Opera
			else if (browserType.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver",
					"C:\\Users\\MYS\\Desktop\\Selenium WebDriver Software\\operadriver_win64\\operadriver.exe");
			return new OperaDriver();
		}
		// Code for Chrome
			else {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\MYS\\Desktop\\Selenium WebDriver Software\\chromedriver.exe");
			return new ChromeDriver();

		}
	}

}
