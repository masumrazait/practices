Feature: Login test
  Scenario Outline: User Login page
    Given User is on login page
    When User enters "<username>" and "<password>"
    Then User is navigated to the home page

    Examples:
      | username | password |
      | masum    | pass1    |
      | raza     | pass2    |
      | delhi    | pass3    |