package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneLinksWithPrices {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("(//button)[2]")).click();
        driver.findElement(By.name("q")).sendKeys("iphone 14 pro"+Keys.ENTER);
        List<WebElement> phones = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro')]"));
        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for (int i = 0; i < phones.size() && i < prices.size(); i++) {
		System.out.println(i+1+"."+phones.get(i).getText()+" ==> "+prices.get(i).getText());
		}
		driver.close();
	}
}
