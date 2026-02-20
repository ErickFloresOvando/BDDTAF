package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = ".//features/Login.feature",
                glue = "stepsdefinitions",
                dryRun = false,
                monochrome = true,
                plugin = {"pretty", "html:test-output"}

        )
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
