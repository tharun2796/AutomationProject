package disabledElemantsAndScrollBar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UdemyCourse {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		  ChromeOptions option = new ChromeOptions();
		  option.addArguments("--disable-notifications");
          WebDriver driver = new ChromeDriver(option);
          driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
          driver.manage().window().maximize();
          driver.get("https://techlinks.in/udemy-free-coupons/12801/python-practice-tests-for-job-interviews-and-assessments");
          driver.findElement(By.id("acceptCookie")).click();
          int y = driver.findElement(By.partialLinkText("Get Coupon")).getRect().getY();
          JavascriptExecutor j = (JavascriptExecutor)driver;
          j.executeScript("window.scrollBy(0,"+y+")");
          driver.findElement(By.partialLinkText("Get Coupon")).click();
          driver.findElement(By.xpath("(//span[text()='Enroll now'])[1]")).click();
          driver.findElement(By.xpath("//span[text()='Enroll now']")).click();
          Thread.sleep(10000);
          driver.close();
          
          
	}

}
