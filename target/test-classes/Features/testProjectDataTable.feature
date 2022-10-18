Feature: testing testProject site

  Scenario: testing loginpage
    Given user is on login
    When user enters credentials
      | Rutuja | 12345 |
    Then user clicks on login button
    And user provides personal info
      | address | Latur          |
      | email   | rutu@gmail.com |
      | phone   |     7028575751 |
