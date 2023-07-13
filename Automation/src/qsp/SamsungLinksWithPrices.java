package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamsungLinksWithPrices {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
        driver.findElement(By.name("//input[@id='twotabsearchtextbox']")).sendKeys("Samsung"+Keys.ENTER);
        List<WebElement> phones = driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
        List<WebElement> prices = driver.findElements(By.xpath(""));
		for (int i = 0; i < phones.size() && i < prices.size(); i++) {
		System.out.println(i+1+"."+phones.get(i).getText()+" ==> "+prices.get(i).getText());
		}
		driver.close();
	}


}
