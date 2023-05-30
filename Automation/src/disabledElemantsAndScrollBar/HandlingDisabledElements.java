package disabledElemantsAndScrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisabledElements {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/user/Desktop/Selenium%20Html%20Codes/HandlingDisabledElements.html");
	    driver.findElement(By.id("d1")).sendKeys("admin");
	    Thread.sleep(3000);
	    RemoteWebDriver r = (RemoteWebDriver)driver;
	    r.executeScript("document.getElementById(\"d2\").value='manager'");
	    Thread.sleep(3000);
        driver.findElement(By.id("d3")).click();
        Thread.sleep(3000);
        
        // To delete the text present in the Password Textbox
        r.executeScript("document.getElementById(\"d2\").value=''");
        Thread.sleep(3000);
        driver.close();
	}
	
}
