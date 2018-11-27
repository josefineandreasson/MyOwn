package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.*;
import utility.Constant;
import utility.ExcelUtils;
import appModules.SignIn_Action;

public class Apache_POI_TC {
	
	private static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constant.URL);
		SignIn_Action.Execute(driver);
		System.out.println("Login Successfully, now it is time to Log Off");
		Home_Page.lnk_LogOut(driver).click();
		driver.quit();
		ExcelUtils.setCellData("Pass", 1, 3);
	}
}
