package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	String title=driver.getTitle();
	System.out.println(title);
	driver.close();
	}

}
