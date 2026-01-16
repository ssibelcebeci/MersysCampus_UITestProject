Feature: Invalid access
  Background:
    Given Navigate to website
    When input into the valid username input field in the login form
    When input into the valid password input field in the login form
    Then click on LOGIN button
    When verify home page loaded
    When click on CALENDAR button
    Then verify course displayed
    When click on course on calendar

    Scenario: Invalid access on courses
      Then verify pop up and error message