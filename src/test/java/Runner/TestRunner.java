package Runner;

import StepDefinationsFiles.Login;
import StepDefinationsFiles.Subscription;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        features = {"src/test/resources/FeatureFiles"},
        glue = {"StepDefinationsFiles"},
        // plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        dryRun = false,
      //  tags = ("@login and @Subscription"),
        publish = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

    private  Login loginInstance;
    private  Subscription subscriptionInstance;

    @BeforeClass
    public void setup() {
        // Initialize instances of Login and Subscription classes
        loginInstance = new Login();
        subscriptionInstance = new Subscription();

        // Set the Login instance in the Subscription class
        subscriptionInstance.setLoginInstance(loginInstance);

    }
}

