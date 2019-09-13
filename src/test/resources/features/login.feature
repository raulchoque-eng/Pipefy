Feature: Login in the Pipefy platform.

  Scenario: Log in successfully on Pipefy page
    Given user goes to the "Pypefy" page
      And user goes to the "Login" page
    When user puts his credential as "admin" user
    Then user should be in his "Organization" page
    When user goes to the "user setting" page
    Then user should watches his information
