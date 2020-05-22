#Author: prakashkris09@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
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
#@tag
Feature: Title of your feature
  #I want to use this template for my feature file

@tag1
  Scenario: first scenario
    Given I want to write a step with preconditions
    
    
@tag2
  Scenario: second scenario
    Given I want to write a step
    
    @tag1 @tag2
  Scenario: third scenario
    Given I want precondition
    