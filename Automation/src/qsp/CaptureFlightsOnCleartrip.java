package qsp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureFlightsOnCleartrip {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//div[@class='px-1   flex flex-middle nmx-1 pb-1']")).click();
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("Bangalore");
		List<WebElement> start = driver.findElements(By.xpath("//p[contains(.,'Bangalore')]"));
		int count=start.size();
		start.get(0).click();
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("Goa");
		List<WebElement> dest = driver.findElements(By.xpath("//p[contains(.,'Goa')]"));
		int count1 = dest.size();
		dest.get(0).click();
		driver.findElement(By.xpath("//span[text()='Search flights']")).click();
		List<WebElement> allFlights = driver.findElements(By.xpath("//p[@class='fw-500 fs-2 c-neutral-900']"));
		List<WebElement> timings = driver.findElements(By.xpath("//p[@class='m-0 fs-5 fw-400 c-neutral-900']")); 
		for(int i = 0; i < allFlights.size() && i < timings.size(); i++) {
			String flightName = allFlights.get(i).getText();
			String time = timings.get(i).getText();   
			System.out.println(flightName+"-->"+time);
		} 
		driver.close();

	}

}

