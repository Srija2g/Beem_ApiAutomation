@FundsSummary
Feature: Get funds summary details

Scenario: Get funds summary details and validate them
          Given resources and End point available in Env "dev"
          And get the session Id by hitting cognitoSigninCode API
          And Extract the session id from response
          And get the ID Token by hitting cognitoSignin API
          And Extract the ID token from response
          When we get the details from Funds summary Api
          Then print the details

