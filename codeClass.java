package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class codeClass {
	private WebDriver webDriver;
	
	public codeClass() {
		System.setProperty("webdriver.chrome.driver", "bin/chromedriver.exe");
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
	
	public void secondFlöde(String text) {
		WebElement e = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/a")); //Klicka på Karriär
		e.click();
		
		e = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/ul/li[1]/a")); //Klicka på Lediga Jobb
		e.click();
		
		delay(2000);
		
		e = webDriver.findElement(By.xpath("//*[@id=\"searchInput--js\"]")); //Klicka i sökfältet och skriva in ett sökord och klicka enter
		e.clear();
		e.sendKeys(text);
		e.sendKeys(Keys.ENTER);
		
		e = webDriver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka på cookies
		e.click();
		
		delay(1000);
		
		e = webDriver.findElement(By.id("loadMore")); //Klickar på visa fler
		e.click();
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(112.69,"+e.getLocation().y+")"); //För att kunna lokalisera knappen
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(48.8,"+e.getLocation().x+")");
		
		delay(1000);
		
		e = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1504516906086\"]/div[2]/div[2]/div/div[2]/div[19]")); //Klicka på en tjänst
		e.click();
		
		delay(2000);
		
		e = webDriver.findElement(By.xpath("//*[@id=\"page-assignment\"]/h2"));
		String text1 = e.getText();
		if (e.isEnabled() && text1.contains("JUNIOR C# UTVECKLARE SOM VILL GÖRA SKILLNAD!"))
		{ 
		    System.out.println("Successfully completed");
		}else{
		    System.out.println("Failed title");
		}
	}
	
	public void thirdFlöde() {
		WebElement driver = webDriver.findElement(By.xpath("//*[@id=\"new-language-picker\"]/li[2]/a")); //Välj engelska som språk
		driver.click();
		
		driver = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/a")); //Välj Career
		driver.click();
		
		driver = webDriver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka på cookies
		driver.click();
		
		delay(2000);
		
		driver = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1503484510235widget_1503484510235_col6-img-right-text1_col12-btn1\"]/a")); 
		//Klicka på Read more som finns längre ner på sidan som leder till Openings
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(119.95,"+driver.getLocation().y+")"); //För att lokaliser knappen
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(39.6,"+driver.getLocation().x+")");
		driver.click();
		
		delay(2000);
		
		driver = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1504516906086\"]/div[2]/div[2]/div/div[2]/div[5]")); //Klicka på en tjänst
		driver.click();
		
		delay(2000);
		
		driver = webDriver.findElement(By.xpath("//*[@id=\"page-assignment\"]/h2"));
		String text = driver.getText();
		if (driver.isEnabled() && text.contains("INHOUSE TESTSPECIALIST TILL SIGMA IT CONSULTING"))
		{ 
		    System.out.println("Successfully completed");
		}else{
		    System.out.println("Failed title");
		}
	}
	
	public void fourthFlöde() {
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
		
		delay(2000);
		
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
	
	public void fifthFlöde() {
		WebElement check = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[2]/a")); //Klicka på Tjänster
		check.click();
		
		check = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[2]/ul/li[2]/a")); //Klicka på lösingar
		check.click();
		
		check = webDriver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka på cookies
		check.click();
		
		check = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1505131993625\"]/div[2]/div/div/div/div[2]/div[12]")); //Klicka på PIM
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(262.5,"+check.getLocation().y+")"); //För att lokaliser knappen
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(40,"+check.getLocation().x+")");
		check.click();
		
		delay(2000);
		
		check = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1505377611598_col12-text-btn-full\"]/div/div[1]/h1"));
		String text = check.getText();
		if (check.isEnabled() && text.contains("UPPDATERING AV MASTERDATA PÅ ETT ENDA STÄLLE"))
		{ 
		    System.out.println("Successfully completed");
		}else{
		    System.out.println("Failed title");
		}
	}
	
	public void sixthFlöde() {
		WebElement check = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[2]/a")); //Klicka på tjänster
		check.click();
		
		check = webDriver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka på cookies
		check.click();
		
		check = webDriver.findElement(By.id("hs_cos_wrapper_widget_1503575254530widget_1503575254530_col3-text4_col12-btn1")); //Klicka på Plattformar längre ner på sidan
		check.click();
		delay(2000);
		
		check = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1500626735145\"]/div[2]/div/div/div[15]/div[3]/a")); //Klicka på Episerver
		check.click();
		
		delay(2000);
		
		check = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1504881430382_col12-text-btn-full\"]/div/div[1]/div"));
		String text = check.getText();
		if (check.isEnabled() && text.contains("Den stora fördelen med Episerver är att du hanterar innehåll och marknadsföringskampanjer i en och samma vy."))
		{ 
		    System.out.println("Successfully completed");
		}else{
		    System.out.println("Failed title");
		}
	}
	
	public void checkSearchField(String numbers) {
		WebElement test = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/a"));
		test.click();
		
		test = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/ul/li[1]/a"));
		test.click();
		
		test = webDriver.findElement(By.xpath("//*[@id=\"searchInput--js\"]")); 
		test.clear();
		test.sendKeys(numbers);
		test.sendKeys(Keys.ENTER);
		
		delay(2000);
	}
	
	public boolean search(String verifyingText) { //Verifierar vilken sida du kommit in på om den stämmer överens med det du valt att den skall klicka på
		WebElement driver = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1504516906086\"]/div[2]/div[2]/div/div[2]/div/article/div/div[1]"));
		String text = driver.getText();
		System.out.println(text);
		return text.contains(verifyingText);
	}
	
	public void searchJob() {
		WebElement job = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/a")); //Klicka på Karriär
		job.click();
		
		job = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/ul/li[1]/a")); //Klicka på Lediga Jobb
		job.click();
		
		job = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1504516906086\"]/div[2]/div[2]/div/div[2]/div[5]"));
		job.click();
		
		job = webDriver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka på cookies
		job.click();
		
		delay(1000);
		
		job = webDriver.findElement(By.id("applyBtn")); //Klicka på Ansök knappen
		job.click();
		
		delay(2000);
		
		job.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/ng-include/div[4]/div[3]/input"));
		job.click();
		
		delay(3000);
	}
	
	public void application(String firstname, String lastname, String email, String password, String birthNumber) {		
		WebElement job = webDriver.findElement(By.xpath("/html/body/div/div/nav/div/ul[3]/li")); 
		job.click();
		job = webDriver.findElement(By.xpath("/html/body/div/div/nav/div/ul[3]/li/ul/li[2]/a")); //Välj språk till Svenska
		job.click();
		
		job = webDriver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/ng-include/div[4]/div[3]/input")); //Fyller i första fältet
		job.click();
		job.clear();
		job.sendKeys(firstname);
		
		job = webDriver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/ng-include/div[5]/div[3]/input")); //Fyller i andra fältet
		job.click();
		job.clear();
		job.sendKeys(lastname);	
		
		job = webDriver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/ng-include/div[6]/div[3]/input")); //Fyller i tredje fältet
		job.click();
		job.clear();
		job.sendKeys(email);
		
		job = webDriver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/ng-include/div[7]/div[3]/input")); //Fyller i fjärde fältet
		job.click();
		job.clear();
		job.sendKeys(password);
		
		job = webDriver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/div[4]/div/button")); //Klicka på skapa knappen
		job.click();
		
		job = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[2]/div[1]/div/input")); //Fyll i födelsedatum
		job.click();
		job.clear();
		job.sendKeys(birthNumber);
		job = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[1]")); //Klicka OK
		job.click();
		
		delay(3000);
		
		job = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button")); //Klicka OK
		job.click();
		
		job = webDriver.findElement(By.xpath("/html/body/div/div/nav/div/div/div/div[2]/ul[1]/li/a/div/p/img")); //Klicka på dropdown-menyn
		job.click();
		delay(1000);
		job = webDriver.findElement(By.xpath("/html/body/div/div/nav/div/div/div/div[2]/ul[1]/li/ul/li[4]/a")); //Klicka på radera konto
		job.click();
		delay(1000);
		job = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[1]")); //Klicka Radera
		job.click();
		delay(1000);
		job = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[1]")); //Klicka Radera
		job.click();
		delay(2000);
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
