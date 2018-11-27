package Sigma.Sigma;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sigma {
	
	private WebDriver webDriver;
	
	public Sigma() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		webDriver = new ChromeDriver();
		webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		webDriver.manage().window().maximize();
	}
	
	public void openPage (String url) {
		webDriver.get(url);
	}
	
	public void firstFlöde() {
		WebElement element = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/a")); //Klicka på Karriär
		element.click();
		
		element = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/ul/li[1]/a")); //Klicka på Lediga Jobb
		element.click();
		
		element = webDriver.findElement(By.id("hs_cos_wrapper_widget_1504516906086")); //Klicka på Visa Filter
		element.click();
		
		element = webDriver.findElement(By.xpath("//*[@id=\"filter1\"]/div[1]/ul/li[1]")); //Klicka på Göteborg
		element.click(); 
		
		element = webDriver.findElement(By.xpath("//*[@id=\"filter1\"]/div[2]/ul/li[1]")); //Klicka på Jobbkategori
		element.click();
		
		delay(1000);
		
		element = webDriver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka bort cookies
		element.click();
		
		element = webDriver.findElement(By.id("hs_cos_wrapper_widget_1504516906086")); //Klicka på Dölj filter knappen
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(129.25,"+element.getLocation().y+")"); //För att kunna lokalisera knappen
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(48.8,"+element.getLocation().x+")");
		element.click();
		
		element = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1504516906086\"]/div[2]/div[2]/div/div[2]/div[10]")); //Klicka på en annons
		element.click();
		
		delay(1000);
		
		element = webDriver.findElement(By.xpath("//*[@id=\"page-assignment\"]/h2"));
		String text = element.getText();
		if (element.isEnabled() && text.contains("KONSULTCHEF / CONSULTANT UNIT MANAGER TILL SIGMA IT CONSULTING"))
		{ 
		    System.out.println("Successfully completed");
		}else{
		    System.out.println("Failed title");
		}
	}
	
	public void closeSelenium() { //För att stänga ner fönstret när testet är klart
		webDriver.quit();
	}
	
	public void delay(int milliseconds) { //Med hjälp av denna kodsnutt gör man en delay på någon sekund för att hinna se vad som händer
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			
		}
	}

}
