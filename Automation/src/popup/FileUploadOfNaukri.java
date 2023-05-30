package popup;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadOfNaukri {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("tharunmsd27@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("THARUNKUMAR2796");
		driver.findElement(By.xpath("//button[text()='Login']")).submit();
		Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href='/mnjuser/profile']")).click();
        String relativePath = "./data/THARUN_KUMAR-RESUME.pdf";
        File f=new File(relativePath);
        String absolutePath = f.getAbsolutePath();
        driver.findElement(By.id("attachCV")).sendKeys(absolutePath);
        Thread.sleep(5000);
        driver.close();
	}

}
