Feature: Admins can use the system
  Scenario: Admins can create manager accounts
    Given The admin has logged in and is on the admin portal
    Then The admin sees the accounts table
    When The admin clicks on a "Make Manager" button
    Then The Admin is taken to the Tenant Account Management page
    When The Admin clicks on the Create Manager Account button
    Then The Admin gets a pop-up with the form for creating Manger accounts
    Then The Admin inputs theManger 's first and last name
    Then The Admin inputs the Manger 's email address
    Then The Admin inputs the Manger's unit number
    Then The Manager inputs a password for the tenant's account
    When The Admin clicks the Submit button
    Then The Admin gets a pop-up with a success message
    Then The Admin is taken back to the Tenant Account Management page

  Scenario: Admins can upgrade tenant accounts to be manager accounts
    Given The admin has logged in and is on the admin portal
    Then The admin sees the accounts table
    When The admin clicks on a "Promote to Manager" button
    Then A pop up asking for confirmation appears
    When The admin clicks the "Yes" button
    Then The connected account is promoted to a manager account
