Feature: Google search

  Scenario: Verifying scenario for google search
    Given I am on the google page
    When I search for "cucumber"
    Then I should see only "cucmber" realted result