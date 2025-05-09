package StepDefinationsFiles;

import AppBase.baseClass;
import BeemAPIs.beemHttpMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import jdk.internal.org.jline.terminal.TerminalBuilder;

import java.util.HashMap;
import java.util.Map;

import static StepDefinationsFiles.Login.tokenID;

public class FundsSummary extends baseClass {

    protected Response response;

    private Login login;
    public static Map<String ,String> resultSet = new HashMap<>();

    public void setLoginInstant(Login login){
        this.login = login;

    }

    @When("we get the details from Funds summary Api")
    public void weGetTheDetailsFromFundsSummaryApi(){
        this.response = beemHttpMethods.getUserFundsSummeryInfo(tokenID);
        System.out.println(tokenID);
    }

    @Then("print the details")
    public void printTheDetails(){
        System.out.println(response);
    }
}
