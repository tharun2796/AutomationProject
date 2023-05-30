package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseActions {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6000,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/home/");
		WebElement target = driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		Thread.sleep(5000);
		a.moveToElement(target).perform();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement loginButton = driver.findElement(By.linkText("Login"));
		a.doubleClick(loginButton).perform();
		String expectedTitle ="Login - Vtiger";
		String actualTitle = driver.getTitle();
		if (expectedTitle.contains(actualTitle)) {
			System.out.println("The Displayed page is Correct and Passed");
		} else {
			System.out.println("The Displayed page is Incorrect and Failed");
		}
		driver.close();
	}

}
