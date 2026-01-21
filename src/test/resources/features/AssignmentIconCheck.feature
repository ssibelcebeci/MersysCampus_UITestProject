Feature: Assignment list icon behaviors

  Background:
    Given Navigate to website
    When input into the valid username input field in the login form
    When input into the valid password input field in the login form
    Then click on LOGIN button

    When Mouse hover over assignment button
    Then Click on Assignments Button
    Then Click Due date
    Then Select last year
    Then click on search button
    Then In progress text appears

  Scenario: The student must ensure that the icons on the right side of the assignment function correctly.
    When the student selects a random assignment information icon
    Then the student selects a random assignment submit icon
    Then the student selects a random assigment mark icon
    Then the student selects a random assignment
    Then the student should be redirected to the assignment details page