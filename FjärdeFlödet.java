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


public class FjärdeFlödet {
	private WebDriver webDriver;
	
	@BeforeMethod
	public void BeforeMethod() {
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			webDriver = new ChromeDriver();
			webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
			webDriver.manage().window().maximize();
	  }
	
	@Test
	public void testSecondFlöde() throws InterruptedException {
		webDriver.get("http://www.sigmaitc.se/sv/");
		WebElement d = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[2]/a")); //Klicka på Tjänster
		d.click();
		
		d = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[2]/ul/li[1]/a")); //Klicka på Konsulter
		d.click();
		
		d = webDriver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka på cookies
		d.click();
		
		d = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1501679939422\"]/div[2]/div/div/div/div[1]/div[1]/div/a[3]")); //Klicka på IT-Development och Technology
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(248.69,"+d.getLocation().y+")"); //För att lokaliser knappen
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(82.4,"+d.getLocation().x+")");
		d.click();
		
		Thread.sleep(2000);
		
		d = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1501679939422\"]/div[2]/div/div/div/div[2]/div[27]/a")); //Klicka på Systemintegration
		d.click();
			
		d = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1505217285786_col6-img-right-text1\"]/div/div[1]/h2"));
		String text = d.getText();
		if (d.isEnabled() && text.contains("VERKSAMHETENS BEHOV STYR LÖSNINGEN"))
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
			  System.out.println("Test passed");
		  }
		  webDriver.quit();
	  }
}


