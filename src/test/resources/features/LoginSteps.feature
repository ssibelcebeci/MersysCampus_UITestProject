Feature: Successful login
  Scenario: Valid
    Given Navigate to website
    When input into the valid username input field in the login form
    When input into the valid password input field in the login form
    Then click on LOGIN button
