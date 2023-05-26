
  Feature: File Download

    @download
    Scenario: Test clicks on the file
      Given user navigate to "download" page
      When user clicks on the file
      Then file should be downloaded