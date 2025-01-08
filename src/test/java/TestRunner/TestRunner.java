package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner {

	@CucumberOptions(features = "C:\\Users\\VGANJIX\\OneDrive - Intel Corporation\\Documents\\Vinay\\Automation Practice\\Intel_ISVC\\Intel_ISVC_R4C\\src\\test\\java\\Features\\Case_Date_Fields_Validation.feature",

			glue = "StepDefination",
		    tags = "@TestCaseDateFieldValidationNo8",
			monochrome = true, 
			dryRun = false, 
			plugin = { "pretty",
					"html:target/cucumber-reports.html", "junit:target/cucumber.xml", "rerun:target/faildrerun.txt",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
	public class CucumberTest extends AbstractTestNGCucumberTests {
}
	
}
			

