Feature: View courses & status
  Background:
    Given Navigate to website
    When input into the valid username input field in the login form
    When input into the valid password input field in the login form
    Then click on LOGIN button

    Scenario: View courses & status on Calendar
      When verify home page loaded
      When click on CALENDAR button
      Then verify today date
      Then verify course statuses
      Then cycle through calendar filters
      Then click forwards button
      Then click backwards button
      Then click today button
      Then verify course displayed
      Then click on course on calendar