package StepDefinationsFiles;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks {

    @Before(order=1)
    public void beforeScenario(Scenario scenario){

        System.out.println("-----------------------");
        System.out.println("Scenario Name : "+scenario.getName());
    }
    @Before(order=0)
    public void beforeScenarioStart(){

        System.out.println("-----------------Start of Scenario-----------------");
    }

    @After(order=0)
    public void afterScenarioFinish(){

        System.out.println("-----------------End of Scenario-----------------\n");
    }
    @After(order=1)
    public void afterScenario(){

        System.out.println("-----------------------");
    }

}