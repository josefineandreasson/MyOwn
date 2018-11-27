package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn_Page {
	
	private static WebElement element = null;
	
	public static WebElement txtbx_UserName(WebDriver driver) {
		element = driver.findElement(By.name("login"));
		
		return element;
	}
	
	public static WebElement txtbx_Password(WebDriver driver) {
		element = driver.findElement(By.name("password"));
		
		return element;
	}
	
	public static WebElement btn_LogIn(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div[4]/div/button"));
		
		return element;
	}

}
