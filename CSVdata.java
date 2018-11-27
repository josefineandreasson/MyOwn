package CSVTestet;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class CSVdata {
	
	WebDriver driver;
	
	String baseurl = "https://profiler.sigma.se/candidate/register";
	String CSV_File = "C:\\Users\\ext.joan\\eclipse-workspace\\webAutomation\\CSVFil.csv";
	
	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void verify_search() throws IOException, InterruptedException {
		driver.get(baseurl);
		
		CSVReader reader = new CSVReader(new FileReader(CSV_File));
		String cell[];
		
		while ((cell = reader.readNext())!= null) {
			for (int i = 0; i<1; i++) {
				String firstName = cell[i];
				String lastName = cell[i+1];
				String email = cell[i+2];
				String password = cell[i+3];
				String birthDate = cell[i+4];
				
				driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/ng-include/div[4]/div[3]/input")).sendKeys(firstName);
				
				driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/ng-include/div[5]/div[3]/input")).sendKeys(lastName);
				
				driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/ng-include/div[6]/div[3]/input")).sendKeys(email);
				
				driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/ng-include/div[7]/div[3]/input")).sendKeys(password);
				
				driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/div[4]/div/button")).click();
				driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[2]/div[1]/div/input")).sendKeys(birthDate);
				driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[1]")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button")).click();
				
				driver.findElement(By.xpath("/html/body/div/div/nav/div/div/div/div[2]/ul[1]/li/a/div/p/img")).click(); //Klicka på dropdown-menyn
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("/html/body/div/div/nav/div/div/div/div[2]/ul[1]/li/ul/li[4]/a")).click(); //Klicka på radera konto
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[1]")).click(); //Klicka Radera
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[1]")).click(); //Klicka Radera
				Thread.sleep(2000);
			}
		}
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
