Feature: Account Information
  Scenario: Change Account Information
    Given I open the homepage
    And I open the login page
    And I enter valid credentials
    And I press the login button
    And I access account information
    And I fill in the middle name field with new information and password field
    When I press the Save button
    Then i get the message "The account information has been saved."
