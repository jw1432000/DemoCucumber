Feature: Facebook Login Feature Number4

Background: Common Login Steps Number41
Given Browser Is launched and url entered is "https://www.facebook.com"


Scenario: Free Login Number42

Given user enters the username "David" on login page.
When user enters the password "Hello" on login page.
And user clicks on the login button.
Then close the browser

Scenario: FB Sign up Number43

Given user enters the username "Bravo" on login page.
When user enters the password "Bufalo" on login page.
Given user enters the last name "Last" on login page.
And user clicks on the sign up button.
Then close the browser