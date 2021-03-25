package com.qait.Actions;

//Write class using the Page Foactory concept

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPageAction {

	WebDriver driver;

	

	// find all required webelement of gmail login page
	@FindBy(id = "identifierId")
	WebElement emailId;

	@FindBy(css = ".VfPpkd-RLmnJb")
	WebElement nextBtn;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password_val;

	@FindBy(css = ".VfPpkd-LgbsSe-OWXEXe-k8QpJ > div:nth-child(3)")
	WebElement loginBtn;

	// create the constructure
	public LogInPageAction(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// create required methods
	public void Enter_EmailId(String email) {
		emailId.sendKeys(email);
	}

	public void hit_on_nextbtn() {
		nextBtn.click();
	}

	public void Enter_password(String password) {
		password_val.sendKeys(password);

	}

	public void hit_on_loginBtn() {
		loginBtn.click();
	}

}
