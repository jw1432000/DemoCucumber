Feature: Facebook login  Number5

Background: Common Login Steps Number51
Given Browser launched and url entered is "https://www.facebook.com"

Scenario Outline: Validate user is able to enter details. Number52

Given user has entered "<FirstName>" in first name
And user has entered "<LastName>" in last name
And user has entered "<Mobile>" in mobile field
Then browser is closed
Examples:
|FirstName|LastName|Mobile|
|David		|Storm	 |1234	|
|Ryan			|Road		 |123456|
|Cool			|Broad	 |1234	|