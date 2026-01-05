Feature: Download finance report
  Background:
    Given Navigate to website
    When input into the valid username input field in the login form
    When input into the valid password input field in the login form
    Then click on LOGIN button

  Scenario: Student downloads finance report as Excel or PDF
    When the student navigates to Hamburger Menu > Finance > My Finance
    When the student selects Excel report format
    Then the "xlsx" file should be downloaded to the local drive
    When the student selects PDF report format
    Then the file should be opened in a new tab
