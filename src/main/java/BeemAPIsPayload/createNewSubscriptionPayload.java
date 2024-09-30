package BeemAPIsPayload;

public class createNewSubscriptionPayload {


    public static String createNewSubscriptionGetSubscriptionIDPayload() {
        return "{\"query\":\"mutation ($payload: JSON) {\\n  createNewSubscription(payload: $payload)\\n}\",\"variables\":{\"payload\":{\"subscriptionPlan\":\"basic\"}}}";
    }

}
