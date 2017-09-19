
Feature: Update User Profile

Background:
Given User login with "admin@yopmail.com" and password is "1"


Scenario: Update Profile
And Show User Menu 
And Open User profile screen
And Update User Profile with First Name is "First name is Updated" and Last Name is "Last name is Updated"
Then Back to Home Page
