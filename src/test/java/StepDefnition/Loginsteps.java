package StepDefnition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {

@Given("user is on login page")
public void user_is_on_login_page() {
    System.out.println("user in login page");
}

@When("user enters username and password")
public void user_enters_username_and_password() {
	System.out.println("valid credentials");
}

@And("click on login button")
public void click_on_login_button() {
	System.out.println("logged in");   
}

@Then("user is navigated to home page")
public void user_is_navigated_to_home_page() {
	System.out.println("Home page reached");
}
}
