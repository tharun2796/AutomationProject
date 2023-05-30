package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopup2 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.name("dob")).click();
		WebElement monthListbox = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select s=new Select(monthListbox);
		Thread.sleep(5000);
		s.selectByVisibleText("Jun");
		WebElement yearListbox = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select s1=new Select(yearListbox);
		s1.selectByValue("1996");
		driver.findElement(By.xpath("(//td/a)[27]")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		String expectedText="Please enter valid Policy No.";
		String actualText = driver.findElement(By.id("policynumberError")).getText();
		if (expectedText.equals(actualText)) {
			System.out.println("The Displayed Text is Right");
		} else {
			System.out.println("The Displayed Text is Wrong");
		}
		driver.close();
	}

}
