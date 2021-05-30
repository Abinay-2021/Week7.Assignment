package pages;


import io.cucumber.java.en.And;
import hooks.TestNgHooks;




public class HomePage extends TestNgHooks {

	@And("Click CRMSFA") 
	public MyHome clickCRMSFA() {
	click(locateElement("link", "CRM/SFA"));
	return new MyHome();
	}
	

}
