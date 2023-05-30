package disabledElemantsAndScrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToParticularElement {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.bbc.com/");
       int y = driver.findElement(By.linkText("Future Planet")).getRect().getY();
       JavascriptExecutor j = (JavascriptExecutor)driver;
       j.executeScript("window.scrollBy(0,"+y+")");
       Thread.sleep(3000);
       driver.close();
	}

}
