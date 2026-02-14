Feature: Login function of leaftaps application
Scenario: Login with valid credentials
Given Launch the browser
And Load the URL
And Enter the Username as 'DemosalesManager'
And Enter the Password as 'crmsfa'
When Click on the login button
Then It should be navigate to home page

Scenario: Login with Invalid credentials
Given Launch the browser
And Load the URL
And Enter the Username as 'Demosales'
And Enter the Password as 'crm'
When Click on the login button
But It throws error Message