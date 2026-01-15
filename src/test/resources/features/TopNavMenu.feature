Feature: Top nav menu functioning

  Background:
    Given Navigate to website
    When input into the valid username input field in the login form
    When input into the valid password input field in the login form
    Then click on LOGIN button

  Scenario: Student makes sure top nav menu works well
    Given student can see top nav bar menu and clicks each of them and opens its related page
