Feature: ContextMenu

  @contextMenu
  Scenario: Right-click in the box to see one called 'the-internet'
    Given user navigate to "context_menu" page
    When user right click the box
    Then JavaScript will be triggered

