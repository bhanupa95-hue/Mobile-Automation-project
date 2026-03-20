Feature: Settings Search Feature

  Scenario Outline: Verify search with multiple inputs

    Given user launches the application
    When user clicks on search bar
    And user enters "<searchText>"
    Then results should be displayed
    And user closes the application

    Examples:
      | searchText |
      | WiFi       |
      | Bluetooth  |
      | Display    |
      | Sound      |









#Feature: Settings Search Feature
#
#  Scenario: Validate search functionality in settings app
#
#    Given user launches the application
#    When user clicks on setting icon
#    And user clicks on search bar
#    And user enters text "WiFi"
#    And user clears search field
#    And user enters text "Bluetooth"
#    And user clears search field
#    And user enters text "Display"
#    And user clears search field
#    And user enters text "Sound"
#    And user clears search field
#    Then results should be displayed
#    And user closes application

#  Scenario: Validate setting Options in settings app
#
#    Given user is launching the application
#    When user validates first option
#    And user validates second option
#    And user validates third option
#    Then user clicks on first option
#    And user closes the application