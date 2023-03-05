Feature: This feature is used for testing UI of Retail page

  Scenario: Verify user can search a product
    Given User is on retail webpage
    When User search for "pokemon" product
    Then The product should be displayed

  #1
  Scenario: Verify Shop by Department sidebar
    Given User is on retail website
    When User click on All section
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @homeTest
  Scenario Outline: Verify department sidebar options
    Given User is on retail website
    When User click on All section
    And User on <department>
    Then below options are present in department
      | <optionOne> | <optionTwo> |
