package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyTitle {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	@Test
	public void verifyTitle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String eTitle = "Googl";
		String aTitle = driver.getTitle();
		if (aTitle.equals(eTitle)) {
			System.out.println("Title is Matching and Pass");
		} else {
			System.out.println("Title is Not Matching and Fail");
		}
		driver.close();
	}
}
