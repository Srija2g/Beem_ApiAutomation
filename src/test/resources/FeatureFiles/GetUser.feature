@getUser
Feature: Getting user details

  Scenario: Get user details and validate them
    Given resources and End point available in Env "dev"
    And get the session Id by hitting cognitoSigninCode API
    And Extract the session id from response
    And get the ID Token by hitting cognitoSignin API
    And Extract the ID token from response
    When we get the details from Get user Api
    Then Check if user is subscribed to any plan
    And print the subscription plan and fees







