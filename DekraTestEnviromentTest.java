package dekra;

import org.junit.Test;

public class DekraTestEnviromentTest {
	
	DekraTestEnvironment dekra = new DekraTestEnvironment();

	@Test
	public void test() {
		dekra.openPage("https://abacusbotest.azurewebsites.net");
		dekra.login("sigma_admin@AbacusADTest.onmicrosoft.com", "Rock'n'rollL1FE?");
		//dekra.createSite();
		dekra.clearFilter();
		dekra.searchSite();
		dekra.createObject();
		//dekra.createActivity();
		//dekra.addCareFirm();
		//dekra.logOut();
		//dekra.closeSelenium();
	}

}
