Feature: Login test

  @SmokeTest
  Scenario Outline: User Login page
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