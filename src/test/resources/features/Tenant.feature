Feature: Tenants can use the system
  Scenario: Tenants can read a message that has been sent to them
    Given The Tenant has logged in and is on the Messaging page
    Then A table is shown on the page with a list of recent messages
    Then Tenant can expand the Old Messages table to view older messages

  Scenario: Tenants can send a message to a manager
    Given The Tenant has logged in and is on the Messaging page
    When The Tenant clicks on the create new Message
    Then The Tenant sees a text box at the bottom of the conversation
    When The Tenant types the message they want to send
    Then The Tenant clicks the Send button and the message is sent
    Then The Tenant should see a notification stating the message was sent.