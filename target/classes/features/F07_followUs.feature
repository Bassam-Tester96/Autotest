@smoke
#Background : User could login with valid email and password
#Given user go to login page
#And user login with valid "test@example.com" and "P@ssw0rd"
#When user press on login button
#Then user login to the system successfully

Feature: F07_followUs | users could open followUs links

  Scenario: user opens facebook link
  When user opens facebook link
  Then "https://www.facebook.com/nopCommerce" is opened in new tab1

  Scenario: user opens twitter link
  When user opens twitter link
  Then "https://twitter.com/nopCommerce" is opened in new tab2

  Scenario: user opens rss link
  Given user opens rss link
  Then "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab3

  Scenario: user opens youtube link
  Given user opens youtube link
  Then "https://www.youtube.com/user/nopCommerce" is opened in new tab4