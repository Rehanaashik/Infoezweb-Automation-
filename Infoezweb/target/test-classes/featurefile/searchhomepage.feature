Feature:Verify search functionality in Infoez application
Scenario Outline: Verify search functionaliy with different credentialss
Given user launches the application Infoez
When user enters the business name "<business>"
And user enters the city name "<city>"
And user clicks the submited button
Then "<ExpectedResults>" should be displayed in validation

Examples:

|business|city      |ExpectedResults|
|gym     |bengaluru |Success       |
|rehhh   |theni     |Invalid search |
|        |chennai   |Empty search   |