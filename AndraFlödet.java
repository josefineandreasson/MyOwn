package webAutomationChrome;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AndraFl�det {
	private WebDriver driver;
  @Test
  public void testAndraFl�det() throws InterruptedException {
	  driver.get("http://www.sigmaitc.se/sv/");
	  WebElement e = driver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/a")); //Klicka p� Karri�r
		e.click();
		
		e = driver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/ul/li[1]/a")); //Klicka p� Lediga Jobb
		e.click();
		
		Thread.sleep(2000);
		
		e = driver.findElement(By.xpath("//*[@id=\"searchInput--js\"]")); //Klicka i s�kf�ltet och skriva in ett s�kord och klicka enter
		e.clear();
		e.sendKeys("test");
		e.sendKeys(Keys.ENTER);
		
		e = driver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka p� cookies
		e.click();
		
		Thread.sleep(2000);
		
		e = driver.findElement(By.id("loadMore")); //Klickar p� visa fler
		e.click();
		((JavascriptExecutor)driver).executeScript("window.scrollTo(112.69,"+e.getLocation().y+")"); //F�r att kunna lokalisera knappen
		((JavascriptExecutor)driver).executeScript("window.scrollTo(48.8,"+e.getLocation().x+")");
		
		Thread.sleep(2000);
		
		e = driver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1504516906086\"]/div[2]/div[2]/div/div[2]/div[19]")); //Klicka p� en tj�nst
		e.click();
		
		Thread.sleep(2000);
		
		e = driver.findElement(By.xpath("//*[@id=\"page-assignment\"]/h2"));
		String text1 = e.getText();
		if (e.isEnabled() && text1.contains("JUNIOR C# UTVECKLARE SOM VILL G�RA SKILLNAD!"))
		{ 
		    System.out.println("Successfully completed");
		}else{
		    System.out.println("Failed title");
		}
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
