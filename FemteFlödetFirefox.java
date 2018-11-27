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

public class FemteFl�detFirefox {
	private WebDriver driver;
  @Test
  public void testFemteFirefoxFl�de() throws InterruptedException{
	  driver.get("http://www.sigmaitc.se/sv/");
	  WebElement check = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div/header/div/div[2]/div/div/div[1]/div/div[5]/span/div/ul/li[2]/a")); //Klicka p� Tj�nster
		check.click();
		
		check = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div/div/header/div/div[2]/div/div/div[1]/div/div[5]/span/div/ul/li[2]/ul/li[2]/a")); //Klicka p� l�singar
		check.click();
		
		check = driver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka p� cookies
		check.click();
		
		check = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div/div/span/div[3]/div[2]/div/div/div/div[2]/div[12]")); //Klicka p� PIM
		((JavascriptExecutor)driver).executeScript("window.scrollTo(262.5,"+check.getLocation().y+")"); //F�r att lokaliser knappen
		((JavascriptExecutor)driver).executeScript("window.scrollTo(40,"+check.getLocation().x+")");
		check.click();
		
		Thread.sleep(2000);
		
		check = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div/div/span/div[1]/div/div/div/div/span/div/div[1]/h1"));
		String text = check.getText();
		if (check.isEnabled() && text.contains("UPPDATERING AV MASTERDATA P� ETT ENDA ST�LLE"))
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
