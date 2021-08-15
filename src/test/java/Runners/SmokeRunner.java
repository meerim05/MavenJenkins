package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features/Dashboard.feature",

        glue = "steps",

        dryRun = false,

        monochrome = true,

        tags ="@dashboardtabs",

        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json","rerun:target/failed.txt"}

)

public class SmokeRunner {

}
