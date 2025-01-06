package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunnerParallelScenario {
	@CucumberOptions(features = "C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\Features\\StockRotation_CaseCreation.feature",

			glue = "StepDefination",
		    //tags = "@highpriority",
			monochrome = true,
		    dryRun=false	,
			plugin = {"pretty", "html:target/cucumber-reports.html","junit:target/cucumber.xml",
					"rerun:target/faildrerun.txt"} )
			public class CucumberTest extends AbstractTestNGCucumberTests {

		  @Override
		    @DataProvider(parallel = true)
		    public Object[][] scenarios() {
		        Object[][] originalScenarios = super.scenarios();
		        int repeatCount = 2;  // Number of times to repeat each scenario
		        Object[][] repeatedScenarios = new Object[originalScenarios.length * repeatCount][1];

		        for (int i = 0; i < originalScenarios.length; i++) {
		            for (int j = 0; j < repeatCount; j++) {
		                repeatedScenarios[i * repeatCount + j] = originalScenarios[i];
		            }
		        }

		        return repeatedScenarios;
		 
		
			} 
	
	
	
	
	
	
	
}}
