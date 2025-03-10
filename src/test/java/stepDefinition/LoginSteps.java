package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("User is on login page")
    public void user_is_on_login_page() {
        System.out.println("User is on login page");
    }

    @When("^User enters (.+) and (.+)$")
    public void user_enters_and(String string, String string2) {
        System.out.println("User enters username and password");
    }

    @Then("User is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("User is navigated to the home page");
    }

}
