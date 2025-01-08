package PageObject;

import java.time.LocalDate;
//import java.time.LocalDate;
//import java.time.LocalDate;
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

	/*
	 * Author: Omkar Yadav Change:Quality Case Creation Description:
	 */
	@FindBy(xpath = "//span[@class='slds-form-element__label'][normalize-space()='Quality']/..//span[@class='slds-radio_faux']")
	WebElement SelectServiceTypeQuality;
	@FindBy(xpath = "//div[@aria-label='Return Reason']//lightning-base-combobox-item[@role='option']")
	WebElement ReasonQAN;
	@FindBy(xpath = "//lightning-input[@data-name='StartDate']//input[@placeholder='Select a date from the calendar picker.']")
	WebElement startDateField;
	@FindBy(xpath = "//lightning-input[@data-name='EndDate']//input[@placeholder='Select a date from the calendar picker.']")
	WebElement endDateField;
	@FindBy(xpath = "//input[@placeholder='Enter MRB Reference Number']")
	List<WebElement> EnterMRBIntoAllfields;

	public void SelectServiceTypeQuality() {
		commonclick.scrollAndClick(SelectServiceTypeQuality);
	}

	public void ReasonQAN() {
		commonclick.scrollAndClick(ReasonQAN);
	}

	// Method to select start and end dates
	public void selectDateRange() throws InterruptedException {
	    // Get today's date
	    LocalDate currentDate = LocalDate.now();
	    // Calculate the start date as two years ago from today
	    LocalDate startDate = currentDate.minusYears(3);
	    // Calculate the end date as two years from today
	    LocalDate endDate = currentDate.plusYears(1);
	    // Define the date format as 'dd/MM/yyyy'
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    // Format the start and end dates
	    String formattedStartDate = startDate.format(formatter); // Two years ago
	    String formattedEndDate = endDate.format(formatter); // Two years from now
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
