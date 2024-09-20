@activity1
Feature: DuckDuckGo Search
@smoketest
Scenario: Searching for cheese on DuckDuckGo
Given User is on the DuckDuckGo Website
When User searches for cheese
Then Show the number of results shown 
And Close the Browser
