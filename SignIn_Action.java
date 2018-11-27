package appModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.Home_Page;
import pageObjects.LogIn_Page;
import utility.ExcelUtils;

public class SignIn_Action {
	
	public static void Execute(WebDriver driver) throws Exception {
		String sUserName = ExcelUtils.getCellData(1, 1);
		String sPassword = ExcelUtils.getCellData(1, 2);
		
		Home_Page.lnk_MyAccount(driver).click();
		LogIn_Page.txtbx_UserName(driver).sendKeys(sUserName);
		LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);
		LogIn_Page.btn_LogIn(driver).click();
	}

}
