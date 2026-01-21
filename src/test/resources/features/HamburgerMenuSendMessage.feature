Feature: Send Message function under hamburgerMenu

  Background:
    Given Navigate to website
    When input into the valid username input field in the login form
    When input into the valid password input field in the login form
    Then click on LOGIN button
    When the student clicks on hamburgerMenu
    And the student hovers over messaging button
    Then the student can hover over and click send message button

  Scenario: Student can send a new message and see the sent messages
    Given the student see the text editor
    When the student can see receivers text box and click on it
    And the student clicks on add receivers icon and add name in the text box
    Then the student types subject in the subject box
    And the student types text in the text editor
    And the student can attach files from local
    And the student can attach files from my files
    And the student can attach files from Google Drive
    And the student sends the message and receives success message
    When the student clicks on hamburgerMenu,hovers over messaging button and hovers over outbox link and clicks
    Then The student can see the sent messages as a list



