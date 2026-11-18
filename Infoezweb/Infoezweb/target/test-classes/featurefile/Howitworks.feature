Feature:verify buttons in how it works

Scenario Outline: verify button functionality in how it works page
Given users launcing the app url
When user clicks on button "<button>"
Then user should navigate to the page "<page>"

Examples:

|button              |Page     |
|Start exploring     |search  |
|List your business  |register |
