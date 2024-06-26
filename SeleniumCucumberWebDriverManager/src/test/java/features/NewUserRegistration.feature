Feature: New User Registration View

  Scenario: Validate new user is able to view page after clicking on new registration
    Given User navigates to the login page
    When User clicks on New registration button
    Then User should be able to view the Registration page

  Scenario: Validate error message is shown when first name is given as empty
    Given User does not enter any value
    When User clicks submit button
    Then Error message must be shown

  Scenario: Validate new user is able to be registered in the registration page
    Given User enters the details in form
    When User clicks submit button
    Then User should be able to view the successful message
    And User should navigate to capcha validation