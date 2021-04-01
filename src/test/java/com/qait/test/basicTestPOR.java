package com.qait.test;

//Write Test Class For Page Object Repository Action Classes 
//  1) demologin.Java
//  2) demoComposeAction.Java


import org.testng.annotations.Test;

import utils.TestSessionInitiator;

public class basicTestPOR extends TestSessionInitiator {

	@Test(priority = 1)
	public void testcheck() {
		System.out.println("hello world !");
	}

	
	
	@Test(priority = 2)
	public void log_in_gmail() throws InterruptedException {
		Thread.sleep(2000);
		demo.enter_email_id("ranjeetrj1947@gmail.com");
		Thread.sleep(3000);
		demo.click_on_button();
		Thread.sleep(5000);
		demo.enter_password("Ranjeet@12345");
		Thread.sleep(2000);
		demo.login_button();

	}

	@Test(priority = 3)
	public void compose_an_email() throws InterruptedException {
		Thread.sleep(15000);
		demoCompose.click_on_compose_btn();
		Thread.sleep(10000);
		demoCompose.write_email("bhadhoriya.02@gmail.com");
		Thread.sleep(5000);
		demoCompose.write_subject("check email using selenium");
		Thread.sleep(5000);
		demoCompose.write_into_text_area("hello this is from qait");
		Thread.sleep(2000);
		demoCompose.click_on_send_button();
	}

}
