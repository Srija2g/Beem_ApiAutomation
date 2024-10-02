package StepDefinationsFiles;

import AppBase.baseClass;
import BeemAPIs.beemHttpMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

public class GetUser extends baseClass {
    protected Response response;
    protected String userAccountStatus;
    protected String subscriptionPlan;
    protected String subscriptionFees;

    private Login login;

    public static Map<String, String> resultsSet = new HashMap<String,String>();

    public void setLoginInstance(Login login) {
        //  Login loginInstance =new Login();
        this.login = login;
    }

    @When("we get the details from Get user Api")
    public void weGetTheDetailsFromGetUserApi() {
        Login login = new Login();
        String tokenID = login.ExtractTheIDTokenFromResponse();
        this.response = beemHttpMethods.getUserInfo(tokenID);
        System.out.println(tokenID);
    }

    @Then("Check if user is subscribed to any plan")
    public void checkIfUserIsSubscribedToAnyPlan() {
        userAccountStatus = jsonpath(response).get("data.getUser.userAccountStatus");
        Assert.assertEquals(userAccountStatus, "subscribed");
        System.out.println("This user is a subscribed user");
    }

    @Then("print the subscription plan and fees")
    public void printTheSubscriptionPlanAndFees() {
        subscriptionPlan = jsonpath(response).get("data.getUser.subscriptionPlan");
        subscriptionFees = jsonpath(response).get("data.getUser.subscriptionFees");
        System.out.println("The user is subscribed to " + subscriptionPlan+ "with subscription fees" + subscriptionFees);
    }



}