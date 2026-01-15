Feature: Attendance Excuse
  Background:
    Given Navigate to website
    When input into the valid username input field in the login form
    When input into the valid password input field in the login form
    Then click on LOGIN button

  Scenario: Student can submit an attendance excuse
    Given the student is on the attendance excuse page
    When the student enters a valid excuse message and adds a file
    And the student clicks Send
    Then an informational message should be displayed