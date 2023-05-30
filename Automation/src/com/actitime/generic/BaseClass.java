package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {

	@BeforeTest
	public void openBrowser() {
		Reporter.log("OpenBrowser",true);
	}

	@AfterTest
	public void closeBrowser() {
		Reporter.log("CloseBrowser",true);
	} 

	@BeforeMethod
	public void login() {
		Reporter.log("Login",true);
	}

	@AfterMethod
	public void logout() {
		Reporter.log("Logout",true);
	}

	@Test
	public void testMethod() {
		Reporter.log("TestMethod",true);
	}

}
