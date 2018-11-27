package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
	
	private static WebElement element = null;
	
	public static WebElement lnk_MyAccount(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div/nav/div/ul[2]/li[2]/a"));
		
		return element;
	}
	
	public static WebElement lnk_LogOut(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/div[4]/div/button"));
		return element;
	}

}
