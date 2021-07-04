Feature: Manager can see recent messages
  Background: Manager can read messages sent by tenants
    Given The Manager has logged in and is on the Messaging page
    Then The manager should see a list of recent messages

  Scenario: The Manager can view past messages
    When The manager clicks on the plus sign
    Then The manager should see a list of past messages

  Scenario: The Manager can respond to a message
    When The manager clicks on the respond button of a message
    Then The manager should see a message popup
    When The manager enters message into message input
    When The manager clicks the submit message button
    Then The submit message button should be disabled
    Then The popup should close
    Then The new message should be displayed at the top of recent messages

  Scenario: The Manager decides not to respond to a message after all
    When The manager clicks on the respond button of a message
    Then The manager should see a message popup
    When The manager clicks on popup close button
    Then The popup should close
    Then The manager should see a list of recent messages
    When The manager clicks on the plus sign
    Then The manager should see a list of past messages

