Feature: Tenants can use the system
  Scenario: Tenants can read a message that has been sent to them
    Given The Tenant has logged in and is on the Message page
    When The Tenant clicks on the Conversations button
    Then The Tenant gets a pop-up with a list of recent conversation, grouped by the tenant that sent them and sorted chronologically
    Then The Tenant chooses which conversation they want to view
    Then The chat conversation appears inside of the pop-up, with past messages from the manager
  Scenario: Tenants can send a message to a manager
    Given The Tenant has logged in and is on the Messaging page
    When The Tenant clicks on the create new Message
    Then The Tenant sees a text box at the bottom of the conversation
    When The Tenant types the message they want to send
    Then The Tenant clicks the Send button and the message is sent
    Then The Tenant should see a notification stating the message was sent.