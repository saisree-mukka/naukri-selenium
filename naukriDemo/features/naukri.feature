Feature: Login to Naukri Website

Scenario: User registering as fresher

Given user want to access 'www.naukri.com'
When User chooses to get registered
And user chooses to register as fresher
And user enters Name
And user enters email
And user enters password
And user enters mobile number
And user enters his current Location
And user the uploads his/her resume
And user then clicks register
Then user successfully opens 'www.naukri.com' and display the success message



Scenario: User registering as professional

Given user want to access 'www.naukri.com'
When User chooses to get registered in 'www.naukri.com'
And user chooses to register as professional
And user enters his/her Name
And user enters his/her email
And user enters his/her password
And user enters his/her mobile number
And user enters his/her total work experience in years
And user enters his/her total work experience in months
And user then uploads his/her resume
And user then clicks register on professional Page
Then user successfully opens 'www.naukri.com' and display the success message of registration