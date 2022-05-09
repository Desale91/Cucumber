Feature: Sample Test functionality

  Scenario: test google functionality
    Given user google page
    When user click on gmail link
    Then user will be on gmail login page

  Scenario: test free crm application
    Given user is on a free crm login page
    When user enter uname and password
    Then user is on free crm home page