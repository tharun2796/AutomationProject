package popup;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPopupUsingChrome {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.selenium.dev/");
       Robot r = new Robot();
       r.keyPress(KeyEvent.VK_CONTROL);       
       r.keyPress(KeyEvent.VK_P);
       r.keyRelease(KeyEvent.VK_CONTROL);
       
	}

}
