package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Testutil;

public class LoginTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
	}
	
	@DataProvider
	public Object[][] getLoginData() {
		Object data [][] = Testutil.getTestData("login");
		return data;
	}
	
	@Test(dataProvider = "getLoginData")
	public void loginTest(String username, String password) {
		driver.get("https://profiler.sigma.se/login");
		//delay(5000);
		WebElement job = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div[1]/div[2]/input"));
		job.sendKeys(username);
		
		job.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div[2]/div[2]/input")).sendKeys(password);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
