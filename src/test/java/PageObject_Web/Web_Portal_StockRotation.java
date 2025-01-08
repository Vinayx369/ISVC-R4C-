package PageObject_Web;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.WaitHelper;
import utils.CommonUtils;
import utils.FileUtils;
import utils.WaitUtils;
import utils.waitUtilsZ;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class Web_Portal_StockRotation {

	public WebDriver ldriver;
	public WaitHelper waitHelper;
	public WebDriver driver;
	public WaitUtils waitUtils;
	public waitUtilsZ waitUtilsZ;
	public CommonUtils commonclick;

	public Web_Portal_StockRotation(WebDriver rdriver) {
		// Assign the passed WebDriver instance to the class variable
		ldriver = rdriver;
		// Initialize all PageFactory elements on this page using the WebDriver instance
		PageFactory.initElements(rdriver, this);
		waitHelper = new WaitHelper(ldriver);
		waitUtils = new WaitUtils(ldriver); // Initialize wait utility
		waitUtilsZ = new waitUtilsZ(ldriver);
		commonclick = new CommonUtils(ldriver);

	}
	/*
	 * Author: Omkar Yadav Date: 11 Nov 2022 Change: Coustomer WebPortalFlow
	 */

	@FindBy(xpath = "//span[text()=\"Create Case \"]")
	WebElement ClickCreatecasebutton;

	@FindBy(xpath = "//span[text()=\"Stock Rotation\"]")
	WebElement SelectSR;

	@FindBy(xpath = "//a[normalize-space()='MM']//preceding::span[@part='indicator']")
	WebElement SelectAllCheckbox;

	@FindBy(xpath = "//body//div//lightning-base-combobox-item[9]")
	WebElement SelectCRF;

	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[5]/div[1]/div[1]/div[1]/c-r4c_-c-x_-case-record-detail[1]/c-r4c_-a-g_-view-summary[1]/div[1]/div[1]/div[1]/div[1]/span[2]/h4[1]")
	WebElement GetCaseNo;
	@FindBy(xpath = "//span[normalize-space()='Edit/View Case']")
	WebElement CaseViewAndEdit;
	@FindBy(xpath = "//div[@title='Open, Unsubmitted']")
	WebElement OpenUnsubmitButton;
	@FindBy(xpath = "//span[normalize-space()='Open, Unsubmitted']")
	WebElement CheckStatus;

	@FindBy(xpath = "//td[@data-label='Service Type']")
	List<WebElement> serviceTypes;

	@FindBy(xpath = "//td[@data-label='Case Number']")
	List<WebElement> caseNumbers;

	@FindBy(xpath = "//tr[@class=\"slds-hint-parent\"]")
	List<WebElement> allCaseDetails; // Use List<WebElement> to store all matching elements

	@FindBy(xpath = "(//div[text()='Open, Unsubmitted'])[1]")
	WebElement ClickOpenUnsubmittedcases;

	@FindBy(xpath = "//button[normalize-space()='Edit']")
	WebElement ClickEdit;

	public void ClickEdit() {
		commonclick.scrollAndClick(ClickEdit);

	}

	public void ClickOpenUnsubmittedcases() {
		commonclick.scrollAndClick(ClickOpenUnsubmittedcases);
	}

	public void printAllCaseDetails() {
		for (WebElement caseDetail : allCaseDetails) {
			System.out.println(caseDetail.getText()); // Print the text of each element
		}
	}

	public boolean checkstatus() {
	    // Get the text of the element
	    String statusText = CheckStatus.getText().trim();
	    System.out.println(statusText); // Print the text to verify
	    // Verify if the text is "Open, Unsubmitted" or "RMA Authorized"
	    return statusText.equals("Open, Unsubmitted") || statusText.equals("RMA Authorized");
	}

	public void clickCaseNumberForStockRotation() {
		for (int i = 0; i < serviceTypes.size(); i++) {
			String serviceTypeText = serviceTypes.get(i).getText();
			System.out.println(serviceTypeText);
			// Check if service type matches "Stock Rotation"
			if (serviceTypeText.equals("Stock Rotation")) {
				System.out.println("Stock Rotation found at index: " + i);

				// Wait until case number element at the matching index is clickable
				WebElement caseNumberElement = caseNumbers.get(i);
				// wait.until(ExpectedConditions.elementToBeClickable(caseNumberElement));

				// Print case number for reference and click the case number
				System.out.println("Case Number at this index: " + caseNumberElement.getText());
				caseNumberElement.click();
				// Exit loop after clicking the matching case number
				break;
			}
		}
	}

	public void OpenUnsubmitButton() {
		commonclick.scrollAndClick(OpenUnsubmitButton);
	}

	public void CaseViewAndEdit() {

		commonclick.scrollAndClick(CaseViewAndEdit);
	}

	public void GetCaseNo() {
		try {
			Thread.sleep(2000);
			// Now fetch the text
			String Caseno = GetCaseNo.getText();
			System.out.println(Caseno);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void SelectRCCCRF() {
		commonclick.scrollAndClick(SelectCRF);
	}

	public void SelectAllCheckbox() {

		commonclick.scrollAndClick(SelectAllCheckbox);

	}

	public void SelectSR() {
		commonclick.scrollAndClick(SelectSR);
	}

	public void ClickCreatecasebutton() {
		commonclick.scrollAndClick(ClickCreatecasebutton);
	}

	public void PrintCaseNoSRweb() throws InterruptedException {
		Thread.sleep(2000);
		String CaseNo = GetCaseNo.getText(); // Assuming PrintCaseNo is already defined WebElement
		System.out.println("WEB_Case No: " + CaseNo);
		// Get the current date and time
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime = currentDateTime.format(formatter);

		// Prepare case details without the CaseName (Status)
		String caseDetails = "Web Case Number- " + CaseNo + "  Date and Time- " + formattedDateTime;

		// Use Case Number as the unique key to store the case details
		String key = "Web Case_Details_" + CaseNo + " ";

		// Save the case details into the properties file
		FileUtils.saveToPropertiesFile("C:/Users/oyadavx/git/Intel_ISVC_R4C/Intel_ISVC_R4C/case_values.properties", key,
				caseDetails);
	}

}
