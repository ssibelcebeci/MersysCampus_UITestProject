Feature: Messaging functions under hamburgerMenu

  Background:
    Given Navigate to website
    When input into the valid username input field in the login form
    When input into the valid password input field in the login form
    Then click on LOGIN button

  Scenario: Student can access messaging and its related functions
    When the student clicks on hamburgerMenu
    And the student hovers over messaging button
    Then the student can hover over and click send message button
    And the student clicks on hamburgerMenu,hovers over messaging button and hovers over inbox button and clicks
    Then the student clicks on hamburgerMenu,hovers over messaging button and hovers over outbox button and clicks
    And the student clicks on hamburgerMenu,hovers over messaging button and hovers over trash button and clicks
