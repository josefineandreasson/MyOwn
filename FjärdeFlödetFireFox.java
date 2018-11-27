package webAutomationFirefox;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class FjärdeFlödetFireFox {
	private WebDriver driver;
  @Test
  public void testFörstaFirefoxFlöde() throws InterruptedException {
	  driver.get("http://www.sigmaitc.se/sv/");
	  WebElement d = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div/header/div/div[2]/div/div/div[1]/div/div[5]/span/div/ul/li[2]/a")); //Klicka på Tjänster
		d.click();
		
		d = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div/div/header/div/div[2]/div/div/div[1]/div/div[5]/span/div/ul/li[2]/ul/li[1]/a")); //Klicka på Konsulter
		d.click();
		
		d = driver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka på cookies
		d.click();
		
		d = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div/div/span/div[3]/div[2]/div/div/div/div[1]/div[1]/div/a[3]")); //Klicka på IT-Development och Technology
		((JavascriptExecutor)driver).executeScript("window.scrollTo(248.683,"+d.getLocation().y+")"); //För att lokaliser knappen
		((JavascriptExecutor)driver).executeScript("window.scrollTo(82.8667,"+d.getLocation().x+")");
		d.click();
		
		Thread.sleep(2000);
		
		d = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div/div/span/div[3]/div[2]/div/div/div/div[2]/div[27]/a")); //Klicka på Systemintegration
		d.click();
		
		d = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div/div/span/div[2]/div/div/div/div[2]/span/div/div[1]/h2"));
		String text = d.getText();
		if (d.isEnabled() && text.contains("VERKSAMHETENS BEHOV STYR LÖSNINGEN"))
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
