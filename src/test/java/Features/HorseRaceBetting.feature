Feature: Select Bets
This feature is to select bets and add to Bet Slip

  Scenario: Launch William Hill Website and Select Horse Racing Bets

    Given I navigate to the Racing page
    And I Click on the Racing Menu
    And I select Racing for Tomorrow
    And I click on the first available HORSERACE
    And I Click on the first available QUICKBET
    And I enter the betting amount
    And I click on the Add to Bet Slip button
    Then  I should see the bet slips with the details of the bet
