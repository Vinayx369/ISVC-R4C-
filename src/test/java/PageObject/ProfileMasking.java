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

public class ProfileMasking {
	public WebDriver ldriver;
	public WebDriver driver;
	public WaitHelper waitHelper;
	public WaitUtils waitUtils;
	public waitUtilsZ waitUtilsZ;
	public CommonUtils commonclick;
    public ScreenshotUtil Screnshot;
	// private WebDriver rdriver;
    public ProfileMasking(WebDriver rdriver) {
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
    
	@FindBy(xpath = "//span[normalize-space()='App Launcher']")
	WebElement AppLauncher;
	@FindBy(xpath = "//input[@placeholder='Search apps and items...']")
	WebElement AppLauncherTextbox;
	@FindBy(xpath = "//b[normalize-space()='Price & Profile Masking']")
	WebElement PriceProfileMasking;
	@FindBy(xpath = "//span[starts-with(text(),'Profile Masking')]")
	WebElement ProfileMaskingbtn;
	@FindBy(xpath = "//button[contains(text(),'Next')]")
	WebElement Nextbtn;
	@FindBy(xpath = "//span[contains(text(),'User Profile Masking')]")
	WebElement UserProfileMaskingbtn;
	@FindBy(xpath = "//button[@aria-label='User Profile Masking']")
	WebElement UserProfileMaskingdropdown;
	@FindBy(xpath = "//span[contains(text(),'First Name')]")
	WebElement FirstName;
	@FindBy(xpath = "//span[contains(text(),'Last Name')]")
	WebElement LastName;
	@FindBy(xpath = "//span[contains(text(),'Email')]")
	WebElement Email;
	@FindBy(xpath = "//span[contains(text(),'Login Name')]")
	WebElement LoginName;
	@FindBy(xpath = "//input[@placeholder='Please enter minimum 3 characters to Search']")
	WebElement EnterTextbox;
	@FindBy(xpath = "//button[@title='Search']")
	WebElement Searchbtn;
	@FindBy(xpath = "(//span[@class='slds-checkbox_faux'])[3]")
	WebElement Checkbox;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement Savebtn;
	@FindBy(xpath = "//button[@aria-label='Search']")
	WebElement GlobalSearch;
	@FindBy(xpath = "//body/div/div/div[@role='dialog']/div/div/div/div/div/div/search_dialog-instant-results-list[@aria-controls='preview']/div[@aria-label='Suggestions']/search_dialog-instant-result-item[2]/div[1]")
	WebElement SelectContact;
	@FindBy(xpath = "//button[contains(text(),'Log in to Experience as User')]")
	WebElement LogintoExperienceasUserbutton;
	@FindBy(xpath = "//div[contains(text(),'The system is unable to display the information requested. Please contact your local Intel RMA Customer support team.')]")
	WebElement ValidateErrorMessage;
	@FindBy(xpath = "(//span[normalize-space()='2']//following::td)[1]//*[@data-name='Amy r4c']")
	WebElement GearIconAtContact;
	@FindBy(xpath = "(//span[normalize-space()='4']//following::td)[1]//*[@data-name='0000024100']")
	WebElement GearIconAtSoldTo;
	@FindBy(xpath = "(//span[normalize-space()='4']//following::td)[2]//*[@data-name='Create Mask']//span[@part='indicator']")
	WebElement UserProfileMaskSoldToCreateMaskCheckbox;
	@FindBy(xpath = "(//span[normalize-space()='4']//following::td)[3]//*[@data-name='View Mask']//span[@part='indicator']")
	WebElement UserProfileMaskSoldToViewMaskCheckbox;
	@FindBy(xpath = "((//span[normalize-space()='1'])[3]//following::td)[1]//*[@data-name='Create Mask']")
	WebElement UserProfileMaskShipToCreateMaskCheckbox;
	@FindBy(xpath = "((//span[normalize-space()='1'])[3]//following::td)[2]//*[@data-name='View Mask']")
	WebElement UserProfileMaskShipToViewMaskCheckbox;
	@FindBy(xpath = "//span[contains(text(),'Create Case')]")
	WebElement CaseCreatebtn;
	@FindBy(xpath = "//button[contains(text(),'Create')]")
	WebElement Createbtn;
	@FindBy(xpath = "(//input[@placeholder='Select one'])[1]")
	WebElement SoldTo;
	@FindBy(xpath = "//lightning-primitive-icon[@size='small']//*[name()='svg']")
	WebElement SoldToCount;
	@FindBy(xpath = "(//td[@class='slds-cell-edit']//*[@data-key='download'])[2]")
	WebElement ExportMaskingDataForContact;
	@FindBy(xpath = "(//td[@class='slds-cell-edit']//*[@data-key='download'])[7]")
	WebElement ExportMaskingDataForSoldTo;
	@FindBy(xpath = "//span[contains(text(),'Customer Profile Masking')]")
	WebElement CustomerProfileMaskingbtn;
	@FindBy(xpath = "//button[@aria-label='Customer Profile Masking']")
	WebElement CustomerProfileMaskingdropdown;
	@FindBy(xpath = "//span[@title='Sold-To']")
	WebElement SoldToValue;
	@FindBy(xpath = "//span[@title='Sold-To Name']")
	WebElement SoldToName;
	@FindBy(xpath = "(//span[@class='slds-checkbox_faux'])[3]")
	WebElement SoldToCreateMaskCheckbox;
	@FindBy(xpath = "(//span[normalize-space()='4']//following::td)[2]//*[@data-name='Create Mask']//span[@part='indicator']")
	WebElement CustomerProfileMaskSoldToCreateMaskCheckbox;
	@FindBy(xpath = "(//span[normalize-space()='4']//following::td)[3]//*[@data-name='View Mask']//span[@part='indicator']")
	WebElement CustomerProfileMaskSoldToViewMaskCheckbox;
	@FindBy(xpath = "((//span[normalize-space()='1'])[3]//following::td)[1]//*[@data-name='Create Mask']")
	WebElement CustomerProfileMaskShipToCreateMaskCheckbox;
	@FindBy(xpath = "((//span[normalize-space()='1'])[3]//following::td)[2]//*[@data-name='View Mask']")
	WebElement CustomerProfileMaskShipToViewMaskCheckbox;
	
	
	public void OpenPriceProfileMasking(String string) throws InterruptedException {
		commonclick.scrollAndClick(AppLauncher);
		Thread.sleep(7000);
		commonclick.scrollAndClick(AppLauncherTextbox);
		AppLauncherTextbox.click();
		AppLauncherTextbox.sendKeys(string);
		Thread.sleep(2000);
		PriceProfileMasking.click();
		commonclick.scrollAndClick(PriceProfileMasking);
	}
	
	public void ProfileMaskingbutton() {
		commonclick.scrollAndClick(ProfileMaskingbtn);
		commonclick.scrollAndClick(Nextbtn);
	}
	
	public void UserProfileMaskingbutton() {
		commonclick.scrollAndClick(UserProfileMaskingbtn);
		commonclick.scrollAndClick(Nextbtn);
	}
	
	public void EnterFirstName(String string) {
		commonclick.scrollAndClick(UserProfileMaskingdropdown);
		commonclick.scrollAndClick(FirstName);
		EnterTextbox.sendKeys(string);
	}
	
	public void Searchbutton() {
		commonclick.scrollAndClick(Searchbtn);
	}
	
	public void EnterLastName(String string) {
		commonclick.scrollAndClick(UserProfileMaskingdropdown);
		commonclick.scrollAndClick(LastName);
		EnterTextbox.sendKeys(string);
	}
	
	public void EnterEmail(String string) {
		commonclick.scrollAndClick(UserProfileMaskingdropdown);
		commonclick.scrollAndClick(Email);
		EnterTextbox.sendKeys(string);
	}
	
	public void EnterLoginName(String string) {
		commonclick.scrollAndClick(UserProfileMaskingdropdown);
		commonclick.scrollAndClick(LoginName);
		EnterTextbox.sendKeys(string);
	}
	
	public void ApplyUserProfileMask() {
//		boolean isChecked = Checkbox.isSelected();
//		if(isChecked = true) {
//			System.out.println("Check box is checked already");
//		} else {
//			commonclick.scrollAndClick(Checkbox);
//			System.out.println("Check box is selected now");
//		}
	commonclick.scrollAndClick(Checkbox);
	commonclick.scrollAndClick(Savebtn);
	}
	
	public void GlobalSearchContact(String string) throws InterruptedException {
		commonclick.scrollAndClick(GlobalSearch);
		GlobalSearch.sendKeys(string);
		Thread.sleep(4000);
		SelectContact.click();
		commonclick.scrollAndClick(SelectContact);
	}
	
	public void LogintoExperienceasUserButton() {
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("scroll(0, -250);");
		
		commonclick.scrollAndClick(LogintoExperienceasUserbutton);
	}
	
	public void ValidateErrorMessage(WebDriver driver) {
		String actualTitle = ValidateErrorMessage.toString();
		System.out.println(actualTitle);
//		String expectedTitle = "The system is unable to display the information requested. Please contact your local Intel RMA Customer support team.";
//		assertEquals(expectedTitle,actualTitle);
		//commonclick.scrollAndClick(ValidateErrorMessage);
	}
	
	public void ClickGearIconAtContact() throws InterruptedException {
		commonclick.scrollAndClick(GearIconAtContact);
		Thread.sleep(5000);
	}
	
	public void ClickGearIconAtSoldTo() throws InterruptedException {
		commonclick.scrollAndClick(GearIconAtSoldTo);
		Thread.sleep(5000);
	}
	
	public void UserProfileMaskSoldToCreateMask() {
		commonclick.scrollAndClick(UserProfileMaskSoldToCreateMaskCheckbox);
		commonclick.scrollAndClick(Savebtn);
	}
	
	public void UserProfileMaskSoldToViewMask() {
		commonclick.scrollAndClick(UserProfileMaskSoldToViewMaskCheckbox);
		commonclick.scrollAndClick(Savebtn);
	}
	
	public void UserProfileMaskShipToCreateMask() {
		commonclick.scrollAndClick(UserProfileMaskShipToCreateMaskCheckbox);
		commonclick.scrollAndClick(Savebtn);
	}
	
	public void UserProfileMaskShipToViewMask() {
		commonclick.scrollAndClick(UserProfileMaskShipToViewMaskCheckbox);
		commonclick.scrollAndClick(Savebtn);
	}
	
	public void ClickTechnicalCaseCreatebtn() {
		commonclick.scrollAndClick(CaseCreatebtn);
		commonclick.scrollAndClick(Createbtn);
	}
	
	public void ValidateSoldTo(String string) {
		commonclick.scrollAndClick(SoldTo);
		//SoldTo.click();
		SoldTo.sendKeys(string);
//		List<WebElement> Count = driver.findElements(By.xpath("//lightning-primitive-icon[@size='small']//*[name()='svg']"));
//		int xpathCount = Count.size();
//		System.out.println("Total xpath: " + xpathCount);
	}
	
	public void ClickExportMaskingDataForContact() {
		commonclick.scrollAndClick(ExportMaskingDataForContact);
	}
	
	public void ClickExportMaskingDataForSoldTo() {
		commonclick.scrollAndClick(ExportMaskingDataForSoldTo);
	}
	
	public void CustomerProfileMaskingbutton() {
		commonclick.scrollAndClick(CustomerProfileMaskingbtn);
		commonclick.scrollAndClick(Nextbtn);
	}
	
	public void EnterSoldTo(String string) {
		commonclick.scrollAndClick(CustomerProfileMaskingdropdown);
		commonclick.scrollAndClick(SoldToValue);
		EnterTextbox.sendKeys(string);
	}
	
	public void EnterSoldToName(String string) {
		commonclick.scrollAndClick(CustomerProfileMaskingdropdown);
		commonclick.scrollAndClick(SoldToName);
		EnterTextbox.sendKeys(string);
	}
	
	public void ApplyCustomerProfileMask() {
	commonclick.scrollAndClick(SoldToCreateMaskCheckbox);
	commonclick.scrollAndClick(Savebtn);
	}
	
	public void CustomerProfileMaskSoldToCreateMask() {
		commonclick.scrollAndClick(CustomerProfileMaskSoldToCreateMaskCheckbox);
		commonclick.scrollAndClick(Savebtn);
	}
	
	public void CustomerProfileMaskSoldToViewMask() {
		commonclick.scrollAndClick(CustomerProfileMaskSoldToViewMaskCheckbox);
		commonclick.scrollAndClick(Savebtn);
	}
	
	public void CustomerProfileMaskShipToCreateMask() {
		commonclick.scrollAndClick(CustomerProfileMaskShipToCreateMaskCheckbox);
		commonclick.scrollAndClick(Savebtn);
	}
	
	public void CustomerProfileMaskShipToViewMask() {
		commonclick.scrollAndClick(CustomerProfileMaskShipToViewMaskCheckbox);
		commonclick.scrollAndClick(Savebtn);
	}
	
	
	
}