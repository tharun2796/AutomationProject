package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Wishes {

	@Test(priority = 0)
	public void morning() {
		Reporter.log("GoodMorning",true);
	}
	
	@Test(priority = 1)
	public void noon() {
		Reporter.log("GoodAfternoon",true);
	}
	
	@Test(priority = 2)
	public void evening() {
		Reporter.log("GoodEvening",true);
	}
	
	@Test(priority = 3)
	public void night() {
		Reporter.log("GoodNight",true);
	}
}
