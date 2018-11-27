package testing;

import org.junit.jupiter.api.Test;

class codeClassTest {
	codeClass tester = new codeClass();
	
	@Test
	void förstaFlöde() {
		tester.openPage("http://www.sigmaitc.se/sv/");
		tester.firstFlöde();
		tester.closeSelenium();
	}
	
	@Test
	void andraFlöde() {
		tester.openPage("http://www.sigmaitc.se/sv/");
		tester.secondFlöde("test");
		tester.closeSelenium();
	}
	
	@Test
	void tredjeFlöde() {
		tester.openPage("http://www.sigmaitc.se/sv/");
		tester.thirdFlöde();
		tester.closeSelenium();
	}
	
	@Test
	void fjärdeFlöde() {
		tester.openPage("http://www.sigmaitc.se/sv/");
		tester.fourthFlöde();
		tester.closeSelenium();
	}
	
	@Test 
	void femteFlöde() {
		tester.openPage("http://www.sigmaitc.se/sv/");
		tester.fifthFlöde();
		tester.closeSelenium();
	}
	
	@Test
	void sjätteFlöde() {
		tester.openPage("http://www.sigmaitc.se/sv/");
		tester.sixthFlöde();
		tester.closeSelenium();
	}
	
	@Test
	void searchField() {
		tester.openPage("http://www.sigmaitc.se/sv/");
		tester.checkSearchField("0");
		tester.closeSelenium();
	}
	
	@Test
	void searchAJob() {
		tester.openPage("http://www.sigmaitc.se/sv/");
		tester.searchJob();
		tester.closeSelenium();
	}
	
	@Test
	void application() {
		tester.openPage("https://profiler.sigma.se/candidate/register");
		tester.application("Josefine", "Andreasson", "aaandreassonjosefine@gmail.com", "test123", "19991111");
		tester.closeSelenium();
	}

}
