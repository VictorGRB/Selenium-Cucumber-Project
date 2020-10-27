Feature: Newsletter
  Scenario: Newsletter Subscription
    Given I open the homepage
    And I fill in the newsletter field
    When I press the Subscribe button
    Then I receive the following message: "Thank you for your subscription."

  Scenario: Unsubscribe from newsletter
    Given I open the homepage
    And I open the login page
    And I enter valid credentials
    And I press the login button
    And I access the newsletter information
    When I uncheck the newsletter box
    And I press the save information button
    Then I get the following message "The subscription has been removed."
