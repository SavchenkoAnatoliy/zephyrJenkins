package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//SMOKE",
        glue = {"StepDefinitions"},
        dryRun =false,
        monochrome = true,
        plugin = {"pretty",
                "json:target/cucumber-reports/Cucumber.json",
                "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}
)
public class RunnerTest
{
    //"html:target/cucumber-reports/cucumber.html"
}

