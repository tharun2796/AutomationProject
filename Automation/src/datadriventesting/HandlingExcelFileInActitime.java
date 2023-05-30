package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingExcelFileInActitime {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		FileInputStream fis =new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String url = wb.getSheet("createcustomer").getRow(1).getCell(1).getStringCellValue();
		driver.get(url);
		String un = wb.getSheet("createcustomer").getRow(2).getCell(1).getStringCellValue();
		String pwd = wb.getSheet("createcustomer").getRow(3).getCell(1).getStringCellValue();
	    driver.findElement(By.id("username")).sendKeys(un);
	    driver.findElement(By.name("pwd")).sendKeys(pwd);
	    driver.findElement(By.partialLinkText("Login")).click();
	    Thread.sleep(5000);
	    driver.close();
	}
}
