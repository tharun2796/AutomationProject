package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabledorNot {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		boolean b=driver.findElement(By.name("login")).isEnabled();
		if (b) {
			System.out.println("The Login Button is Enabled");
		} else {
			System.out.println("The Login Button is Disabled");
		}
		driver.close();
	}

}
