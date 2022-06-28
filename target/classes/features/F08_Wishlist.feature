@smoke
  Feature: User add wishlist
    Scenario: User add product to wishlist and get success message
      When user click at wihlist icon
      Then user should get success message with green background

      Scenario: User add product to Wislist and wait success message to go then check wishlist quantity
        Given  user click at wihlist icon
        And  Wait success message to disappears
        When Click at wishlist
        Then quantity of product should appears
