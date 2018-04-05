package be.artusvranken.counter.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * The CucumberRunner is the class that binds the feature files and the execution of tests together.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"be.artusvranken.counter.domain"}
)
public class CucumberRunner {

}
