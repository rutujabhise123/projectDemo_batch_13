Feature: testing testProject site

  Scenario: testing loginpage
    Given user is on loginpage
    When user enters username
    And user enters passwd
    And user clicks on login
    And user enters address
    And user enters email
    And user enters phone
    Then login is successful