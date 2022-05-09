Feature: Test Orange HRM Functionality

  Scenario: test Login functionality
    Given user is on login page
    When user enter valid username and valid password
    Then user is on home page

  Scenario: test Home page Functionality
    Then validate user on home page by using title
    And validate user on home page by using Url
    And validate user on home page by using logo

  Scenario: test PIM Page functionality
    Given user is on pim page and click on add  button
    When create a new employee
    Then fillup more personal details
    And search user by using employee id
    Then delete newly created user
