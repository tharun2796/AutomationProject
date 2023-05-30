package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup1 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		driver.switchTo().alert().accept();
		String text = driver.findElement(By.id("demo1")).getText();
		System.out.println(text);
		driver.close();
	}

}
