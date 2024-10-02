package TestRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner_invocationCount {

	
	
	@CucumberOptions(features = "C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\Features\\StockRotation_CaseCreation.feature",

			glue = "StepDefination",
			tags = "@Sanity11",
			monochrome = true, 
			dryRun = false, 
			plugin = { "pretty",
					"html:target/cucumber-reports.html", "junit:target/cucumber.xml", "rerun:target/faildrerun.txt",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
	public class CucumberTest extends AbstractTestNGCucumberTests {

		 @Test(invocationCount = 5) // This will execute the test 5 times
		    public void runCucumberTests() {
		        // No need for additional logic; TestNG will handle the Cucumber execution
		        System.out.println("Running Cucumber tests...");
		    }}
}
