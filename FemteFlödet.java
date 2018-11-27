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

public class FemteFl�det {
	private WebDriver webDriver;
  @Test
  public void testFemteFl�det() throws InterruptedException {
	  webDriver.get("http://www.sigmaitc.se/sv/");
	  WebElement check = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[2]/a")); //Klicka p� Tj�nster
		check.click();
		
		check = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[2]/ul/li[2]/a")); //Klicka p� l�singar
		check.click();
		
		check = webDriver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka p� cookies
		check.click();
		
		check = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1505131993625\"]/div[2]/div/div/div/div[2]/div[12]")); //Klicka p� PIM
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(262.5,"+check.getLocation().y+")"); //F�r att lokaliser knappen
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(40,"+check.getLocation().x+")");
		check.click();
		
		Thread.sleep(2000);
		
		check = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1505377611598_col12-text-btn-full\"]/div/div[1]/h1"));
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
