package resourcesFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@CucumberOptions( plugin = { “com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html”});

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src//test/java//featureFile",
 glue= {"stepDefinitionFile"},tags={"@tag2"},
 //plugin = { "pretty" },
 monochrome = true
 )
public class RunnerClass {
	

}
