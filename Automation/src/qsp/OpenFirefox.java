package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {
	static {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		System.out.println(driver.getPageSource());	
		driver.close();	
	}

}
