@Subscription

Feature: New Subscription APIs


Scenario: Create new subscription
    Given resources and End point available in Env "dev"
    When create a new subscription by hitting createNewSubscription API
    Then validate the status code
    Then Extract the subscription id from response