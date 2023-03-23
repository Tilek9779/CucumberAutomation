package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.openqa.selenium.By;
import utilities.Driver;

public class Google_steps {
    @Given("I am on the google page")
     public void i_am_on_the_google_page() {

    }

    @When("I search for {string}")
    public void i_search_for(String string) {
        Driver.getDriver().findElement(By.name("q"));

    }
    @Then("I should see only {string} related result")
    public void i_should_see_only_related_result(String string) {

    }
}
