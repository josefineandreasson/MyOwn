package dekra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DekraTestEnvironment {
	private WebDriver webDriver;
	
	public DekraTestEnvironment() {
		System.setProperty("webdriver.chrome.driver", "bin/chromedriver.exe");
		webDriver = new ChromeDriver();
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		webDriver.manage().window().maximize();
	}
	
	public void openPage(String url) {
		webDriver.get(url);
	}
	
	public void login(String userName, String password) { //Loggar in p� sidan
		WebElement driver = webDriver.findElement(By.id("i0116"));
		driver.clear();
		driver.sendKeys(userName);
		driver.sendKeys(Keys.ENTER);
		
		driver = webDriver.findElement(By.id("i0118"));
		driver.clear();
		driver.sendKeys(password);
		delay(1000);
		driver = webDriver.findElement(By.id("idSIButton9"));
		driver.click();
		
		driver = webDriver.findElement(By.id("idBtn_Back"));
		driver.click();
		
		delay(2000);
	}
	
	public void createSite() {
		WebElement driver = webDriver.findElement(By.id("seleniumAddButton")); //Klicka p� L�gg till knappen
		driver.click();
		
		driver = webDriver.findElement(By.xpath("//*[@id=\"selenium-site-panel\"]/div[2]/ng-form/div[1]/address-picker/div[3]/div[1]/div[1]/input")); //Klickar p� anl�ggningsadresser f�ltet
		driver.click();
		driver.clear();
		driver.sendKeys("g�teborg"); //Fyller i G�teborg
		delay(2000);
		driver.sendKeys(Keys.ARROW_DOWN, Keys.ENTER); //V�ljer G�teborg
		
		driver = webDriver.findElement(By.id("seleniumAddSiteName")); // Klickar p� anl�ggningsnamn f�ltet
		driver.click();
		driver.clear();
		driver.sendKeys("Auto2"); //Fyller i anl�ggningsnamnet
		
		driver = webDriver.findElement(By.id("seleniumNextButton")); //Klickar p� n�sta knappen
		driver.click();
		
		driver = webDriver.findElement(By.id("input-1")); //Klickar p� Kund f�ltet
		driver.click();
		driver.sendKeys("hiss"); //Fyller i kundnamnet
		delay(2000);
		driver.sendKeys(Keys.ARROW_DOWN, Keys.ENTER); //V�ljer kund
		
		driver = webDriver.findElement(By.id("selenium-add-contact-button")); //Klickar p� Kontaktknappen 
		driver.click();

		driver = webDriver.findElement(By.id("contacts-grid-0-0-firstname-edit")); //Fyller i f�rnamn
		driver.click();
		driver.sendKeys("test");
		
		driver = webDriver.findElement(By.id("contacts-grid-0-0-lastname-edit")); //Fyller i efternamn
		driver.click();
		driver.sendKeys("test");
		
		driver = webDriver.findElement(By.id("contacts-grid-0-1-email-edit")); //Fyller i email
		driver.click();
		driver.sendKeys("test@test.com");
		
		driver = webDriver.findElement(By.id("contacts-grid-0-1phone-number-edit")); //Fyller i telefonnummer
		driver.click();
		driver.sendKeys("11111");
		
		driver = webDriver.findElement(By.id("contacts-grid-0-3-update-button")); //Klickar p� klar bocken
		driver.click();
		
		delay(1000);
		
		/*driver = webDriver.findElement(By.id("seleniumAddSite2")); //Klickar p� L�gg till anl�ggning
		driver.click();
		
		driver = webDriver.findElement(By.id("seleniumRemoveYes")); //V�ljer Visa anl�ggning
		driver.click();*/
	}
	
	public void createObject() {
		delay(2000);
		WebElement d = webDriver.findElement(By.xpath("/html/body/div/panels/div/site-panel/base-panel/div/div[1]/div/panel-content/tab-area/div/ul/li[2]")); //Klickar p� Objekt
		d.click();
		
		d = webDriver.findElement(By.id("seleniumAddObject")); //Klickar p� L�gg till objekt
		d.click();
		
		d = webDriver.findElement(By.xpath("//*[@id=\"seleniumSelectObjType\"]/div/input")); //V�lj objekttyp
		d.click();
		d.sendKeys("Personhiss");
		d.sendKeys(Keys.ENTER);
		
		d = webDriver.findElement(By.xpath("//*[@id=\"seleniumSelectInsMonth\"]/div/input")); //V�lj Styrande besiktningsm�nad
		d.click();
		d.sendKeys("september");
		d.sendKeys(Keys.ENTER);
		
		d = webDriver.findElement(By.id("seleniumNext1")); //Klickar p� n�sta
		d.click();
		
		d = webDriver.findElement(By.id("location-name")); //Skriver in Namn
		d.click();
		d.sendKeys("Entre");
		
		d = webDriver.findElement(By.id("seleniumNext2")); //Klickar p� n�sta
		d.click();
		
		d = webDriver.findElement(By.xpath("//*[@id=\"1\"]/div/input")); //V�ljer tillverkare
		d.click();
		d.sendKeys("Lohenner GmbH & Co KG");
		d.findElement(By.xpath("//*[@id=\"1\"]/div/div[2]/ul/li"));
		d.sendKeys(Keys.ENTER);
		
		d = webDriver.findElement(By.id("15")); //Tillverkningsnummer
		d.click();
		d.sendKeys("1343423");
		
		d = webDriver.findElement(By.id("2")); //Tillverknings�r
		d.click();
		d.sendKeys("2010");
		
		d = webDriver.findElement(By.id("4")); //Max vikt
		d.click();
		d.sendKeys("800");
		
		d = webDriver.findElement(By.id("170")); //Max antal personer
		d.click();
		d.sendKeys("6");
		
		d = webDriver.findElement(By.xpath("//*[@id=\"30\"]/div/input")); //Hur m�nga lyftorgan
		d.click();
		d.sendKeys("5");
		d.sendKeys(Keys.ENTER);
		
		d = webDriver.findElement(By.id("seleniumNext3")); //Klicka p� n�sta
		d.click();
		
		delay(2000);
		
		d = webDriver.findElement(By.xpath("/html/body/modal-windows/div/div/div/new-object-window/div/modal-window/div/div[2]/window-body/div[2]/div[1]/care-firm-picker/care-firm-search/div/autocomplete-input")); //Klickar i f�ltet Sk�tselfirma
		d.click();
		
		delay(1000);
		Actions actions1 = new Actions(webDriver);
		actions1.moveToElement(d);
		actions1.click();
		actions1.sendKeys("Kone hiss");
		actions1.build().perform();
		delay(5000);

		d = webDriver.findElement(By.xpath("//*[@id=\"989c5351-ec0a-11e8-8e75-090e8a516f57\"]/autocomplete-list/ul/li[1]")); //V�ljer Kone hiss
		//((JavascriptExecutor)webDriver).executeScript("window.scrollTo(32.24,"+d.getLocation().y+")"); //F�r att lokaliser knappen
		//((JavascriptExecutor)webDriver).executeScript("window.scrollTo(18.4,"+d.getLocation().x+")");
		d.click();
		
		/*d = webDriver.findElement(By.id("seleniumAddObject4")); //Klickar p� L�gg till objekt
		d.click();
		
		d = webDriver.findElement(By.xpath("/html/body/modal-windows/div/div/div/new-object-window/div/modal-window/div/div[3]/window-controls/div/button[1]"));
		d.click();*/
	}
	
	public void searchSite() {
		delay(3000);
		WebElement site = webDriver.findElement(By.id("basic-search-input")); //Klickar p� s�kf�ltet och s�ker efter anl�ggning
		site.click();
		site.sendKeys("Auto1");
		delay(2000);
		site.sendKeys(Keys.ARROW_DOWN);
		site.sendKeys(Keys.ENTER);
		
		/*site = webDriver.findElement(By.xpath("/html/body/div/panels/div/site-panel/base-panel/div/div[1]/div/panel-content/tab-area/div/ul/li[2]")); //Klickar p� objekt
		site.click();
		
		site = webDriver.findElement(By.xpath("/html/body/div/panels/div/site-panel/base-panel/div/div[1]/div/panel-content/tab-area/div/div/tab-area-content[2]/div/object-list-item[1]/div"));
		//Klickar p� f�rsta objektet
		site.click();*/
	}
	
	public void createActivity() {
		WebElement site = webDriver.findElement(By.xpath("/html/body/div[1]/panels/div/site-panel/base-panel/div/div[1]/div/panel-content/tab-area/div/ul/li[2]")); //Klickar p� objekt
		site.click();
		
		delay(1000);
		
		site = webDriver.findElement(By.xpath("/html/body/div/panels/div/site-panel/base-panel/div/div[1]/div/panel-content/tab-area/div/div/tab-area-content[2]/div/object-list-item[1]/div"));
		//Klickar p� f�rsta objektet
		site.click();
		
		site = webDriver.findElement(By.xpath("/html/body/div/panels/div/object-panel/base-panel/div/div[1]/div/panel-content/tab-area/div/ul/li[2]")); //Klickar p� Aktivitet
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(275.51,"+site.getLocation().y+")"); //F�r att lokaliser knappen
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(44,"+site.getLocation().x+")");
		site.click();
		
		delay(1000);
		
		site = webDriver.findElement(By.xpath("/html/body/div[1]/panels/div/object-panel/base-panel/div/div[1]/div/panel-content/tab-area/div/div/tab-area-content[2]/div/div/div[1]/add-button/button"));
		//Klickar p� L�gg till aktivitet
		site.click();
		
		site = webDriver.findElement(By.id("service-type")); //Skriver in Servicetyp
		site.click();
		site.sendKeys("�terkommande besiktning av Hiss enligt BFS 2011:12");
		site = webDriver.findElement(By.xpath("/html/body/div[1]/panels/div/activity-panel/base-panel/div/div[1]/div/panel-content/form/div[1]/searchable-select/div/div[2]/ul/li"));
		site.click();
		
		site = webDriver.findElement(By.id("section")); //Skriver in sektion
		site.click();
		site.sendKeys("Provning - G�teborg, Varberg ");
		site = webDriver.findElement(By.xpath("/html/body/div[1]/panels/div/activity-panel/base-panel/div/div[1]/div/panel-content/form/div[2]/searchable-select[1]/div/div[2]/ul/li"));
		site.click();
		
		site = webDriver.findElement(By.id("assignee")); //Skriver in besiktningsingenj�r
		site.click();
		site.sendKeys("Lotta Mellgren");
		site = webDriver.findElement(By.xpath("/html/body/div[1]/panels/div/activity-panel/base-panel/div/div[1]/div/panel-content/form/div[2]/searchable-select[2]/div/div[2]/ul/li"));
		site.click();
		
		//site = webDriver.findElement(By.xpath("/html/body/div[1]/panels/div/activity-panel/base-panel/div/div[2]/panel-controls/div/div/button[2]"));
		//Klickar p� spara
		//site.click();
	}
	
	public void addCareFirm() { //L�gger till en sk�tselfirma
		WebElement site = webDriver.findElement(By.xpath("/html/body/div/panels/div/site-panel/base-panel/div/div[1]/div/panel-content/tab-area/div/ul/li[2]")); //Klickar p� objekt
		site.click();
		
		delay(1000);
		
		site = webDriver.findElement(By.xpath("/html/body/div/panels/div/site-panel/base-panel/div/div[1]/div/panel-content/tab-area/div/div/tab-area-content[2]/div/object-list-item[1]/div"));
		//Klickar p� f�rsta objektet
		site.click();
		
		site = webDriver.findElement(By.xpath("/html/body/div/panels/div/object-panel/base-panel/div/div[1]/div/panel-content/tab-area/div/div/tab-area-content[1]/div/div[1]/simple-list-item[6]/div"));
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(615.2,"+site.getLocation().y+")"); //F�r att lokaliser knappen
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(44.6,"+site.getLocation().x+")");
		site.click();
		delay(2000);
		
		site = webDriver.findElement(By.xpath("/html/body/div/panels/div/care-firm-picker-panel/base-panel/div/div[1]/div/panel-content/care-firm-picker/care-firm-search/div/autocomplete-input"));
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(615.2,"+site.getLocation().y+")"); //F�r att lokaliser knappen
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(18.4,"+site.getLocation().x+")");
		site.click();
		Actions actions = new Actions(webDriver);
		actions.moveToElement(site);
		actions.click();
		actions.sendKeys("Kone hiss");
		actions.build().perform();

		delay(3000);
		site.findElement(By.className("care-firm-search__name ng-binding"));
		site.click();
		//site.sendKeys(Keys.ENTER);
		
		//site.findElement(By.xpath("//*[@id=\"8a2850e1-e97a-11e8-a090-f7242ccfad8c\"]/autocomplete-list/ul/li[1]"));
		//site.click();
	}
	
	public void logOut() { //Loggar ut fr�n sidan
		WebElement driver = webDriver.findElement(By.xpath("/html/body/header/nav-bar/div/div[1]/ul[2]/li[3]/menu-nav-panel/div/a"));
		driver.click();
		
		driver = webDriver.findElement(By.xpath("/html/body/header/nav-bar/div/div[1]/ul[2]/li[3]/menu-nav-panel/ul/li[4]/a"));
		driver.click();
		
		delay(2000);
	}
	
	public void clearFilter() { //Rensar filtret f�r att kunna hitta mina anl�ggningar
		WebElement d = webDriver.findElement(By.xpath("/html/body/header/nav-bar/div/div[1]/ul[1]/li[1]/icon-filter/div"));
		d.click();
		delay(2000);
		d = webDriver.findElement(By.xpath("/html/body/header/nav-bar/search-filter/div/div[2]/form/div/div/div[1]/div[1]/icon-cross/div"));
		d.click();
		delay(1000);
		/*d = webDriver.findElement(By.xpath("/html/body/header/nav-bar/div/div[1]/ul[1]/li[1]/icon-filter/div"));
		d.click();
		delay(2000);
		d = webDriver.findElement(By.xpath("/html/body/alternatives-popup/popup/div/div/div/div[3]/popup-footer/button[2]"));
		d.click();*/
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
