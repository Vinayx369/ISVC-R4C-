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

import Utilities.ConfigReader;
import Utilities.ExcelUtils;
import Utilities.WaitHelper;
import utils.CommonUtils;
import utils.WaitUtils;
import utils.waitUtilsZ;

public class PriceMasking {
	public WebDriver ldriver;
	public WebDriver driver;
	public WaitHelper waitHelper;
	public WaitUtils waitUtils;
	public waitUtilsZ waitUtilsZ;
	public CommonUtils commonclick;

	// private WebDriver rdriver;
	public PriceMasking(WebDriver rdriver) {
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
	@FindBy(xpath = "//span[text()=\"Price Masking\"]")
	WebElement SelectPMRadioButton;
	@FindBy(xpath = "//button[text()=\"Next\"]")
	WebElement ClickOnNEXT;
	@FindBy(xpath = "//span[text()=\"User Price Masking\"]")
	WebElement SelectUPMRadioButton;
	@FindBy(xpath = "//span[text()=\"Select One Option\"]")
	WebElement ClickDropdownPM;
	@FindBy(xpath = "//body//div//lightning-base-combobox-item[1]")
	WebElement SelectFN;
	
	@FindBy(xpath = "//input[@placeholder='Please enter minimum 3 characters to Search']")
	WebElement EnterFN ;
	@FindBy(xpath = "//button[normalize-space()='Search']")
	WebElement ClickSearch ;
	@FindBy(xpath = "//span[normalize-space()='1']/../../..//span[@part='indicator']")
	WebElement SelectCheckBox ;
	@FindBy(xpath = "//button[@title='Save']")
	WebElement ClickSavebutton ;
	@FindBy(xpath = "//button[@type='button']//span//div//span")
	WebElement ClickOnIcon ;
	@FindBy(xpath = "//a[normalize-space()='Log Out']")
	WebElement ClickOnLogout ;
	@FindBy(xpath = "//button[normalize-space()='Log in to Experience as User']")
	WebElement ClickOnUserLogin ;
	@FindBy(xpath = "//span[@title='Last Name']")
	WebElement Selectlastname ;
	
	@FindBy(xpath = "//lightning-base-combobox-item[@role='option']//span//span[@title='Email'][normalize-space()='Email']")
	WebElement SelectlastEmail ;
	@FindBy(xpath = "//span[@title='Login Name']")
	WebElement SelectLogInName ;
	
	@FindBy(xpath = "//span[contains(text(),'Customer Price Masking')]")
	WebElement ClickOnCPM ;
	
	@FindBy(xpath = "//button[@name='searchTypeDropdown']")
	WebElement ClickOnCPMdropdown;
	@FindBy(xpath = "//span[@title='Sold-To']")
	WebElement SlectSoldTo;
	@FindBy(xpath = "//span[@title='Sold-To Name']")
	WebElement SlectSoldToname;
	@FindBy(xpath = "//input[@placeholder='Please enter minimum 3 characters to Search']")
	WebElement EnterSoldTo;
	@FindBy(xpath = "//*[name()='path' and contains(@d,'M261 191c-')]")
	WebElement ClickOnSettingIcon;
	
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[3]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/c-r4c_-a-g_-masking-search[1]/div[1]/lightning-card[4]/article[1]/div[2]/slot[1]/c-r4c_-a-g_-masking-table[1]/lightning-accordion[1]/div[1]/slot[1]/lightning-accordion-section[1]/div[1]/section[1]/div[2]/slot[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/lightning-input[1]/lightning-primitive-input-checkbox[1]/div[1]/span[1]/label[1]/span[1]")
	WebElement SelectCAOption;
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[3]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/c-r4c_-a-g_-masking-search[1]/div[1]/lightning-card[5]/article[1]/div[2]/slot[1]/c-r4c_-a-g_-masking-table[1]/lightning-accordion[1]/div[1]/slot[1]/lightning-accordion-section[1]/div[1]/section[1]/div[2]/slot[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/lightning-input[1]/lightning-primitive-input-checkbox[1]/div[1]/span[1]/label[1]/span[1]")
	WebElement SelectRCAOption;
	
	
public void SelectRCAOption() {
		
		commonclick.scrollAndClick(SelectRCAOption);
	}
	public void SelectCAOption() {
		
		commonclick.scrollAndClick(SelectCAOption);
	}
	
	public void ClickOnSettingIcon() {
		
		ClickOnSettingIcon.click();
		commonclick.scrollAndClick(ClickOnSettingIcon);
	}
	
	public void EnterSoldToPM() {
		// Retrieve the Excel file path from the config file
		String excelFilePath = ConfigReader.getProperty("excelFilePath");
		// Retrieve data from the desired cell
		String thirdColumnData = ExcelUtils.getCellData(excelFilePath, 0, 1, 1); // 0 = sheetIndex, 1 = rowIndex, 5 =
		System.out.println("Third column data: " + thirdColumnData);

		// Enter the data into the text field if it's not empty
		if (!thirdColumnData.isEmpty()) {
			EnterSoldTo.clear(); // Clear any existing value
			EnterSoldTo.sendKeys(thirdColumnData); // Enter the data
		}
	}

	
	
	
	public void SlectSoldToname() {
		commonclick.scrollAndClick(SlectSoldToname);
	}
	public void SlectSoldTo() {
		commonclick.scrollAndClick(SlectSoldTo);
	}
	public void ClickOnCPMdropdown() {
		commonclick.scrollAndClick(ClickOnCPMdropdown);
	}
	public void ClickOnCPM() {
		commonclick.scrollAndClick(ClickOnCPM);
	}
	
	public void SelectLogInName() {
		commonclick.scrollAndClick(SelectLogInName);
	}
	
	
	public void SelectlastEmail() {
		commonclick.scrollAndClick(SelectlastEmail);
	}
	
	
	public void Selectlastname() {
		commonclick.scrollAndClick(Selectlastname);
	}
	
	public void ClickOnUserLogin() {
		commonclick.scrollAndClick(ClickOnUserLogin);
	}
	
	
	public void ClickOnLogout() {
		commonclick.scrollAndClick(ClickOnLogout);
	}
	public void ClickOnIcon() {
		commonclick.scrollAndClick(ClickOnIcon);
	}
	
	
	public void ClickSavebutton() {
		commonclick.scrollAndClick(ClickSavebutton);
	}
	
	//button[@title='Save']
	public void SelectCheckBox() {
		commonclick.scrollAndClick(SelectCheckBox);
	}
	public void ClickSearch() {
		commonclick.scrollAndClick(ClickSearch);
	}
	
	
	
	public void EnterFN(String EnterFiratname ) {
		
		commonclick.scrollAndClick(EnterFN);
		EnterFN.sendKeys(EnterFiratname);
		
	}
	
	public void SelectFN() {
		commonclick.scrollAndClick(SelectFN);
	}
	
	public void ClickDropdownPM() {
		commonclick.scrollAndClick(ClickDropdownPM);
	}
	public void SelectUPMRadioButton() {
		commonclick.scrollAndClick(SelectUPMRadioButton);
	}
	public void SelectPMRadioButton() {
		commonclick.scrollAndClick(SelectPMRadioButton);
	}
	public void ClickOnNEXT() {
		commonclick.scrollAndClick(ClickOnNEXT);
	}

}
