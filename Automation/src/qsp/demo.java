package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class demo {

	public static void main(String[] args) {
        System.setProperty("webdriver.opera.driver","./driver/operadriver_win64/operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
   }

}
