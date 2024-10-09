package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunnerMultipleTime {
	@CucumberOptions(features = "C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\Features\\StockRotation_CaseCreation.feature", 
			glue = "StepDefination", 
			tags = "@Sanity111", 
			monochrome = true, 
			dryRun = false, 
			plugin = {
			"pretty", "html:target/cucumber-reports.html", "junit:target/cucumber.xml", "rerun:target/faildrerun.txt" })
	public class CucumberTest extends AbstractTestNGCucumberTests {

		private static final int RUN_COUNT = 4; // Number of times to run the feature file

		@Override
		@DataProvider(parallel = false)
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
