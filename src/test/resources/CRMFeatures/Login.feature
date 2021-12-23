Feature: CRM Login Feature


#to comment give ctrl+/

#Scenario: Valid login
#Given  User is in Login Page
#When User enters Login Credentials
#Then User is on Home Page



#Scenario: Valid login
#Given  User is in Login Page
#When User enters  "tomsmith" and "SuperSecretPassword!" 
#Then User is on Home Page


#Scenario Outline: Valid login
#Given  User is in Login Page
#When User enters  "<username>" and "<password>" 
#Then User is on Home Page
#
#Examples:
#	| username | password |
#	| testuser1 | password1 |
#	| testuser2 | password2 |
#	| tomsmith | SuperSecretPassword! |


##parameter from step and using list in stepdef
#
#Scenario: Valid login
#Given  User is in Login Page
#When User enters Login Credentials
#		| tomsmith | SuperSecretPassword! |
#Then User is on Home Page


##parameter from step and using map with headers in steps
Scenario: Valid login
Given  User is in Login Page
When User enters Login Credentials
		| username | password |
		| tomsmith | SuperSecretPassword! |
Then User is on Home Page
	
	

#Scenario: create a contact
#Given  User is on Login Page
#And User Loggedin
#
#And User navigates to contact page
#When User Enters contact details
#		firstname, lastname....