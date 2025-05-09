package StepDefinationsFiles;

import AppBase.baseClass;
import BeemAPIs.beemHttpMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static StepDefinationsFiles.Login.tokenID;

public class FundsSummary extends baseClass {

    protected Response response;

    private Login login;
    public static Map<String ,String> resultSet = new HashMap<>();

    public void setLoginInstant(Login login){
        System.out.println("This is getting printed");
        this.login = login;
        System.out.println("This is getting printed");

    }

    @When("we get the details from Funds summary Api")
    public void weGetTheDetailsFromFundsSummaryApi() {
        this.response = beemHttpMethods.getUserFundsSummaryInfo(tokenID);
        System.out.println(tokenID);
    }

    @Then("print the details")
    public void printTheDetails() {
        System.out.println(response.prettyPrint());
    }
}
