Feature: Login
Scenario Outline: Login with incorrect account
Given I go to login page
When I input user name is "<username>"
And I input password is "<password>"
And I click on Login button
Then Show me message "<message>"

Examples: Login fail
| username        | password  | message |
| abc@yopamil.com | xyz1      | Unable to log in. Invalid email and/or password |
| xyz@yopmail.com | haha      | title2 |