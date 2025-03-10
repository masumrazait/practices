package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = {"stepDefinition"}, tags = "@RegressionTest", plugin = {"pretty", "html:target/cucumber-reports"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
