package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
features = {"testProjectDataTable.feature"},
		
		glue = {"testProjectDataTable.java"},
		
		dryRun = false,
		
		monochrome = true
		
		)

public class testRunner {

}
