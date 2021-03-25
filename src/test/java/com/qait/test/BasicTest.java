package com.qait.test;

//Write Test Class for Page Factory Action Classes
//  1) LogInPageAction.Java
//  2) ComposeEmailAction.Java
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import utils.TestSessionInitiator;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import WebDriverConfigure.DriverManager;
import WebDriverConfigure.DriverType;
import utils.WebDriverIntiator;

public class BasicTest extends TestSessionInitiator {

	

	@Test(priority = 1)
	public void navigatetoGoogle() {
		System.out.println("hello! Test");
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	// Test for the gmail

	@Test(priority = 2)
	public void Login_into_email() throws InterruptedException {

		login.Enter_EmailId("ranjeetrj1947@gmail.com");
		Thread.sleep(1000);
		login.hit_on_nextbtn();
		Thread.sleep(3000);
		login.Enter_password("Ranjeet@12345");
		Thread.sleep(2000);
		login.hit_on_loginBtn();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void Compose_an_Email() throws InterruptedException {
		Thread.sleep(6000);

		// String num=driver.getWindowHandle();
		// System.out.println("num" +num);

		composeEmail.click_on_compose();
		Thread.sleep(2000);

		// Set<String> number=driver.getWindowHandles();
		// System.out.println("num" +number);

		composeEmail.Enter_emailId_receiver("sunilsb1990@gmail.com");
		// Thread.sleep(2000);
		composeEmail.Enter_Subject("New framework test");
		// Thread.sleep(2000);
		composeEmail.Enter_content_of_email("hi is only for demo purpose");
		Thread.sleep(2000);
		//composeEmail.hit_on_sendbtn();

	}

}
