Feature: Facebook Login Feature Number7

Background: Common Steps Number71
Given Browser is launched

Scenario Outline: Free Login Number72

Given user enters the "<username>" on login page.
When user enters "<password>" on login page.
And user clicks on the login button.
Then close the browser
Examples:
|username|password|
|acd@gmail.com|1234|
|dfde@gmail.com|567|