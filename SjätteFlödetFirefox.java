package webAutomationFirefox;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class SjätteFlödetFirefox {
	private WebDriver driver;
  @Test
  public void testSjätteFirefoxFlöder() throws InterruptedException{
	  driver.get("http://www.sigmaitc.se/sv/");
	  WebElement check = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div/header/div/div[2]/div/div/div[1]/div/div[5]/span/div/ul/li[2]/a")); //Klicka på tjänster
		check.click();
		
		check = driver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka på cookies
		check.click();
		
		check = driver.findElement(By.id("/html/body/div[3]/div/div[2]/div/div/div/div/div/div/span/div[4]/div/div/div/div[4]/span/div/div[2]/div/a")); //Klicka på Plattformar längre ner på sidan
		check.click();
		
		Thread.sleep(5000);
		
		check = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div/div/span/div[3]/div[2]/div/div/div[15]/div[3]/a")); //Klicka på Episerver
		check.click();
		
		Thread.sleep(5000);
		
		check = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div/div/span/div[1]/div/div/div/div/span/div/div[1]/div"));
		String text = check.getText();
		if (check.isEnabled() && text.contains("Den stora fördelen med Episerver är att du hanterar innehåll och marknadsföringskampanjer i en och samma vy."))
		{ 
		    System.out.println("Successfully completed");
		}else{
		    System.out.println("Failed title");
		}
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
