Feature: Tek Retail Order feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'tester1010@tekschool.us' and password 'Tek@12345'
    And User click on login button
    And User should be logged in into Account

  #1 Passed
  Scenario: Verify User can add an item to cart
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'

  #2 Passed
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below information
      | country | fullName | phoneNumber | streetAddress | apt | city    | state    | zipCode |
      | France  | John     |  1234567890 | Governor St   | 111 | Phoenix | Bretagne |   12345 |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 0009876543210002 | John       |               6 |           2032 |          222 |
    And User click on Add your card button
    And User click on Place Your Order
    Then a message should be displayed 'Order Placed, Thanks'

  #3 Passed
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    And User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on the item
    And User select quantity '5'
    And User click add to Cart button
    Then the cart icon quantity should change to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a message should be displayed 'Order Placed, Thanks'

  #4 Passed
  @orderTest
  Scenario: Verify User can cancel the order
    And User click on Orders section
    And User click on first order in list
    And User click on Cancel The Order button
    And User select the cancelation Reason 'Bought wrong item'
    And User click on Cancel Order button
    Then a cancelation message should be displayed 'Your Order Has Been Cancelled'
