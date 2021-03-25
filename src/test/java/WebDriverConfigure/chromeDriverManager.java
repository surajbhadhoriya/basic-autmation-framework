package WebDriverConfigure;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class chromeDriverManager extends DriverManager {

	@Override
	public void createWebDriver() {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		
		//options.addArguments("--disable-web-security");
        //  options.addArguments("--allow-running-insecure-content");
       // options.addArguments("--user-data-dir");
		//DesiredCapabilities capabilities= new DesiredCapabilities();
		//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		/*
		Map<String, Object> prefs=new HashMap<String, Object> ();
		prefs.put("profile.managed_default_content_settings.javascript", 2);
		options.setExperimentalOption("prefs", prefs);
		*/

		this.driver = new ChromeDriver(options);
		

	}

}
