Feature:Business claim verification
Scenario Outline:verify claim functionality with different conditions


Given user launches the application infoez url
When user login status is login "<login>"
And user navigates to the business details entered page
And user clicks the claim button
And user enters reason "<reason>"
And user enters the proof url "<proof>"
And user clicks on submit claim button
Then "<expectedconditions>" should be displaying

Examples:
| login | reason         | proof           | expectedconditions  |
| yes   | Business owner | https://abc.com | claimalready pending|
| No    | Business owner | https://abc.com | please signin first |
| yes   | Business owner |                 | claim should not submit |
