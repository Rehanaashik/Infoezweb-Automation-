Feature:Send Enquiry for petal&loom bakery
Scenario Outline:Verify send enquiry functionality for petal&loom bakery
Given user launches the application url infoez
When user navigates to the business details page
And user clicks the send enquiry button
And user enters the names "<names>"
And user enters the emails "<emails>"
And user enters the phones "<phones>"
And user enters the send enquiry messages "<messages>"
And user clicks the submiting button
Then "<Expectednotification>"should be displayed

Examples:
|names |emails        |phones     |messages    |Expectednotification                  |
|veena |veena@123.com|9807654321|need details|enquiry sent message                  |
|reena|             |          |need details|validation message                    |
|meena|meena@987.com |9087686541|need details|user should be redirected to loginpage|