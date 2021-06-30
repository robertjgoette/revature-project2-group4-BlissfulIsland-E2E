Feature: Admins can use the system
  Scenario: Admins can create manager accounts
    Given The Admin has logged in and is on the admin portal
    Then The Admin sees the accounts table
    When The Admin clicks on the Make Manager button
    Then The Admin is taken to the Tenant Account Management page
    When The Admin clicks on the Create Manager Account button
    Then The Admin gets a pop-up with the form for creating manager accounts
    Then The Admin inputs the manager's first and last name
    Then The Admin inputs the manager's email address
    Then The Admin inputs the manager's unit number
    Then The Manager inputs a password for the tenant's account
    When The Admin clicks the Submit button
    Then The Admin gets a pop-up with a success message
    Then The Admin is taken back to the Tenant Account Management page

  Scenario: Admins can upgrade tenant accounts to be manager accounts
    Given The Admin has logged in and is on the admin portal
    Then The Admin sees the accounts table
    When The Admin clicks on the Promote to Manager button
    Then A pop up asking for confirmation appears
    When The Admin clicks the Yes button
    Then The connected account is promoted to a manager account
