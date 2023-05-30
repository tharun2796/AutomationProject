package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindValueofAttribute {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement getName = driver.findElement(By.linkText("Forgotten password?"));
		System.out.println("tagname: "+getName.getTagName());
		System.out.println("href ="+getName.getAttribute("href"));
		driver.close();
	}

}
