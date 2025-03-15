package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

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

    //Another Scenario Explanation
    @Given("User is on Practice landing page")
    public void user_is_on_practice_landing_page(List<String> data) {
        System.out.println("User is on Practice landing page");
        System.out.println("Data is: " + data.get(0));
        System.out.println("Data is: " + data.get(1));
        System.out.println("Data is: " + data.get(2));

    }

    @Then("Home Page is displayed")
    public void home_page_is_displayed() {
        System.out.println("Home Page is displayed");
    }

    @Then("Cards are displayed")
    public void cards_are_displayed() {
        System.out.println("Cards are displayed");
    }

    @Given("setup the entries in the database")
    public void SetupEntries() {
        System.out.println("**************************");

    }

    @When("launch the browser")
    public void LanunchBrower() {
        System.out.println("launch the browser");
    }

    @Then("hit the home page url of banking site")
    public void hitHomePage() {
        System.out.println("hit the home page url of banking site");
    }


    //Another Scenario Explanation

    @Given("User should enter these details")
    public void user_should_be_enter_these_details() {
        System.out.println("User should be enter the details");

    }

    @Then("User should be able to book the flight")
    public void user_should_be_able_to_book_the_flight(List<String>dataTable) {
        System.out.println("user enter the details: " + dataTable.get(0));
        System.out.println("user enter the details: " + dataTable.get(1));
        System.out.println("user enter the details: " + dataTable.get(2));
        System.out.println("user enter the details: " + dataTable.get(3));
        System.out.println("User should be able to book the flight"+dataTable.get(4));
        System.out.println("User should be able to book the flight"+dataTable.get(5));
        System.out.println("User should be able to book the flight"+dataTable.get(6));
    }
}
