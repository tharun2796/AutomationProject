package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SelectAllCheckbox {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
	    driver.get("https://www.myntra.com/");
	    WebElement target = driver.findElement(By.xpath("//a[@data-group='men']"));
	    Actions a = new Actions(driver);
	    a.moveToElement(target).perform();
	    driver.findElement(By.xpath("(//a[text()='T-Shirts'])[1]")).click();
	    List<WebElement> checkBox = driver.findElements(By.xpath("//div[@class='vertical-filters-filters categories-container']//input[@type='checkbox']"));
          for(WebElement cb:checkBox) {
        	  cb.click();
          }
	}

}
