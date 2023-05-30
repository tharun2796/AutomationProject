package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CompareTitle {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		String chrometitle=driver.getTitle();
		System.out.println(chrometitle);
		driver.quit();

		WebDriver driver1=new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://en-gb.facebook.com/");
		String firefoxtitle=driver1.getTitle();
		System.out.println(firefoxtitle);
		driver1.quit();

		if (chrometitle.equals(firefoxtitle)){
			System.out.println(true);
		} else {
			System.out.println(false);
		}


	}


}
