Feature: Web Login

Background:
Given Chrome browser is installed
When User launches the chrome browser
Then verify the chrome browser in opened

@RegTest
Scenario: Login from Home page
Given User is on Home Page
When User login into the application with username "Test1" and password "Test@123"
Then User navigated to Dashboard page
And Returns displayed are "true"

@SanityTest
Scenario: Login from Home page
Given User is on Home Page
When User login into the application with username "Test2" and password "Test@1234"
Then User navigated to Dashboard page
And Returns displayed are "false"


@PortalTest @SmokeTest
Scenario: Login from SignUp page
Given User is on SignUp Page
When User sign up with following details
| jenny | abcd | john@abcd.com |Australia | 3242353|
Then SignUp landing page is filled
And Returns displayed are "false"

@SmokeTest
Scenario Outline: Multiple Login from Home page
Given User is on Home Page
When User login in to application with <Username> and password <password>
Then User navigated to Dashboard page
And Returns displayed are "true"

Examples:
|Username |password|
|user1    |pass1   |
|user2    |pass2   |
|user3    |pass3   |
|user4    |pass4   |








