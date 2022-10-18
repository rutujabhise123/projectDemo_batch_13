Feature: testing orangehrm site

  Scenario: testing login functionality
    Given user is on hrm site
    And user enters loginID
    And user enters password
    And user clicks on submitno
    But verify the title
