Feature: Assignments Click
  Background:
    Given Navigate to website
    When input into the valid username input field in the login form
    When input into the valid password input field in the login form
    Then click on LOGIN button

    Scenario: Student clicks the assignments button
      When Mouse hover over assignment button
      Then Click on Assignments Button
      Then Click Due date
      Then Select last year
      Then click on search button
      Then In progress text appears