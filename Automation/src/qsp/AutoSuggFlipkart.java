package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggFlipkart {

static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	////button[@class='_2KpZ6l _2doB4z']
public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
    driver.get("https://www.flipkart.com/");
    driver.findElement(By.xpath("(//button)[2]")).click();
    driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
    List<WebElement> allSugg = driver.findElements(By.xpath("//a[contains(.,'iphone 14 pro max')]"));
    int count = allSugg.size();
    System.out.println(count);
    for(WebElement sugg:allSugg) {
    	System.out.println(sugg.getText());
    }
}

}
