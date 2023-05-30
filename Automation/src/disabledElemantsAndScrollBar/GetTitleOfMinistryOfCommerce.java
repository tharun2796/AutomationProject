package disabledElemantsAndScrollBar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.asserts.SoftAssert;

public class GetTitleOfMinistryOfCommerce {

	static {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://pib.gov.in/indexd.aspx");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.findElement(By.partialLinkText("Ministry of Commerce & Industry")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
