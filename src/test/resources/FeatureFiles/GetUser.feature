@getUser
Feature: Getting user details

  Scenario: Get user details and validate them
    Given resources and End point available in Env "dev"
    When we get the details from Get user Api
    Then Check if user is subscribed to any plan
    Then print the subscription plan and fees







