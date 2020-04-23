Feature:Sign In
  After registering my new account
  I want to sing out then sign in again with my new credentials

  Scenario: Signed In successfully
    Given I am a registered user
    But I am signed out
    When I log in with my credentials
    Then I am authenticated

