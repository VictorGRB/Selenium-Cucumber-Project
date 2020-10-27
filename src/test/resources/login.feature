Feature: Login

  Scenario: Login with invalid credentials
    Given I open the homepage
    And I open the login page
    And i enter credentials
    When I press the login button
    Then I get an error message:"Invalid login or password."

  Scenario: Login with empty field
    Given I open the homepage
    And I open the login page
    And I enter only password credentials
    When I press the login button
    Then I get the error message "This is a required field."

  Scenario: Login with valid credentials
    Given I open the homepage
    And I open the login page
    And I enter valid credentials
    When I press the login button
    Then I am redirected to "My Dashboard" page

  Scenario: Login with valid credentials and Logout
    Given I open the homepage
    And I open the login page
    And I enter valid credentials
    And I press the login button
    When i press the logout button
    Then i receive the message "You are now logged out"