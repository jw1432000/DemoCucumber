package multiRunnerAndSd;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		dryRun=false,
		features= {"src\\test\\java\\multiFeature"},
		glue= {"multiRunnerAndSd"},
		plugin= {"pretty",
				"html:target/cucumber-html",
				"json:target/cucumber-json4"
				}
		
		)
public class TestRunner {

}
