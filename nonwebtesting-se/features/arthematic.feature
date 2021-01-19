#Author: ravi.gompa@team.telstra.com
#Feature: This feature file is to test arthematic operations 
#List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: This feature file is to test arthematic operations 
   

  @tag1
  Scenario: Accept two number and perform addition operation on them
    Given I have two numbers to add 101 and 341 and show results 
    Then I want to multiple two numbers 9 and 11 and show results 
    And I want to perform division of 100 and 10 and show output 
     

  @tag2
  Scenario: Accept two number and perform multiplication operation on them
     Given I have two numbers to add 10 and 34 and show results 
    Then I want to multiple two numbers 2 and 50 and show results 
    And I want to perform division of 100 and 25 and show output 
    
  @tag3
  Scenario: Accept two number and perform division operation on them
    Given I have two numbers to add 10 and 34 and show results 
    Then I want to multiple two numbers 25 and 25 and show results 
    And I want to perform division of 50 and 5 and show output 