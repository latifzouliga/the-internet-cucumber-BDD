Feature: dynamic_controls

  Background:
    Given user navigate to "dynamic_controls" page


  Scenario: clicks on the Remove Button and uses explicit wait
    Given user clicks on the Remove Button and uses explicit wait
    Then the checkbox is gone



  Scenario: clicks on Add Button and uses explicit wait
    Given clicks on Add Button and uses explicit wait
    Then the checkbox is present


  Scenario: clicks on the Enable Button and uses explicit wait
    Given clicks on the Enable Button and uses explicit wait
    Then the text box is enabled

  @dynamic
  Scenario: clicks on the Disable Button and uses explicit wait
    Given clicks on the Disable Button and uses explicit wait
    Then the text box is disabled


















