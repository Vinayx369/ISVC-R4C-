package Hooks;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.Scenario;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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


	 public static WebDriver driver;

	    @Before
	    public void setUp() {
	        // Set up Chrome driver options
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");
	        options.addArguments("--disable-notifications");
	        options.addArguments("--incognito");
	        options.addArguments("--disable-extensions");
	        options.addArguments("--disable-infobars");
	        options.addArguments("--no-sandbox");
	        options.addArguments("--disable-dev-shm-usage");
	        options.addArguments("--rSemote-allow-origins=*");

	        // Initialize the WebDriver
	        driver = new ChromeDriver(options);
	        System.out.println("Browser launched and configured before scenario.");
	    }

	    @After
	    public void tearDown(Scenario scenario) {
	        if (scenario.isFailed()) {
	            // Take screenshot
	            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	            
	            // Create a unique timestamp for each screenshot
	            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	            
	            // Define the file path where the screenshot will be saved
	            String filePath = "C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\Log\\" + scenario.getName() + "_" + timestamp + ".png";
	            
	            // Save the screenshot to the defined path
	            try {
	                FileUtils.copyFile(screenshotFile, new File(filePath));
	                System.out.println("Screenshot saved at: " + filePath);
	            } catch (IOException e) {
	                System.out.println("Failed to save screenshot: " + e.getMessage());
	            }
	        }
	        
	        // Close the browser after the scenario is complete
	        if (driver != null) {
	            driver.quit();
	            System.out.println("Browser closed after scenario.");
	        }}
	}
	
	
	
	
	
	
	
	
	
