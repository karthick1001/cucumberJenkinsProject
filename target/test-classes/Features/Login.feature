@Smoke
Feature: Bank login validation
  validation for Bank valid user and invalid user.

Background: Login Steps
  Given user is on Bank login page
@Valid
Scenario: User able to login to Bank with valid credentials

  When user enters "mngr603352" and "bejUtUd"
  And user clicks on the login button
  Then user able to login to the bank successfully
@Invalid
Scenario: User unable to login to Bank with invalid credentials
  When user enters "username" and "password"
  And user clicks on the login button
  Then user unable to login to the bank


