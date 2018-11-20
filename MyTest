package FirstTime;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.commons.mail.EmailException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class MyTest {
  @Test
  public void f() {
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Starting test");
  }

  @AfterMethod
  public void afterClass(ITestResult result) throws EmailException {
	  
	  if (result.getStatus()==ITestResult.FAILURE) {
		  SendEmailTest.sendEmail();
		  System.out.println("Test failed and email is sent");
	  }
  }
  
  @AfterMethod
  public void afterClass2(ITestResult result) throws EmailException {
	  
	  if (result.getStatus()==ITestResult.SUCCESS) {
		  SendEmailTest.sendEmail();
		  System.out.println("Everything was successfull and email is sent");
	  }
  }

}
