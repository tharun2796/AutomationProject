package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompareAxis {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Rectangle locator = driver.findElement(By.id("username")).getRect();
		Rectangle locator1 = driver.findElement(By.name("pwd")).getRect();
		int unHeight = locator.getHeight();
		int unWidth= locator.getWidth();
		int pwdHeight= locator1.getHeight();
		int pwdWidth = locator1.getWidth();
		if ((unHeight==pwdHeight)&&(unWidth==pwdWidth)) {
			System.out.println("The Alignment of UN and PWD are Correct");
		} else {
			System.out.println("The Alignment of UN and PWD are Incorrect");
		}
		driver.close()
	}

}
