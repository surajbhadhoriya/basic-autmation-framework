package com.qait.Actions;

//Write action Class using Page Object Repository

import org.openqa.selenium.WebDriver;

import utils.GetPage;

public class demoComposeAction extends GetPage {

	public demoComposeAction(WebDriver driver) {
		// TODO Auto-generated constructor stub
		// pass name of text file (compose.txt)
		super(driver, "compose");
	}

	//This class is used to compose an email
	public void click_on_compose_btn() {

		element("composeBtn").click();
	}

	public void write_email(String Email) {
		element("To_email").sendKeys(Email);
	}

	public void write_subject(String subject) {
		element("subject").sendKeys(subject);
	}

	public void write_into_text_area(String text) {
		element("write_txt").sendKeys(text);
	}

	public void click_on_send_button() {
		element("sendbtn").click();
	}
}
