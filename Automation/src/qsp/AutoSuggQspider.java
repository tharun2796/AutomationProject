package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggQspider {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("qspiders");
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(.,'qspiders')]"));
		int count = allSugg.size();
		for(WebElement sugg:allSugg) {
			String name = sugg.getText();
			System.out.println(name);
		}
		allSugg.get(count-1).click();
        driver.close();
	}

}
