package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.OnlineProductsPage.*;

public class OnlineProductsPage {
    @When("User clicks on Formal shoes drop down")
    public void userClicksOnFormalShoesDropDown() {
        formal_shoes_dropdown_click();
    }

    @Then("User should be able to view the Products")
    public void userShouldBeAbleToViewTheProducts() {
        formal_shoes_first_text();
    }
}
