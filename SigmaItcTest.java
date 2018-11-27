package Sigma;

import static org.junit.Assert.*;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import org.junit.Test;

public class SigmaItcTest {
	
	SigmaItc sigma = new SigmaItc();

	@Test
	public void förstaFlödet() {
		sigma.openPage("http://www.sigmaitc.se/sv/");
		sigma.firstFlöde();
		sigma.closeSelenium();
	}
	
	@Test
	public void andraFlödet() { 
		sigma.openPage("http://www.sigmaitc.se/sv/");
		sigma.secondFlöde("test");
		sigma.closeSelenium();
	}
	
	@Test
	public void tredjeFlödet() { 
		sigma.openPage("http://www.sigmaitc.se/sv/");
		sigma.thirdFlöde();
		sigma.closeSelenium();
	}
	
	@Test
	public void fjärdeFlöde() {  
		sigma.openPage("http://www.sigmaitc.se/sv/");
		sigma.fourthFlöde();
		sigma.closeSelenium();
	}
	
	@Test
	public void femteFlöde() {
		sigma.openPage("http://www.sigmaitc.se/sv/");
		sigma.fifthFlöde();
		sigma.closeSelenium();
	}
	
	@Test
	public void sjätteFlöde() {
		sigma.openPage("http://www.sigmaitc.se/sv/");
		sigma.sixthFlöde();
		sigma.closeSelenium();
	}
	
	@Test
	public void searchField() {
		sigma.openPage("http://www.sigmaitc.se/sv/");
		sigma.checkSearchField("585538704578");
		assertTrue(sigma.search("0"));
		sigma.closeSelenium();
	}
	
	@Test
	public void searchAJob() {
		sigma.openPage("http://www.sigmaitc.se/sv/");
		sigma.searchJob();
		sigma.closeSelenium();
	}
	
	@Test public void application() {
		sigma.openPage("https://profiler.sigma.se/candidate/register");
		sigma.application("Josefine", "Andreasson", "aaandreassonjosefine@gmail.com", "test123", "19991111");
		sigma.closeSelenium();
	}

}
