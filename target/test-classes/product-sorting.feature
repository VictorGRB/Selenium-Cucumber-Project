Feature: Products sorting

  Scenario: Sort products by price
    Given I open the homepage
    And I search products by "new arrivals"
    When I select the option "Price" in the Sort By list
    And I sort the products in descending direction
    Then the products are ordered by price in descending order