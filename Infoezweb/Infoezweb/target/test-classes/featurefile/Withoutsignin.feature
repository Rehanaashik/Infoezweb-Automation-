Feature:verify save,claim and review functionality without sign in
Scenario Outline:verify save,claim and review functionality without signin in infoez
Given user going to launch the app url
When user navigating to the particular business details page
And user clicks the "<option>" button in a business
Then user should be "<redirected>" to the sign in page
 
 Examples:
|option|redirected|
|save|validationmsg|
|claim|sign in|
|review|sign in|