package mouseActions;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAllHeadings {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	            //h2[not(text()='Application Service Agreement')]
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.partialLinkText("Login")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		driver.findElement(By.linkText("Read Service Agreement")).click();
		Set<String> allTabs = driver.getWindowHandles();
		for (String tab : allTabs) {
			driver.switchTo().window(tab);
			String title = driver.getTitle();
			if (title.equals("actiTIME Online Terms of Service")){
				List<WebElement> headings = driver.findElements(By.xpath("//h2[not(contains(text(),'Application'))]"));
				for (int i = 0; i < headings.size(); i++) {
					String text = headings.get(i).getText();
					System.out.println(text);
				}
			driver.close();
			Thread.sleep(3000);
			}
		}
      driver.quit();
	}
}
