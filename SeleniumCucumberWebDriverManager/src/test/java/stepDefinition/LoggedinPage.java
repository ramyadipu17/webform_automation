package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.LoggedinPage.*;
import static pages.LoginPage.*;

public class LoggedinPage {
    @Then("User should be able to view the product category page")
    public void usershouldbeabletoviewtheproductcategorypage() throws InterruptedException {
        visibility_of_cat_formal_shoes();
        visibility_of_cat_sports_shoes();
        visibility_of_cat_sneakers_shoes();

    }
}
