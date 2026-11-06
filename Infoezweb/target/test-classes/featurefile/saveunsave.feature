
Feature: Saved Business

  Scenario Outline: User can save and unsave a business
    Given user launches the applications
    When user login to the applications
    And user navigates to the business details pages
    And user "<action>" the business
    
    Then validation message should be displayed

    Examples:
      | action | 
      | save   | 
      | unsave | 
