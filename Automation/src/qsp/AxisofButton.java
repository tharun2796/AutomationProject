package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxisofButton {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Point button = driver.findElement(By.name("login")).getLocation();
		int x =button.getX();
		int y=button.getY();
		System.out.println("X-Axis = "+x);
		System.out.println("Y-Axix = "+y);
		driver.close();
	}

}
