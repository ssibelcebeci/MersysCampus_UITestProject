Feature: Change theme
  Background:
    Given Navigate to website
    When input into the valid username input field in the login form
    When input into the valid password input field in the login form
    Then click on LOGIN button

  Scenario: Student changes profile theme successfully
    When the student navigates to Profile > Settings
    And the student clicks on the Default Theme dropdown
    And the student selects a theme from the list
    And the student clicks on Save
    Then the success message should be displayed