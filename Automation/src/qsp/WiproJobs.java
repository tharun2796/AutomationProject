package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJobs {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("wipro jobs"+Keys.ENTER);
		Thread.sleep(3000);
		//List<WebElement> autosugg = driver.findElements(By.xpath("//span[contains(text(),'wiprojobs')]"));
		List<WebElement> links = driver.findElements(By.xpath("//h3"));
		int count = links.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text = links.get(i).getText();
			System.out.println(text);
		}
		//driver.close();

	}
}

