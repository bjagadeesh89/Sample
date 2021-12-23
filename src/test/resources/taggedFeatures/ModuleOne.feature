@PhaseOne
Feature: CRM Contact & Deal Feature

Background: UserLogin
Given User is loggedIn


@RegressionTest
Scenario: Create Contact
When User create a new contact

@SmokeTest
Scenario: View Contact
When User view contact details

@RegressionTest
Scenario: Update Contact
When User update a contact details

Scenario: Create Deal
When User create a new Deal

@RegressionTest
Scenario: View Deal
When User view Deal details


Scenario: Update Deal
When User update a Deal details

Scenario: User Logout
Then User Logout from App