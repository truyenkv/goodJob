
Feature: Admin do some thing

Background:
Given I go to login page
When I input user name is "admin@yopmail.com"
And I input password is "1"
And I click on Login button


Scenario: Access Company detail
And Open company is company
Then Show me "SCORING DETAILS"

Scenario: Download screen
And Clicking on Download button
Then Open Test Download 50k 