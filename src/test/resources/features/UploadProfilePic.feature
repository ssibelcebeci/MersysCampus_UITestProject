Feature: Upload or update profile picture
  Background:
    Given Navigate to website
    When input into the valid username input field in the login form
    When input into the valid password input field in the login form
    Then click on LOGIN button

  Scenario: Student uploads or updates profile picture successfully
    When the student navigates to Profile > Settings
    And the student uploads a valid image file
    And the student clicks on Save
    Then the success message should be displayed
