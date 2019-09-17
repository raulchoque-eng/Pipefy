Feature: Create a pipe into a user's organization.

  Background:
    Given I am logged in as "Admin" user

  @delete-pipe
  Scenario Outline: Create successfully a pipe.
    When I add a new Pipe with template "<name_template>"
    Then I should see the information Pipe
    Examples: Name of templates that exist
      | name_template        |
      | IT Service Desk      |
      | Team Task Management |
