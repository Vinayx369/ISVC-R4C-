package PageObject_Web;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
		ldriver = rdriver;
		// Initialize all PageFactory elements on this page using the WebDriver instance
		PageFactory.initElements(rdriver, this);
		waitHelper = new WaitHelper(ldriver);
		waitUtils = new WaitUtils(ldriver); // Initialize wait utility
		waitUtilsZ = new waitUtilsZ(ldriver);
		commonclick = new CommonUtils(ldriver);

	}
	
	
	/*Date: 11-12-2024
	 * Author: Omkar Yadav Change:Search Quality FLow
	 */
	
	@FindBy(xpath = "//span[normalize-space()='Search & View Return Request']")
	WebElement ClickSearchQuery ;
	@FindBy(xpath = "//input[@placeholder='Enter RMA Number']")
	WebElement EnterRMA ;
	@FindBy(xpath = "//input[@name=\"rmaNumber\"]")
	WebElement RMANo;
	@FindBy(xpath = "//button[text()=\"Search\"]")
	WebElement Searchbtn;
	@FindBy(xpath = "//tbody/tr[1]/td[3]/..//a")
	WebElement ClickonRMANumber;
	@FindBy(xpath = "//span[@class=\"fieldsol\"]//h4")
	WebElement ValidateRMA;
	@FindBy(xpath = "//input[@placeholder='Select one']")
	WebElement SoldTo;
	@FindBy(xpath = "//lightning-primitive-icon[@size='small']//*[name()='svg']")
	WebElement SelectSoldTo;
	@FindBy(xpath = "//input[@placeholder='Select Start Date']")
	WebElement StartDate;
	@FindBy(xpath = "//input[@placeholder='Select End Date']")
	WebElement EndDate;
	@FindBy(xpath = "//input[@placeholder='Enter Customer PO Number']")
	WebElement CustomerPONumber;
	@FindBy(xpath = "//input[@placeholder='Enter Return PO']")
	WebElement ReturnPONumber;
	@FindBy(xpath = "//input[@placeholder='Enter SN/VisId']")
	WebElement SNVisId;
	@FindBy(xpath = "//input[@placeholder='Product code/MM/CPN or IPN']")
	WebElement Product;
	@FindBy(xpath = "//input[@placeholder='Enter Credit Note Number']")
	WebElement CreditNoteNumber;
	@FindBy(xpath = "(//input[@placeholder='Select one'])[2]")
	WebElement CreatedBy;
	@FindBy(xpath = "//lightning-primitive-icon[@size='small']//*[name()='svg']")
	WebElement CreatedByAsIntelUser;
	@FindBy(xpath = "//lightning-primitive-icon[@size='small']//*[name()='svg']")
	WebElement CreatedByAsCustomer;
	@FindBy(xpath = "//button[@name='serviceType']")
	WebElement ServiceType;
	@FindBy(xpath = "//span[@title='Technical']")
	WebElement Technical;
	@FindBy(xpath = "//span[@title='Stock Rotation']")
	WebElement StockRotation;
	@FindBy(xpath = "//span[@title='Quality']")
	WebElement Quality;
	@FindBy(xpath = "//span[@title='Admin']")
	WebElement Admin;
	@FindBy(xpath = "//span[@title='Exception']")
	WebElement Exception;
	@FindBy(xpath = "//span[@title='Miscellaneous']")
	WebElement Miscellaneous;
	@FindBy(xpath = "//button[@name='remedy']")
	WebElement Remedy;
	@FindBy(xpath = "//span[@title='Credit']")
	WebElement Credit;
	@FindBy(xpath = "//span[@title='NPR-Credit']")
	WebElement NPRCredit;
	@FindBy(xpath = "//span[@title='Exchange']")
	WebElement Exchange;
	@FindBy(xpath = "//span[@title='Return Only']")
	WebElement ReturnOnly;
	@FindBy(xpath = "//button[@name='returnReasons']")
	WebElement ReturnReason;
	@FindBy(xpath = "//span[@title='Failed at Customer Factory Site - Credit']")
	WebElement FailedAtCustomerFactorySiteForCredit;
	@FindBy(xpath = "//span[@title='Failed at End Customer - Credit']")
	WebElement FailedAtEndCustomerForCredit;
	@FindBy(xpath = "//span[@title='Technical Sample - Credit']")
	WebElement TechnicalSampleForCredit;
	@FindBy(xpath = "//span[@title='Standard Warranty Replacement (SWR)-Technical Line - Exchange']")
	WebElement SWRTechnicalLineForExchange;
	@FindBy(xpath = "//span[@title='Advance Warranty Replacement (AWR)-Technical Line - Exchange']")
	WebElement AWRTechnicalLineForExchange;
	@FindBy(xpath = "//span[@title='Standard Warranty Replacement (SWR)-Technical Field - Exchange']")
	WebElement SWRTechnicalFieldForExchange;
	@FindBy(xpath = "//span[@title='Advance Warranty Replacement (AWR)-Technical Field - Exchange']")
	WebElement AWRTechnicalFieldForExchange;
	@FindBy(xpath = "//span[@title='Sample - NPR-Credit']")
	WebElement SampleForNPRCredit;
	
	
	public void ClickSearchQuery() {
		commonclick.scrollAndClick(ClickSearchQuery);

	}
	
	public void EnterRMANumber() {
		// Retrieve the Excel file path from the config file
		String excelFilePath = ConfigReader.getProperty("excelFilePath");
		// Retrieve data from the desired cell
		String tenthColumnData = ExcelUtils.getCellData(excelFilePath, 0, 1, 10); // 0 = sheetIndex, 1 = rowIndex, 9 =
		System.out.println("Third column data: " + tenthColumnData);
		// Enter the data into the text field if it's not empty
		if (!tenthColumnData.isEmpty()) {
			//EnterMRB.clear();
			commonclick.scrollAndClick(EnterRMA);
			EnterRMA.sendKeys(tenthColumnData); // Enter the data
		}
	}
	
	public void EnterRMANo(String string) {
		commonclick.scrollAndClick(RMANo);
		RMANo.sendKeys(string);
	}
	
	public void ClickSearchbtn() {
		commonclick.scrollAndClick(Searchbtn);
	}
	
	public void ClickonRMANumber() {
		commonclick.scrollAndClick(ClickonRMANumber);
	}
	
	public void ValidateRMANumber(WebDriver driver) throws InterruptedException {
		
//		driver.switchTo().newWindow(WindowType.TAB);
//		
//		String parentWindowHandle = driver.getWindowHandle();
//
//		Set<String> allWindowHandles = driver.getWindowHandles();
//
//		for (String windowHandle : allWindowHandles) {
//		    if (!windowHandle.equals(parentWindowHandle)) {
//		        driver.switchTo().window(windowHandle);
//		        break;
//		    }
//		}
		WindowHandles.switchToChildWindow(driver);
		Thread.sleep(5000);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Case: 06414440";
		assertEquals(expectedTitle,actualTitle);
	}

	public void EnterSoldToNo(String string) throws InterruptedException {
		commonclick.scrollAndClick(SoldTo);
		//SoldTo.click();
		SoldTo.sendKeys(string);
		Thread.sleep(2000);
		SelectSoldTo.click();
		commonclick.scrollAndClick(SelectSoldTo);
		//driver.findElement(By.xpath("//lightning-primitive-icon[@size='small']//*[name()='svg']")).click();
	}
	
	public void SelectStartDate(String string) {
		commonclick.scrollAndClick(StartDate);
		StartDate.sendKeys(string);
	}
	
	public void SelectEndDate(String string) {
		commonclick.scrollAndClick(EndDate);
		EndDate.sendKeys(string);
		
	}
	
	public void EnterCustomerPONumber(String string) {
		commonclick.scrollAndClick(CustomerPONumber);
		CustomerPONumber.sendKeys(string);
	}
	
	public void EnterReturnPONumber(String string) {
		commonclick.scrollAndClick(ReturnPONumber);
		ReturnPONumber.sendKeys(string);
	}
	
	public void EnterSerialNumber(String string) {
		commonclick.scrollAndClick(SNVisId);
		SNVisId.sendKeys(string);
	}
	
	public void EnterVisId(String string) {
		commonclick.scrollAndClick(SNVisId);
		SNVisId.sendKeys(string);
	}
	
	public void EnterMm(String string) {
		commonclick.scrollAndClick(Product);
		Product.sendKeys(string);
	}
	
	public void EnterCpn(String string) {
		commonclick.scrollAndClick(Product);
		Product.sendKeys(string);
	}
	
	public void EnterCreditNoteNumber(String string) {
		commonclick.scrollAndClick(CreditNoteNumber);
		CreditNoteNumber.sendKeys(string);
	}
	
	public void SelectCreatedByAsIntelUser(String string) throws InterruptedException {		
		commonclick.scrollAndClick(CreatedBy);
		CreatedBy.click();
		CreatedBy.sendKeys(string);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//lightning-primitive-icon[@size='small']//*[name()='svg']")).click();
		CreatedByAsIntelUser.click();
		commonclick.scrollAndClick(CreatedByAsIntelUser);
	}
	
	public void SelectCreatedByAsCustomer(String string) throws InterruptedException {
		commonclick.scrollAndClick(CreatedBy);
		CreatedBy.click();
		CreatedBy.sendKeys(string);
		Thread.sleep(2000);
		CreatedByAsCustomer.click();
		commonclick.scrollAndClick(CreatedByAsCustomer);
	}
	
	public void SelectServiceTypeAsTechnical() {
		commonclick.scrollAndClick(ServiceType);
		commonclick.scrollAndClick(Technical);
	}
	
	public void SelectServiceTypeAsStockRotation() {
		commonclick.scrollAndClick(ServiceType);
		commonclick.scrollAndClick(StockRotation);
	}
	
	public void SelectServiceTypeAsQuality() {
		commonclick.scrollAndClick(ServiceType);
		commonclick.scrollAndClick(Quality);
	}
	
	public void SelectServiceTypeAsAdmin() {
		commonclick.scrollAndClick(ServiceType);
		commonclick.scrollAndClick(Admin);
	}
	
	public void SelectServiceTypeAsException() {
		commonclick.scrollAndClick(ServiceType);
		commonclick.scrollAndClick(Exception);
	}
	
	public void SelectServiceTypeAsMiscellaneous() {
		commonclick.scrollAndClick(ServiceType);
		commonclick.scrollAndClick(Miscellaneous);
	}
	
	public void SelectRemedyAsCredit() {
		commonclick.scrollAndClick(Remedy);
		commonclick.scrollAndClick(Credit);
	}
	
	public void SelectRemedyAsNPRCredit() {
		commonclick.scrollAndClick(Remedy);
		commonclick.scrollAndClick(NPRCredit);
	}
	
	public void SelectRemedyAsExchange() {
		commonclick.scrollAndClick(Remedy);
		commonclick.scrollAndClick(Exchange);
	}
	
	public void SelectRemedyAsReturnOnly() {
		commonclick.scrollAndClick(Remedy);
		commonclick.scrollAndClick(ReturnOnly);
	}
	
	public void SelectReturnReasonAsFailedAtCustomerFactorySiteForCredit() {
		commonclick.scrollAndClick(ReturnReason);
		commonclick.scrollAndClick(FailedAtCustomerFactorySiteForCredit);
	}
	
	public void SelectReturnReasonAsFailedAtEndCustomerForCredit() {
		commonclick.scrollAndClick(ReturnReason);
		commonclick.scrollAndClick(FailedAtEndCustomerForCredit);
	}
	public void SelectReturnReasonAsTechnicalSampleForCredit() {
		commonclick.scrollAndClick(ReturnReason);
		commonclick.scrollAndClick(TechnicalSampleForCredit);
	}
	public void SelectReturnReasonAsSWRTechnicalLineForExchange() {
		commonclick.scrollAndClick(ReturnReason);
		commonclick.scrollAndClick(SWRTechnicalLineForExchange);
	}
	
	public void SelectReturnReasonAsAWRTechnicalLineForExchange() {
		commonclick.scrollAndClick(ReturnReason);
		commonclick.scrollAndClick(AWRTechnicalLineForExchange);
	}
	
	public void SelectReturnReasonAsSWRTechnicalFieldForExchange() {
		commonclick.scrollAndClick(ReturnReason);
		commonclick.scrollAndClick(SWRTechnicalFieldForExchange);
	}
	
	public void SelectReturnReasonAsAWRTechnicalFieldForExchange() {
		commonclick.scrollAndClick(ReturnReason);
		commonclick.scrollAndClick(AWRTechnicalFieldForExchange);
	}
	
	public void SelectReturnReasonAsNPRCreditForNPRCredit() {
		commonclick.scrollAndClick(ReturnReason);
		commonclick.scrollAndClick(SampleForNPRCredit);
	}
	
}
