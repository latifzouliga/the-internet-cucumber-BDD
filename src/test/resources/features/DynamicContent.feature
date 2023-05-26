Feature: Dynamic Content

  @refresh
  Scenario Outline: refreshes the page a couple of times
    Given user navigate to "dynamic_content" page
    When user refresh the webpage "<number>" of times
    Then page content should change on each refresh
    Examples:
      | number |
      | 1      |
      | 1      |
      | 1      |