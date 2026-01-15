Feature: Logged In

  Background:
    Given Navigate to website
    When input into the valid username input field in the login form
    When input into the valid password input field in the login form
    Then click on LOGIN button

  Scenario: User can login as a student
    Given the student is on the loggedIn page
    When the company logo should be displayed
    Then the student clicks the logo
    And the student on the techno.study page
