Feature: Business Claim Verification

Scenario Outline: Verify claim functionality with valid and invalid details

Given user launches the application using Infoez URL
 When user logs in to the application
  And user navigates to the Business Details page
    And user clicks on the Claim button 
    And user enters reason "<reason>" 
    And user enters proof URL "<proof>"
     And user clicks on the Submit Claim button 
     Then "<expectedconditions>" should be displaying

Examples:
 | reason         |proof            | expectedconditions | 
 | Business owner | https://abc.com | Claim already pending |
  | Business owner|                | proof should be submitted |