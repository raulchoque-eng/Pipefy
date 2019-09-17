Feature: Log into the Pipefy page.

  Scenario Outline: : Admin has successfully logged into Pipefy page
    Given user is in Pipefy page
    When the user goes to the "Login" page
      And the user logs in as "<userType>" user
    Then the user should see his organization page
    Examples: type of users.
      | userType |
      | Admin    |
      | Invited  |
