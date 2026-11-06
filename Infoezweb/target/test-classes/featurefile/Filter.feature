
Feature: Filter functionality in Infoez application

Scenario Outline: Verify filter functionality

Given user launches the application url for infoez
When user navigates to the explore page
And user selects the filter type "<filter type>"
And user selects the filter value "<filter value>"
Then user should see the filtered business results "<businessresults>"
When user clicks on the clear filter options
And user should see all business without filters

Examples:

| filter type     | filter value      | businessresults      |
| category        | fitness&wellness  | Iron Peak Gym        |
| sort by         | Toprated          | Iron Peak Gym        |
| minimum rating  | 4.0               | Iron Peak Gym        |
| verified only   | yes               | NO businesses found |
