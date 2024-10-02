package PageObject;

import java.time.Duration;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;
import utils.CommonUtils;
import utils.FileUtils;
import utils.WaitUtils;
import utils.waitUtilsZ;
import utils.waitUtilsZ.WaitType;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

public class Technical {
	public WebDriver ldriver;
	public WebDriver driver;
	public WaitHelper waitHelper;
	public WaitUtils waitUtils;
	public waitUtilsZ waitUtilsZ;
	public CommonUtils commonclick;

	// private WebDriver rdriver;
	public Technical(WebDriver rdriver) {
		// Assign the passed WebDriver instance to the class variable
		ldriver = rdriver;
		// Initialize all PageFactory elements on this page using the WebDriver instance
		PageFactory.initElements(rdriver, this);
		waitHelper = new WaitHelper(driver); // Initialize WaitHelper
		waitUtils = new WaitUtils(ldriver);
		waitUtilsZ = new waitUtilsZ(ldriver);
		commonclick = new CommonUtils(ldriver);
	}

// ---------------Technical--------------------
	@FindBy(xpath = "//lightning-base-combobox-item[1]//span[2]")
	WebElement SelectRSFaildAtCustomerFactory;
	@FindBy(xpath = "//button[@title=\"Warranty Entitlement Check\"]")
	WebElement ClickOnWarrentyEntitlement;
	@FindBy(xpath = "//input[@placeholder='Enter Product Unique Id']")
	WebElement EnterUID;
	@FindBy(xpath = "//span[normalize-space()='Accept']")
	WebElement Acceptclick;
//----------- Technical Test case No 1 Case Creation Xpaths
	@FindBy(xpath = "//button[text()='PO History Check']")
	WebElement POHistoryCheck;
	@FindBy(xpath = "//button[normalize-space()='Ok']")
	WebElement ClickonOkButton;
	@FindBy(xpath = "//button[contains(text(),'Next')]")
	WebElement ClickonNEXT;
	@FindBy(xpath = "//button[normalize-space()='Credit Price Validation']")
	WebElement ClickOnCreditpriceValidation;
	@FindBy(xpath = "//tbody/c-r4c_-a-g_-line-items-result-row[1]/td[1]/div[1]/span[1]/../../..//span[@part='indicator']")
	WebElement SelectFirstCheckbox;
//	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/section[3]/div[1]/div[2]/div[1]/div[1]/c-r4c_-a-g_-case-header[1]/div[2]/lightning-card[1]/article[1]/div[2]/slot[1]/div[3]/div[1]/c-r4c_-a-g_-p-o-search[1]/div[1]/div[1]/div[2]/c-r4c_-a-g_-line-items-result-table[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]/div[1]/lightning-input[1]/lightning-primitive-input-checkbox[1]/div[1]/span[1]/label[1]/span[1]")
//	WebElement Unselectallcheckbox;
	@FindBy(xpath = "//a[normalize-space()='MM']//preceding::div[@class='slds-th__action slds-th__action_form']")
	WebElement Unselectallcheckbox; // new Above xpath old
	// a[normalize-space()='MM']//preceding::div[@class='slds-th__action
	// slds-th__action_form']
//------------Technical Test Case 2 Xpaths----------
	@FindBy(xpath = "//body//div//lightning-base-combobox-item[2]")
	WebElement ReturnReasonFaildEndCustomer;
	@FindBy(xpath = "//body//div//lightning-base-combobox-item[1]//preceding::button[@aria-label='Remedy']")
	WebElement selectremedy;

//--------Technical test case PO search functionality Xpaths----
	@FindBy(xpath = "//label[text()='Return to Customer Address']")
	WebElement RCA;
	@FindBy(xpath = "//div[@aria-label='Return to Customer Address']//lightning-base-combobox-item[@role='option']//span//span[@title='ZAC DE LA MONTJAY,BONNEUIL 95 95500,France'][normalize-space()='ZAC DE LA MONTJAY,BONNEUIL 95 95500,France']")
	WebElement SelectRCA;
	@FindBy(xpath = "//body//div//c-r4c_-a-g_-collection-details//lightning-base-combobox-item[1]")
	WebElement SelectRCAOptinOut;
	@FindBy(xpath = "//button[@aria-label=\"Collection Address\"]")
	WebElement ClickCA;
	@FindBy(xpath = "//div[@aria-label='Collection Address']//lightning-base-combobox-item[@role='option']//span//span[@title='ZAC DE LA MONTJAY,BONNEUIL 95 95500,France'][normalize-space()='ZAC DE LA MONTJAY,BONNEUIL 95 95500,France']")
	WebElement SelectCA;
	@FindBy(xpath = "//button[@aria-label='Return to Customer Contact']")
	WebElement ClickRCC;
	@FindBy(xpath = "//lightning-combobox[@data-name='Sales_Issue_Return_To_Cst_Contact__c']//lightning-base-combobox-item[1]//span[2]//span[1]")
	WebElement SelectRCC;
	@FindBy(xpath = "//button[contains(text(),'Next')]")
	WebElement NextAfterCheckAll;
	@FindBy(xpath = "//td[@scope='row']//span[contains(text(),'1')]//following::span[@part='indicator']")
	WebElement ClickOnAll;
	@FindBy(xpath = "//td[@scope='row']//span[contains(text(),'1')]//following::span[@part='indicator']")
	WebElement SelectF;
	@FindBy(xpath = "//span[@title='Failed at Customer Factory Site']")
	WebElement SelectFailedatCustomerFactorySite;
	@FindBy(xpath = "//span[@title='Failed at End Customer']")
	WebElement FailedatEndCustomer;
	@FindBy(xpath = "//input[@placeholder='Enter Credit Price']")
	WebElement EnterPrice100k;
	@FindBy(xpath = "//label[text()=\"Remedy\"]")
	WebElement SelectNPR;
	
	@FindBy(xpath="//label[text()=\"Sold To Contact\"]")
	WebElement soldtocontact;
	public void soldtocontact() 
	{
		
		//soldtocontact.click();
		commonclick.scrollAndClick(soldtocontact);
	}
	
	@FindBy(xpath="//lightning-combobox[@data-name='Sales_Issue_SoldTo_Contact__c']//lightning-base-combobox-item[1]")
	WebElement selectsoldtocontact;
	
	
	public void selectsoldtocontact() 
	{
		commonclick.scrollAndClick(selectsoldtocontact);

		//selectsoldtocontact.click();
		
	}
	@FindBy(xpath = "//span[@title='NPR-Credit']")
	WebElement ClickOnNPR;
	@FindBy(xpath = "//label[text()=\"Return Reason\"]")
	WebElement SelectReasin;
	@FindBy(xpath = "//lightning-combobox[@data-name='Sales_Issue_Return_Reason__c']//lightning-base-combobox-item[3]//span[2]")
	WebElement SelectreasonFCFS;
	@FindBy(xpath = "//span[text()='Promotional Stock Rotation']")
	WebElement SelectPromationalStockRoatation;
	@FindBy(xpath = "//span[@title='Failed at End Customer']")
	WebElement SelectFailcustomer;
	@FindBy(xpath = "//span[@title='Warranty Service/Software']")
	WebElement SelectWarrentyService;
	@FindBy(xpath = "//input[@placeholder='Enter Product Unique Id']")
	WebElement EnterULT;
	@FindBy(xpath = "//span[@title='Sample']")
	WebElement SelectSimpleReason;
	@FindBy(xpath = "//span[@title='Credit']")
	WebElement Selectcredit;
	@FindBy(xpath = "//span[@title='Credit']")
	WebElement CreditOption;
	@FindBy(xpath = "//a[text()=\"Download ULT Template\"]")
	WebElement ClickOnULTDownload;
	@FindBy(xpath = "//button[text()=\"Next\"]")
	WebElement ClickOnNEXTAfterEdit;
	@FindBy(xpath = "//lightning-formatted-text[text()='RMA Authorized']")
	WebElement rmaStatusElement;
//----Optinout Technical----Xpaths
	@FindBy(xpath = "//c-r4c_-a-g_-case-header//div//div[@role='none']//span[contains(text(),'Intel Managed Freight')]")
	WebElement IMFType;
	@FindBy(xpath = "//div[@data-target-selection-name='sfdc:RecordField.Case.CaseNumber']//div//dd//div")
	WebElement PrintCaseNo;
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[8]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/one-record-home-flexipage2[1]/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-r4-c_-case_-record_-page___-case___-v-i-e-w[1]/forcegenerated-flexipage_r4c_case_record_page_case__view_js[1]/record_flexipage-desktop-record-page-decorator[1]/div[1]/records-record-layout-event-broker[1]/slot[1]/slot[1]/flexipage-record-home-template-desktop2[1]/div[1]/div[2]/div[1]/slot[1]/flexipage-component2[1]/slot[1]/flexipage-tabset2[1]/div[1]/lightning-tabset[1]/div[1]/slot[1]/slot[1]/flexipage-tab2[1]/slot[1]/flexipage-component2[2]/slot[1]/records-lwc-detail-panel[1]/records-base-record-form[1]/div[1]/div[1]/div[1]/div[1]/records-lwc-record-layout[1]/forcegenerated-detailpanel_case___0124u0000003attqam___full___view___recordlayout2[1]/records-record-layout-block[1]/slot[1]/records-record-layout-section[1]/div[1]/div[1]/dl[1]/slot[1]/records-record-layout-row[2]/slot[1]/records-record-layout-item[2]/div[1]/div[1]/dd[1]/div[1]/span[1]/slot[1]/records-record-type[1]/div[1]/div[1]")
	WebElement CaseType;
	@FindBy(xpath = "(//label[text()='Sold To']/following-sibling::div//input)[1]")
	WebElement EnterSoldto; // Enter Sold To id into fields

	@FindBy(xpath = "//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']")
	WebElement SelectSoldTo;
	@FindBy(xpath = "//button[text()=\"Ok\"]")
	WebElement ClickonOk;
	@FindBy(xpath = "//span[@title='Failed at Customer Factory Site']")
	WebElement faildatcustomersite;
	@FindBy(xpath = "//span[normalize-space()='Customer Routed Freight']")
	WebElement CRFstatus;
	@FindBy(xpath = "//input[@placeholder=\"Enter the MM\"]")
	WebElement ClickMMTextbox;
	@FindBy(xpath = "//input[@placeholder='Enter Product Unique Id']")
	// WebElement EnterULTIDs;
	List<WebElement> EnterULTIDs;
	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement EnterTextGlobalfield;
	// Global search POC
	@FindBy(xpath = "//button[@aria-label='Search']/..//lightning-primitive-icon[@variant='bare']")
	WebElement clickGlobal;
//----------- Technical Test case No 1 Case Creation PO search

	public void SelectRSFaildAtCustomerFactory() {
		// waitUtils.waitForElementToBeClickable(SelectRSFaildAtCustomerFactory, 30);
		commonclick.scrollAndClick(SelectRSFaildAtCustomerFactory);
		// SelectRSFaildAtCustomerFactory.click();
	}

	public void ClickOnWarrentyEntitlement() {
		// waitUtils.waitForElementToBeClickable(ClickOnWarrentyEntitlement, 30);
		commonclick.scrollAndClick(ClickOnWarrentyEntitlement);
		// ClickOnWarrentyEntitlement.click();
	}

	public void clickonaccept() {
		// waitUtils.waitForElementToBeClickable(Acceptclick, 30);
		commonclick.scrollAndClick(Acceptclick);
		// Acceptclick.click();
	}

	public void POhistoryCheck() {
		// waitUtils.waitForElementToBeClickable(POHistoryCheck, 30);
		commonclick.scrollAndClick(POHistoryCheck);
		// POHistoryCheck.click();
	}

	public void clickonOkButton() {
		// waitUtils.waitForElementToBeClickable(ClickonOkButton, 30);
		commonclick.scrollAndClick(ClickonOkButton);
		// ClickonOkButton.click();

	}

	public void clickonNext() {
		// waitUtils.waitForElementToBeClickable(ClickonNEXT, 30);
		commonclick.scrollAndClick(ClickonNEXT);
		// ClickonNEXT.click();
	}

	public void ClickOnCreditpriceValidation() {
		// waitUtils.waitForElementToBeClickable(ClickOnCreditpriceValidation, 30);
		commonclick.scrollAndClick(ClickOnCreditpriceValidation);
		// ClickOnCreditpriceValidation.click();
	}

	public void SelectFirstCheckbox() {
		// waitUtils.waitForElementToBeClickable(SelectFirstCheckbox, 30);
		commonclick.scrollAndClick(SelectFirstCheckbox);
		// SelectFirstCheckbox.click();
	}

	public void Unselectallcheckbox() {
		waitUtils.waitForElementToBeClickable(Unselectallcheckbox, 30);
		commonclick.scrollAndClick(Unselectallcheckbox);
		// Unselectallcheckbox.click();
	}

//--------Technical test case SO search case creation

	public void ReturnReasonFaildEndCustomer() {
		// waitUtils.waitForElementToBeClickable(ReturnReasonFaildEndCustomer, 30);
		commonclick.scrollAndClick(ReturnReasonFaildEndCustomer);
		// ReturnReasonFaildEndCustomer.click();
	}

	public void selectremedy() {
		// waitUtils.waitForElementToBeClickable(selectremedy, 30);
		commonclick.scrollAndClick(selectremedy);
		// selectremedy.click();

	}
//--------Technical test case PO search functionality

	public void RCA() {
		// waitUtils.waitForElementToBeClickable(RCA, 30);
		commonclick.scrollAndClick(RCA);
		// RCA.click();
	}

	public void SelectRCA() {
		// waitUtils.waitForElementToBeClickable(SelectRCA, 30);
		commonclick.scrollAndClick(SelectRCA);
		// SelectRCA.click();
	}

	public void ClickCA() {
		// waitUtils.waitForElementToBeClickable(ClickCA, 30);
		commonclick.scrollAndClick(ClickCA);
		// ClickCA.click();
	}

	public void SelectCA() {
		// waitUtils.waitForElementToBeClickable(SelectCA, 30);
		commonclick.scrollAndClick(SelectCA);
		// SelectCA.click();
	}

	public void ClickRCC() {
		// waitUtils.waitForElementToBeClickable(ClickRCC, 30);
		commonclick.scrollAndClick(ClickRCC);
		// ClickRCC.click();
	}

	public void selectRCC() {
		// waitUtils.waitForElementToBeClickable(SelectRCC, 30);
		commonclick.scrollAndClick(SelectRCC);
		// SelectRCC.click();
	}
//-------------Technical <25K----------

	public void NextAfterCheckAll() {
		// waitUtils.waitForElementToBeClickable(NextAfterCheckAll, 30);
		commonclick.scrollAndClick(NextAfterCheckAll);
		// NextAfterCheckAll.click();
	}

	public void ClickOnAll() {
		// waitUtils.waitForElementToBeClickable(ClickOnAll, 30);
		commonclick.scrollAndClick(ClickOnAll);
		// ClickOnAll.click();
	}

	public void Selectfirst() {
		// waitUtils.waitForElementToBeClickable(SelectF, 30);
		commonclick.scrollAndClick(SelectF);
		// SelectF.click();
	}

	public void SelectFailedatCustomerFactorySite() {
		// waitUtils.waitForElementToBeClickable(SelectFailedatCustomerFactorySite, 30);
		commonclick.scrollAndClick(SelectFailedatCustomerFactorySite);
		// SelectFailedatCustomerFactorySite.click();
	}

	public void FailedatEndCustomer() {
		// waitUtils.waitForElementToBeClickable(FailedatEndCustomer, 30);
		commonclick.scrollAndClick(FailedatEndCustomer);
		// FailedatEndCustomer.click();
	}
//---------------Technical >100k

	public void PricerGreterThan100K() {
		// waitUtils.waitForElementVisibility(EnterPrice100k, 30); // Wait for 10
		// seconds

		EnterPrice100k.sendKeys("100000");
	}
//-----------------------NPR Bulk Upload----------------------

	public void SelectNPR() {
		// waitUtils.waitForElementVisibility(SelectNPR, 30); // Wait for 10 seconds
		// waitUtils.waitForElementToBeClickable(SelectNPR, 30);

		// waitUtilsZ.waitForElement(SelectNPR, 10, WaitUtils.WaitType.VISIBILITY);
		// waitUtilsZ.waitForElement(SelectNPR, 10, WaitUtils.WaitType.CLICKABLE);
		// waitUtilsZ.waitForElement(SelectNPR, 30, WaitType.VISIBILITY);
		// waitUtilsZ.waitForElement(SelectNPR, 30, WaitType.CLICKABLE);
		// JavascriptExecutor js = (JavascriptExecutor) ldriver;
		// js.executeScript("arguments[0].click();", SelectNPR);
		commonclick.scrollAndClick(SelectNPR);
		// SelectNPR.click();
	}

	public void ClickOnNPR() {
		// waitUtilsZ.waitForElement(SelectNPR, 30, WaitType.VISIBILITY);
		// waitUtilsZ.waitForElement(SelectNPR, 30, WaitType.CLICKABLE);
		// waitUtils.waitForElementToBeClickable(ClickOnNPR, 30);
		commonclick.scrollAndClick(ClickOnNPR);

		// ClickOnNPR.click();
	}

	public void SelectReason() {
		// waitUtils.waitForElementToBeClickable(SelectReasin, 30);
		commonclick.scrollAndClick(SelectReasin);

		// SelectReasin.click();
	}

	public void SelectreasonFCFS() {
		// waitUtils.waitForElementToBeClickable(SelectreasonFCFS, 30);
		commonclick.scrollAndClick(SelectreasonFCFS);

		// SelectreasonFCFS.click();
	}

	public void SelectPromationalStockRoatation() {
		// waitUtils.waitForElementToBeClickable(SelectPromationalStockRoatation, 30);
		// Wait for 10 seconds
		commonclick.scrollAndClick(SelectPromationalStockRoatation);

		// SelectPromationalStockRoatation.click();
	}

	public void SelectFailcustomer() {
		// waitUtils.waitForElementToBeClickable(SelectFailcustomer, 30);
		commonclick.scrollAndClick(SelectFailcustomer);

		// SelectFailcustomer.click();
	}

	public void SelectWarrentyService() {
		// waitUtils.waitForElementVisibility(SelectWarrentyService, 10); // Wait for 10
		// seconds
		// waitUtils.waitForElementToBeClickable(SelectWarrentyService, 30);
		commonclick.scrollAndClick(SelectWarrentyService);

		// SelectWarrentyService.click();
	}

	public void SelectSimpleReason() {
		// waitUtils.waitForElementVisibility(SelectSimpleReason, 10); // Wait for 10
		// seconds
		// waitUtils.waitForElementToBeClickable(SelectSimpleReason, 30);
		commonclick.scrollAndClick(SelectSimpleReason);

		// SelectSimpleReason.click();
	}

	public void EnterULT(String ULT) {
		// waitUtils.waitForElementVisibility(EnterULT, 10); // Wait for 10 seconds
		commonclick.scrollAndClick(EnterULT);

		EnterULT.sendKeys(ULT);
	}

	public void Selectcredit() {
		// waitUtils.waitForElementToBeClickable(Selectcredit, 30);
		commonclick.scrollAndClick(Selectcredit);

		// Selectcredit.click();
	}

	public void CreditOption() {
		// waitUtils.waitForElementVisibility(CreditOption, 30); // Wait for 10 seconds
		// waitUtils.waitForElementToBeClickable(CreditOption, 30);
		commonclick.scrollAndClick(CreditOption);

		// CreditOption.click();
	}

//---------BulkUpload ULT

	public void ClickOnULTDownload() {
		// waitUtils.waitForElementToBeClickable(ClickOnULTDownload, 30);
		commonclick.scrollAndClick(ClickOnULTDownload);

		// ClickOnULTDownload.click();
	}

	public void ClickonOk() {
		// waitUtils.waitForElementToBeClickable(ClickonOk, 30);
		commonclick.scrollAndClick(ClickonOk);

		// ClickonOk.click();
	}

	// Technical Opin And Out

	public void faildatcustomersite() {
		// waitUtils.waitForElementToBeClickable(faildatcustomersite, 30);
		commonclick.scrollAndClick(faildatcustomersite);

		// faildatcustomersite.click();
	}

	public void IMFType() {
		String actualText = IMFType.getText().trim(); // Retrieve and trim the text

		if (actualText.equals("Intel Managed Freight")) {
			System.out.println("Validation Passed: Text is 'Intel Managed Freight'.");
		} else {
			System.out.println("Validation Failed: Expected 'Intel Managed Freight', but found '" + actualText + "'.");
			// Optionally, you can throw an exception or handle the failure case as needed
		}

	}

	public void CRFType() {
		String actualText = CRFstatus.getText().trim(); // Retrieve and trim the text

		if (actualText.equals("Customer Routed Freight")) {
			System.out.println("Validation Passed: Text is 'Customer Routed Freight'.");
		} else {
			System.out
					.println("Validation Failed: Expected 'Customer Routed Freight', but found '" + actualText + "'.");
			// Optionally, you can throw an exception or handle the failure case as needed
		}

	}

//---------------Technical Case Edit

	public void ClickOnNEXTAfterEditfirst() {
		// waitUtils.waitForElementToBeClickable(ClickOnNEXTAfterEdit, 30);
		commonclick.scrollAndClick(ClickOnNEXTAfterEdit);

		// ClickOnNEXTAfterEdit.click();

	}

	public void ClickOnNEXTAfterEditsecond() {
		// waitUtils.waitForElementToBeClickable(ClickOnNEXTAfterEdit, 30);
		commonclick.scrollAndClick(ClickOnNEXTAfterEdit);

		// ClickOnNEXTAfterEdit.click();

	}

	public void ClickOnNEXTAfterEditthird() {
		// waitUtils.waitForElementToBeClickable(ClickOnNEXTAfterEdit, 30);
		commonclick.scrollAndClick(ClickOnNEXTAfterEdit);

		// ClickOnNEXTAfterEdit.click();

	}

	public void checkRMAStatus() {
		// Check if the element is displayed
		// Assert.assertTrue(rmaStatusElement.isDisplayed(), "RMA status 'RMA
		// Authorized' is not displayed as expected.");
		// Get the text from the element and validate it
		String actualText = rmaStatusElement.getText();
		String expectedText = "RMA Authorized";

		// Assert that the actual text matches the expected text
		Assert.assertEquals(actualText, expectedText, "RMA status does not match the expected value.");

		// Output the status to the console (optional)
		System.out.println("RMA status verified: " + actualText);

	}

	// ---------------UPload MMIds With Help of excel sheet and ULT

	public void ClickMMTextbox() {
		// Path to the Excel file
		String excelFilePath = "C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate (1) - Copy - Copy.xlsx";

		// String to hold values
		StringBuilder allValues = new StringBuilder();

		try {
			FileInputStream excelFile = new FileInputStream(new File(excelFilePath));
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheetAt(0); // Assuming values are in the first sheet

			// Iterate through each row in the sheet
			Iterator<Row> iterator = sheet.iterator();

			if (iterator.hasNext()) {
				iterator.next(); // Skip the header row
			}
			while (iterator.hasNext()) {
				Row currentRow = iterator.next();
				Cell cell = currentRow.getCell(3); // Only get the first column (index 0)

				if (cell != null) {
					String cellValue = "";
					switch (cell.getCellType()) {
					case STRING:
						cellValue = cell.getStringCellValue().trim();
						break;
					case NUMERIC:
						// Handle both integer and decimal numbers
						if (DateUtil.isCellDateFormatted(cell)) {
							cellValue = cell.getDateCellValue().toString();
						} else {
							cellValue = String.valueOf((int) cell.getNumericCellValue());
						}
						break;
					case BOOLEAN:
						cellValue = String.valueOf(cell.getBooleanCellValue());
						break;
					case FORMULA:
						cellValue = cell.getCellFormula();
						break;
					case BLANK:
						cellValue = "";
						break;
					default:
						cellValue = cell.toString().trim();
					}

					if (!cellValue.isEmpty()) {
						if (allValues.length() > 0) {
							allValues.append(",");
						}
						allValues.append(cellValue);
					}
				}
			}

			workbook.close();
			excelFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Print all values
		System.out.println(allValues);
		ClickMMTextbox.sendKeys(allValues);

	}
	
	

	public void EnterULTs() throws InterruptedException {
		// Path to the Excel file
		String excelFilePath = "C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate (1) - Copy - Copy.xlsx";

		try {
			FileInputStream excelFile = new FileInputStream(new File(excelFilePath));
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheetAt(0); // Assuming values are in the first sheet
			// Iterate through each row in the sheet and each text field
			Iterator<Row> iterator = sheet.iterator();
			int textFieldIndex = 0; // Index for text fields
			// Skip the header row
			if (iterator.hasNext()) {
				iterator.next(); // Skip the header row
			}
			while (iterator.hasNext() && textFieldIndex < EnterULTIDs.size()) {
				Row currentRow = iterator.next();

				// Get value from the second column (index 1)
				Cell secondColumnCell = currentRow.getCell(3); // For the ID to be entered

				if (secondColumnCell != null) {
					String idToEnter = "";
					switch (secondColumnCell.getCellType()) {
					case STRING:
						idToEnter = secondColumnCell.getStringCellValue().trim();
						break;
					case NUMERIC:
						// Handle numeric types
						idToEnter = String.valueOf((int) secondColumnCell.getNumericCellValue());
						break;
					case BOOLEAN:
						idToEnter = String.valueOf(secondColumnCell.getBooleanCellValue());
						break;
					case FORMULA:
						idToEnter = secondColumnCell.getCellFormula();
						break;
					case BLANK:
						idToEnter = "";
						break;
					default:
						idToEnter = secondColumnCell.toString().trim();
					}
					System.out.println(idToEnter);
					if (!idToEnter.isEmpty()) {
						// Get the current text field based on the index
						WebElement textField = EnterULTIDs.get(textFieldIndex);
						textField.clear(); // Clear any existing value
						//Thread.sleep(2000);
						textField.sendKeys(idToEnter);

						textFieldIndex++; // Move to the next text field
					}
				}
			}

			workbook.close();
			excelFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
//Thread.sleep(3000);
	}

	public void SelectRCAOptinOut() {
		commonclick.scrollAndClick(SelectRCAOptinOut);
	}

	// ---------------------------Global text enter through Excel POC

	public void EnterGlobalTextthrouhExcel() {
		// Path to the Excel file
		String excelFilePath = "C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate (1) - Copy - Copy.xlsx";

		try {
			FileInputStream excelFile = new FileInputStream(new File(excelFilePath));
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheetAt(0); // Assuming values are in the first sheet

			// Skip the header row
			Iterator<Row> iterator = sheet.iterator();
			if (iterator.hasNext()) {
				iterator.next(); // Skip the header row
			}

			// Variable to store the third column data
			String thirdColumnData = "";

			if (iterator.hasNext()) {
				Row currentRow = iterator.next(); // Get the next row (first data row)

				// Get value from the third column (index 2)
				Cell thirdColumnCell = currentRow.getCell(0); // Third column (index starts from 0)

				if (thirdColumnCell != null) {
					switch (thirdColumnCell.getCellType()) {
					case STRING:
						thirdColumnData = thirdColumnCell.getStringCellValue().trim();
						break;
					case NUMERIC:
						thirdColumnData = String.valueOf((int) thirdColumnCell.getNumericCellValue());
						break;
					case BOOLEAN:
						thirdColumnData = String.valueOf(thirdColumnCell.getBooleanCellValue());
						break;
					case FORMULA:
						thirdColumnData = thirdColumnCell.getCellFormula();
						break;
					case BLANK:
						thirdColumnData = "";
						break;
					default:
						thirdColumnData = thirdColumnCell.toString().trim();
					}

					System.out.println("Third column data: " + thirdColumnData);

					// Enter the third column data into the global text field
					if (!thirdColumnData.isEmpty()) {
						// clickGlobal.click();
						EnterTextGlobalfield.clear(); // Clear any existing value
						EnterTextGlobalfield.sendKeys(thirdColumnData); // Enter the third column data
					}
				}
			}

			workbook.close();
			excelFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

//	public void enterSlodToExcel() throws InterruptedException, IOException {
//
//		Properties properties = new Properties();
//
//		FileInputStream fileInput = new FileInputStream(
//				"C:\\Users\\oyadavx\\OneDrive - Intel Corporation\\Desktop\\Automation Test Data\\Testdata_R4C.xlsx"); // Path
//		properties.load(fileInput);
//		String excelFilePath = properties.getProperty("excelFilePath");
//		System.out.println(excelFilePath);
//		System.out.println("Printed Path correct");
//
//		try {
//			FileInputStream excelFile = new FileInputStream(new File(excelFilePath));
//			Workbook workbook = new XSSFWorkbook(excelFile);
//			Sheet sheet = workbook.getSheetAt(0); // Assuming values are in the first sheet
//
//			// Skip the header row
//			Iterator<Row> iterator = sheet.iterator();
//			if (iterator.hasNext()) {
//				iterator.next(); // Skip the header row
//			}
//
//			// Iterate through each row and enter the "Sold To" data for each row
//			while (iterator.hasNext()) {
//				Row currentRow = iterator.next(); // Move to the next row
//				String fourthColumnData = "";
//
//				// Get value from the fourth column (index 3)
//				Cell fourthColumnCell = currentRow.getCell(3); // Fourth column (index starts from 0)
//
//				if (fourthColumnCell != null) { 
//					// Always treat the fourth column as a string to avoid Excel formatting issues
//					switch (fourthColumnCell.getCellType()) {
//					case STRING:
//						fourthColumnData = fourthColumnCell.getStringCellValue().trim();
//						break;
//					case NUMERIC:
//						// Handle large numbers by converting them to string
//						fourthColumnData = BigDecimal.valueOf(fourthColumnCell.getNumericCellValue()).toPlainString();
//						break;
//					case BOOLEAN:
//						fourthColumnData = String.valueOf(fourthColumnCell.getBooleanCellValue());
//						break;
//					case FORMULA:
//						fourthColumnData = fourthColumnCell.getCellFormula();
//						break;
//					case BLANK:
//						fourthColumnData = "";
//						break;
//					default:
//						fourthColumnData = fourthColumnCell.toString().trim();
//					}
//
//					System.out.println("Fourth column data: " + fourthColumnData);
//
//					// Enter the fourth column data into the "Sold To" field
//					if (!fourthColumnData.isEmpty()) {
//						//Thread.sleep(4000);
//
//						//EnterSoldto.click();
//						commonclick.scrollAndClick(EnterSoldto);
//						//Thread.sleep(4000);
//						EnterSoldto.clear(); // Clear any existing value
//
//						EnterSoldto.sendKeys(fourthColumnData); // Enter the fourth column data
//						commonclick.scrollAndClick(SelectSoldTo);
//
//						//SelectSoldTo.click();
//
//					}
//				}
//			}
//
//			workbook.close();
//			excelFile.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//	}
	public void enterSlodToExcel() {
		// Path to the Excel file
		String excelFilePath = "C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate (1) - Copy - Copy.xlsx";

		try {
			FileInputStream excelFile = new FileInputStream(new File(excelFilePath));
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheetAt(0); // Assuming values are in the first sheet

			// Skip the header row
			Iterator<Row> iterator = sheet.iterator();
			if (iterator.hasNext()) {
				iterator.next(); // Skip the header row
			}

			// Variable to store the third column data
			String thirdColumnData = "";

			if (iterator.hasNext()) {
				Row currentRow = iterator.next(); // Get the next row (first data row)

				// Get value from the third column (index 2)
				Cell thirdColumnCell = currentRow.getCell(1); // Third column (index starts from 0)

				if (thirdColumnCell != null) {
					switch (thirdColumnCell.getCellType()) {
					case STRING:
						thirdColumnData = thirdColumnCell.getStringCellValue().trim();
						break;
					case NUMERIC:
						thirdColumnData = String.valueOf((int) thirdColumnCell.getNumericCellValue());
						break;
					case BOOLEAN:
						thirdColumnData = String.valueOf(thirdColumnCell.getBooleanCellValue());
						break;
					case FORMULA:
						thirdColumnData = thirdColumnCell.getCellFormula();
						break;
					case BLANK:
						thirdColumnData = "";
						break;
					default:
						thirdColumnData = thirdColumnCell.toString().trim();
					}

					System.out.println("Third column data: " + thirdColumnData);

					// Enter the third column data into the global text field
					if (!thirdColumnData.isEmpty()) {
						// clickGlobal.click();
						EnterSoldto.clear(); // Clear any existing value
						EnterSoldto.sendKeys(thirdColumnData); // Enter the third column data
					}
				}
			}

			workbook.close();
			excelFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	
	

	public void PrintCaseNo() {

		String CaseNo = PrintCaseNo.getText();
		String CaseTypes = CaseType.getText();
		System.out.println("Technical Case No:- " + CaseNo + " Case Type:" + CaseTypes);
		Assert.assertEquals(CaseTypes, "Technical Intake", "Case Type is not as expected!");// Assert that the CaseTypes
																							
																							
	}
	
	@FindBy(xpath="//div[@data-target-selection-name='sfdc:RecordField.Case.Status']//div//dd//div//span")
	WebElement Status;
	public void PrintCaseNoSR() throws InterruptedException {
		String CaseNo = PrintCaseNo.getText();
		//String CaseTypes = CaseType.getText();
		String CaseName=Status.getText();
		//String CaseTypes = CaseType.getText();
		System.out.println("Case Number:- " + CaseNo + "Status"+CaseName+ "Case Record Type: "
				);
	    String caseDetails = "Case Number: "+ CaseNo + "  Status: " + CaseName;
	    System.out.println(caseDetails);
	    String key = "case_details_" + System.currentTimeMillis(); // Using timestamp as a unique identifier
	    FileUtils.saveToPropertiesFile("C:/Users/oyadavx/git/Intel_ISVC_R4C/Intel_ISVC_R4C/case_values.properties", key, caseDetails);

	}
	// test bulk with multiple contact
	public void EnterOutinecontactName(String ContactName) {
		EnterTextGlobalfield.sendKeys(ContactName); // Enter the third column data

	}

	public void EnterSoldToOutline(String SoldToNumber) throws InterruptedException {
		Thread.sleep(3000);
		// waitUtils.waitForElementToBeClickable(EnterSoldto, 30);
		commonclick.scrollAndClick(EnterSoldto);

		// EnterSoldto.click();
		Thread.sleep(3000);
		EnterSoldto.sendKeys(SoldToNumber);
		Thread.sleep(3000);
		// waitUtils.waitForElementToBeClickable(SelectSoldTo, 30);
		commonclick.scrollAndClick(SelectSoldTo);

		// SelectSoldTo.click();
		Thread.sleep(3000);

	}

	public void EnterMMIdsOutline(String MMID) {
		// waitUtils.waitForElementToBeClickable(ClickMMTextbox, 30);
		commonclick.scrollAndClick(ClickMMTextbox);

		// ClickMMTextbox.click();
		ClickMMTextbox.sendKeys(MMID);

	}

	public void EnterULTsBulkUpload(String ULts) {
		// Split the ULTs by commas
		String[] ULTidArray = ULts.split(",");
		System.out.println(ULTidArray);
		// Iterate through both the ULT IDs and the corresponding text boxes
		for (int i = 0; i < ULTidArray.length && i < EnterULTIDs.size(); i++) {
			WebElement ULTidInputField = EnterULTIDs.get(i); // Fetch the corresponding text field
			ULTidInputField.clear(); // Clear the field before entering new ULT ID
			ULTidInputField.sendKeys(ULTidArray[i]); // Enter each ULT ID one by one
		}

	}
	
	@FindBy(xpath="//lightning-combobox[@data-name='Sales_Issue_SoldTo_Contact__c']//lightning-base-combobox-item[2]")
	WebElement SelectSoldToContact;
	public void SelectSoldToContact() 
	{
		
		SelectSoldToContact.click();
		
	}
	
	
}
