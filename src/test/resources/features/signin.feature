Feature: TEK Retail application SignIn feature

  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'tester12345678@tekschool.us' and password 'A12345678z@'
    And User click on login button
    Then User should be logged in into Account

  @signinTest
  Scenario Outline: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email '<email>' and password '<password>'
    And User click on login button
    Then User should be logged in into Account

    Examples: 
      | email                       | password    |
      | transformers@tekschool.us   | Tek@12345   |
      | tester12345678@tekschool.us | A12345678z@ |
      | phantom.test@gmail.com      | Tek@12345   |

  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create new Account button
    And User fill the signUp information with below data
      | name  | email                 | password  | confirmPassword |
      | hamed | tester1010@tekschool.us | Tek@12345 | Tek@12345       |
    And User click on signUp button
    Then User should be logged into account page
