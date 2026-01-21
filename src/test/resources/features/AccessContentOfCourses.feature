Feature: Access Content
  Background:
    Given Navigate to website
    When input into the valid username input field in the login form
    When input into the valid password input field in the login form
    Then click on LOGIN button
    When verify home page loaded
    Then click on CALENDAR button
    Then verify course displayed

    Scenario: Access Content of Courses
      When click on back button
      Then click on course on calendar
      Then click on recording button
      Then click on play button