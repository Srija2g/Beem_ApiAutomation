@login
Feature: Congnito Login APIs

  Scenario: Create session from cognitoSignInCode API
    Given resources and End point available in Env "dev"
    When get the session Id by hitting cognitoSigninCode API
    Then validate the status code
    Then Extract the session id from response

    
    
    
  Scenario: Create idToken from cognitoSignIn API
    Given resources and End point available in Env "dev"
    When get the ID Token by hitting cognitoSignin API
    Then validate the status code
    Then Extract the ID token from response