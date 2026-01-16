Feature: Filter Assignments
  Background:
    Given Navigate to website
    When input into the valid username input field in the login form
    When input into the valid password input field in the login form
    Then click on LOGIN button
    When verify home page loaded

  Scenario: Filter Assignments
    When click on ASSIGNMENTS button
    Then verify ASSIGNMENTS page
    Then filter through course options
    Then filter through view options