Feature: Managers can use the system
  Scenario: Manager can create a tenant account
    Given The Manager has logged in and is on the Messaging page
    When The Manager clicks on the Tenant Account Management button
    Then The Manager is taken to the Tenant Account Management page
    When The Manager clicks on the Create Tenant Account button
    Then The Manager gets a pop-up with the form for creating tenant accounts
    Then The Manager inputs the tenant's first and last name
    Then The Manager inputs the tenant's email address
    Then The Manager inputs the tenant's unit number
    Then The Manager inputs a password for the tenant's account
    When The Manager clicks the Submit button
    Then The Manager gets a pop-up with a success message
    Then The Manager is taken back to the Tenant Account Management page

  Scenario: Manager can update if unit is available
    Given The Manager has logged in and is on the Messaging page
    When The Manager clicks on View Unit List
    Then The Manager is taken to the Unit List page
    When The Manager clicks on the unit they want to update
    Then The Manager gets a pop-up with a form for updating the unit
    Then The Manager changes the Occupation status to the desired value (Vacant or Occupied) using the drop-down
    When The Manager clicks the Save button
    Then The Manager is taken back to the Unit List page

  Scenario: Manager can read messages sent by tenants
    Given The Manager has logged in and is on the Messaging page
    When The Manager clicks on the Conversations button
    Then The Manager gets a pop-up with a list of recent conversations, grouped by the tenant that sent them and sorted chronologically
    When The Manager chooses which conversation they want to view
    Then The chat conversation appears inside of the pop-up, with past messages from the tenant

  Scenario: Send messages to tenants
    Given The Manager has logged in and is on the Messaging page
    When The Manager clicks on the Conversations button
    Then The Manager gets a pop-up with a list of recent conversations, grouped by the tenant that sent them and sorted chronologically
    Then The Manager chooses which conversation they want to view
    Then The chat conversation appears inside of the pop-up
    Then The Manager sees a text box at the bottom of the conversation
    When The Manager types the message they want to send
    Then The Manager clicks the Send button and the message is sent
    Then The Manager should see a notification stating the message was sent

  Scenario: Manager can delete tenant accounts
    Given The Manager has logged in and is on the Messaging page
    When The Manager clicks on the Tenant Account Management button
    Then The Manager is taken to the Tenant Account Management page
    When The Manager clicks on the Delete Tenant Accounts button
    When The Manager selects the account that they want to delete
    When The Manager clicks Delete
    Then A popup appears asking the Manager to confirm if they want to delete this account
    When The Manager click Ok on the Confirm Deletion popup
    Then A message pops up confirming the deletion was processed
    Then The Manager is taken back to the Tenant Account Management page

  Scenario: Manager can view a list of units and their occupation status, along with a percentage of units occupied, and be able to filter the list
    Given The Manager has logged in and is on the Messaging page
    When The Manager clicks on View Unit List
    Then The Manager is taken to the Unit List page
    Then The Manager can see the percentage of units occupied on the bottom of the page
    Then The Manager can filter the list of units