package Sigma.Sigma;

import org.testng.annotations.Test;

public class SigmaTest {
	
	Sigma sigma = new Sigma();

	@Test
	public void förstaFlödet() {
		sigma.openPage("http://www.sigmaitc.se/sv/");
		sigma.firstFlöde();
		sigma.closeSelenium();
	}
	
}