@signin
Feature: slack signin
  User Wants to sign in slack account

  Scenario Outline: sign in slack account
    Given user is already in singin page
    When user wants to type <email> and <password> and click sign in button in order to sign in
    Then user wants to verify <userName> to validate correct sign in test

    Examples: 
      | email                    | password     | status  |
      | "sharmasani01@gmail.com" | "Ajitsani2!" | success |
