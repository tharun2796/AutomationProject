package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateTask {

	@Test
	public void createTask() {
		Reporter.log("CreateTask",true);
	}
	
	@Test
	public void modifyTask() {
		Reporter.log("ModifyTask",true);
	}
	
	@Test
	public void deleteTask() {
		Reporter.log("DeleteTask",true);
	}
	
}
