
Feature: Login successful

Scenario Outline: Login successful
Given I go to login page
When I input user name is "<username>"
And I input password is "<password>"
And I click on Login button
Then Show me message Title "Authorized Companies"

Examples: account list

| username | password  |
| admin@yopmail.com | 1 |