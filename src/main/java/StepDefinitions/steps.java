package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps {
	@Given("^Open chome and Start Application$")
	public void open_chome_and_Start_Application() throws Throwable {
		System.out.println("Test1Pass");
		
	}
	  

	@When("^enter valid username and password$")
	public void enter_valid_username_and_password() throws Throwable {
		System.out.println("Test2Pass");
	  
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		System.out.println("Test3Pass");
	}


}
