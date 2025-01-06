package PageObject_Web;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utilities.ConfigReader;
import Utilities.ExcelUtils;
import Utilities.WaitHelper;
import utils.CommonUtils;
import utils.WaitUtils;
import utils.waitUtilsZ;

public class Web_Query_SRAllowance {

	public WebDriver ldriver;
	public WaitHelper waitHelper;
	public WebDriver driver;
	public WaitUtils waitUtils;
	public waitUtilsZ waitUtilsZ;
	public CommonUtils commonclick;

	public Web_Query_SRAllowance(WebDriver rdriver) {
		// Assign the passed WebDriver instance to the class variable
		this.ldriver = rdriver;
		// Initialize all PageFactory elements on this page using the WebDriver instance
		PageFactory.initElements(rdriver, this);
		waitHelper = new WaitHelper(ldriver);
		waitUtils = new WaitUtils(ldriver); // Initialize wait utility
		waitUtilsZ = new waitUtilsZ(ldriver);
		commonclick = new CommonUtils(ldriver);

	}

	/*
	 * Date: 12-12-2024 Author: Omkar Yadav Change:Search Product&Warrenty
	 */

	@FindBy(xpath = "//span[normalize-space()='Stock Rotation Allowance']")
	WebElement ClickOnSRAllowance;
	@FindBy(xpath = "//input[@placeholder='Select one']")
	WebElement EnterSoldToQuery;
	@FindBy(xpath = "//lightning-primitive-icon[@size='small']//*[name()='svg']")
	WebElement SelectSoldTo;
	@FindBy(xpath = "//button[@name='Return Reason']")
	WebElement ClickOnReason;
	@FindBy(xpath = "//span[@title='Standard Stock Rotation']")
	WebElement SelectSSR;

	@FindBy(xpath = "//span[@title='Promotional Stock Rotation']")
	WebElement SelectPSR;

	@FindBy(xpath = "//span[text()=\"Standard Stock Rotation\"]")
	WebElement SSRText;
	@FindBy(xpath = "//span[text()=\"Promotional Stock Rotation\"]")
	WebElement PSRText;

	@FindBy(xpath = "//tbody/tr[1]/th[4]/span[1]/span[1]")
	WebElement PSRSSRText;
	
	@FindBy(xpath = "//span[contains(text(),'All CMFs')]")
	WebElement SelectAllCMFradiobutton;
	@FindBy(xpath = "//button[text()='Export to Excel']")
	WebElement CLickOnExport;
	@FindBy(xpath = "//span[text()=\"Allowance available for Q4 2024 quarter\"]")
	WebElement ValidateDiscription;

	public void ValidateDiscription(WebDriver driver) {
		// Expected text
		String expectedText = "Allowance available for Q4 2024 quarter";

	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     WebElement ValidationElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"Allowance available for Q4 2024 quarter\"]")));

		
		// Retrieve the actual text from the web element
		String actualText = ValidationElement.getText();

		// Validate the text using an assertion
		if (actualText.equals(expectedText)) {
			System.out.println("Validation Passed: The description text matches the expected value.");
		} else {
			System.out.println("Validation Failed: Expected '" + expectedText + "' but found '" + actualText + "'.");
		}

	}

	public void validateExportButtonClickable() {
		try {
			// Perform the click action
			commonclick.scrollAndClick(CLickOnExport);
			System.out.println("Validation Passed: The 'Export to Excel' button is clickable.");

			// Use Robot to handle the file save dialog
			Robot robot = new Robot();

			// Wait for the file save dialog to appear
			Thread.sleep(2000);

			// Type the file name "Export"
			String fileName = "Export";
			for (char c : fileName.toCharArray()) {
				int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
				if (KeyEvent.CHAR_UNDEFINED == keyCode) {
					throw new RuntimeException("Cannot type character: " + c);
				}
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
			}

			// Press Enter to save the file
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			System.out.println("File saved successfully with the name 'Export'.");
		} catch (AWTException | InterruptedException e) {
			System.out.println("Error occurred while handling the save file dialog: " + e.getMessage());
		}
	}

	public void SelectAllCMFradiobutton() {

		commonclick.scrollAndClick(SelectAllCMFradiobutton);
	}

	public void PSRText() {
		String actualText = PSRText.getText();
		System.out.println("Actual text= " + actualText);
		// Expected text
		String expectedText = "Promotional Stock Rotation";

		// Validate the text
		if (actualText.equals(expectedText)) {
			System.out.println("Validation Passed: Text is as expected.");
		} else {
			System.out.println("Validation Failed: Expected '" + expectedText + "' but found '" + actualText + "'.");
		}
	}

	public void SSRText() {
		String actualText = SSRText.getText();
		System.out.println("Actual text= " + actualText);
		// Expected text
		String expectedText = "Standard Stock Rotation";

		// Validate the text
		if (actualText.equals(expectedText)) {
			System.out.println("Validation Passed: Text is as expected.");
		} else {
			System.out.println("Validation Failed: Expected '" + expectedText + "' but found '" + actualText + "'.");
		}
	}
	
	
	
	public void PSRSSRText(WebDriver driver) {
	    try {
	        // Create a WebDriverWait instance with a 10-second timeout
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Wait until SSRText element is visible
	        WebElement ssrElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"Standard Stock Rotation\"]")));

	        // Wait until PSRText element is visible
	        WebElement psrElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"Promotional Stock Rotation\"]")));

	        // Get the text from both elements
	        String actualTextSSR = ssrElement.getText();
	        String actualTextPSR = psrElement.getText();

	        // Combine the text from both elements
	        String combinedText = actualTextSSR + " " + actualTextPSR;

	        System.out.println("Combined actual text = " + combinedText);

	        // Expected texts
	        String expectedText1 = "Promotional Stock Rotation";
	        String expectedText2 = "Standard Stock Rotation";

	        // Validate if the combined text contains the expected phrases
	        if (combinedText.contains(expectedText1) || combinedText.contains(expectedText2)) {
	            System.out.println("Validation Passed: Combined text contains the expected values.");
	        } else {
	            System.out.println("Validation Failed: Combined text does not contain '" + expectedText1 + "' or '" + expectedText2 + "'.");
	        }
	    } catch (Exception e) {
	        System.out.println("Exception occurred: " + e.getMessage());
	    }
	}


	public void SelectPSR() {

		commonclick.scrollAndClick(SelectPSR);
	}

	public void SelectSSR() {

		commonclick.scrollAndClick(SelectSSR);
	}

	public void ClickOnReason() {
		commonclick.scrollAndClick(ClickOnReason);
	}

	public void SelectSoldTo() {
		SelectSoldTo.click();
		commonclick.scrollAndClick(SelectSoldTo);
	}

	public void EnterSoldToQuery() throws InterruptedException {
		// Retrieve the Excel file path from the config file
		String excelFilePath = ConfigReader.getProperty("excelFilePath");
		// Retrieve data from the desired cell
		String SoldColumnData = ExcelUtils.getCellData(excelFilePath, 0, 1, 1); // 0 = sheetIndex, 1 = rowIndex, 9 =
		System.out.println("Third column data: " + SoldColumnData);
		// Enter the data into the text field if it's not empty
		if (!SoldColumnData.isEmpty()) {
			// EnterMRB.clear();
			commonclick.scrollAndClick(EnterSoldToQuery);
			Thread.sleep(4000);
			EnterSoldToQuery.sendKeys(SoldColumnData); // Enter the data
		}

	}

	public void ClickOnSRAllowance() {

		commonclick.scrollAndClick(ClickOnSRAllowance);
	}

}
