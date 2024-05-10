package stepDefinition;

import io.cucumber.java.en.When;

import static pages.LoginPage.*;

public class LoginPage {
    @When("User successfully enters the login details")
    public void userSuccessfullyEntersTheLoginDetails() throws InterruptedException {
        sendkeys_username();
        sendkeys_password();
        login_btn_click();
    }

    @When("User clicks on New registration button")
    public void userClicksOnNewRegistrationButton() throws InterruptedException {
        new_user_btn_click();
    }
}
