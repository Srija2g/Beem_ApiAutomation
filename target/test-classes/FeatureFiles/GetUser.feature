@getUser
Feature: Getting user details

  Scenario: Get user details and validate them
    Given resources and End point available in Env "dev"
    When get the session Id by hitting cognitoSigninCode API
    Then validate the status code
    Then Extract the session id from response
    When get the ID Token by hitting cognitoSignin API
    When Extract the ID token from response
    When we get the details from Get user Api
    Then Check if user is subscribed to any plan
    Then print the subscription plan and fees







