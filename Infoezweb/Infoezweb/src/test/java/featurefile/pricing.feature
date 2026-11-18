Feature:Verify subscription functionality
Scenario Outline:subscription functionality in infoez

Given user launched the applications urls
When  user is logged in "<loginstatus>"
And user clicks the pricing button
And  user clicks the choose plan "<plan>"
Then validationsss should be displays "<validationsss>"

Examples:
|loginstatus|plan    |validationsss|
| logged in|   Free    |      Subscription updated       |
|   not logged in |  Enterprise     |    Please sign in to subscribe          |