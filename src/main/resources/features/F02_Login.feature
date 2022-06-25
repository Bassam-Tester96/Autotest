@smoke
Feature: Check login functionality Valid & Invalid

  Scenario: user could login with valid email and password
  Given user go to login page
  And user login with valid "test@example.com" and "P@ssw0rd"
  When user press on login button
 Then user login to the system successfully

  Scenario: user could login with valid email and password
    Given user go to login page
    And user login with Invalid "testyt@example.com" and "P@ssw0rd"
    When user press on login button
    Then user could not login to the system

