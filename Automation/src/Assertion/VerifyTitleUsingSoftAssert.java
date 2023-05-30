package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitleUsingSoftAssert {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	@Test
	public void VerifyTitle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String eTitle = "Googe";
		String aTitle = driver.getTitle();
		SoftAssert s = new SoftAssert();
		s.assertNotEquals(eTitle, aTitle);
		driver.close();
		s.assertAll();
	}
}
