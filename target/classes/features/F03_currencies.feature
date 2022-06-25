@smoke
  Feature: User change currency
    Scenario: User switch currency from US Dollar to Euro
      Given User open Currency dropdown menu
      When User click Euro currency
      Then All page currencies should changed to Euro