Feature:Verify registration functionality in Infoez application
Scenario:verify registration functionality with different credentials
Given user launch the application
When user selects the customer
And user enters a name "<name>"
And user enters the email "<email>"
And user enters the phone no"<phone>"
And user enters the password"<password>"
And user clicks the submit button
Then "<ExpectedResult>" should be displayed after registration

Examples:
|name   |email           |phone     |password|ExpectedResult|
|ajay   |ajay129@infoez.com |987654321 |1234567 |success         |
|karthik|karthik097       |567       |9876543 |Invalid email   |
|vikram  |vikram950@infoez.com|1        |12      |Invalid password|