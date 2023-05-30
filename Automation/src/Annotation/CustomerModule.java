package Annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModule {

	@Test(priority = 1,invocationCount = 1)
	public void createCustomer() {
		Reporter.log("CreateCustomer",true);
	}

	@Test(priority = 1)
	public void deleteCustomer() {
		Reporter.log("DeleteCustomer",true);
	}

	@BeforeMethod
	public void login() {
		Reporter.log("Login",true);
	}

	@AfterMethod
	public void logout() {
		Reporter.log("Logout",true);
	}

	@BeforeClass
	public void openBrowser() {
		Reporter.log("OpenBrowser",true);
	}

	@AfterClass	
	public void closeBrowser() {
		Reporter.log("CloseBrowser",true);
	}

}
