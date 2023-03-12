Feature: TEK Retail application SignIn feature

  #1 Passed
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'tester1010@tekschool.us' and password 'Tek@12345'
    And User click on login button
    Then User should be logged in into Account

  
  Scenario Outline: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email '<email>' and password '<password>'
    And User click on login button
    Then User should be logged in into Account

    Examples: 
      | email                       | password  |
      | tester10101@tekschool.us    | Tek@12345 |
      | tester12345678@tekschool.us | Tek@12345 |
      | tester1010@tekschool.us     | Tek@12345 |

  #2 Passed
  @signinTest
  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create new Account button
    And User fill the signUp information with below data
      | name     | email | password  | confirmPassword |
      | fullName | email | Tek@12345 | Tek@12345       |
    And User click on signUp button
    Then User should be logged into account page
