package pages;


import io.cucumber.java.en.And;
import hooks.TestNgHooks;



public class LoginPage extends TestNgHooks{

	@And("Enter the username {string}")
	public LoginPage typeUsername(String Username) {
		type(locateElement("id", "username"), Username);
		return this;
	}
	
	@And("Enter the password {string}")
	public LoginPage typePassword(String password) {
		type(locateElement("id", "password"), password);
		return this;
	}
	@And("Click Login button")
	public HomePage clickLogin() {
		click(locateElement("class", "decorativeSubmit"));
		return new HomePage();
	}
}
