package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner {

<<<<<<< HEAD
	@CucumberOptions(features = "C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\Features\\Exception_CaseEdit.feature",

			glue = "StepDefination",
			tags = "@TestCaseNo1",
=======
	@CucumberOptions(features = "C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\Features\\Admin_SaveForLater.feature",

			glue = "StepDefination",
			tags = "@TestCaseASFLNo2",
>>>>>>> acb8ea77c883fa0805c227ae14fa4b673373a82e
			monochrome = true, 
			dryRun = false, 
			plugin = { "pretty",
					"html:target/cucumber-reports.html", "junit:target/cucumber.xml", "rerun:target/faildrerun.txt",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
	public class CucumberTest extends AbstractTestNGCucumberTests {
}

}
	