
Feature: Admin do some thing

Background:
Given User login with "admin@yopmail.com" and password is "1"

Scenario: Access Company detail
And Open company is company
Then Show me "SCORING DETAILS"

Scenario: Download screen
And Clicking on Download button
Then Open Test Download 50k 