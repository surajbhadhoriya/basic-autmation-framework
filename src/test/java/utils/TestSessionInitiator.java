package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import com.qait.Actions.ComposeEmailAction;
import com.qait.Actions.LogInPageAction;
import WebDriverConfigure.DriverManager;
import WebDriverConfigure.DriverType;
import com.qait.Actions.demoComposeAction;
import com.qait.Actions.demologin;

public class TestSessionInitiator {

	DriverManager driverManager;
	protected WebDriver driver;
	private WebDriverIntiator wdfactory = new WebDriverIntiator();

	// initialize the webdriver
	public void initialize() {
		driverManager = wdfactory.getDriverManager(DriverType.CHROME);
		driver = driverManager.getWebDriver();

		Goto("https://mail.google.com");

	}

	public WebDriver Driver() {
		return driver;
	}

	// create object of action classes
	public LogInPageAction login;
	public ComposeEmailAction composeEmail;
	public demologin demo;
	public demoComposeAction demoCompose;

	private void initPage() {
		login = new LogInPageAction(driver);
		composeEmail = new ComposeEmailAction(driver);
		demo = new demologin(driver);
		demoCompose = new demoComposeAction(driver);
	}

	public void Goto(String url) {
		driver.get(url);
	}

	@BeforeClass
	public void launchMyAppliction() {

		initialize();
		initPage();
	}

}
