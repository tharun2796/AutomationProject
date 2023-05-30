package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggWiproJobs {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("wipro jobs");
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(.,'wipro jobs')]"));
		int count=allSugg.size();
		System.out.println("Count: "+count);
		for(int i=0;i<allSugg.size();i++) {
			String text = allSugg.get(i).getText();        
			System.out.println(i+1+")"+text);	
		}	

		allSugg.get(1).click();
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		for (int j = 0; j <allLinks.size(); j++) {
			Thread.sleep(3000);
			String linknames = allLinks.get(j).getText(); 	
			System.out.println(linknames);
		}
		driver.close();
	}

}
