Feature: Login test

  Background:
    Given setup the entries in the database
    When launch the browser
    And hit the home page url of banking site

  @SmokeTest
  Scenario Outline: Admin Page Default Login
    Given User is on login page
    When User enters "<username>" and "<password>"
    Then User is navigated to the home page

    Examples:
      | username | password |
      | masum    | pass1    |
      | raza     | pass2    |
      | delhi    | pass3    |

  @RegressionTest
  Scenario: User Page Default Sign up
    Given User is on Practice landing page
      | Masum          |
      | raza@gmail.com |
      | 1234567890     |
    Then Home Page is displayed
    And Cards are displayed

  @Test
  Scenario Outline: User Login page with different data
    Given User is on login page
    When User enters "<username>" and "<password>"
    Then User is navigated to the home page

    Examples:
      | username | password   |
      | masum    | passmasum1 |
      | raza     | passraza2  |
      | delhi    | passdelhi3 |