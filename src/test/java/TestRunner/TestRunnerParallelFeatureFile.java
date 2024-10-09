package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunnerParallelFeatureFile {

	
	
	
	@CucumberOptions(features = "C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\Features\\StockRotation_CaseCreation.feature",

			glue = "StepDefination",
		   tags = "@Retest",
			monochrome = true,
		    dryRun=false	,
			plugin = {"pretty", "html:target/cucumber-reports.html","junit:target/cucumber.xml",
					"rerun:target/faildrerun.txt"} )
			public class CucumberTest extends AbstractTestNGCucumberTests {

		  
		@Override
		@DataProvider(parallel = true)
		public Object[][] scenarios() {
		    return super.scenarios();
		}
	
	
	
	
	
	
}}
