package com.comcast.contact;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups="SmokeTest")
	public void createContactTest() {
		String url = System.getProperty("url");
		String browser = System.getProperty("browser");
		
		System.out.println(url + browser);
		
		System.out.println("contact created");
	}
	
	@Test(groups="RegressionTest")
	public void createContactWithOrgTest() {
		String url = System.getProperty("url");
		String browser = System.getProperty("browser");
		
		System.out.println(url + browser);
		
		System.out.println("contact created");
		System.out.println("contact created with organization");
	}
	
	@Test(groups="RegressionTest")
	public void deleteContactTest() {
		System.out.println("contact is deleted");
	}
	
	public void createContactForTest() {
		System.out.println("contact created for Test");
	}
}
