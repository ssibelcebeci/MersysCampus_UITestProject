Feature: Unsuccessful login

  Scenario: Invalid
    Given Navigate website
    When input into the invalid username input field in the login form
    When enter the valid password input field in the login form
    Then click on Login button