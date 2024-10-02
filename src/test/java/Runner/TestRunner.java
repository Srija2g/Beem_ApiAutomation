package Runner;

import StepDefinationsFiles.GetUser;
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
    private  GetUser getUserInstance;

    @BeforeClass
    public void setup() {
        // Initialize instances of Login and Subscription classes
        loginInstance = new Login();
        getUserInstance = new GetUser();

        // Set the Login instance in the Subscription class
        getUserInstance.setLoginInstance(loginInstance);

    }
}

