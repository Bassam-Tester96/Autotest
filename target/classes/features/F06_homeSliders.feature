Feature: User open slider and check redirect after click
  Scenario: first slider is clickable on home page
    Given User Click at first slider
    Then User should redirect to url for first slider

    Scenario: Second slider is clickable on home page
      Given User Click at second slider
      Then User should redirect to url for second slider