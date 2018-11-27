package webAutomationChrome;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class CheckSearchField {
	private WebDriver webDriver;
  @Test
  public void testCheckSearchField() throws InterruptedException {
	  webDriver.get("http://www.sigmaitc.se/sv/");
	  WebElement test = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/a"));
		test.click();
		
		test = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/ul/li[1]/a"));
		test.click();
		
		test = webDriver.findElement(By.xpath("//*[@id=\"searchInput--js\"]")); 
		test.clear();
		test.sendKeys("0");
		test.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
  }
  
  public boolean search(String verifyingText) { //Verifierar vilken sida du kommit in på om den stämmer överens med det du valt att den skall klicka på
		WebElement driver = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1504516906086\"]/div[2]/div[2]/div/div[2]/div/article/div/div[1]"));
		String text = driver.getText();
		System.out.println(text);
		return text.contains(verifyingText);
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
