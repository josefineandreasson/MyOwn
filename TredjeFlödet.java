package webAutomationChrome;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TredjeFl�det {
	private WebDriver webDriver;
  @Test
  public void testTredjeFl�det() throws InterruptedException {
	  webDriver.get("http://www.sigmaitc.se/sv/");
	  WebElement driver = webDriver.findElement(By.xpath("//*[@id=\"new-language-picker\"]/li[2]/a")); //V�lj engelska som spr�k
		driver.click();
		
		driver = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/a")); //V�lj Career
		driver.click();
		
		driver = webDriver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka p� cookies
		driver.click();
		
		Thread.sleep(2000);
		
		driver = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1503484510235widget_1503484510235_col6-img-right-text1_col12-btn1\"]/a")); 
		//Klicka p� Read more som finns l�ngre ner p� sidan som leder till Openings
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(119.95,"+driver.getLocation().y+")"); //F�r att lokaliser knappen
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(39.6,"+driver.getLocation().x+")");
		driver.click();
		
		Thread.sleep(2000);
		
		driver = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1504516906086\"]/div[2]/div[2]/div/div[2]/div[5]")); //Klicka p� en tj�nst
		driver.click();
		
		Thread.sleep(2000);
		
		driver = webDriver.findElement(By.xpath("//*[@id=\"page-assignment\"]/h2"));
		String text = driver.getText();
		if (driver.isEnabled() && text.contains("INHOUSE TESTSPECIALIST TILL SIGMA IT CONSULTING"))
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
