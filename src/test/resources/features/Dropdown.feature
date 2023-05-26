Feature: Dropdown

  @dropdown
  Scenario Outline: selects Option 1 and Option 2 from the drop down menu
    Given user navigate to "dropdown" page
    When user select "<option>" form the dropdown menu
    Then option1 and "<option>" is selected

    Examples:
      | option   |
      | Option 1 |
      | Option 2 |

    