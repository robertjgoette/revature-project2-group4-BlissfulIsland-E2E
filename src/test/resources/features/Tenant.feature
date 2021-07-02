Feature: Tenants can use the system
  Scenario: Tenants can read a message that has been sent to them
    Given The Tenant has logged in and is on the Messaging page
    When A table is shown on the page with a list of recent messages
    Then Tenant can expand the Old Messages table to view older messages

  Scenario: Tenants can send a message to a manager
    Given The Tenant has logged in and is on the Messaging page
    When The Tenant clicks on the Send Message button
    Then The Tenant sees a pop-up box where they can send their message
    When The Tenant types in their message
    Then The Tenant selects which type of issue this is
    Then The Tenant clicks the Send button
    Then The pop-up disappears and the Tenant is back on the Messaging page