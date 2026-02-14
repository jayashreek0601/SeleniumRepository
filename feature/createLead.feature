Feature: CreateLead Functionality of Leaftaps application
Scenario Outline: CreateLead with Different set of Data
Given Launch the browser
And Load the URL
And Enter the Username as 'DemosalesManager'
And Enter the Password as 'crmsfa'
When Click on the login button
Then It should be navigate to home page
When Click on the crmsfa link
And Click on the Leads link
And Click on the Create Lead
Given Enter the companyname as <companyname>
And Enter the firstname as <firstname>
And Enter the Lastname as <lastname>
When Click on the CreateLead button
Then Lead should be craeted
Examples:
|companyname|firstname|lastname|
|TestLeaf|Vineeth|Rajendran|
|Qeagle|Saranya|S|
|TestLeaf|Harrish|A|