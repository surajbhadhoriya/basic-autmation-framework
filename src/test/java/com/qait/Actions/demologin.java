package com.qait.Actions;

//Write class using Page Object Repository

import org.openqa.selenium.WebDriver;

import utils.GetPage;

public class demologin extends GetPage {

	
	
	public demologin(WebDriver driver) {
		// TODO Auto-generated constructor stub
		// pass name of text file (login.txt)
		super(driver, "login");
	}

	//This class is used to login an email
	public void enter_email_id(String email)
	{
		element("emailId").sendKeys(email);
	}
	
	public void click_on_button()
	{
		element("nextButton").click();
	}
	
	public void enter_password(String password)
	{
		element("password").sendKeys(password);
	}
	
	public void login_button()
	{
		element("loginbtn").click();
	}
	

}
