Feature: Admins can use the system
  Scenario: Admins can create manager accounts
    Given The Admin has logged in and is on the admin portal
    When The Admin clicks on the Account Maker button
    Then The Admin should be taken to the Create Account page
    When The Admin inputs the manager's first into the First Name field
    When The Admin inputs the manager's last name into the Last Name field
    When The Admin inputs the manager's email address into the Email field
    When The Admin inputs the password for the manager's account into the Password field
    When The Admin inputs the manager's account number into the Account Type field
    When The Admin selects the manager's unit number from Unit ID dropdown menu
    When The Admin clicks on the Submit button
    Then The Admin should get a pop-up with a success message
    Then The Admin should be taken back to the admin portal

  Scenario: Admins can upgrade tenant accounts to be manager accounts
    Given The Admin has logged in and is on the admin portal
    When The Admin clicks on the Tenant List plus sign
    Then The Admin should see the accounts table
    When The Admin clicks on the Make Manager button
    Then A pop up asking for confirmation appears
    When The Admin clicks on the pop up Make Manager button
    Then The connected account should be promoted to a manager account
