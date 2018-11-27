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
	
	public void firstFl�de() {
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
		
		delay(1000);
		
		element = webDriver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka bort cookies
		element.click();
		
		element = webDriver.findElement(By.id("hs_cos_wrapper_widget_1504516906086")); //Klicka p� D�lj filter knappen
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(129.25,"+element.getLocation().y+")"); //F�r att kunna lokalisera knappen
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(48.8,"+element.getLocation().x+")");
		element.click();
		
		element = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1504516906086\"]/div[2]/div[2]/div/div[2]/div[10]")); //Klicka p� en annons
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
	
	public void secondFl�de(String text) {
		WebElement e = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/a")); //Klicka p� Karri�r
		e.click();
		
		e = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/ul/li[1]/a")); //Klicka p� Lediga Jobb
		e.click();
		
		delay(2000);
		
		e = webDriver.findElement(By.xpath("//*[@id=\"searchInput--js\"]")); //Klicka i s�kf�ltet och skriva in ett s�kord och klicka enter
		e.clear();
		e.sendKeys(text);
		e.sendKeys(Keys.ENTER);
		
		e = webDriver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka p� cookies
		e.click();
		
		delay(1000);
		
		e = webDriver.findElement(By.id("loadMore")); //Klickar p� visa fler
		e.click();
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(112.69,"+e.getLocation().y+")"); //F�r att kunna lokalisera knappen
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(48.8,"+e.getLocation().x+")");
		
		delay(1000);
		
		e = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1504516906086\"]/div[2]/div[2]/div/div[2]/div[19]")); //Klicka p� en tj�nst
		e.click();
		
		delay(2000);
		
		e = webDriver.findElement(By.xpath("//*[@id=\"page-assignment\"]/h2"));
		String text1 = e.getText();
		if (e.isEnabled() && text1.contains("JUNIOR C# UTVECKLARE SOM VILL G�RA SKILLNAD!"))
		{ 
		    System.out.println("Successfully completed");
		}else{
		    System.out.println("Failed title");
		}
	}
	
	public void thirdFl�de() {
		WebElement driver = webDriver.findElement(By.xpath("//*[@id=\"new-language-picker\"]/li[2]/a")); //V�lj engelska som spr�k
		driver.click();
		
		driver = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/a")); //V�lj Career
		driver.click();
		
		driver = webDriver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka p� cookies
		driver.click();
		
		delay(2000);
		
		driver = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1503484510235widget_1503484510235_col6-img-right-text1_col12-btn1\"]/a")); 
		//Klicka p� Read more som finns l�ngre ner p� sidan som leder till Openings
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(119.95,"+driver.getLocation().y+")"); //F�r att lokaliser knappen
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(39.6,"+driver.getLocation().x+")");
		driver.click();
		
		delay(2000);
		
		driver = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1504516906086\"]/div[2]/div[2]/div/div[2]/div[5]")); //Klicka p� en tj�nst
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
	
	public void fourthFl�de() {
		WebElement d = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[2]/a")); //Klicka p� Tj�nster
		d.click();
		
		d = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[2]/ul/li[1]/a")); //Klicka p� Konsulter
		d.click();
		
		d = webDriver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka p� cookies
		d.click();
		
		d = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1501679939422\"]/div[2]/div/div/div/div[1]/div[1]/div/a[3]")); //Klicka p� IT-Development och Technology
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(248.69,"+d.getLocation().y+")"); //F�r att lokaliser knappen
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(82.4,"+d.getLocation().x+")");
		d.click();
		
		delay(2000);
		
		d = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1501679939422\"]/div[2]/div/div/div/div[2]/div[27]/a")); //Klicka p� Systemintegration
		d.click();
		
		d = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1505217285786_col6-img-right-text1\"]/div/div[1]/h2"));
		String text = d.getText();
		if (d.isEnabled() && text.contains("VERKSAMHETENS BEHOV STYR L�SNINGEN"))
		{ 
		    System.out.println("Successfully completed");
		}else{
		    System.out.println("Failed title");
		}
	}
	
	public void fifthFl�de() {
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
		
		delay(2000);
		
		check = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1505377611598_col12-text-btn-full\"]/div/div[1]/h1"));
		String text = check.getText();
		if (check.isEnabled() && text.contains("UPPDATERING AV MASTERDATA P� ETT ENDA ST�LLE"))
		{ 
		    System.out.println("Successfully completed");
		}else{
		    System.out.println("Failed title");
		}
	}
	
	public void sixthFl�de() {
		WebElement check = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[2]/a")); //Klicka p� tj�nster
		check.click();
		
		check = webDriver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka p� cookies
		check.click();
		
		check = webDriver.findElement(By.id("hs_cos_wrapper_widget_1503575254530widget_1503575254530_col3-text4_col12-btn1")); //Klicka p� Plattformar l�ngre ner p� sidan
		check.click();
		delay(2000);
		
		check = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1500626735145\"]/div[2]/div/div/div[15]/div[3]/a")); //Klicka p� Episerver
		check.click();
		
		delay(2000);
		
		check = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1504881430382_col12-text-btn-full\"]/div/div[1]/div"));
		String text = check.getText();
		if (check.isEnabled() && text.contains("Den stora f�rdelen med Episerver �r att du hanterar inneh�ll och marknadsf�ringskampanjer i en och samma vy."))
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
	
	public boolean search(String verifyingText) { //Verifierar vilken sida du kommit in p� om den st�mmer �verens med det du valt att den skall klicka p�
		WebElement driver = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1504516906086\"]/div[2]/div[2]/div/div[2]/div/article/div/div[1]"));
		String text = driver.getText();
		System.out.println(text);
		return text.contains(verifyingText);
	}
	
	public void searchJob() {
		WebElement job = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/a")); //Klicka p� Karri�r
		job.click();
		
		job = webDriver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_my_menu\"]/ul/li[1]/ul/li[1]/a")); //Klicka p� Lediga Jobb
		job.click();
		
		job = webDriver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1504516906086\"]/div[2]/div[2]/div/div[2]/div[5]"));
		job.click();
		
		job = webDriver.findElement(By.xpath("/html/body/div[1]/div/a")); //Klicka p� cookies
		job.click();
		
		delay(1000);
		
		job = webDriver.findElement(By.id("applyBtn")); //Klicka p� Ans�k knappen
		job.click();
		
		delay(2000);
		
		job.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/ng-include/div[4]/div[3]/input"));
		job.click();
		
		delay(3000);
	}
	
	public void application(String firstname, String lastname, String email, String password, String birthNumber) {		
		WebElement job = webDriver.findElement(By.xpath("/html/body/div/div/nav/div/ul[3]/li")); 
		job.click();
		job = webDriver.findElement(By.xpath("/html/body/div/div/nav/div/ul[3]/li/ul/li[2]/a")); //V�lj spr�k till Svenska
		job.click();
		
		job = webDriver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/ng-include/div[4]/div[3]/input")); //Fyller i f�rsta f�ltet
		job.click();
		job.clear();
		job.sendKeys(firstname);
		
		job = webDriver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/ng-include/div[5]/div[3]/input")); //Fyller i andra f�ltet
		job.click();
		job.clear();
		job.sendKeys(lastname);	
		
		job = webDriver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/ng-include/div[6]/div[3]/input")); //Fyller i tredje f�ltet
		job.click();
		job.clear();
		job.sendKeys(email);
		
		job = webDriver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/ng-include/div[7]/div[3]/input")); //Fyller i fj�rde f�ltet
		job.click();
		job.clear();
		job.sendKeys(password);
		
		job = webDriver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/div[4]/div/button")); //Klicka p� skapa knappen
		job.click();
		
		job = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[2]/div[1]/div/input")); //Fyll i f�delsedatum
		job.click();
		job.clear();
		job.sendKeys(birthNumber);
		job = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[1]")); //Klicka OK
		job.click();
		
		delay(3000);
		
		job = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button")); //Klicka OK
		job.click();
		
		job = webDriver.findElement(By.xpath("/html/body/div/div/nav/div/div/div/div[2]/ul[1]/li/a/div/p/img")); //Klicka p� dropdown-menyn
		job.click();
		delay(1000);
		job = webDriver.findElement(By.xpath("/html/body/div/div/nav/div/div/div/div[2]/ul[1]/li/ul/li[4]/a")); //Klicka p� radera konto
		job.click();
		delay(1000);
		job = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[1]")); //Klicka Radera
		job.click();
		delay(1000);
		job = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[1]")); //Klicka Radera
		job.click();
		delay(2000);
	}
	
	public void closeSelenium() { //F�r att st�nga ner f�nstret n�r testet �r klart
		webDriver.quit();
	}
	
	public void delay(int milliseconds) { //Med hj�lp av denna kodsnutt g�r man en delay p� n�gon sekund f�r att hinna se vad som h�nder
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			
		}
	}
}
