package Sigma;

import static org.junit.Assert.*;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import org.junit.Test;

public class SigmaItcTest {
	
	SigmaItc sigma = new SigmaItc();

	@Test
	public void f�rstaFl�det() {
		sigma.openPage("http://www.sigmaitc.se/sv/");
		sigma.firstFl�de();
		sigma.closeSelenium();
	}
	
	@Test
	public void andraFl�det() { 
		sigma.openPage("http://www.sigmaitc.se/sv/");
		sigma.secondFl�de("test");
		sigma.closeSelenium();
	}
	
	@Test
	public void tredjeFl�det() { 
		sigma.openPage("http://www.sigmaitc.se/sv/");
		sigma.thirdFl�de();
		sigma.closeSelenium();
	}
	
	@Test
	public void fj�rdeFl�de() {  
		sigma.openPage("http://www.sigmaitc.se/sv/");
		sigma.fourthFl�de();
		sigma.closeSelenium();
	}
	
	@Test
	public void femteFl�de() {
		sigma.openPage("http://www.sigmaitc.se/sv/");
		sigma.fifthFl�de();
		sigma.closeSelenium();
	}
	
	@Test
	public void sj�tteFl�de() {
		sigma.openPage("http://www.sigmaitc.se/sv/");
		sigma.sixthFl�de();
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
