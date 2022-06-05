package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
	(
		features = "src/test/java/Features",
		glue = "StepDefination",
		tags = "@tag1" 
	)
public class Runner extends AbstractTestNGCucumberTests {
	
}
