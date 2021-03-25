package utils;

import static org.testng.Assert.fail;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import getPageObject.Locator;

import getPageObject.Object_File_Reader;

public class GetPage {

	WebDriver driver;
	String pageName;
	Object_File_Reader fr = new Object_File_Reader();

	public GetPage(WebDriver driver, String pageName) {
		this.driver = driver;
		this.pageName = pageName;
	}

	public WebElement element(String locator) {
		WebElement ele = driver.findElement(getLocator(locator));
		return ele;

	}

	public By getLocator(String locator) {

		ArrayList<String> object_Name = new ArrayList<String>();
		object_Name = fr.getObject(pageName);
		int index = object_Name.indexOf(locator);

		ArrayList<String> locator_Name = new ArrayList<String>();
		locator_Name = fr.getlocatorName(pageName);
		String Ln = locator_Name.get(index);

		ArrayList<String> locator_Value = new ArrayList<String>();
		locator_Value = fr.getlocatorValue(pageName);
		String Lv = locator_Value.get(index);

		return getBy(Ln, Lv);
	}

	public By getBy(String locator_Name, String locator_Value) {
		switch (Locator.valueOf(locator_Name)) {
		case id:
			return By.id(locator_Value);
		case xpath:
			return By.xpath(locator_Value);
		case css:
			return By.cssSelector(locator_Value);
		case name:
			return By.name(locator_Value);
		case classname:
			return By.className(locator_Value);
		case linktext:
			return By.linkText(locator_Value);
		case tagName:
			return By.tagName(locator_Value);
		default:
			return By.id(locator_Value);

		}

	}

}
