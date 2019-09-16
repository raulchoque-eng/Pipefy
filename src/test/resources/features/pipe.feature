Feature: Create a pipe into a user's organization.

  Background:
    Given I am logged in as "Admin" user

  Scenario: Create successfully a pipe.
    When I add a new Pipe with template "IT Service Desk"
    Then I should see the information Pipe
