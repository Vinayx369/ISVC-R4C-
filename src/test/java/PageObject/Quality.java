package PageObject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;
import utils.CommonUtils;
import utils.WaitUtils;
import utils.waitUtilsZ;

public class Quality {
	public WebDriver ldriver;
	public WebDriver driver;
	public WaitHelper waitHelper;
	public WaitUtils waitUtils;
	public waitUtilsZ waitUtilsZ;
	public CommonUtils commonclick;

	// private WebDriver rdriver;
	public Quality(WebDriver rdriver) {
		// Assign the passed WebDriver instance to the class variable
		ldriver = rdriver;
		// Initialize all PageFactory elements on this page using the WebDriver instance
		PageFactory.initElements(rdriver, this);
		waitUtils = new WaitUtils(ldriver); // Initialize wait utility
		waitHelper = new WaitHelper(ldriver); // Initialize WaitHelper
		waitUtilsZ = new waitUtilsZ(ldriver);
		commonclick = new CommonUtils(ldriver);
	}

	@FindBy(xpath = "//span[contains(text(),'Quality')]")
	// waitUtils.waitForElementVisibility(ClickOnNPR, 10); // Wait for 10 seconds

	WebElement SelectServiceTypeQuality;

	@FindBy(xpath = "//div[@aria-label='Return Reason']//lightning-base-combobox-item[@role='option']")
	WebElement ReasonQAN;
	// WebElements for Start Date and End Date fields
	@FindBy(xpath = "//lightning-input[@data-name='StartDate']//input[@placeholder='Select a date from the calendar picker.']")
	WebElement startDateField;

	@FindBy(xpath = "//lightning-input[@data-name='EndDate']//input[@placeholder='Select a date from the calendar picker.']")
	WebElement endDateField;
	@FindBy(xpath = "//input[@placeholder='Enter MRB Reference Number']")
	List<WebElement> EnterMRBIntoAllfields;

	public void SelectServiceTypeQuality() {
		// waitUtils.waitForElementToBeClickable(SelectServiceTypeQuality, 30);
		commonclick.scrollAndClick(SelectServiceTypeQuality);
		// SelectServiceTypeQuality.click();
	}

	public void ReasonQAN() {
		// waitUtils.waitForElementToBeClickable(ReasonQAN, 30);
		commonclick.scrollAndClick(ReasonQAN);
		// ReasonQAN.click();
	}

	// Method to select start and end dates
	public void selectDateRange() {
		// Get today's date

		LocalDate currentDate = LocalDate.now();

		// Calculate the start date as one year ago from today
		LocalDate startDate = currentDate.minusYears(1);

		// Calculate the end date as one year from today
		LocalDate endDate = currentDate.plusYears(1);

		// Define the date format as 'MMM d, yyyy'
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy");

		// Format the start and end dates
		String formattedStartDate = startDate.format(formatter); // One year ago
		String formattedEndDate = endDate.format(formatter); // One year from now
		// Enter the formatted start date into the Start Date field
		commonclick.scrollAndClick(startDateField);
		startDateField.clear();
		startDateField.sendKeys(formattedStartDate);

		// Enter the formatted end date into the End Date field
		commonclick.scrollAndClick(endDateField);
		endDateField.clear();
		endDateField.sendKeys(formattedEndDate);
	}

	public void EnterMRBIntoAllfields(String string) {
		// Loop through each input field and enter the value "1"
		for (WebElement inputField : EnterMRBIntoAllfields) {
			inputField.clear(); // Optional: clear any existing value
			commonclick.scrollAndClick(inputField);

			inputField.sendKeys(string); // Enter the value "100"
		}

	}
}
