package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckIndiaIsPresent {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	//tbody/tr/td[2]
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/live-cricket/live");
		dri
	}

}
