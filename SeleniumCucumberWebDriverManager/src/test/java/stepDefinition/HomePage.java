package stepDefinition;

import io.cucumber.java.en.Given;

import static pages.HomePage.*;

public class HomePage {

    @Given("^User navigates to the login page$")
    public void user_navigates_to_the_login_page() throws InterruptedException {
        click_hamburger_menu();
        click_signIn_link();

    }

    @Given("User navigates to the online product page")
    public void userNavigatesToTheOnlineProductPage() throws InterruptedException {
        click_hamburger_menu();
        click_online_products();
    }
}
