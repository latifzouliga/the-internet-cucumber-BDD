

  Feature: Iframe

    @iframe
    Scenario: Test switches to Iframe and types some text
      Given user navigate to "iframe" page
      When user switches to Iframe and types "Hello World!"
      Then the typed text should be "Hello World!"