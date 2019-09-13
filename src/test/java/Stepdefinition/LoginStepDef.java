package Stepdefinition;

import Pages.Login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {

	Login loginfe = new Login();

	@Given("^user is  on homepage$")
	public void user_is_on_homepage() throws Throwable {
		loginfe.Home();

	}

	@When("^user navigates to Login Page$")
	public void user_navigates_to_Login_Page() throws Throwable {
		loginfe.loginpage();

	}

	@When("^user enters username and Password$")
	public void user_enters_username_and_Password() throws Throwable {

		loginfe.login();
	}

	@Then("^user successfully logged out$")
	public void user_successfully_logged_out() throws Throwable {	 
		loginfe.logout();
	}

}
