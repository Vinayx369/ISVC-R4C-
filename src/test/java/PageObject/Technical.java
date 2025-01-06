package PageObject;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

import Utilities.ConfigReader;
import Utilities.ExcelUtils;
import Utilities.ScreenshotUtil;
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
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class Technical {
	public WebDriver ldriver;
	public WebDriver driver;
	public WaitHelper waitHelper;
	public WaitUtils waitUtils;
	public waitUtilsZ waitUtilsZ;
	public CommonUtils commonclick;
    public ScreenshotUtil Screnshot;
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
	/*
	 * Author: Omkar Yadav Change:Technical Case Creation Description:
	 */
	@FindBy(xpath = "//lightning-base-combobox-item[1]//span[2]")
	WebElement SelectRSFaildAtCustomerFactory;
	@FindBy(xpath = "//button[@title=\"Warranty Entitlement Check\"]")
	WebElement ClickOnWarrentyEntitlement;
	@FindBy(xpath = "//input[@placeholder='Enter Product Unique Id']")
	WebElement EnterUID;
	@FindBy(xpath = "//span[normalize-space()='Accept']")
	WebElement Acceptclick;
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
	@FindBy(xpath = "//a[normalize-space()='MM']//preceding::div[@class='slds-th__action slds-th__action_form']")
	WebElement Unselectallcheckbox; // new Above xpath old
	@FindBy(xpath = "//body//div//lightning-base-combobox-item[2]")
	WebElement ReturnReasonFaildEndCustomer;
	@FindBy(xpath = "//body//div//lightning-base-combobox-item[1]//preceding::button[@aria-label='Remedy']")
	WebElement selectremedy;
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
	@FindBy(xpath = "//a[normalize-space()='MM']/../..//span[@part='indicator']")
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
	@FindBy(xpath = "//li//button[contains(text(),'Cancel')]//following::button[contains(text(),'Next')]")
	WebElement ClickNEXT;
	@FindBy(xpath = "//span[@title='Credit']//following::span[@title='Exchange']")
	WebElement SelectExchange;
	@FindBy(xpath = "//span[@title='Standard Warranty Replacement (SWR)-Technical Line']")
	WebElement SelectreasonSWRTL;
	@FindBy(xpath = "//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']")
	WebElement selectSoldtoOption;
	@FindBy(xpath = "//label[text()=\"Sold To Contact\"]")
	WebElement soldtocontact;
	@FindBy(xpath = "//lightning-combobox[@data-name='Sales_Issue_SoldTo_Contact__c']//lightning-base-combobox-item[1]")
	WebElement selectsoldtocontact;
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
	@FindBy(xpath = "//c-r4c_-a-g_-case-header//div//div[@role='none']//span[contains(text(),'Intel Managed Freight')]")
	WebElement IMFType;
	@FindBy(xpath = "//records-entity-label[normalize-space()='Case']//following::lightning-formatted-text[@slot='primaryField']")
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
	List<WebElement> EnterULTIDs;
	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement EnterTextGlobalfield;
	@FindBy(xpath = "//button[@aria-label='Search']/..//lightning-primitive-icon[@variant='bare']")
	WebElement clickGlobal;
	@FindBy(xpath = "//lightning-combobox[@data-name='Sales_Issue_SoldTo_Contact__c']//lightning-base-combobox-item[2]")
	WebElement SelectSoldToContact;
	@FindBy(xpath = "//div[@data-target-selection-name='sfdc:RecordField.Case.Status']//div//dd//div//span")
	WebElement Status;
	@FindBy(xpath = "(//span[@class=\"slds-radio_faux\"])[1]")
	WebElement SelectCheckbox;
	@FindBy(xpath = "//input[@placeholder='Enter comma separated ULTs']")
	List<WebElement> EnterULTsForExchange;
	@FindBy(xpath = "//button[text()=\"Search\"]")
	WebElement ClickSearch;
	@FindBy(xpath = "//span[@title='Advance Warranty Replacement (AWR)-Technical Line']")
	WebElement SelectAWRTL;
	@FindBy(xpath = "//span[@title='Standard Warranty Replacement (SWR)-Technical Field']")
	WebElement SelectSWRTLF;
	@FindBy(xpath = "//span[@title='Advance Warranty Replacement (AWR)-Technical Field']")
	WebElement SelectAWETF;
	@FindBy(xpath = "//input[@placeholder=\"Enter the R4E Case Number\"]")
	WebElement EnterR4E;
	@FindBy(xpath = "//a[@data-label='R4C Case Header']/../..//a[@data-label='Details'][normalize-space()='Details']")
	WebElement ClickDetails;
	@FindBy(xpath = "//div[@aria-hidden='true']//img[@title='Case']")
	WebElement SelectCase;
	@FindBy(xpath = "//button[normalize-space()='Reset']//preceding::input[@placeholder='Enter the Order Part Number']")
	WebElement EnterOPN;

	public void soldtocontact() {
		commonclick.scrollAndClick(soldtocontact);
	}

	public void selectsoldtocontact() {
		commonclick.scrollAndClick(selectsoldtocontact);
	}

	public void SelectRSFaildAtCustomerFactory() {
		commonclick.scrollAndClick(SelectRSFaildAtCustomerFactory);
	}

	public void ClickOnWarrentyEntitlement() {
		commonclick.scrollAndClick(ClickOnWarrentyEntitlement);
	}
	public void clickOnWarrantyEntitlementClick() {
	    // Scroll and click on the Warranty Entitlement element
	    commonclick.scrollAndClick(ClickOnWarrentyEntitlement);

	    try {
	    	ClickOnWarrentyEntitlement.click();
	    } catch (Exception e) {
	        // Handle the exception (you can log it or take other actions as needed)
	        System.out.println("An error occurred while clicking on Warranty Entitlement: " + e.getMessage());
	    }
	}


	public void clickonaccept() {
		commonclick.scrollAndClick(Acceptclick);
	}

	public void POhistoryCheck() {
		commonclick.scrollAndClick(POHistoryCheck);
	}

	public void clickonOkButton() {
		commonclick.scrollAndClick(ClickonOkButton);
	}

	public void clickonNext() {
		commonclick.scrollAndClick(ClickonNEXT);
	}

	public void ClickOnCreditpriceValidation() {
		commonclick.scrollAndClick(ClickOnCreditpriceValidation);
	}

	public void SelectFirstCheckbox() {
		commonclick.scrollAndClick(SelectFirstCheckbox);
	}

	public void Unselectallcheckbox() {
		waitUtils.waitForElementToBeClickable(Unselectallcheckbox, 30);
		commonclick.scrollAndClick(Unselectallcheckbox);
	}

	public void ReturnReasonFaildEndCustomer() {
		commonclick.scrollAndClick(ReturnReasonFaildEndCustomer);
	}

	public void selectremedy() {
		commonclick.scrollAndClick(selectremedy);

	}

	public void RCA() {
		commonclick.scrollAndClick(RCA);
	}

	public void SelectRCA() {
		commonclick.scrollAndClick(SelectRCA);
	}

	public void ClickCA() {
		commonclick.scrollAndClick(ClickCA);
	}

	public void SelectCA() {
		commonclick.scrollAndClick(SelectCA);
	}

	public void ClickRCC() {
		commonclick.scrollAndClick(ClickRCC);
	}

	public void selectRCC() {
		commonclick.scrollAndClick(SelectRCC);
	}

	public void NextAfterCheckAll() {
		commonclick.scrollAndClick(NextAfterCheckAll);
	}

	public void ClickOnAll() {
		commonclick.scrollAndClick(ClickOnAll);
	}

	public void Selectfirst() {
		commonclick.scrollAndClick(SelectF);
	}

	public void SelectFailedatCustomerFactorySite() {
		commonclick.scrollAndClick(SelectFailedatCustomerFactorySite);
	}

	public void FailedatEndCustomer() {
		commonclick.scrollAndClick(FailedatEndCustomer);
	}
//---------------Technical >100k

	public void PricerGreterThan100K() {

		EnterPrice100k.sendKeys("100000");
	}

	public void SelectNPR() {

		commonclick.scrollAndClick(SelectNPR);
	}

	public void ClickOnNPR() {
		commonclick.scrollAndClick(ClickOnNPR);
	}

	public void SelectReason() {
		commonclick.scrollAndClick(SelectReasin);
	}

	public void SelectreasonFCFS() {
		commonclick.scrollAndClick(SelectreasonFCFS);
	}

	public void SelectPromationalStockRoatation() {
		commonclick.scrollAndClick(SelectPromationalStockRoatation);
	}

	public void SelectFailcustomer() {
		commonclick.scrollAndClick(SelectFailcustomer);
	}

	public void SelectWarrentyService() {
		commonclick.scrollAndClick(SelectWarrentyService);
	}

	public void SelectSimpleReason() {
		commonclick.scrollAndClick(SelectSimpleReason);
	}

	public void EnterULT(String ULT) {
		commonclick.scrollAndClick(EnterULT);
		EnterULT.sendKeys(ULT);
	}

	public void Selectcredit() {
		commonclick.scrollAndClick(Selectcredit);
	}

	public void CreditOption() {
		commonclick.scrollAndClick(CreditOption);
	}

	public void ClickOnULTDownload() {
		commonclick.scrollAndClick(ClickOnULTDownload);
	}

	public void ClickonOk() {
		commonclick.scrollAndClick(ClickonOk);
	}

	public void faildatcustomersite() {
		commonclick.scrollAndClick(faildatcustomersite);
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
		}

	}

	public void ClickOnNEXTAfterEditfirst() {
		commonclick.scrollAndClick(ClickOnNEXTAfterEdit);

	}

	public void ClickOnNEXTAfterEditsecond() {
		commonclick.scrollAndClick(ClickOnNEXTAfterEdit);
	}

	public void ClickOnNEXTAfterEditthird() {
		commonclick.scrollAndClick(ClickOnNEXTAfterEdit);
	}

	public void checkRMAStatus() {
		String actualText = rmaStatusElement.getText();
		String expectedText = "RMA Authorized";
		// Assert that the actual text matches the expected text
		Assert.assertEquals(actualText, expectedText, "RMA status does not match the expected value.");
		// Output the status to the console (optional)
		System.out.println("RMA status verified: " + actualText);

	}

	public void ClickMMTextbox() {
		// Path to the Excel file
		String excelFilePath = "C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Automation Test data.xlsx";

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
				Cell cell = currentRow.getCell(2); // Only get the first column (index 0)

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
		String excelFilePath = "C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Automation Test data.xlsx";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

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
				Cell secondColumnCell = currentRow.getCell(3); // Get value from the 4th column (index 3)

				if (secondColumnCell != null) {
					String idToEnter = "";
					switch (secondColumnCell.getCellType()) {
					case STRING:
						idToEnter = secondColumnCell.getStringCellValue().trim();
						break;
					case NUMERIC:
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

					if (!idToEnter.isEmpty()) {
						// Get the current text field based on the index
						WebElement textField = EnterULTIDs.get(textFieldIndex);

						try {
							// Wait for the text field to be visible and clickable
							wait.until(ExpectedConditions.visibilityOf(textField));
							wait.until(ExpectedConditions.elementToBeClickable(textField));

							textField.clear(); // Clear any existing value
							textField.sendKeys(idToEnter); // Enter the value from the Excel sheet
							textFieldIndex++; // Move to the next text field
						} catch (NoSuchElementException e) {
							System.out.println("Element not found: " + e.getMessage());
						} catch (TimeoutException e) {
							System.out.println("Element not available within the specified time: " + e.getMessage());
						} catch (ElementNotInteractableException e) {
							System.out.println("Element not interactable: " + e.getMessage());
						}
					}
				}
			}

			workbook.close();
			excelFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//	public void EnterULTs() throws InterruptedException {
//		String excelFilePath = "C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Automation Test data.xlsx";
//		try {
//			FileInputStream excelFile = new FileInputStream(new File(excelFilePath));
//			Workbook workbook = new XSSFWorkbook(excelFile);
//			Sheet sheet = workbook.getSheetAt(0); // Assuming values are in the first sheet
//			// Iterate through each row in the sheet and each text field
//			Iterator<Row> iterator = sheet.iterator();
//			int textFieldIndex = 0; // Index for text fields
//			// Skip the header row
//			if (iterator.hasNext()) {
//				iterator.next(); // Skip the header row
//			}
//			while (iterator.hasNext() && textFieldIndex < EnterULTIDs.size()) {
//				Row currentRow = iterator.next();
//
//				// Get value from the second column (index 1)
//				Cell secondColumnCell = currentRow.getCell(3); // For the ID to be entered
//
//				if (secondColumnCell != null) {
//					String idToEnter = "";
//					switch (secondColumnCell.getCellType()) {
//					case STRING:
//						idToEnter = secondColumnCell.getStringCellValue().trim();
//						break;
//					case NUMERIC:
//						// Handle numeric types
//						idToEnter = String.valueOf((int) secondColumnCell.getNumericCellValue());
//						break;
//					case BOOLEAN:
//						idToEnter = String.valueOf(secondColumnCell.getBooleanCellValue());
//						break;
//					case FORMULA:
//						idToEnter = secondColumnCell.getCellFormula();
//						break;
//					case BLANK:
//						idToEnter = "";
//						break;
//					default:
//						idToEnter = secondColumnCell.toString().trim();
//					}
//					System.out.println(idToEnter);
//					if (!idToEnter.isEmpty()) {
//						// Get the current text field based on the index
//						WebElement textField = EnterULTIDs.get(textFieldIndex);
//						textField.clear(); // Clear any existing value
//						textField.sendKeys(idToEnter);
//						textFieldIndex++; // Move to the next text field
//					}
//				}
//			}
//
//			workbook.close();
//			excelFile.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//
//		}
////Thread.sleep(3000);
//	}

	public void EnterULT() throws InterruptedException {
		// Path to the Excel file
		String excelFilePath = "C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Automation Test data.xlsx";

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

				// Get value from the Third column (index 3)
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
						// Thread.sleep(2000);
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
	}

	public void SelectRCAOptinOut() {
		commonclick.scrollAndClick(SelectRCAOptinOut);
	}

	// ---------------------------Global text enter through Excel POC

//	public void EnterGlobalTextthrouhExcel() {
//		// Path to the Excel file
//		String excelFilePath = "C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Automation Test data.xlsx";
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
//			// Variable to store the third column data
//			String thirdColumnData = "";
//
//			if (iterator.hasNext()) {
//				Row currentRow = iterator.next(); // Get the next row (first data row)
//
//				// Get value from the third column (index 2)
//				Cell thirdColumnCell = currentRow.getCell(0); // Third column (index starts from 0)
//
//				if (thirdColumnCell != null) {
//					switch (thirdColumnCell.getCellType()) {
//					case STRING:
//						thirdColumnData = thirdColumnCell.getStringCellValue().trim();
//						break;
//					case NUMERIC:
//						thirdColumnData = String.valueOf((int) thirdColumnCell.getNumericCellValue());
//						break;
//					case BOOLEAN:
//						thirdColumnData = String.valueOf(thirdColumnCell.getBooleanCellValue());
//						break;
//					case FORMULA:
//						thirdColumnData = thirdColumnCell.getCellFormula();
//						break;
//					case BLANK:
//						thirdColumnData = "";
//						break;
//					default:
//						thirdColumnData = thirdColumnCell.toString().trim();
//					}
//
//					System.out.println("Third column data: " + thirdColumnData);
//
//					// Enter the third column data into the global text field
//					if (!thirdColumnData.isEmpty()) {
//						// clickGlobal.click();
//	                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	                    WebElement globalTextField = wait.until(ExpectedConditions.elementToBeClickable(EnterTextGlobalfield));
//
//						commonclick.scrollAndClick(EnterTextGlobalfield);
//						EnterTextGlobalfield.clear(); // Clear any existing value
//						EnterTextGlobalfield.sendKeys(thirdColumnData); // Enter the third column data
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

	public void EnterGlobalTextthrouhExcel() {
		// Retrieve the Excel file path from the config file
		String excelFilePath = ConfigReader.getProperty("excelFilePath");

		// Retrieve data from the desired cell
		String thirdColumnData = ExcelUtils.getCellData(excelFilePath, 0, 1, 0); // 0 = sheetIndex, 1 = rowIndex, 5 =
																					// cellIndex

		System.out.println("Third column data: " + thirdColumnData);

		// Enter the data into the text field if it's not empty
		if (!thirdColumnData.isEmpty()) {
			EnterTextGlobalfield.clear(); // Clear any existing value
			EnterTextGlobalfield.sendKeys(thirdColumnData); // Enter the data
		}
	}

	public void EnterGlobalcasethrouhExcel() {
		// Path to the Excel file
		String excelFilePath = "C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Automation Test data.xlsx";

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
				Cell thirdColumnCell = currentRow.getCell(10); // Third column (index starts from 0)

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
						commonclick.scrollAndClick(EnterTextGlobalfield);
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

	public void SelectCase() {

		commonclick.scrollAndClick(SelectCase);
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

	public void enterSlodToExcel() throws InterruptedException {
		// Path to the Excel file
		String excelFilePath = "C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Automation Test data.xlsx";

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

					if (!thirdColumnData.isEmpty()) {
						commonclick.scrollAndClick(EnterSoldto);
						Thread.sleep(2000);
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

//	public void enterSlodToExcel() {
//		// Retrieve the Excel file path from the config file
//		String excelFilePath = ConfigReader.getProperty("excelFilePath");
//
//		// Retrieve data from the desired cell
//		String thirdColumnData = ExcelUtils.getCellData(excelFilePath, 0, 1, 1); // 0 = sheetIndex, 1 = rowIndex, 5 =
//																					// cellIndex
//
//		System.out.println("Third column data: " + thirdColumnData);
//
//		// Enter the data into the text field if it's not empty
//		if (!thirdColumnData.isEmpty()) {
//			commonclick.scrollAndClick(EnterSoldto);
//			EnterSoldto.clear(); // Clear any existing value
//			EnterSoldto.sendKeys(thirdColumnData); // Enter the data
//		}
//	}

//	public void enteropn() {
//		// Path to the Excel file
//		String excelFilePath = "C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Automation Test data.xlsx";
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
//			// Variable to store the third column data
//			String thirdColumnData = "";
//
//			if (iterator.hasNext()) {
//				Row currentRow = iterator.next(); // Get the next row (first data row)
//
//				// Get value from the third column (index 2)
//				Cell thirdColumnCell = currentRow.getCell(6); // Third column (index starts from 0)
//
//				if (thirdColumnCell != null) {
//					switch (thirdColumnCell.getCellType()) {
//					case STRING:
//						thirdColumnData = thirdColumnCell.getStringCellValue().trim();
//						break;
//					case NUMERIC:
//						thirdColumnData = String.valueOf((int) thirdColumnCell.getNumericCellValue());
//						break;
//					case BOOLEAN:
//						thirdColumnData = String.valueOf(thirdColumnCell.getBooleanCellValue());
//						break;
//					case FORMULA:
//						thirdColumnData = thirdColumnCell.getCellFormula();
//						break;
//					case BLANK:
//						thirdColumnData = "";
//						break;
//					default:
//						thirdColumnData = thirdColumnCell.toString().trim();
//					}
//
//					System.out.println("Third column data: " + thirdColumnData);
//
//					if (!thirdColumnData.isEmpty()) {
//						commonclick.scrollAndClick(EnterOPN);
//						EnterOPN.sendKeys(thirdColumnData); // Enter the third column data
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

	public void enteropn() {
		// Retrieve the Excel file path from the config file
		String excelFilePath = ConfigReader.getProperty("excelFilePath");

		// Retrieve data from the desired cell
		String thirdColumnData = ExcelUtils.getCellData(excelFilePath, 0, 1, 6); // 0 = sheetIndex, 1 = rowIndex, 5 =
																					// cellIndex

		System.out.println("Third column data: " + thirdColumnData);

		// Enter the data into the text field if it's not empty
		if (!thirdColumnData.isEmpty()) {
			EnterOPN.clear(); // Clear any existing value
			EnterOPN.sendKeys(thirdColumnData); // Enter the data
		}
	}

	public void PrintCaseNo() {

		String CaseNo = PrintCaseNo.getText();
		String CaseTypes = CaseType.getText();
		System.out.println("Technical Case No:- " + CaseNo + " Case Type:" + CaseTypes);
		Assert.assertEquals(CaseTypes, "Technical Intake", "Case Type is not as expected!");// Assert that the CaseTypes

	}

	public void ClickDetails() {
		commonclick.scrollAndClick(ClickDetails);
	}

//	public void PrintCaseNoSR() throws InterruptedException {
//		
//		
//		String CaseNo = PrintCaseNo.getText(); // Assuming PrintCaseNo is already defined WebElement
//		String CaseName = Status.getText(); // Assuming Status is already defined WebElement
//
//		// Get the current date and time
//		LocalDateTime currentDateTime = LocalDateTime.now();
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//		String formattedDateTime = currentDateTime.format(formatter);
//
//		// Print case details with date and time
//		System.out.println("Case Number-" + CaseNo + " Status-" + CaseName + " Date and Time-" + formattedDateTime);
//
//		String caseDetails = "Case Number-" + CaseNo + "  Status-" + CaseName + "  Date and Time-" + formattedDateTime;
//		System.out.println(caseDetails);
//
//		// Use Case Number as the unique key to store the case details
//		String key = "Case_Details_" + CaseNo;
//
//		// Save the case details into the properties file
//		FileUtils.saveToPropertiesFile("C:/Users/oyadavx/git/Intel_ISVC_R4C/Intel_ISVC_R4C/case_values.properties", key,
//				caseDetails);
//	}
//	

	
	public void PrintCaseNoSR() throws InterruptedException {
		Thread.sleep(2000);
		String CaseNo = PrintCaseNo.getText(); // Assuming PrintCaseNo is already defined WebElement
		System.out.println("Case No: " + CaseNo);
		// Get the current date and time
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime = currentDateTime.format(formatter);

		// Prepare case details without the CaseName (Status)
		String caseDetails = "Case Number-" + CaseNo + "  Date and Time-" + formattedDateTime;

		// Use Case Number as the unique key to store the case details
		String key = "Case_Details_" + CaseNo;

		// Save the case details into the properties file
		FileUtils.saveToPropertiesFile("C:/Users/oyadavx/git/Intel_ISVC_R4C/Intel_ISVC_R4C/case_values.properties", key,
				caseDetails);
	}

	public void EnterOutinecontactName(String ContactName) {
		EnterTextGlobalfield.sendKeys(ContactName); // Enter the third column data

	}

	public void EnterSoldToOutline(String SoldToNumber) throws InterruptedException {
		Thread.sleep(3000);
		commonclick.scrollAndClick(EnterSoldto);
		Thread.sleep(3000);
		EnterSoldto.sendKeys(SoldToNumber);
		Thread.sleep(3000);
		commonclick.scrollAndClick(SelectSoldTo);
		Thread.sleep(3000);

	}

	public void EnterMMIdsOutline(String MMID) {
		commonclick.scrollAndClick(ClickMMTextbox);
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

	public void SelectSoldToContact() {
		commonclick.scrollAndClick(SelectSoldToContact);
		// SelectSoldToContact.click();

	}

	public void selectSoldtoOption() {
		commonclick.scrollAndClick(selectSoldtoOption);

	}
//Technical Exchange 

	public void SelectreasonSWRTL() {

		commonclick.scrollAndClick(SelectreasonSWRTL);
	}

	public void SelectExchange() {

		commonclick.scrollAndClick(SelectExchange);
	}

	public void SelectCheckbox() {
		commonclick.scrollAndClick(SelectCheckbox);
	}

	public void ClickSearch() {
		commonclick.scrollAndClick(ClickSearch);
	}

	public void EnterULTsForExchange() {
		// Path to the Excel file
		String excelFilePath = "C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Automation Test data.xlsx";

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

		// Enter the concatenated values into the first element in the list
		if (!EnterULTsForExchange.isEmpty()) {
			EnterULTsForExchange.get(0).sendKeys(allValues.toString()); // Use the first field or specify the index
		} else {
			System.out.println("No elements found for EnterULTsForExchange.");
		}
	}

	public void SelectAWRTL() {
		commonclick.scrollAndClick(SelectAWRTL);
	}

	public void SelectSWRTF() {
		commonclick.scrollAndClick(SelectSWRTLF);
	}

	public void SelectAWETF() {
		commonclick.scrollAndClick(SelectAWETF);
	}

	public void EnterR4E() {
		// Path to the Excel file
		String excelFilePath = "C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Automation Test data.xlsx";

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

				Cell thirdColumnCell = currentRow.getCell(12); // Third column (index starts from 0)

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
						commonclick.scrollAndClick(EnterR4E);
						EnterR4E.clear(); // Clear any existing value
						EnterR4E.sendKeys(thirdColumnData); // Enter the third column data
					}
				}
			}

			workbook.close();
			excelFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void ClickNEXT() {
		commonclick.scrollAndClick(ClickNEXT);
	}

}
