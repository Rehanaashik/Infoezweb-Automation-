Feature:verify footer link navigation
Scenario Outline:verify footer link navigation in infoez
Given user launched the app url
When user clicks on footer link "<link>"
Then user should navigate to the specific page "<page>"

Examples:
|link                   |page        |
|All Businesses         |search      |
|Featured               |featured    |
|Top Rated              |sort        |
|Add your business      |register    |
|Pricing plans          |pricing     |
|How claims work        |false |
|How it works           |how-it-works |
|Pricing                |pricing     |
|Contact                |contact  |

