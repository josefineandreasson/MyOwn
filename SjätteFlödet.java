package webAutomationChrome;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SjätteFlödet {
	private WebDriver webDriver;
  @Test
  public void testSjätteFlödet() throws InterruptedException {
	  webDriver.get("http://www.sigmaitc.se/sv/");
	  WebElement check = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[2]/a")); //Klicka på tjänster
		check.click();
		
		check = webDriver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka på cookies
		check.click();
		
		check = webDriver.findElement(By.id("hs_cos_wrapper_widget_1503575254530widget_1503575254530_col3-text4_col12-btn1")); //Klicka på Plattformar längre ner på sidan
		check.click();
		Thread.sleep(2000);
		
		check = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1500626735145\"]/div[2]/div/div/div[15]/div[3]/a")); //Klicka på Episerver
		check.click();
		
		Thread.sleep(2000);
		
		check = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1504881430382_col12-text-btn-full\"]/div/div[1]/div"));
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
