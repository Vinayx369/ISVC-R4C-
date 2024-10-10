package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunnerMultipleTime {
	@CucumberOptions(features = "C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\Features\\Technical_CaseCreation.feature", 
			glue = "StepDefination", 
			tags = "@ScenarioNo-1", 
			monochrome = true, 
			dryRun = false, 
			plugin = {
			"pretty", "html:target/cucumber-reports.html", "junit:target/cucumber.xml", "rerun:target/faildrerun.txt","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
	public class CucumberTest extends AbstractTestNGCucumberTests {

<<<<<<< HEAD
		private static final int RUN_COUNT = 50
				; // Number of times to run the feature file
=======
		private static final int RUN_COUNT = 2; // Number of times to run the feature file
>>>>>>> acb8ea77c883fa0805c227ae14fa4b673373a82e

		@Override
		@DataProvider(parallel = true)
		public Object[][] scenarios() {
			Object[][] scenarios = super.scenarios();
			Object[][] result = new Object[scenarios.length * RUN_COUNT][1];

			int index = 0;
			for (int i = 0; i < RUN_COUNT; i++) {
				for (Object[] scenario : scenarios) {
					result[index++] = scenario;
				}
			}
			return result;
		}
	}
}
