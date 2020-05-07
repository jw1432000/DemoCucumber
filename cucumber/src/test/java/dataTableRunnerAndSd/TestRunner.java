package dataTableRunnerAndSd;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				monochrome=true,
				dryRun=false,
				features= {"src\\test\\java\\feature\\datatable.feature"},
				glue= {"dataTableRunnerAndSd"},
				plugin = {"pretty","html:target/cucumber-html","json:target/cucumber-reports/CucumberTestReport2.json"}
				)


public class TestRunner {

}
