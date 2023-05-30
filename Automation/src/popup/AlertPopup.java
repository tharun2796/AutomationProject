package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12000, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.switchTo().alert().dismiss();
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		if (text.equals("You Pressed Cancel")) {
			System.out.println("The Text is displayed Correctly");
		} else {
			System.out.println("The Text is displayed InCorrectly");
		}
		driver.close();
	}


}
