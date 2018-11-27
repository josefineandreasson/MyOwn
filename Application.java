package webAutomationChrome;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Application {
	private WebDriver webDriver;
  @Test
  public void testApplication() throws InterruptedException {
	  webDriver.get("http://www.sigmaitc.se/sv/");
	  WebElement job = webDriver.findElement(By.xpath("/html/body/div/div/nav/div/ul[3]/li")); 
		job.click();
		job = webDriver.findElement(By.xpath("/html/body/div/div/nav/div/ul[3]/li/ul/li[2]/a")); //Välj språk till Svenska
		job.click();
		
		job = webDriver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/ng-include/div[4]/div[3]/input")); //Fyller i första fältet
		job.click();
		job.clear();
		job.sendKeys("Josefine");
		
		job = webDriver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/ng-include/div[5]/div[3]/input")); //Fyller i andra fältet
		job.click();
		job.clear();
		job.sendKeys("Andreasson");	
		
		job = webDriver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/ng-include/div[6]/div[3]/input")); //Fyller i tredje fältet
		job.click();
		job.clear();
		job.sendKeys("aaandreassonjosefine@gmail.com");
		
		job = webDriver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/ng-include/div[7]/div[3]/input")); //Fyller i fjärde fältet
		job.click();
		job.clear();
		job.sendKeys("test123");
		
		job = webDriver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/div[4]/div/button")); //Klicka på skapa knappen
		job.click();
		
		job = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[2]/div[1]/div/input")); //Fyll i födelsedatum
		job.click();
		job.clear();
		job.sendKeys("19991111");
		job = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[1]")); //Klicka OK
		job.click();
		
		Thread.sleep(2000);
		
		job = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button")); //Klicka OK
		job.click();
		
		job = webDriver.findElement(By.xpath("/html/body/div/div/nav/div/div/div/div[2]/ul[1]/li/a/div/p/img")); //Klicka på dropdown-menyn
		job.click();
		Thread.sleep(1000);
		job = webDriver.findElement(By.xpath("/html/body/div/div/nav/div/div/div/div[2]/ul[1]/li/ul/li[4]/a")); //Klicka på radera konto
		job.click();
		Thread.sleep(1000);
		job = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[1]")); //Klicka Radera
		job.click();
		Thread.sleep(1000);
		job = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[1]")); //Klicka Radera
		job.click();
		Thread.sleep(2000);
}
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		webDriver = new ChromeDriver();
		webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
		webDriver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  webDriver.quit();
  }

}
