Feature: Test does a mouse hover on each image

  @floating
  Scenario: Test does a mouse hover on each image
    Given user navigate to "floating_menu" page
    When user scroll the page
    Then the floating menu is still displayed