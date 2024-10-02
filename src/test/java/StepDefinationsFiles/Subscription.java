package StepDefinationsFiles;

import AppBase.baseClass;
import StepDefinationsFiles.Login;
import BeemAPIs.beemHttpMethods;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;


public class Subscription extends baseClass {

    public baseClass baseObj;
    protected Response response;
    protected String subscriptionID;

    private Login login;

    public static Map<String, String> resultsSet = new HashMap<String,String>();

    public void setLoginInstance(Login login) {
      //  Login loginInstance =new Login();
        this.login = login;
    }


    @When("create a new subscription by hitting createNewSubscription API")
    public void createNewSubscriptionByHittingCreateNewSubscriptionAPI() {
      //  response = beemHttpMethods.createNewSubscription(resultsSet.values().toArray()[0].toString());
        Login login = new Login();
        String tokenID = login.ExtractTheIDTokenFromResponse();
        this.response = beemHttpMethods.createNewSubscription(tokenID);
        System.out.println(tokenID);
    }


    @Then("Extract the subscription id from response")
    public void extractTheSubscriptionIdFromResponse() {

     //   subscriptionID = jsonpath(response).getString("data.createNewSubscription.subscriptionId");
        System.out.println("session ID is : "+subscriptionID);
        resultsSet.put(subscriptionID,subscriptionID);


    }

}
