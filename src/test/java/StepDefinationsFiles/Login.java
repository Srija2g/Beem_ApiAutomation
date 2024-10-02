package StepDefinationsFiles;

import AppBase.baseClass;
import BeemAPIs.beemHttpMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Login extends baseClass {

    public baseClass baseObj;
    protected Response response;
    public static String sessionID , tokenID;
    public static Map<String, String> resultsSet = new HashMap<String,String>();



    @Given("resources and End point available in Env {string}")
    public void resourcesAndEndPointAvailableInEnv(String env) {
        this.baseObj = new baseClass();
        setbaseURL(env);

    }

    @When("get the session Id by hitting cognitoSigninCode API")
    public void getTheSessionIdByHittingCognitoSigninCodeAPI() {
        this.response = beemHttpMethods.getSessionID();
        System.out.println(response.asString());
    }

    @Then("validate the status code")
    public void validateTheStatusCode() {
        verifyStatusCode_OK(this.response);
    }

    @Then("Extract the session id from response")
    public void extractTheSessionIdFromResponse() {
        sessionID = jsonpath(response).getString("data.cognitoSigninCode.Session");
        System.out.println("session ID is : "+sessionID);
        resultsSet.put(sessionID,sessionID);


    }
    
    
    @When("get the ID Token by hitting cognitoSignin API")
    public void getTheIDTokenByHittingCognitoSigninAPI()
    {
    	 response = beemHttpMethods.getIDToken(resultsSet.values().toArray()[0].toString());
    }
    
    
    @Then("Extract the ID token from response")
    public String ExtractTheIDTokenFromResponse() {
    	tokenID = jsonpath(response).getString("data.cognitoSignin.response.AuthenticationResult.IdToken");
        System.out.println("Token ID is : "+tokenID);
        resultsSet.put(tokenID,tokenID);
        return tokenID;

    }

        /*public String getTokenID() {
        System.out.println("Elements : "+ Arrays.asList(resultsSet.toString()));
        return tokenID;
    }*/

}