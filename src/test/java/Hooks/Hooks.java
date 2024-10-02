package Hooks;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import StepDefination.BaseClass;
import Utilities.ScreenshotUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.DriverFactory;
import utils.ScreenshotHelper;
public class Hooks {


    private WebDriver driver;

    public Hooks(BaseClass base) {
     //   this.driver = base.getDriver();  // Assuming you have a method to get WebDriver from BaseClass
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take screenshot on failure
            ScreenshotUtil.takeScreenshot(driver, scenario.getName());
        }
    }
	}
	
	
	
	
	
	
	
	
	
