package PageObject_Web;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.ConfigReader;
import Utilities.ExcelUtils;
import Utilities.WaitHelper;
import Utilities.WindowHandles;
import utils.CommonUtils;
import utils.WaitUtils;
import utils.waitUtilsZ;

public class Web_Query_Search {

	public WebDriver ldriver;
	public WaitHelper waitHelper;
	public WebDriver driver;
	public WaitUtils waitUtils;
	public waitUtilsZ waitUtilsZ;
	public CommonUtils commonclick;

	public Web_Query_Search(WebDriver rdriver) {
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
	 * Date: 11-12-2024 Author: Omkar Yadav Change:Search Quality FLow
	 */

	@FindBy(xpath = "//span[normalize-space()='Search & View Return Request']")
	WebElement ClickSearchQuery;
	@FindBy(xpath = "//input[@placeholder='Enter RMA Number']")
	WebElement EnterRMA;
	@FindBy(xpath = "//legend[normalize-space()='Service Type']//following::button[@name='serviceType']")
	WebElement SelectServiceType;
	@FindBy(xpath = "//span[@title='Technical']")
	WebElement SelectTypeTechnical;
	@FindBy(xpath = "//span[@title='Warranty Service/Software - NPR-Credit']")
	WebElement SelectReasonWSSNPRCredit;
	@FindBy(xpath = "//button[@name='returnReasons']")
	WebElement SelectReturnReason;
	@FindBy(xpath = "//button[@title='Search']")
	WebElement ClickSearchButton;
	@FindBy(xpath = "//button[@name='remedy']//span[contains(text(),'Please Select One')]")
	WebElement SelectRemedy;
	@FindBy(xpath = "//span[@title='NPR-Credit']")
	WebElement SelectNPRCredit;

	@FindBy(xpath = "//tbody/tr[1]/td[3]/..//a")
	WebElement ClickOnHyperlink;
	@FindBy(xpath = "//a[text()=\"Technical\"]")
	WebElement ValidateServiceTypeTechnical;
	@FindBy(xpath = "//a[text()=\"Stock Rotation\"]")
	WebElement ValidateSR;

	@FindBy(xpath = "//span[@title='Failed at Customer Factory Site - NPR-Credit']")
	WebElement SelectReasonFECNPRCredit;

	@FindBy(xpath = "//span[@title='Failed at End Customer - NPR-Credit']")
	WebElement SelectReasonFEC;

	@FindBy(xpath = "//span[@title='Credit']")
	WebElement SelectCredit;

	@FindBy(xpath = "//span[@title='Stock Rotation']")
	WebElement SelectTypeSR;

	@FindBy(xpath = "//span[@title='Promotional Stock Rotation - Credit']")
	WebElement ServiceTypePSR;
	@FindBy(xpath = "//span[@title='Standard Stock Rotation - Credit']")
	WebElement ServiceTypeSSR;
	@FindBy(xpath = "//span[@title='Admin']")
	WebElement SelectTypeAdmin;
	@FindBy(xpath = "//span[@title='Exception']")
	WebElement SelectTypeException;
	@FindBy(xpath = "//span[@title='Duplicate order - Credit']")
	WebElement SelectDO;
	@FindBy(xpath = "//span[@title='Incorrect Labeling - Credit']")
	WebElement SelectIL;
	@FindBy(xpath = "//span[@title='Mixed Product - Credit']")
	WebElement SelectMP;
	@FindBy(xpath = "//span[@title='Overship - Credit']")
	WebElement SelectOvership;
	@FindBy(xpath = "//span[@title='Sample - Credit']")
	WebElement SelectSample;
	@FindBy(xpath = "//span[@title='Shortship - Credit']")
	WebElement SelectShortShip;
	@FindBy(xpath = "//span[@title='Wrong Destination - Credit']")
	WebElement SelectWrongDestination;
	@FindBy(xpath = "//span[@title='Wrong Product - Credit']")
	WebElement SelectWrongProduct;
	@FindBy(xpath = "//span[@title='Wrong Ship date - Credit']")
	WebElement SelectWrongShipdate;
	@FindBy(xpath = "//span[@title='Lost Shipment - Credit']")
	WebElement SelectLostShipment;

	@FindBy(xpath = "//span[@title='Damage in transit - Credit']")
	WebElement SelectDamageintransit;

	@FindBy(xpath = "//span[@title='Exception Return - Credit']")
	WebElement SelectExceptionReturn;

	@FindBy(xpath = "//span[@title='GRL Exception Return - Credit']")
	WebElement SelectGRLException;

	@FindBy(xpath = "//span[@title='Quarterly Exception - Credit']")
	WebElement SelectQuarterly;

	@FindBy(xpath = "//span[@title='GRL Exception - NPR-Credit']")
	WebElement SelectGRLExceptionNPR;
	@FindBy(xpath = "//span[@title='Quality']")
	WebElement SelectTypeQuality;
	@FindBy(xpath = "//span[@title='FAC - Credit']")
	WebElement SelectreasonFAC;
	@FindBy(xpath = "//span[@title='QAN/MRB - Credit']")
	WebElement SelectreasonQAN;
	@FindBy(xpath = "//span[@title='Miscellaneous']")
	WebElement SelectTypeMiscllaneous;
	@FindBy(xpath = "//span[@title='Return Only']")
	WebElement SelectReturnOnly;
	@FindBy(xpath = "//button[@name='caseStatus']")
	WebElement ClickOnCaseStatus;
	@FindBy(xpath = "//lightning-layout[6]//slot[1]//lightning-layout-item[1]//slot[1]//fieldset[1]//div[1]//lightning-combobox[1]//div[1]//div[1]//lightning-base-combobox[1]//div[1]//div[1]//div[2]//lightning-base-combobox-item[2]//span[2]//span[1]")
	WebElement SelectOpenUnsubmitted;
	@FindBy(xpath = "//lightning-layout[6]//slot[1]//lightning-layout-item[1]//slot[1]//fieldset[1]//div[1]//lightning-combobox[1]//div[1]//div[1]//lightning-base-combobox[1]//div[1]//div[1]//div[2]//lightning-base-combobox-item[3]//span[2]//span[1]")
	WebElement SelectPendingApproval;
	@FindBy(xpath = "//lightning-layout[6]//slot[1]//lightning-layout-item[1]//slot[1]//fieldset[1]//div[1]//lightning-combobox[1]//div[1]//div[1]//lightning-base-combobox[1]//div[1]//div[1]//div[2]//lightning-base-combobox-item[4]//span[2]//span[1]")
	WebElement Customeraction;
	@FindBy(xpath = "//span[@title='Open, Authorized']")
	WebElement SelectOpenAuthorized;
	@FindBy(xpath = "//lightning-layout[6]//slot[1]//lightning-layout-item[1]//slot[1]//fieldset[1]//div[1]//lightning-combobox[1]//div[1]//div[1]//lightning-base-combobox[1]//div[1]//div[1]//div[2]//lightning-base-combobox-item[6]//span[2]//span[1]")
	WebElement SelectCancelled;
	@FindBy(xpath = "//lightning-layout[6]//slot[1]//lightning-layout-item[1]//slot[1]//fieldset[1]//div[1]//lightning-combobox[1]//div[1]//div[1]//lightning-base-combobox[1]//div[1]//div[1]//div[2]//lightning-base-combobox-item[7]//span[2]//span[1]")
	WebElement SelectDeclined;
	@FindBy(xpath = "//span[@title='Closed']")
	WebElement SelectClosed;
	@FindBy(xpath = "//button[@name='caseLineStatus']")
	WebElement ClickOnCaseLine;
	@FindBy(xpath = "//lightning-layout-item[3]//slot[1]//fieldset[1]//div[1]//lightning-combobox[1]//div[1]//div[1]//lightning-base-combobox[1]//div[1]//div[1]//div[2]//lightning-base-combobox-item[2]//span[2]//span[1]")
	WebElement SelectCaselineUnsubmitted;
	@FindBy(xpath = "//lightning-layout-item[3]//slot[1]//fieldset[1]//div[1]//lightning-combobox[1]//div[1]//div[1]//lightning-base-combobox[1]//div[1]//div[1]//div[2]//lightning-base-combobox-item[3]//span[2]//span[1]")
	WebElement SelectpendingApproval;
	@FindBy(xpath = "//span[contains(text(),'Bulk Upload')]")
	WebElement ClickUploadButton;
	@FindBy(xpath = "//span[normalize-space()='Or drop files']")
	WebElement ClickonUpload;
	@FindBy(xpath = "//a[text()=\"Admin\"]")
	WebElement ValidateAdmin;
	@FindBy(xpath = "//span[normalize-space()='Submitted, Pending Approval']")
	WebElement ValidateCasePending;
	@FindBy(xpath = "//lightning-icon[@title='Expand']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']")
	WebElement ClickOnShowMore;
	@FindBy(xpath = "//button[@name='contactType']//span[contains(text(),'Please Select One')]")
	WebElement clickcontacttype;
	
	@FindBy(xpath = "//span[@title='Sold To']")
	WebElement SelectContactSoldTo;
	
	@FindBy(xpath = "//input[@placeholder='Enter Email']")
	WebElement EnterEmail;
	
	@FindBy(xpath = "//span[@title='Ship To']")
	WebElement SelectContactShipTo;
	@FindBy(xpath = "//span[@title='Collection']")
	WebElement SelectContactcollection;
	@FindBy(xpath = "//span[@title='Return to Customer Contact']")
	WebElement SelectContactcustomercontact;
	
	public void SelectContactcustomercontact() 
	{
		commonclick.scrollAndClick(SelectContactcustomercontact);
	}
	
	
	public void SelectContactcollection() 
	{
		commonclick.scrollAndClick(SelectContactcollection);
	}
	
	public void SelectContactShipTo() 
	{
		commonclick.scrollAndClick(SelectContactShipTo);
	}
	
	public void EnterEmail() { 
		//commonclick.scrollAndClick(EnterEmail);
		
		// Retrieve the Excel file path from the config file
				String excelFilePath = ConfigReader.getProperty("excelFilePath");
				// Retrieve data from the desired cell
				String thirdColumnData = ExcelUtils.getCellData(excelFilePath, 0, 1, 15); // 0 = sheetIndex, 1 = rowIndex, 9 =
				System.out.println("Third column data: " + thirdColumnData);
				// Enter the data into the text field if it's not empty
				if (!thirdColumnData.isEmpty()) {
					// EnterMRB.clear();
					commonclick.scrollAndClick(EnterEmail);
					EnterEmail.sendKeys(thirdColumnData); // Enter the data
				}
		
		
		
		
	}
	public void SelectContactSoldTo() { 
		commonclick.scrollAndClick(SelectContactSoldTo);
		
	}
	public void clickcontacttype() { 
		commonclick.scrollAndClick(clickcontacttype);
		
	}
	
	
	public void ClickOnShowMore(WebDriver driver) throws InterruptedException 
	{   WindowHandles.switchToChildWindow(driver);
		commonclick.scrollAndClick(ClickOnShowMore);
		
	}
	
	
	public void ValidateCaseCAR(WebDriver driver) throws InterruptedException {

	    WindowHandles.switchToChildWindow(driver);
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    WebElement element = wait.until(ExpectedConditions
	            .visibilityOfElementLocated(By.xpath("//span[normalize-space()='Customer Action Required")));

	    String ActualText = element.getText();
	    System.out.println("Actual Text: " + ActualText);

	    // Check if the text contains the word "Pending"
	    if (ActualText.contains("Customer Action")) {
	        System.out.println("The word 'Customer Action' is present in the text.");
	    } else {
	        System.out.println("The word 'Customer Action' is not present in the text.");
	    }
	}
	

	public void ValidateCasePending(WebDriver driver) throws InterruptedException {

	    WindowHandles.switchToChildWindow(driver);
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    WebElement element = wait.until(ExpectedConditions
	            .visibilityOfElementLocated(By.xpath("//span[normalize-space()='Submitted, Pending Approval']")));

	    String ActualText = element.getText();
	    System.out.println("Actual Text: " + ActualText);

	    // Check if the text contains the word "Pending"
	    if (ActualText.contains("Pending")) {
	        System.out.println("The word 'Pending' is present in the text.");
	    } else {
	        System.out.println("The word 'Pending' is not present in the text.");
	    }
	}

	public void ValidateCasecancelled(WebDriver driver) throws InterruptedException {

	    WindowHandles.switchToChildWindow(driver);
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    WebElement element = wait.until(ExpectedConditions
	            .visibilityOfElementLocated(By.xpath("//span[normalize-space()='Cancelled by Customer']")));

	    String ActualText = element.getText();
	    System.out.println("Actual Text: " + ActualText);

	    // Check if the text contains the word "Pending"
	    if (ActualText.contains("Cancelled")) {
	        System.out.println("The word 'Cancelled' is present in the text.");
	    } else {
	        System.out.println("The word 'Cancelled' is not present in the text.");
	    }
	}

	
	
	

	public void ValidateAdmin(WebDriver driver) throws InterruptedException {

		WindowHandles.switchToChildWindow(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Admin\"]")));

		String ActualText = element.getText();
		System.out.println("Actual Text: " + ActualText);
		String Expected = "Admin";
		if (ActualText.equals(Expected)) {
			System.out.println("ActualText and Expected text are the same");
		} else {
			System.out.println("Text mismatch: " + ActualText);
		}

	}

	public void ValidateException(WebDriver driver) throws InterruptedException {

		WindowHandles.switchToChildWindow(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Exception\"]")));

		String ActualText = element.getText();
		System.out.println("Actual Text: " + ActualText);
		String Expected = "Exception";
		if (ActualText.equals(Expected)) {
			System.out.println("ActualText and Expected text are the same");
		} else {
			System.out.println("Text mismatch: " + ActualText);
		}

	}

	public void ValidateMiscellaneous(WebDriver driver) throws InterruptedException {

		WindowHandles.switchToChildWindow(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Miscellaneous\"]")));

		String ActualText = element.getText();
		System.out.println("Actual Text: " + ActualText);
		String Expected = "Miscellaneous";
		if (ActualText.equals(Expected)) {
			System.out.println("ActualText and Expected text are the same");
		} else {
			System.out.println("Text mismatch: " + ActualText);
		}

	}

	public void ValidateCaseOpenUnsubmitted(WebDriver driver) throws InterruptedException {

		WindowHandles.switchToChildWindow(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\" Open, Unsubmitted \"]")));

		String ActualText = element.getText();
		System.out.println("Actual Text: " + ActualText);
		String Expected = "Open, Unsubmitted";
		if (ActualText.equals(Expected)) {
			System.out.println("ActualText and Expected text are the same");
		} else {
			System.out.println("Text mismatch: " + ActualText);
		}

	}

	public void ValidateCustomeraction(WebDriver driver) throws InterruptedException {

		WindowHandles.switchToChildWindow(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"Customer Action Required\"]")));

		String ActualText = element.getText();
		System.out.println("Actual Text: " + ActualText);
		String Expected = "Customer Action Required";
		if (ActualText.equals(Expected)) {
			System.out.println("ActualText and Expected text are the same");
		} else {
			System.out.println("Text mismatch: " + ActualText);
		}

	}

	public void ValidateCancelled(WebDriver driver) throws InterruptedException {

		WindowHandles.switchToChildWindow(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\" Cancelled \"]")));

		String ActualText = element.getText();
		System.out.println("Actual Text: " + ActualText);
		String Expected = "Cancelled";
		if (ActualText.equals(Expected)) {
			System.out.println("ActualText and Expected text are the same");
		} else {
			System.out.println("Text mismatch: " + ActualText);
		}

	}

	public void ValidateDeclined(WebDriver driver) throws InterruptedException {

		WindowHandles.switchToChildWindow(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\" Declined \"]")));

		String ActualText = element.getText();
		System.out.println("Actual Text: " + ActualText);
		String Expected = "Declined";
		if (ActualText.equals(Expected)) {
			System.out.println("ActualText and Expected text are the same");
		} else {
			System.out.println("Text mismatch: " + ActualText);
		}

	}

	public void Validateclosed(WebDriver driver) throws InterruptedException {

		WindowHandles.switchToChildWindow(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\" Closed \"]")));

		String ActualText = element.getText();
		System.out.println("Actual Text: " + ActualText);
		String Expected = "Closed";
		if (ActualText.equals(Expected)) {
			System.out.println("ActualText and Expected text are the same");
		} else {
			System.out.println("Text mismatch: " + ActualText);
		}

	}

	public void ValidateCaseAutoClosed(WebDriver driver) throws InterruptedException {

		WindowHandles.switchToChildWindow(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\" Auto-Closed \"]")));

		String ActualText = element.getText();
		System.out.println("Actual Text: " + ActualText);
		String Expected = "Auto-Closed";
		if (ActualText.equals(Expected)) {
			System.out.println("ActualText and Expected text are the same");
		} else {
			System.out.println("Text mismatch: " + ActualText);
		}

	}

	public void ValidateQuality(WebDriver driver) throws InterruptedException {

		WindowHandles.switchToChildWindow(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Quality\"]")));

		String ActualText = element.getText();
		System.out.println("Actual Text: " + ActualText);
		String Expected = "Quality";
		if (ActualText.equals(Expected)) {
			System.out.println("ActualText and Expected text are the same");
		} else {
			System.out.println("Text mismatch: " + ActualText);
		}

	}

	public void ClickonUpload() {
		// commonclick.scrollAndClick(ClickonUpload);
		commonclick.ClickByView(ClickonUpload);
		commonclick.scrollAndClick(ClickonUpload);
		ClickonUpload.click();

	}

	public void ClickUploadButton() {
		commonclick.scrollAndClick(ClickUploadButton);
	}

	public void SelectpendingApproval() {
		commonclick.scrollAndClick(SelectpendingApproval);
	}

	@FindBy(xpath = "//lightning-layout-item[3]//slot[1]//fieldset[1]//div[1]//lightning-combobox[1]//div[1]//div[1]//lightning-base-combobox[1]//div[1]//div[1]//div[2]//lightning-base-combobox-item[4]//span[2]//span[1]")
	WebElement SelectlineCancelled;

	public void SelectlineCancelled() {
		commonclick.scrollAndClick(SelectlineCancelled);
	}

	@FindBy(xpath = "//lightning-layout-item[3]//slot[1]//fieldset[1]//div[1]//lightning-combobox[1]//div[1]//div[1]//lightning-base-combobox[1]//div[1]//div[1]//div[2]//lightning-base-combobox-item[5]//span[2]//span[1]")
	WebElement SelectCustomerActionrequire;

	public void SelectCustomerActionrequire() {
		commonclick.scrollAndClick(SelectCustomerActionrequire);
	}

	@FindBy(xpath = "//span[@title='Credited']")
	WebElement Selectcredited;

	public void Selectcredited() {
		commonclick.scrollAndClick(Selectcredited);
	}

	@FindBy(xpath = "//span[@title='Auto-Closed']")
	WebElement SelectAutoClosed;

	public void SelectAutoClosed() {
		commonclick.scrollAndClick(SelectAutoClosed);
	}

	@FindBy(xpath = "//span[@title='Reject Scrap']")
	WebElement SelectRejectScrap;

	public void SelectRejectScrap() {
		commonclick.scrollAndClick(SelectRejectScrap);
	}

	@FindBy(xpath = "//span[@title='Reject Ship to Customer']")
	WebElement SelectRejectShip;

	public void SelectRejectShip() {
		commonclick.scrollAndClick(SelectRejectShip);
	}

	@FindBy(xpath = "//span[@title='Complete']")
	WebElement SelectComplete;

	public void SelectComplete() {
		commonclick.scrollAndClick(SelectComplete);
	}

	@FindBy(xpath = "//span[@title='In Transit']")
	WebElement SelectInTransit;

	public void SelectInTransit() {
		commonclick.scrollAndClick(SelectInTransit);
	}

	@FindBy(xpath = "//span[@title='Receiving In Progress']")
	WebElement SelectReceivingProgress;

	public void SelectReceivingProgress() {
		commonclick.scrollAndClick(SelectReceivingProgress);
	}

	@FindBy(xpath = "//span[@title='Discrepant']")
	WebElement Selectdiscrepant;

	public void Selectdiscrepant() {
		commonclick.scrollAndClick(Selectdiscrepant);
	}

	@FindBy(xpath = "//span[@title='Received']")
	WebElement SelectRecevied;

	public void SelectRecevied() {
		commonclick.scrollAndClick(SelectRecevied);
	}

	@FindBy(xpath = "//lightning-layout-item[3]//slot[1]//fieldset[1]//div[1]//lightning-combobox[1]//div[1]//div[1]//lightning-base-combobox[1]//div[1]//div[1]//div[2]//lightning-base-combobox-item[15]//span[2]//span[1]")
	WebElement SelectlineDeclined;

	public void SelectlineDeclined() {
		commonclick.scrollAndClick(SelectlineDeclined);
	}

	public void SelectCaselineUnsubmitted() {

		commonclick.scrollAndClick(SelectCaselineUnsubmitted);
	}

	public void ClickOnCaseLine() {
		commonclick.scrollAndClick(ClickOnCaseLine);
	}

	public void SelectOpenUnsubmitted() {
		commonclick.scrollAndClick(SelectOpenUnsubmitted);
	}

	public void SelectPendingApproval() {
		commonclick.scrollAndClick(SelectPendingApproval);
	}

	public void Customeraction() {
		commonclick.scrollAndClick(Customeraction);
	}

	public void SelectOpenAuthorized() {
		commonclick.scrollAndClick(SelectOpenAuthorized);
	}

	public void SelectCancelled() {
		commonclick.scrollAndClick(SelectCancelled);
	}

	public void SelectDeclined() {
		commonclick.scrollAndClick(SelectDeclined);
	}

	public void SelectClosed() {
		commonclick.scrollAndClick(SelectClosed);
	}

	public void ClickOnCaseStatus() {

		commonclick.scrollAndClick(ClickOnCaseStatus);
	}

	public void SelectReturnOnly() {
		commonclick.scrollAndClick(SelectReturnOnly);
	}

	public void SelectTypeMiscllaneous() {

		commonclick.scrollAndClick(SelectTypeMiscllaneous);
	}

	public void SelectreasonFAC() {

		commonclick.scrollAndClick(SelectreasonFAC);
	}

	public void SelectreasonQAN() {

		commonclick.scrollAndClick(SelectreasonQAN);
	}

	public void SelectTypeQuality() {

		commonclick.scrollAndClick(SelectTypeQuality);
	}

	public void SelectGRLExceptionNPR() {
		commonclick.scrollAndClick(SelectGRLExceptionNPR);
	}

	public void SelectExceptionReturn() {
		commonclick.scrollAndClick(SelectExceptionReturn);
	}

	public void SelectGRLException() {
		commonclick.scrollAndClick(SelectGRLException);
	}

	public void SelectQuarterly() {
		commonclick.scrollAndClick(SelectQuarterly);
	}

	public void SelectDO() {
		commonclick.scrollAndClick(SelectDO);
	}

	public void SelectTypeException() {
		commonclick.scrollAndClick(SelectTypeException);
	}

	public void SelectIL() {
		commonclick.scrollAndClick(SelectIL);
	}

	public void SelectMP() {
		commonclick.scrollAndClick(SelectMP);
	}

	public void SelectOvership() {
		commonclick.scrollAndClick(SelectOvership);
	}

	public void SelectSample() {
		commonclick.scrollAndClick(SelectSample);
	}

	public void SelectShortShip() {
		commonclick.scrollAndClick(SelectShortShip);
	}

	public void SelectWrongDestination() {
		commonclick.scrollAndClick(SelectWrongDestination);
	}

	public void SelectWrongProduct() {
		commonclick.scrollAndClick(SelectWrongProduct);
	}

	public void SelectWrongShipdate() {
		commonclick.scrollAndClick(SelectWrongShipdate);
	}

	public void SelectLostShipment() {
		commonclick.scrollAndClick(SelectLostShipment);
	}

	public void SelectDamageintransit() {
		commonclick.scrollAndClick(SelectDamageintransit);
	}

	public void SelectTypeAdmin() {
		commonclick.scrollAndClick(SelectTypeAdmin);

	}

	public void ServiceTypeSSR() {

		commonclick.scrollAndClick(ServiceTypeSSR);
	}

	public void ServiceTypePSR() {

		commonclick.scrollAndClick(ServiceTypePSR);
	}

	public void SelectTypeSR() {
		commonclick.scrollAndClick(SelectTypeSR);
	}

	public void SelectCredit() {
		commonclick.scrollAndClick(SelectCredit);

	}

	public void SelectReasonFEC() {
		commonclick.scrollAndClick(SelectReasonFEC);
	}

	public void SelectReasonFECNPRCredit() {

		commonclick.scrollAndClick(SelectReasonFECNPRCredit);
	}

	public void ValidateServiceTypeTechnical(WebDriver driver) throws InterruptedException {

		if (driver == null) {
			throw new IllegalArgumentException("WebDriver instance is null");
		}
		Thread.sleep(10000);
		String mainWindowHandle = driver.getWindowHandle();
		System.out.println("Main Window Handle: " + mainWindowHandle);

		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("All Window IDs" + windowHandles);
		// Loop through the handles and switch to the new window
		for (String handle : windowHandles) {
			if (!handle.equals(mainWindowHandle)) {
				driver.switchTo().window(handle);
				System.out.println("Switched to Window Handle: " + handle);
				break;
			}
		}

		System.out.println("Title of the new window: " + driver.getTitle());
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Technical']")));

		String ActualText = element.getText();
		System.out.println("Actual Text: " + ActualText);
		String Expected = "Technical";
		if (ActualText.equals(Expected)) {
			System.out.println("ActualText and Expected text are the same");
		} else {
			System.out.println("Text mismatch: " + ActualText);
		}
		WebElement elementRemedy = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"NPR-Credit\"]")));
		String TextRemedy = elementRemedy.getText();
		String ActualTextRemedy = "NPR-Credit";

		if (ActualTextRemedy.equals(TextRemedy)) {
			System.out.println("ActualText and Expected text are the same");
		} else {
			System.out.println("Text mismatch: " + ActualText);
		}
	}

	public void validateNPRCredit(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement elementRemedy = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"NPR-Credit\"]")));
		String TextRemedy = elementRemedy.getText();
		String ActualTextRemedy = "NPR-Credit";

		if (ActualTextRemedy.equals(TextRemedy)) {
			System.out.println("ActualText and Expected text are the same");
		} else {
			System.out.println("Text mismatch: " + TextRemedy);

		}
	}

	public void validateCredit(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement elementRemedy = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Credit\"]")));
		String TextRemedy = elementRemedy.getText();
		String ActualTextRemedy = "Credit";

		if (ActualTextRemedy.equals(TextRemedy)) {
			System.out.println("ActualText and Expected text are the same");
		} else {
			System.out.println("Text mismatch: " + TextRemedy);

		}
	}

	public void ValidateSR(WebDriver driver) throws InterruptedException {

		WindowHandles.switchToChildWindow(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Stock Rotation\"]")));

		String ActualText = element.getText();
		System.out.println("Actual Text: " + ActualText);
		String Expected = "Stock Rotation";
		if (ActualText.equals(Expected)) {
			System.out.println("ActualText and Expected text are the same");
		} else {
			System.out.println("Text mismatch: " + ActualText);
		}

	}

	public void ClickOnHyperlink() {
		commonclick.scrollAndClick(ClickOnHyperlink);

	}

	public void SelectNPRCredit() {

		commonclick.scrollAndClick(SelectNPRCredit);
	}

	public void clickonremedy() {

		commonclick.scrollAndClick(SelectRemedy);
	}

	public void ClickSearchButton() {

		commonclick.scrollAndClick(ClickSearchButton);
	}

	public void SelectReturnReason() {
		commonclick.scrollAndClick(SelectReturnReason);

	}

	public void SelectReasonWSSNPRCredit() {

		commonclick.scrollAndClick(SelectReasonWSSNPRCredit);
	}

	public void SelectTypeTechnical() {

		commonclick.scrollAndClick(SelectTypeTechnical);
	}

	public void SelectServiceType() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.elementToBeClickable(SelectServiceType));
	   // commonclick.ClickByView(SelectServiceType);
		//commonclick.scrollAndClick(SelectServiceType);
	    commonclick.doubleClickWithInterval(SelectServiceType);
	}

	public void ClickSearchQuery() {
		commonclick.scrollAndClick(ClickSearchQuery);

	}

	public void EnterRMANumber() {
		// Retrieve the Excel file path from the config file
		String excelFilePath = ConfigReader.getProperty("excelFilePath");
		// Retrieve data from the desired cell
		String thirdColumnData = ExcelUtils.getCellData(excelFilePath, 0, 1, 10); // 0 = sheetIndex, 1 = rowIndex, 9 =
		System.out.println("Third column data: " + thirdColumnData);
		// Enter the data into the text field if it's not empty
		if (!thirdColumnData.isEmpty()) {
			// EnterMRB.clear();
			commonclick.scrollAndClick(EnterRMA);
			EnterRMA.sendKeys(thirdColumnData); // Enter the data
		}
	}

}
