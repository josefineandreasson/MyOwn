package webAutomationChrome;

import java.util.concurrent.TimeUnit;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class F�rstaFl�det {
	private WebDriver webDriver;
	
  @BeforeMethod
  public void BeforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		webDriver = new ChromeDriver();
		webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
		webDriver.manage().window().maximize();
  }
  
  @Test
  public void testFirstFl�de() throws InterruptedException {
	  	
	  	webDriver.get("http://www.sigmaitc.se/sv/");
	  	
	  	WebElement element = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/a")); //Klicka p� Karri�r
		element.click();
		
		element = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/ul/li[1]/a")); //Klicka p� Lediga Jobb
		element.click();
		
		element = webDriver.findElement(By.id("hs_cos_wrapper_widget_1504516906086")); //Klicka p� Visa Filter
		element.click();
		
		element = webDriver.findElement(By.xpath("//*[@id=\"filter1\"]/div[1]/ul/li[1]")); //Klicka p� G�teborg
		element.click(); 
		
		element = webDriver.findElement(By.xpath("//*[@id=\"filter1\"]/div[2]/ul/li[1]")); //Klicka p� Jobbkategori
		element.click();
		
		Thread.sleep(2000);
		
		element = webDriver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka bort cookies
		element.click();
		
		element = webDriver.findElement(By.id("hs_cos_wrapper_widget_1504516906086")); //Klicka p� D�lj filter knappen
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(129.25,"+element.getLocation().y+")"); //F�r att kunna lokalisera knappen
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(48.8,"+element.getLocation().x+")");
		element.click();
		
		element = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1504516906086\"]/div[2]/div[2]/div/div[2]/div[2]")); //Klicka p� en annons
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
  
  @AfterMethod
  public void afterMethod(ITestResult result) throws EmailException {
		 
		 if (result.getStatus()==ITestResult.SUCCESS) {
			  SendEmail.sendEmail();
			  System.out.println("Test succeeded and email is sent");
		  }
		  webDriver.quit();
	  }
}
