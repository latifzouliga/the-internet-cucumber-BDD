Feature: Dynamic Loading

  @loading
  Scenario: clicks the start button and uses explicit wait
    Given user navigate to "dynamic_loading/2" page
    When clicks the start button and uses explicit wait
    Then  "Hello World!" text is displayed.