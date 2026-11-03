Feature: Verify valid login functionality in Infoez application
Scenario: Verify valid  login functionality  with different credentials

Given user launch the application url
When  user enters email "<email>"
And user enters a password "<password>"
And  user clicks the submit button
Then "<expected message>" should be displayed



Examples:
|email                 |password      |Expected message
|customer@infoez.com   |customer@123  |Success
|customer@7.com        |customer@123  |Error
|customer@infoez.com   |customer      |Error