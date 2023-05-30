package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValues {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement attribute = driver.findElement(By.linkText("Forgotten password?"));
		Object color = attribute.getCssValue("color");
		System.out.println("Font Color: "+color);
		Object type = attribute.getCssValue("font-family");
		System.out.println("Font Type: "+type);
		Object size = attribute.getCssValue("font-size");
		System.out.println("Font Size: "+size);
		driver.close();
	}
}
