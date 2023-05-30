package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAutoSuggestions {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		
		//find All the elements and print the count
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		int count = allSugg.size();
		System.out.println(count);

		// print the texts of all suggestions
		for (int i = 0; i < count; i++) {
			String text = allSugg.get(i).getText();				
			System.out.println(text);
		}
		
		// select the last suggestion
		allSugg.get(count-1).click();
        driver.close();
	}

}
