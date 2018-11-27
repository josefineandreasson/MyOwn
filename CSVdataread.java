package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class CSVdataread {
	WebDriver driver;
	String baseurl = "https://profiler.sigma.se/login";
	String CSV_File = "C:\\Users\\ext.joan\\eclipse-workspace\\Try2\\TestData.csv";
	
	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void verify_search() throws InterruptedException, IOException {
		driver.get(baseurl);
		
		//CSVREADER CLASS
		CSVReader reader = new CSVReader(new FileReader(CSV_File));
		String[] cell;
		
		while((cell = reader.readNext())!=null) {
			for(int i = 0; i<1; i++) {
				String name = cell[i];
				String password = cell[i+1];
				
				driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div[1]/div[2]/input")).sendKeys(name);
				
				driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div[2]/div[2]/input")).sendKeys(password);
			}
		}
	}

}
