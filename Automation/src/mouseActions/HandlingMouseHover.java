package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseHover {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.vtiger.com/home/");
		WebElement target = driver.findElement(By.xpath("(//a[@id='navbarPages'])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
		driver.findElement(By.xpath("(//a[contains(.,' Contact Us')])[1]")).click();
		String phno = driver.findElement(By.xpath("//p[contains(.,'Bengaluru')]/../p[2]")).getText();
		System.out.println(phno);
		driver.close();
	}

}
