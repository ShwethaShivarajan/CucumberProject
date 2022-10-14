Feature: This feature would be creating a calculator for Add and Subtract

  @Sanity
  Scenario: To Add two numbers
    Given I have a calculator
    When I add 5 and 4
    Then I should get the result as 9

  @Sanity
  Scenario Outline: To Add two numbers
    Given I have a calculator
    When I add <num1> and <num2>
    Then I should get the result as <Result>

    Examples: 
      | num1 | num2 | Result |
      |    3 |    2 |      5 |
      |   20 |   15 |     35 |
      |   45 |   05 |     50 |

  @Sanity
  Scenario: To Add two numbers
    Given I have a calculator
    When I add below numbers
      |  2 |
      |  5 |
      | 10 |
      | 05 |
      | 20 |
    Then I should get the result as 42
