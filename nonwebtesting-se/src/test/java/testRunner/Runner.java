package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features=".//features/arthematic.feature",
		glue={"stepDefinition"},
		dryRun = false,
		plugin = { 	"pretty", 
					"html:output" ,
					"json:./output/cucumber.json" , 
					"junit:./output/cucumber.xml"}, 
					monochrome = true
		
		)


public class Runner {

}
