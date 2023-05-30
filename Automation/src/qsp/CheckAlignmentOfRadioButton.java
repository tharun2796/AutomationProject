package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAlignmentOfRadioButton {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		int radioButton1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getRect().getY();
		int radioButton2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getRect().getY();
		int radioButton3 = driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getRect().getY();
		if ((radioButton1==radioButton2)&&(radioButton1==radioButton3)) {
			System.out.println("The Radio Buttons are Aligned Properly");
		} else {
			System.out.println("The Radio Buttons are not Aligned Properly");
		}
	}
}
