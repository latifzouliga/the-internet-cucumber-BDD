Feature: Hover

  @hovers
  Scenario: Test does a mouse hover on each image
  Given user navigate to "hovers" page
  When user does a mouse hover on each image
  Then the additional information is displayed for each image

