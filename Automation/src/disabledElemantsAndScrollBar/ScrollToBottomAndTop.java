package disabledElemantsAndScrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToBottomAndTop {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver;

		// To Scroll to bottom of webpage
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		// To Scroll to top of webpage
		j.executeScript("window.scrollTo(0,0)");
		Thread.sleep(3000);
		driver.close();
	}

}
