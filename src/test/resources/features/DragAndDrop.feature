Feature: Drag And Drop

  @drag
  Scenario: Perform Drag And Drop
    Given user navigate to "drag_and_drop" page
    When user drags box A to box B
    Then the boxes should switch its places


    