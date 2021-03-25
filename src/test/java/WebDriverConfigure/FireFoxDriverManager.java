package WebDriverConfigure;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxDriverManager extends DriverManager {

	@Override
	public void createWebDriver() {
		// TODO Auto-generated method stub
		FirefoxOptions options = new FirefoxOptions();

		this.driver = new FirefoxDriver(options);

	}

}
