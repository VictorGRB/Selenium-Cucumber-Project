Feature: Register user

  Scenario: Successful register with all details
    Given I open the homepage
    And I go to the Register page
    And I fill in all mandatory fields with valid data on the Register page
    And I check the newsletter checkbox on the Register page
    When I press the Register button
    Then I receive the following confirmation message: "Thank you for registering with Madison Island."

  Scenario: Successful register with mandatory details only
    Given I open the homepage
    And I go to the Register page
    And I fill in all mandatory fields with valid data on the Register page
    And I set the value "" in the "Middle Name" field on the Register page
    When I press the Register button
    Then I receive the following confirmation message: "Thank you for registering with Madison Island."

  Scenario Outline: Unsuccessful register with blank mandatory field
    Given I open the homepage
    And I go to the Register page
    And I fill in all mandatory fields with valid data on the Register page
    And I set the value "<Value>" in the "<Field Name>" field on the Register page
    When I press the Register button
    Then I receive the following message under the "<Field Name>" field on the Register page: "This is a required field."

    Examples:
      | Value | Field Name   |
      | ""    | First Name   |
      | ""    | Last Name    |
      | ""    | Email        |
      | ""    | Password     |
      | ""    | Confirmation |


  Scenario: Unsuccessful register with invalid email address
    Given I open the homepage
    And I go to the Register page
    And I fill in all mandatory fields with valid data on the Register page
    And I set the value "nomail@here" in the "Email" field on the Register page
    When I press the Register button
    Then I receive the following message under the email field on the Register page: "Please enter a valid email address. For example johndoe@domain.com."

  Scenario: Unsuccessful register with invalid password confirmation
    Given I open the homepage
    And I go to the Register page
    And I fill in all mandatory fields with valid data on the Register page
    And I set the value "anotherpass" in the "Confirmation" field on the Register page
    When I press the Register button
    Then I receive the following message under the password confirmation field on the Register page: "Please make sure your passwords match."

  Scenario: Unsuccessful register with too short password
    Given I open the homepage
    And I go to the Register page
    And I fill in all mandatory fields with valid data on the Register page
    And I set the value "123" in the "Password" field on the Register page
    When I press the Register button
    Then I receive the following message under the password field on the Register page: "Please enter 6 or more characters without leading or trailing spaces."