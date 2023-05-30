package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class LoginActitime {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		System.setProperty("webdriver.opera.driver","./driver/operadriver.exe");
	}
	public static void main(String[] args) throws Throwable  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(5000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(5000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.close();
	
		WebDriver driver1=new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://demo.actitime.com/login.do");
		driver1.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(5000);
		driver1.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(5000);
		driver1.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		System.out.println(driver1.getTitle());
		driver1.close();
	
		WebDriver driver2=new OperaDriver();
		driver2.manage().window().maximize();
		driver2.get("https://demo.actitime.com/login.do");
		driver2.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(5000);
		driver2.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(5000);
		driver2.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		System.out.println(driver2.getTitle());
		driver2.quit();
	
	}

}
