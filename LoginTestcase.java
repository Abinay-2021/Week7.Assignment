package tests;

import org.testng.annotations.Test;

import hooks.TestNgHooks;
import pages.LoginPage;

public class LoginTestcase extends TestNgHooks {
	
	@Test(dataProvider = "FetchExcelData")
	public void LoginLeafTaps(String Username, String Password,String companyName, String firstName,String lastName) {
		new LoginPage()
		.typeUsername(Username)
		.typePassword(Password)
		.clickLogin()
		.clickCRMSFA()
		.clickCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickSubmit()
		.verifyIfLeadIsCreated();
	}

}
