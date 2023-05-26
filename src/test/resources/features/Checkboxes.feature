@checkbox
Feature: checks and unchecks checkboxes


  Scenario: Test uses assertions to make sure boxes were properly checked.
    Given user navigate to "checkboxes" page
    When user checked checkbox1 and checkbox2
    Then checkboxes should be checked


  Scenario: Test uses assertions to make sure boxes were properly unchecked.
    Given user navigate to "checkboxes" page
    When user unchecked checkbox1 and checkbox2
    Then checkboxes should be unchecked