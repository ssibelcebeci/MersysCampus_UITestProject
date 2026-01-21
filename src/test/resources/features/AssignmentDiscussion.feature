Feature: Start Discussion from Assignments Page
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

  Scenario: Student should see and click the discussion button on assignment details page
    And the student clicks the discussion icon
    Then the student should see the chats section
    And the student should be able to click the chats icon
    Then the student should see the contacts section
    And the student should be able to select a contact
    Then the student should be able to select random list
    And the student attaches a file
    And the student writes and sends a message
    Then the student should able to send button
    And the message date and time should be displayed