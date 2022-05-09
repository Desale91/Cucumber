
@AllScenario
Feature: test tags in cucumber

  @Google
  Scenario: test the google functionality
    When user test google title

  @Facebook
  Scenario: test facebook functionality
    Then user test facebook title

  @orangehrm
  Scenario: test orange functionality
    Then user test logo
