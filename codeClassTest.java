package testing;

import org.junit.jupiter.api.Test;

class codeClassTest {
	codeClass tester = new codeClass();
	
	@Test
	void f�rstaFl�de() {
		tester.openPage("http://www.sigmaitc.se/sv/");
		tester.firstFl�de();
		tester.closeSelenium();
	}
	
	@Test
	void andraFl�de() {
		tester.openPage("http://www.sigmaitc.se/sv/");
		tester.secondFl�de("test");
		tester.closeSelenium();
	}
	
	@Test
	void tredjeFl�de() {
		tester.openPage("http://www.sigmaitc.se/sv/");
		tester.thirdFl�de();
		tester.closeSelenium();
	}
	
	@Test
	void fj�rdeFl�de() {
		tester.openPage("http://www.sigmaitc.se/sv/");
		tester.fourthFl�de();
		tester.closeSelenium();
	}
	
	@Test 
	void femteFl�de() {
		tester.openPage("http://www.sigmaitc.se/sv/");
		tester.fifthFl�de();
		tester.closeSelenium();
	}
	
	@Test
	void sj�tteFl�de() {
		tester.openPage("http://www.sigmaitc.se/sv/");
		tester.sixthFl�de();
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
