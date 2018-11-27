package webAutomationIE11;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;

public class FörstaFlödetIE11 {
	private WebDriver webDriver;
  @Test
  public void testFörstaIE11Flödet() throws InterruptedException {
	  webDriver.get("http://www.sigmaitc.se/sv/");
	  WebElement element = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/a")); //Klicka på Karriär
		element.click();
		
		element = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/ul/li[1]/a")); //Klicka på Lediga Jobb
		Thread.sleep(3000);
		element.click();
		
		element = webDriver.findElement(By.id("hs_cos_wrapper_widget_1504516906086")); //Klicka på Visa Filter
		element.click();
		
		element = webDriver.findElement(By.xpath("//*[@id=\"filter1\"]/div[1]/ul/li[1]")); //Klicka på Göteborg
		element.click(); 
		
		element = webDriver.findElement(By.xpath("//*[@id=\"filter1\"]/div[2]/ul/li[1]")); //Klicka på Jobbkategori
		element.click();
		
		Thread.sleep(2000);
		
		element = webDriver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka bort cookies
		element.click();
		
		element = webDriver.findElement(By.id("hs_cos_wrapper_widget_1504516906086")); //Klicka på Dölj filter knappen
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(129.25,"+element.getLocation().y+")"); //För att kunna lokalisera knappen
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(48.8,"+element.getLocation().x+")");
		element.click();
		
		element = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1504516906086\"]/div[2]/div[2]/div/div[2]/div[2]")); //Klicka på en annons
		element.click();
		
		Thread.sleep(2000);
		
		element = webDriver.findElement(By.xpath("//*[@id=\"page-assignment\"]/h2"));
		String text = element.getText();
		if (element.isEnabled() && text.contains("KONSULTCHEF / CONSULTANT UNIT MANAGER TILL SIGMA IT CONSULTING"))
		{ 
		    System.out.println("Successfully completed");
		}else{
		    System.out.println("Failed title");
		}
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
	  webDriver = new InternetExplorerDriver();
	  webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
	  webDriver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  webDriver.quit();
  }

}
