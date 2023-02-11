
Feature: veryfy log in cradential
Scenario: as a user should be log in  using valid crdential
Given open browser 
And go to facebook.com
When user type valid userID  in username text box 
And user type valid password  in password text box 
And user click on log in button 
Then user should see his profilePage 

Scenario Outline: as a user should not be log in  using invalid crdential
Given open browser 
And go to facebook.com
When user type "<invalidUserID>"  in username text box 
And user type "<invalidPassword>"  in password text box 
And user click on log in button 
Then user should not see his profilePage 

Examples: 
|invalidUserID|invalidPassword|
|user1|p1234|
|user2|p1254|


