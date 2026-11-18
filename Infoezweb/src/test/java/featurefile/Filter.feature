Feature: Filter functionality in Infoez application
Scenario Outline: Verify filter functionality
Given user launches the application url for infoez
When user navigates to the explore page
And user selects the filter type "<filter type>"
And user selects the filter value "<filter value>"
Then user should see the filtered business results "<businessresults>"
When user clicks on the clear filter options


Examples:

| filter type     | filter value      | businessresults      |
| category        | fitness&wellness  | Fitness and wellness business only|
| sort by         | Toprated          | Highest rated first     |
| minimum rating  | 4.0               | Ratings above 4.0       |
| verified only   | yes               | verified batch      |
