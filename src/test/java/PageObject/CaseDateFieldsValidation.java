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

import static org.testng.Assert.assertEquals;

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
import Utilities.WindowHandles;
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

public class CaseDateFieldsValidation {
	public WebDriver ldriver;
	public WebDriver driver;
	public WaitHelper waitHelper;
	public WaitUtils waitUtils;
	public waitUtilsZ waitUtilsZ;
	public CommonUtils commonclick;
    public ScreenshotUtil Screnshot;
	// private WebDriver rdriver;
    public CaseDateFieldsValidation(WebDriver rdriver) {
		// Assign the passed WebDriver instance to the class variable
		ldriver = rdriver;
		// Initialize all PageFactory elements on this page using the WebDriver instance
		PageFactory.initElements(rdriver, this);
		waitHelper = new WaitHelper(driver); // Initialize WaitHelper
		waitUtils = new WaitUtils(ldriver);
		waitUtilsZ = new waitUtilsZ(ldriver);
		commonclick = new CommonUtils(ldriver);
	}
    
    /*
	 * Author: Vinay Kumar Ganji
	 */
    
	@FindBy(xpath = "(//table[@class='slds-table slds-table_bordered']//tbody//td[2])[1]//a")
	WebElement LineItem;
	@FindBy(xpath = "(//*[@field-label='Header Number']//span)[5]")
	WebElement HeaderRecord;
	@FindBy(xpath = "//button[text()=\"Search...\"]")
	WebElement GlobalSearch;
	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement EnterTextGlobalSearch;
	@FindBy(xpath = "//body/div/div/div[@role='dialog']/div/div/div/div/div/div/search_dialog-instant-results-list[@aria-controls='preview']/div[@aria-label='Suggestions']/search_dialog-instant-result-item[1]/div[1]")
	WebElement SelectGlobalSearchCase;
	@FindBy(xpath = "(//span[contains(text(),'Case Expiry Date')]//following::span)[1]")		
	WebElement ExpiryDate;
	@FindBy(xpath = "(//span[contains(text(),'Day 21st After RMA Approval')]//following::span)[1]")		
	WebElement Case21stDateAfterRMAApproval;
	@FindBy(xpath = "(//span[contains(text(),'Day 14th After RMA Approval')]//following::span)[1]")		
	WebElement Case14thDateAfterRMAApproval;
	@FindBy(xpath = "(//span[normalize-space()='Approved Date']/../../..//span)[2]")		
	WebElement ApprovedDate;
	@FindBy(xpath = "(//span[normalize-space()='Collection Date']/../../..//span)[2]")		
	WebElement CollectionDate;
	@FindBy(xpath = "(//span[normalize-space()='Created Date']/../../..//div)[7]")		
	WebElement CreatedDate;
	@FindBy(xpath = "(//span[normalize-space()='Case Submitted Date']/../../..//div)[10]")		
	WebElement CaseSubmittedDate;
	@FindBy(xpath = "(//span[normalize-space()='International Commerce Term']/../../..//div)[19]")		
	WebElement InternationalCommerceTerm;
	
	
	
	public void ClickOnLineItem() {
		commonclick.scrollAndClick(LineItem);
	}
	
	public void ClickOnHeaderRecord() throws InterruptedException {
		commonclick.scrollAndClick(HeaderRecord);
	}
	
	public void clickGlobalSearch() {
		commonclick.scrollAndClick(GlobalSearch);
	}
	
	public void EnterTextGlobalSearch(String string) {
		commonclick.scrollAndClick(EnterTextGlobalSearch);
		EnterTextGlobalSearch.sendKeys(string);
	}
	
	public void SelectGlobalSearchCase() {
		commonclick.scrollAndClick(SelectGlobalSearchCase);
	}
	
	public void ValidateCaseExpiryDate() {
		String actualTitle = ExpiryDate.getText();
		Assert.assertFalse(actualTitle.isEmpty(), "Text is present or not");
		System.out.println("Assertion passed, 'test' is present.");
		System.out.println("Case Expiry Date: " + actualTitle);
	}
	
	public void Validate21stDateAfterRMAApproval() {
		String actualTitle = Case21stDateAfterRMAApproval.getText();
		Assert.assertFalse(actualTitle.isEmpty(), "Text is present or not");
		System.out.println("Assertion passed, 'test' is present.");
		System.out.println("21st Date After RMA Approval: " + actualTitle);
	}
	
	public void Validate14thDateAfterRMAApproval() {
		String actualTitle = Case14thDateAfterRMAApproval.getText();
		Assert.assertFalse(actualTitle.isEmpty(), "Text is present or not");
		System.out.println("Assertion passed, 'test' is present.");
		System.out.println("14th Date After RMA Approval: " + actualTitle);
	}
	
	public void ValidateApprovedDate() {
		String actualTitle = ApprovedDate.getText();
		Assert.assertFalse(actualTitle.isEmpty(), "Text is present or not");
		System.out.println("Assertion passed, 'test' is present.");
		System.out.println("Approved Date: " + actualTitle);
	}
	
	public void ValidateCollectionDate() {
		String actualTitle = CollectionDate.getText();
		Assert.assertFalse(actualTitle.isEmpty(), "Text is present or not");
		System.out.println("Assertion passed, 'test' is present.");
		System.out.println("Collection Date: " + actualTitle);
	}
	
	public void ValidateCreatedDate() {
		String actualTitle = CreatedDate.getText();
		Assert.assertFalse(actualTitle.isEmpty(), "Text is present or not");
		System.out.println("Assertion passed, 'test' is present.");
		System.out.println("Created Date: " + actualTitle);
	}
	
	public void ValidateCaseSubmittedDate() {
		String actualTitle = CaseSubmittedDate.getText();
		Assert.assertFalse(actualTitle.isEmpty(), "Text is present or not");
		System.out.println("Assertion passed, 'test' is present.");
		System.out.println("Case Submitted Date: " + actualTitle);
	}
	
	public void ValidateInternationalCommerceTerm() {
		String actualTitle = InternationalCommerceTerm.getText();
		Assert.assertFalse(actualTitle.isEmpty(), "Text is present or not");
		System.out.println("Assertion passed, 'test' is present.");
		System.out.println("International Commerce Term: " + actualTitle);
	}
	
	
	
}	