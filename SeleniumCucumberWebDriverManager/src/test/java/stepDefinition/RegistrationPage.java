package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import static pages.RegistrationPage.*;


public class RegistrationPage {
    @Then("User should be able to view the Registration page")
    public void userShouldBeAbleToViewTheRegistrationPage() {
        visibility_of_registration_page();
    }

    @Given("User enters the details in form")
    public void userEntersTheDetailsInForm() throws InterruptedException, IOException {
        enter_salutation();
        enter_firstname();
        enter_lastname();
        enter_email();
        enter_contact();
        enter_username();
        enter_password();
        takeScreenshot(driver,"form_filled");
    }

    @When("User clicks submit button")
    public void userClicksSubmitButton() throws IOException {
        click_submit_btn();
        takeScreenshot(driver,"form_submitted");
    }

    @Then("User should be able to view the successful message")
    public void userShouldBeAbleToViewTheSuccessfulMessage() {
        visibility_of_success_msg();
    }

    @And("User should navigate to capcha validation")
    public void userShouldNavigateToCapchaValidation() throws InterruptedException, IOException {
        navigateCaptcha();
        captchaSubmit();
        takeScreenshot(driver,"form_submitted");
    }

    @Given("User does not enter any value")
    public void userDoesNotEnterAnyValue() {
        
    }

    @Then("Error message must be shown")
    public void errorMessageMustBeShown() throws IOException {
        visibility_of_error_msg();
        takeScreenshot(driver,"form_submitted");
    }
}
