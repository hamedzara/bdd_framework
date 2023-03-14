  @capstoneTest
Feature: TEK Retail Account feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'tester1010@tekschool.us' and password 'Tek@12345'
    And User click on login button
    And User should be logged in into Account

  #1 Passed
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'fullName' and Phone 'phoneNumber'
    And User click on Update button
    Then user profile information should be updated

  #2 Passed
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | tEk@12345        | Tek@12345   | Tek@12345       |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’

  #3 Passed
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | cardNumber | nameOnCard |               6 |           2025 | securityCode |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  #4 Passed
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | cardNumber | nameOnCard |               5 |           2030 | securityCode |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  #5 Passed
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  #6 Passed
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city | state      | zipCode |
      | United States | fullName | phoneNumber | address       | A15 | city | California | zipcode |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  #7 Passed
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city | state      | zipCode |
      | United States | fullName | phoneNumber | address       |  15 | city | California | zipcode |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

  #8 Passed
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
