package Runner;

import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Resources/Features",
       glue = {"StepDefinitions"}, plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber_json.json"},
        tags = "@Smoke",
        dryRun = false)
public class TestrunnerLogin extends AbstractTestNGCucumberTests {


}
