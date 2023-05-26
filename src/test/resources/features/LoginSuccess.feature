Feature: Login

  @success
  Scenario: Login Success
    Given user navigate to "login" page
    When user enters credentials
    Then user is able to login successfully

  @Invalid
  Scenario Outline: Login Failure
    Given user navigate to "login" page
    When user enters "<userName>" and "<password>"
    Then user is unable to login successfully

    Examples:
      | userName        | password             |
      | invalidUsername | invalidPassword      |
      | invalidUsername | SuperSecretPassword! |
      | tomsmith        | invalidPassword      |
      | empty           | empty                |
      | empty           | SuperSecretPassword! |
      | tomsmith        | empty                |


