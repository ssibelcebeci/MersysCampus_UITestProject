Feature: Assignment Submission
  Background:
    Given Navigate to website
    When input into the valid username input field in the login form
    When input into the valid password input field in the login form
    Then click on LOGIN button

    Scenario: Submit Assignments
      When click on ASSIGNMENTS button
      Then verify ASSIGNMENTS page
      When click on SUBMIT button
      Then input text on text editor
      When click SAVE AS DRAFT button
      Then again click on SUBMIT button
      When click on YES button
      When click on course name
      Then verify directed to course details
      When click on ATTEMPTS button
      Then verify submitted work
      When click on NEW SUBMISSION button
      Then verify text editor