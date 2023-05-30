package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {

	@Test(priority = -2)
	public void createModule() {
		Reporter.log("CreateModule");
	}
	
	@Test(priority = -2)
	public void modifyModule() {
		Reporter.log("ModifyModule");
	}
	
	@Test(priority = -2)
	public void deleteModule() {
		Reporter.log("DeleteModule");
	}
	
}
