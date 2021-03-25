package com.qait.Actions;

//Write Action class using Page Factory method

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComposeEmailAction {

	WebDriver driver;

	// find locators
	@FindBy(xpath = "//div[@class='T-I T-I-KE L3']")
	WebElement compose;

	@FindBy(xpath = "//textarea[@name='to']")
	WebElement To_emailId;

	@FindBy(xpath = "//input[@name='subjectbox']")
	WebElement Subject;

	@FindBy(xpath = "//div[@class='Am Al editable LW-avf tS-tW']")
	WebElement write_Something;

	@FindBy(xpath = "//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")
	WebElement sendBtn;

	// create constructor
	public ComposeEmailAction(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// define required methods
	public void click_on_compose() {
		compose.click();
	}

	public void Enter_emailId_receiver(String emailid) {
		To_emailId.sendKeys(emailid);
	}

	public void Enter_Subject(String subject) {
		Subject.sendKeys(subject);
	}

	public void Enter_content_of_email(String content) {
		write_Something.sendKeys(content);
	}

	public void hit_on_sendbtn() {
		sendBtn.click();
	}

}
