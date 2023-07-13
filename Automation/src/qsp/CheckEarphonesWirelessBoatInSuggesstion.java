package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckEarphonesWirelessBoatInSuggesstion {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("earphone");
		List<WebElement> autoSugg = driver.findElements(By.xpath("//div[contains(text(),'earphone')]"));
		int count = autoSugg.size();
		for (int i = 0; i <count; i++) {
			String text = autoSugg.get(i).getText();
			if(text.equalsIgnoreCase("earphones wireless boat"))
				System.out.println("The Expected Text is present");
			else {
			}

		}
	}
}
