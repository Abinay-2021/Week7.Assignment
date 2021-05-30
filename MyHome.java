package pages;


import io.cucumber.java.en.And;
import hooks.TestNgHooks;

public class MyHome extends TestNgHooks{
	
	  
	@And("Click Create Leads") 
	public CreateLead clickCreateLead() {
	click(locateElement("link", "Create Lead"));
	return new CreateLead();
	}

}