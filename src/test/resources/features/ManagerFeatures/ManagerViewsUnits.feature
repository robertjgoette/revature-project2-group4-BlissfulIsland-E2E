Feature: The Manager can view the units
  Background: The Manager is on the unit page
    Given The Manager has logged in and is on the Messaging page
    When The Manager clicks on View Unit List
    Then The Manager should be taken to the Unit List page

  Scenario: The Manager views Type 2 Unit information
    Given The manager is on the Unit List page
    When The manager clicks on the plus sign of Type 2 apartments
    Then The manager should see the list of Type 2 apartments
    When The manager clicks on the plus sign of Type 2 apartments
    Then The list of Type 2 apartments should be hidden

  Scenario: The Manager views Type 3 Unit information
    Given The manager is on the Unit List page
    When The manager clicks on the plus sign of Type 3 apartments
    Then The manager should see the list of Type 3 apartments
    When The manager clicks on the plus sign of Type 3 apartments
    Then The list of Type 3 apartments should be hidden