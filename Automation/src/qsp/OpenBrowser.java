package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

public class OpenBrowser {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		System.setProperty("webdriver.opera.driver","./driver/operadriver.exe");
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
	}
	
	public static void main(String[] args) {
           WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.youtube.com/");
           driver.manage().deleteAllCookies();
           System.out.println(driver.getTitle());
           driver.close();
           
           WebDriver driver1=new FirefoxDriver();
           driver1.manage().window().maximize();
           driver1.get("https://www.facebook.com/");
           driver1.manage().deleteAllCookies();
           System.out.println(driver1.getTitle());
           driver1.close();
           
           WebDriver driver2=new OperaDriver();
           driver2.manage().window().maximize();
           driver2.get("https://www.instagram.com/");
           driver2.manage().deleteAllCookies();
           System.out.println(driver2.getTitle());
	       driver2.quit();
	       
	       WebDriver driver3=new EdgeDriver();
           driver3.manage().window().maximize();
           driver3.get("https://www.jiocinema.com/");
           driver3.manage().deleteAllCookies();
           System.out.println(driver3.getTitle());
	       driver3.quit();
	}

}
