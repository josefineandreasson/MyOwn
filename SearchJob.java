package webAutomationChrome;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SearchJob {
	private WebDriver webDriver;
  @Test
  public void testSearchJob() throws InterruptedException {
	  webDriver.get("http://www.sigmaitc.se/karriar/lediga-jobb/jobb?id=profiler-position-75");
		
		WebElement job = webDriver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka på cookies
		job.click();
		
		job = webDriver.findElement(By.id("applyBtn")); //Klicka på Ansök knappen
		job.click();
		
		Thread.sleep(2000);
		
		webDriver.get("https://profiler.sigma.se/candidate/register");
		//delay(5000);
		job = webDriver.findElement(By.name("firstname"));
		job.sendKeys("Josefine");
	  
	  /*webDriver.get("http://www.sigmaitc.se/sv/");
	  WebElement job = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/a")); //Klicka på Karriär
		job.click();
		
		job = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/ul/li[1]/a")); //Klicka på Lediga Jobb
		job.click();
		
		job = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1504516906086\"]/div[2]/div[2]/div/div[2]/div[5]"));
		job.click();
		
		job = webDriver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka på cookies
		job.click();
		
		Thread.sleep(2000);
		
		job = webDriver.findElement(By.id("applyBtn")); //Klicka på Ansök knappen
		job.click();
		
		Thread.sleep(2000);
		
		job.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/ng-include/div[4]/div[3]/input"));
		job.click();*/
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
