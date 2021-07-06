Feature: Manager can create a tenant account
  Scenario: Manager creates a new tenant account
    Given The Manager has logged in and is on the Messaging page
    When The Manager clicks on the Account Maker button
    Then The Manager should be redirected to the Create Account Page
    When The Manager inputs the tenant's first name
    When The Manager inputs the tenant's last name
    When The Manager inputs the tenant's email address
    When The Manager inputs the tenant's password
    When The Manager inputs the tenant's unit number
    When The Manager clicks the Submit button
    Then The Submit button should be disabled
    Then The Manager should see a success message
    Then The Submit button should be enabled
    Then The success message should disappear
