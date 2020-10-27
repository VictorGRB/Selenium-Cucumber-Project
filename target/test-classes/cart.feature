Feature: Cart

  Scenario: Add simple product to cart
    Given I open the homepage
    And I search products by "vase"
    When I add to cart the product "Herald Glass Vase"
    Then the product "Herald Glass Vase" is successfully added to the cart

  Scenario: Add product with specific size and color to cart
    Given I open the homepage
    And I open the sub-category "New Arrivals" from the "WOMEN" category
    And I press the first View Details button
    And I store the name of the product
    And I select the color Red
    And I select the size M
    When I press the Add to Cart button
    Then the product is added to the cart
    And the color of the product in cart is "Red"
    And the size of the product in cart is "M"

  Scenario: Update product quantity from cart page
    Given I open the homepage
    And I add a product to cart
    And I store the product subtotal displayed in cart
    And I set the value of the quantity field to 3
    When I press the Update quantity button in cart
    Then the initial product subtotal in cart is multiplied by 3

  Scenario: Remove the single product present in cart
    Given I open the homepage
    And I add a product to cart
    When I press the Remove product button from the cart page
    Then I am redirected to a page with title "SHOPPING CART IS EMPTY"

  Scenario: Empty cart from cart footer
    Given I open the homepage
    And I add a product to cart
    When I press the Empty Cart button from the cart page
    Then I am redirected to a page with title "SHOPPING CART IS EMPTY"