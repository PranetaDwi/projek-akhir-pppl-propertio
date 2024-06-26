package stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",  glue = "stepDefinitions", plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/test-output/report.html"}, monochrome = true)

public class TestRunner {
}