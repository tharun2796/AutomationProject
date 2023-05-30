package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadPopup {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);
         driver.get("https://www.selenium.dev/downloads/");
         driver.findElement(By.xpath("(//a[@class='card-link'])[7]")).click();
         Thread.sleep(7000);
         driver.close();
	}

}
