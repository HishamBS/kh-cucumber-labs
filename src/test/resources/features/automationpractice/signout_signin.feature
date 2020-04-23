Feature: Sign Out then Sign In
  As an existing user
  I want to sing out of my account
  then sign in with my existing credintials

  Scenario: Signed In successfully
    Given I am a registered user
    But I am signed out
    When I log in with my credentials
    Then I am authenticated

