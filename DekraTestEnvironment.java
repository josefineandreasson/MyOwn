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
	
	public void login(String userName, String password) { //Loggar in på sidan
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
		WebElement driver = webDriver.findElement(By.id("seleniumAddButton")); //Klicka på Lägg till knappen
		driver.click();
		
		driver = webDriver.findElement(By.xpath("//*[@id=\"selenium-site-panel\"]/div[2]/ng-form/div[1]/address-picker/div[3]/div[1]/div[1]/input")); //Klickar på anläggningsadresser fältet
		driver.click();
		driver.clear();
		driver.sendKeys("göteborg"); //Fyller i Göteborg
		delay(2000);
		driver.sendKeys(Keys.ARROW_DOWN, Keys.ENTER); //Väljer Göteborg
		
		driver = webDriver.findElement(By.id("seleniumAddSiteName")); // Klickar på anläggningsnamn fältet
		driver.click();
		driver.clear();
		driver.sendKeys("Auto2"); //Fyller i anläggningsnamnet
		
		driver = webDriver.findElement(By.id("seleniumNextButton")); //Klickar på nästa knappen
		driver.click();
		
		driver = webDriver.findElement(By.id("input-1")); //Klickar på Kund fältet
		driver.click();
		driver.sendKeys("hiss"); //Fyller i kundnamnet
		delay(2000);
		driver.sendKeys(Keys.ARROW_DOWN, Keys.ENTER); //Väljer kund
		
		driver = webDriver.findElement(By.id("selenium-add-contact-button")); //Klickar på Kontaktknappen 
		driver.click();

		driver = webDriver.findElement(By.id("contacts-grid-0-0-firstname-edit")); //Fyller i förnamn
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
		
		driver = webDriver.findElement(By.id("contacts-grid-0-3-update-button")); //Klickar på klar bocken
		driver.click();
		
		delay(1000);
		
		/*driver = webDriver.findElement(By.id("seleniumAddSite2")); //Klickar på Lägg till anläggning
		driver.click();
		
		driver = webDriver.findElement(By.id("seleniumRemoveYes")); //Väljer Visa anläggning
		driver.click();*/
	}
	
	public void createObject() {
		delay(2000);
		WebElement d = webDriver.findElement(By.xpath("/html/body/div/panels/div/site-panel/base-panel/div/div[1]/div/panel-content/tab-area/div/ul/li[2]")); //Klickar på Objekt
		d.click();
		
		d = webDriver.findElement(By.id("seleniumAddObject")); //Klickar på Lägg till objekt
		d.click();
		
		d = webDriver.findElement(By.xpath("//*[@id=\"seleniumSelectObjType\"]/div/input")); //Välj objekttyp
		d.click();
		d.sendKeys("Personhiss");
		d.sendKeys(Keys.ENTER);
		
		d = webDriver.findElement(By.xpath("//*[@id=\"seleniumSelectInsMonth\"]/div/input")); //Välj Styrande besiktningsmånad
		d.click();
		d.sendKeys("september");
		d.sendKeys(Keys.ENTER);
		
		d = webDriver.findElement(By.id("seleniumNext1")); //Klickar på nästa
		d.click();
		
		d = webDriver.findElement(By.id("location-name")); //Skriver in Namn
		d.click();
		d.sendKeys("Entre");
		
		d = webDriver.findElement(By.id("seleniumNext2")); //Klickar på nästa
		d.click();
		
		d = webDriver.findElement(By.xpath("//*[@id=\"1\"]/div/input")); //Väljer tillverkare
		d.click();
		d.sendKeys("Lohenner GmbH & Co KG");
		d.findElement(By.xpath("//*[@id=\"1\"]/div/div[2]/ul/li"));
		d.sendKeys(Keys.ENTER);
		
		d = webDriver.findElement(By.id("15")); //Tillverkningsnummer
		d.click();
		d.sendKeys("1343423");
		
		d = webDriver.findElement(By.id("2")); //Tillverkningsår
		d.click();
		d.sendKeys("2010");
		
		d = webDriver.findElement(By.id("4")); //Max vikt
		d.click();
		d.sendKeys("800");
		
		d = webDriver.findElement(By.id("170")); //Max antal personer
		d.click();
		d.sendKeys("6");
		
		d = webDriver.findElement(By.xpath("//*[@id=\"30\"]/div/input")); //Hur många lyftorgan
		d.click();
		d.sendKeys("5");
		d.sendKeys(Keys.ENTER);
		
		d = webDriver.findElement(By.id("seleniumNext3")); //Klicka på nästa
		d.click();
		
		delay(2000);
		
		d = webDriver.findElement(By.xpath("/html/body/modal-windows/div/div/div/new-object-window/div/modal-window/div/div[2]/window-body/div[2]/div[1]/care-firm-picker/care-firm-search/div/autocomplete-input")); //Klickar i fältet Skötselfirma
		d.click();
		
		delay(1000);
		Actions actions1 = new Actions(webDriver);
		actions1.moveToElement(d);
		actions1.click();
		actions1.sendKeys("Kone hiss");
		actions1.build().perform();
		delay(5000);

		d = webDriver.findElement(By.xpath("//*[@id=\"989c5351-ec0a-11e8-8e75-090e8a516f57\"]/autocomplete-list/ul/li[1]")); //Väljer Kone hiss
		//((JavascriptExecutor)webDriver).executeScript("window.scrollTo(32.24,"+d.getLocation().y+")"); //För att lokaliser knappen
		//((JavascriptExecutor)webDriver).executeScript("window.scrollTo(18.4,"+d.getLocation().x+")");
		d.click();
		
		/*d = webDriver.findElement(By.id("seleniumAddObject4")); //Klickar på Lägg till objekt
		d.click();
		
		d = webDriver.findElement(By.xpath("/html/body/modal-windows/div/div/div/new-object-window/div/modal-window/div/div[3]/window-controls/div/button[1]"));
		d.click();*/
	}
	
	public void searchSite() {
		delay(3000);
		WebElement site = webDriver.findElement(By.id("basic-search-input")); //Klickar på sökfältet och söker efter anläggning
		site.click();
		site.sendKeys("Auto1");
		delay(2000);
		site.sendKeys(Keys.ARROW_DOWN);
		site.sendKeys(Keys.ENTER);
		
		/*site = webDriver.findElement(By.xpath("/html/body/div/panels/div/site-panel/base-panel/div/div[1]/div/panel-content/tab-area/div/ul/li[2]")); //Klickar på objekt
		site.click();
		
		site = webDriver.findElement(By.xpath("/html/body/div/panels/div/site-panel/base-panel/div/div[1]/div/panel-content/tab-area/div/div/tab-area-content[2]/div/object-list-item[1]/div"));
		//Klickar på första objektet
		site.click();*/
	}
	
	public void createActivity() {
		WebElement site = webDriver.findElement(By.xpath("/html/body/div[1]/panels/div/site-panel/base-panel/div/div[1]/div/panel-content/tab-area/div/ul/li[2]")); //Klickar på objekt
		site.click();
		
		delay(1000);
		
		site = webDriver.findElement(By.xpath("/html/body/div/panels/div/site-panel/base-panel/div/div[1]/div/panel-content/tab-area/div/div/tab-area-content[2]/div/object-list-item[1]/div"));
		//Klickar på första objektet
		site.click();
		
		site = webDriver.findElement(By.xpath("/html/body/div/panels/div/object-panel/base-panel/div/div[1]/div/panel-content/tab-area/div/ul/li[2]")); //Klickar på Aktivitet
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(275.51,"+site.getLocation().y+")"); //För att lokaliser knappen
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(44,"+site.getLocation().x+")");
		site.click();
		
		delay(1000);
		
		site = webDriver.findElement(By.xpath("/html/body/div[1]/panels/div/object-panel/base-panel/div/div[1]/div/panel-content/tab-area/div/div/tab-area-content[2]/div/div/div[1]/add-button/button"));
		//Klickar på Lägg till aktivitet
		site.click();
		
		site = webDriver.findElement(By.id("service-type")); //Skriver in Servicetyp
		site.click();
		site.sendKeys("Återkommande besiktning av Hiss enligt BFS 2011:12");
		site = webDriver.findElement(By.xpath("/html/body/div[1]/panels/div/activity-panel/base-panel/div/div[1]/div/panel-content/form/div[1]/searchable-select/div/div[2]/ul/li"));
		site.click();
		
		site = webDriver.findElement(By.id("section")); //Skriver in sektion
		site.click();
		site.sendKeys("Provning - Göteborg, Varberg ");
		site = webDriver.findElement(By.xpath("/html/body/div[1]/panels/div/activity-panel/base-panel/div/div[1]/div/panel-content/form/div[2]/searchable-select[1]/div/div[2]/ul/li"));
		site.click();
		
		site = webDriver.findElement(By.id("assignee")); //Skriver in besiktningsingenjör
		site.click();
		site.sendKeys("Lotta Mellgren");
		site = webDriver.findElement(By.xpath("/html/body/div[1]/panels/div/activity-panel/base-panel/div/div[1]/div/panel-content/form/div[2]/searchable-select[2]/div/div[2]/ul/li"));
		site.click();
		
		//site = webDriver.findElement(By.xpath("/html/body/div[1]/panels/div/activity-panel/base-panel/div/div[2]/panel-controls/div/div/button[2]"));
		//Klickar på spara
		//site.click();
	}
	
	public void addCareFirm() { //Lägger till en skötselfirma
		WebElement site = webDriver.findElement(By.xpath("/html/body/div/panels/div/site-panel/base-panel/div/div[1]/div/panel-content/tab-area/div/ul/li[2]")); //Klickar på objekt
		site.click();
		
		delay(1000);
		
		site = webDriver.findElement(By.xpath("/html/body/div/panels/div/site-panel/base-panel/div/div[1]/div/panel-content/tab-area/div/div/tab-area-content[2]/div/object-list-item[1]/div"));
		//Klickar på första objektet
		site.click();
		
		site = webDriver.findElement(By.xpath("/html/body/div/panels/div/object-panel/base-panel/div/div[1]/div/panel-content/tab-area/div/div/tab-area-content[1]/div/div[1]/simple-list-item[6]/div"));
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(615.2,"+site.getLocation().y+")"); //För att lokaliser knappen
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(44.6,"+site.getLocation().x+")");
		site.click();
		delay(2000);
		
		site = webDriver.findElement(By.xpath("/html/body/div/panels/div/care-firm-picker-panel/base-panel/div/div[1]/div/panel-content/care-firm-picker/care-firm-search/div/autocomplete-input"));
		((JavascriptExecutor)webDriver).executeScript("window.scrollTo(615.2,"+site.getLocation().y+")"); //För att lokaliser knappen
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
	
	public void logOut() { //Loggar ut från sidan
		WebElement driver = webDriver.findElement(By.xpath("/html/body/header/nav-bar/div/div[1]/ul[2]/li[3]/menu-nav-panel/div/a"));
		driver.click();
		
		driver = webDriver.findElement(By.xpath("/html/body/header/nav-bar/div/div[1]/ul[2]/li[3]/menu-nav-panel/ul/li[4]/a"));
		driver.click();
		
		delay(2000);
	}
	
	public void clearFilter() { //Rensar filtret för att kunna hitta mina anläggningar
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
