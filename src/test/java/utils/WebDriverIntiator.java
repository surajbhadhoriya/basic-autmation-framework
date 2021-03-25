package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import WebDriverConfigure.DriverManager;
import WebDriverConfigure.DriverType;
import WebDriverConfigure.FireFoxDriverManager;
import WebDriverConfigure.chromeDriverManager;

public class WebDriverIntiator {

	public static DriverManager getDriverManager(DriverType type) {
		DriverManager driverManager;
		switch (type) {
		case CHROME:
			driverManager = new chromeDriverManager();
			break;

		case FIREFOX:
			driverManager = new FireFoxDriverManager();
			break;

		default:
			driverManager = new FireFoxDriverManager();
			break;

		}

		return driverManager;

	}

}
