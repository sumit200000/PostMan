Feature: Login page Automation of saucedemo App
  

  Scenario: Check login is successful with valid creds
    Given User is on login page

    When User enters valid username and password
    And Clicks on Login Button
    Then User is navigated to Hpme Page
    And Close the browser
    
    @tag2
  Scenario Outline: Check login is successful with valid creds
    Given user is on login page
    When user enters valid "<username>" and "<password>"
    And Click on login Button
    Then User is navigated to Home Page
    And close the browser
    
    Examples:
    | username | password |
    | locked_out_user | secret_sauce |
    | problem_user |  secret_sauce |
    | standard_user |  secret_sauce |
    |performance_glitch_user|  secret_sauce |