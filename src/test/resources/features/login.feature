Feature: Log into the Pipefy page.

  Scenario: Admin has successfully logged into Pipefy page
    Given user is in Pipefy page
    When the user goes to the "Login" page
      And the user logs in as "admin" user
    Then the user should see his organization page
