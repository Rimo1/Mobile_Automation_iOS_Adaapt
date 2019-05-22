package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
        (features = "./src/main/resources/features/",
                glue = {"stepDefination"},
                tags = {"@Regression"},
                plugin = {"pretty", "html:target/cucumber-reports"}
        )
public class TestRunner extends AbstractTestNGCucumberTests {
}