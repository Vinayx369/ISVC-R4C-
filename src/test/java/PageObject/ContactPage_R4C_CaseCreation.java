package PageObject;

import java.awt.event.InputEvent;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utils.CommonUtils;
import utils.WaitUtils;
import utils.waitUtilsZ;
import utils.waitUtilsZ.WaitType;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage_R4C_CaseCreation {
	public WebDriver ldriver;
	public WaitHelper waitHelper;
	public WebDriver driver;
	public WaitUtils waitUtils;
	public waitUtilsZ waitUtilsZ;
	public CommonUtils commonclick;

	public ContactPage_R4C_CaseCreation(WebDriver rdriver) {
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
	 * Authur: Omkar Yadav Change:SR Case Creation Description:
	 */
	@FindBy(xpath = "//button[@title=\"Show Navigation Menu\"]")
	WebElement clickoncontactdropdown;
	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity'][normalize-space()='Contacts']")
	WebElement SelectContacts;
	@FindBy(xpath = "//span[@class='triggerLinkText selectedListView slds-page-header__title slds-truncate slds-p-right--xx-small lst-temp-slds-lineHeight uiOutputText']")
	WebElement clickViewDropdown;
	@FindBy(xpath = "//span[@class=' virtualAutocompleteOptionText'][normalize-space()='Recently Viewed Contacts']")
	WebElement SelectRecentViewcontact;
	@FindBy(xpath = "//input[@placeholder='Search this list...']")
	WebElement EnterSearchcontact;
	@FindBy(xpath = "//button[normalize-space()='Search...']")
	WebElement EnterTextGolbarsearch;
	@FindBy(xpath = "//a[normalize-space()='Sarah Aggelidis']")
	WebElement selecttextcontact;
	@FindBy(xpath = "//button[text()=\"Search...\"]")
	WebElement clickGlobal;
	@FindBy(xpath = "//lightning-layout[1]//slot[1]//lightning-layout-item[1]//slot[1]//div[1]//span[1]//c-r4c_-a-g_-reusable-lookup[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//lightning-input[1]//lightning-primitive-input-simple[1]//div[1]//div[1]//input[1]")
	WebElement clickonsoldtobox;
	@FindBy(xpath = "//section[@aria-expanded='true']//section[@role='tabpanel']//button[@type='button'][normalize-space()='New R4C Case']")
	WebElement ClickonNewR4CCaseButton;
	@FindBy(xpath = "//span[@part='label'][normalize-space()='Stock Rotation']/..//span[@part='indicator']") // To // //
	WebElement clickonservicetype;
	@FindBy(xpath = "//button[@type='button'][normalize-space()='Cancel']//following::button[normalize-space()='Create']")
	WebElement clickoncreatebutton;
	@FindBy(xpath = "//div[@aria-label='Sales Area']//lightning-base-combobox-item[@role='option']")
	WebElement clicksalesareaselect;
	@FindBy(xpath = "(//input[@placeholder=\"Select one\"])[1]")
	WebElement EnterSoldto; // Enter Sold To id into fields
	@FindBy(xpath = "//span[text()='6006683685-ALSO Deutschland GmbH']/ancestor::li") // To select searched contact
	WebElement Clickonsoldtocontacts; // Click on sild to detils on dropdown
	@FindBy(xpath = "//label[text()='Return Reason']/following-sibling::div")
	WebElement ClickonReturnreasondropdown; // To click on the return reason Dropdown
	@FindBy(xpath = "//span[text()='Standard Stock Rotation']/ancestor::lightning-base-combobox-item")
	WebElement selectStandardStockRotation; // To select Stock Rotation from from dropdown
	@FindBy(xpath = "//button[normalize-space()='Next']")
	WebElement clickonnextaftersuldto;
	@FindBy(xpath = "//button[normalize-space()='Next']")
	WebElement clickonnextaftersuldto2;
	@FindBy(xpath = "//span[contains(text(),'Purchase/Sales Order')]/..//span[@class='slds-radio_faux']")
	WebElement ClickonPO; // To click PO radio button
	@FindBy(xpath = "//input[@placeholder='Enter PO Number (use commas between multiple values)']")
	WebElement enterPOnumber; // To Enter PO number into the test field
	@FindBy(xpath = "//button[text()=\"Search\"]")
	WebElement Clickonsearch;
	@FindBy(xpath = "(//span[@part='indicator'])[4]")
	WebElement selectAllcheckbox;
	@FindBy(xpath = "//button[normalize-space()='Cancel']//following::button[contains(text(),'Next')]")
	WebElement AfterPONumberclickonNext;
	@FindBy(xpath = "//button[text()=\"Get Credit Price\"]")
	WebElement ClickGetCreditPrice;
	@FindBy(xpath = "//button[normalize-space()='Product Validation']")
	WebElement ProductvalidationButton;
	@FindBy(xpath = "//button[text()=\"Next\"]")
	WebElement ClickonNextAfterProductvalidation; // To click on the next button after Product validation check box
	@FindBy(xpath = "(//input[@inputmode=\"decimal\"])[1]") // To Enter Return Quantity To all field
	WebElement enterquantityfirst;
	@FindBy(xpath = "//button[normalize-space()='Clone']//following::button[normalize-space()='Get Credit Price']")
	WebElement Clickongetcreditprice;
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/c-r4c_-a-g_-case-header[1]/div[2]/lightning-card[1]/article[1]/div[2]/slot[1]/div[3]/div[1]/c-r4c_-a-g_-p-o-search[1]/div[1]/div[1]/div[2]/c-r4c_-a-g_-line-items-result-table[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]/div[1]/lightning-input[1]/lightning-primitive-input-checkbox[1]/div[1]/span[1]/label[1]/span[1]")
	WebElement UnselectAfterPriceCheckboxes;
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/c-r4c_-a-g_-case-header[1]/div[2]/lightning-card[1]/article[1]/div[2]/slot[1]/div[3]/div[1]/c-r4c_-a-g_-p-o-search[1]/div[1]/div[1]/div[2]/c-r4c_-a-g_-line-items-result-table[1]/div[1]/div[1]/table[1]/tbody[1]/c-r4c_-a-g_-line-items-result-row[1]/td[2]/div[1]/lightning-input[1]/lightning-primitive-input-checkbox[1]/div[1]/span[1]/label[1]/span[1]")
	WebElement SelectfirstCheckbox;
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/c-r4c_-a-g_-case-header[1]/div[2]/lightning-card[1]/article[1]/div[2]/slot[1]/div[3]/div[1]/c-r4c_-a-g_-p-o-search[1]/div[1]/div[1]/div[2]/c-r4c_-a-g_-line-items-result-table[1]/div[1]/div[1]/table[1]/tbody[1]/c-r4c_-a-g_-line-items-result-row[2]/td[2]/div[1]/lightning-input[1]/lightning-primitive-input-checkbox[1]/div[1]/span[1]/label[1]/span[1]")
	WebElement SelectSecondCheckbox;
	@FindBy(xpath = "//input[@placeholder='Enter Credit Price']")
	WebElement EnterPrice;
	@FindBy(xpath = "//input[@placeholder='Enter Reason']")
	WebElement EnterText;
	@FindBy(xpath = "//button[normalize-space()='Save for Later']//preceding::button[contains(text(),'Next')]")
	WebElement AfterCreditpriceNext;
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/c-r4c_-a-g_-case-header[1]/div[2]/lightning-card[1]/article[1]/div[2]/slot[1]/div[3]/div[1]/c-r4c_-a-g_-p-o-search[1]/div[1]/div[1]/div[2]/c-r4c_-a-g_-line-items-result-table[1]/div[1]/div[1]/table[1]/tbody[1]/c-r4c_-a-g_-line-items-result-row[2]/td[13]/span[1]/span[1]/lightning-input[1]/lightning-primitive-input-simple[1]/div[1]/div[1]/input[1]")
	WebElement ResoneintoSecondFields;
	@FindBy(xpath = "//button[@title='Cancel']//following::button[normalize-space()='Validate Allowance']")
	WebElement ValidateAllownce;
	@FindBy(xpath = "//button[@title='Cancel']//following::button[normalize-space()='Save & View Summary']")
	WebElement SaveSummary;
	@FindBy(xpath = "//button[text()=\"Submit\"]")
	WebElement ClickonsubmitafterSave;
	@FindBy(xpath = "//span[normalize-space()='SO Number']//following::input[@placeholder='Enter SO Number (use commas between multiple values)']") // Enter
	WebElement EnterSONumber;
	@FindBy(xpath = "//span[contains(text(),'6006683685-ALSO Deutschland GmbH')]")
	WebElement SoldToIdContact;
	@FindBy(xpath = "(//button[@name=\"Select one\"])[2]")
	WebElement ReturnReasonPSR;
	@FindBy(xpath = "//span[@title='Promotional Stock Rotation']")
	WebElement SelectPSR;
	@FindBy(xpath = "//span[normalize-space()='Search By:']//following::span[contains(text(),'Product')]")
	WebElement ClickonProductradioButton;
	@FindBy(xpath = "//span[contains(text(),'MM')]/..//span[contains(text(),'MM')]") // To click on the MM Radio Button
	WebElement ClickOnMMRadioButton;
	@FindBy(xpath = "//button[normalize-space()='Reset']//preceding::input[@placeholder='Enter the MM']") // To Enter MM
	WebElement EnterMMNumber;
	@FindBy(xpath = "//button[normalize-space()='Reset']//following::button[normalize-space()='Search']") // To click on
	WebElement ClickonSearchButtonAfterMM;
	@FindBy(xpath = "//button[normalize-space()='Cancel']//preceding::button[normalize-space()='PO History']") // To
	WebElement POHistoryButton;
	@FindBy(xpath = "//button[normalize-space()='Cancel']//following::button[contains(text(),'Next')]") // To click on
	WebElement POHistoryNext;
	@FindBy(xpath = "//span[contains(text(),'Bulk Upload')]/..//span") // To click on the bulk upload button
	WebElement BulkUploadRadioButton;
	@FindBy(xpath = "//button[normalize-space()='Reset']//preceding::span[@part='button']") // To click on the Upload
	WebElement UploadFile;
	@FindBy(xpath = "//span[text()=\"Or drop files\"]")
	WebElement UploadDrop;
	@FindBy(xpath = "//div[@part='modal-footer']//button[@part='button'][normalize-space()='Cancel']")
	WebElement ClickOnCancel;

	@FindBy(xpath = "//button[normalize-space()='Reset']//following::button[normalize-space()='Validate']") // To Click
	WebElement ClickonValidate;
	@FindBy(xpath = "//body//div//lightning-input[@data-key='CPN']//span//span[1]//following::span[contains(text(),'CPN')]") // To
	WebElement ClickOnCPN;
	@FindBy(xpath = "//button[normalize-space()='Reset']//preceding::input[@placeholder='Enter the CPN']") // To Enter
	WebElement EnterCPN;
	@FindBy(xpath = "//button[normalize-space()='Reset']//following::button[normalize-space()='Search']") // To Click on
	WebElement AfterCPNSearch;
	@FindBy(xpath = "//span[contains(text(),'Order Part Number')]/..//span") // To Click On the OPN Radio Button
	WebElement ClickonOPNRadiobutton;
	@FindBy(xpath = "//button[normalize-space()='Reset']//preceding::input[@placeholder='Enter the Order Part Number']")
	WebElement EnterOPN;
	@FindBy(xpath = "//button[contains(text(),'Next')]//following::button[normalize-space()='Save for Later']")
	WebElement MMSaveforlater;
	@FindBy(xpath = "//div[@part='modal-footer']//button[@part='button'][normalize-space()='Cancel']//following::button[normalize-space()='OK']")
	WebElement ClickonOkButton;
	@FindBy(xpath = "//span[normalize-space()='Status']//following::lightning-formatted-text[normalize-space()='Open, Unsubmitted']")
	WebElement getSavedstatustext;
	@FindBy(xpath = "//input[@placeholder=\"Select one\"]")
	WebElement SelectL3User;
	@FindBy(xpath = "//li[@data-id='vinayx.kumar.ganji@intel.com']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']//following::span[contains(text(),'Vinay Kumar Ganji')]")
	WebElement L3agent;
	@FindBy(xpath = "//div[@part='modal-footer']//button[@type='button'][normalize-space()='Cancel']//following::button[normalize-space()='Select']")
	WebElement ClickonselectL3;
	@FindBy(xpath = "//div[@part='modal-footer']//button[@type='button'][normalize-space()='Cancel']//following::button[normalize-space()='Select']")
	WebElement SelectL3user;
	By ClickonAccept = By.xpath("//ul[contains(.,'Post')]/li/a[@title='Accept']");
	@FindBy(xpath = "//section[@aria-expanded='true']//slot//slot//span[contains(text(),'Accept')]/../../..//span[contains(text(),'Edit')]")
	WebElement ClickonEdit;
	@FindBy(xpath = "//flexipage-component2[@data-component-id='forceChatter_publisher']//span[contains(text(),'Post')]/../../../../..//p")
	WebElement EnterTextintoPost;
	@FindBy(xpath = "//span[contains(text(),'0000500908-Ingram Micro LP')]")
	WebElement SoldTOcontactSelect;
	@FindBy(xpath = "//button[normalize-space()='OK']/..//button[@part='button'][normalize-space()='Cancel']")
	WebElement IMFCancel;
	@FindBy(xpath = "//div[@part='modal-footer']//button[@part='button'][normalize-space()='Cancel']//following::button[normalize-space()='OK']")
	WebElement ClickOnOKIMF;
	@FindBy(xpath = "//button[@aria-label='Return to Customer Address']/..//button[@aria-label='Return to Customer Address']")
	WebElement ClickonCRA;
	@FindBy(xpath = "//lightning-combobox[@data-name='Sales_Issue_Return_To_Cst_Address__c']//lightning-base-combobox-item[2]//span[2]")
	WebElement SelectCRA;
	@FindBy(xpath = "//button[@aria-label=\"Collection Address\"]")
	WebElement ClickCA;
	@FindBy(xpath = "//span[@title='X DOCK,Amsterdam,Noord-Holland,Netherlands']")
	WebElement SelectCA;
	@FindBy(xpath = "//button[@aria-label='Return to Customer Contact']")
	WebElement ClickonRCC;
	@FindBy(xpath = "//lightning-combobox[@data-name='Sales_Issue_Return_To_Cst_Contact__c']//lightning-base-combobox-item[1]//span[2]")
	WebElement SelectRCC;
	@FindBy(xpath = "//button[@aria-label='Collection Contact']")
	WebElement ClickonCollectionContact;
	@FindBy(xpath = "//lightning-combobox[@data-name='Sales_Issue_Collection_Contact__c']//lightning-base-combobox-item[1]//span[2]")
	WebElement SelectCollectionContacts;
	@FindBy(xpath = "//button[@title='Cancel']//following::button[normalize-space()='Next']")
	WebElement clickonNextIMF;
	@FindBy(xpath = "//button[@title='Cancel']//following::button[contains(text(),'Next')]")
	WebElement Clicknextedit;
	@FindBy(xpath = "//c-r4c_-a-g_-case-edit//li//button[contains(text(),'Cancel')]//following::button[contains(text(),'Next')]")
	WebElement clickonnextafteredit;
	@FindBy(xpath = "//li//button[contains(text(),'Save for Later')]/..//button[contains(text(),'Next')]")
	WebElement ClickonNextAfterEdit;
	@FindBy(xpath = "//body/div/div[@aria-hidden='false']/section/div/div/div/div[@role='main']/section[@role='tabpanel']/div/div/section[@role='tabpanel']/div/div/div/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-contact_-record_-page1___-contact___-v-i-e-w/forcegenerated-flexipage_contact_record_page1_contact__view_js[@data-page-type='RecordPage']/record_flexipage-desktop-record-page-decorator/div/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div/div/slot[@name='main']/flexipage-component2[@data-component-id='flexipage_tabset']/slot/flexipage-tabset2/div/lightning-tabset/div/slot/slot[@name='tabs']/flexipage-tab2[@role='tabpanel']/slot/flexipage-component2[@data-component-id='force_relatedListContainer']/slot/lst-related-list-container/div/div/lst-related-list-single-container/laf-progressive-container[@aria-busy='false']/slot/lst-related-list-single-app-builder-mapper/article[@aria-label='Cases']/lst-related-list-view-manager/a/span[1]")
	WebElement ClickonALLcases;
	@FindBy(xpath = "//section[@aria-expanded='true']//a[@data-label='Details'][normalize-space()='Details']//following::a[@data-label='Related'][normalize-space()='Related']")
	WebElement ClickonRelated;
	@FindBy(xpath = "//button[@aria-label='Search']")
	WebElement globaltextenter; // enter Text Globaly
	@FindBy(xpath = "//c-r4c_-a-g_-case-edit//li//button[contains(text(),'Cancel')]//following::button[contains(text(),'Next')]")
	WebElement clicknextbutton;

	@FindBy(xpath = "//button[@title='Show quick filters']")
	WebElement ClickOnfilter;
	@FindBy(xpath = "//label[normalize-space()='Case']//following::input[@name='Case-CaseNumber']")
	WebElement EnterTextIntocasefield;
	@FindBy(xpath = "//button[normalize-space()='Apply']")
	WebElement Clickonapply;
	@FindBy(xpath = "//tbody/tr[@role='row']/th[@data-label='Case']/lightning-primitive-cell-factory[@data-label='Case']/span[1]")
	WebElement SelectCase;
	@FindBy(xpath = "(//button[text()=\"Next\"])[2]")
	WebElement clickonNextAccept;
	@FindBy(xpath = "//tbody/tr[1]/th[1]")
	WebElement ClickOnFirstSearch;
	@FindBy(xpath = "//input[@placeholder='Search this list...']")
	WebElement Entertext;
	@FindBy(xpath = "//label[text()=\"Return Reason\"]")
	WebElement Clickonreason;
	@FindBy(xpath = "//a[text()=\"Amy Adamo\"]")
	WebElement selecttext;
	@FindBy(xpath = "//tbody/tr[1]/th[1]/span[1]")
	WebElement selectsearchcontacts;
	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement EnterTextGlobalfield;
	//@FindBy(xpath = "//body/div/div/div[@role='dialog']/div/div/div/div/div/div/search_dialog-instant-results-list[@aria-controls='preview']/div[@aria-label='Suggestions']/search_dialog-instant-result-item[2]/div[1]")
	@FindBy(xpath = "//div[@aria-hidden='true']//img[@title='Contact']")
	WebElement SelectGlobalsearch;
	@FindBy(xpath = "//body//div//c-r4c_-a-g_-collection-details//lightning-base-combobox-item[1]")
	WebElement SelectFirstRCA;
	@FindBy(xpath = "//lightning-combobox[@data-name='Sales_Issue_Cst_Collection_Address__c']//lightning-base-combobox-item[1]")
	WebElement SelectFirstCA;
	@FindBy(xpath = "//lightning-combobox[@data-name='Sales_Issue_Return_To_Cst_Contact__c']//lightning-base-combobox-item[1]")
	WebElement SelectFirstRCC;
	@FindBy(xpath = "//lightning-combobox[@data-name='Sales_Issue_Collection_Contact__c']//lightning-base-combobox-item[1]")
	WebElement SelectFirstcc;
	@FindBy(xpath = "//p[@title='Status']/..//lightning-formatted-text[contains(text(),'Open, Unsubmitted')]")
	WebElement statusOpenUn;
	@FindBy(xpath = "//button[@name='Ship To Conatct']/../..//lightning-base-combobox-item[@role='option']")
	WebElement SelectShipToContact;
	@FindBy(xpath = "//input[@placeholder='Enter Credit Price']")
	List<WebElement> EnterPriceIntoAllFields;
	@FindBy(xpath = "//input[@placeholder='Enter Reason']")
	List<WebElement> EnterReasonintoAllfileds;
	@FindBy(xpath = "//label[text()=\"Sales Area\"]")
	WebElement clicksalesarea;
	@FindBy(xpath = "//th[@scope='row']")
	List<WebElement> PrintActiveMMIds;
	@FindBy(xpath = "//button[text()=\"Next\"]")
	WebElement CLickNextAfterPO;
	@FindBy(xpath = "//label[text()='Ship To Contact']")
	WebElement ShipTocontact;
	@FindBy(xpath = "//div[@aria-label='Sold To Address']//lightning-base-combobox-item[@role='option']")
	WebElement SelectSoldToaddressoption;
	@FindBy(xpath = "//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']")
	WebElement SelectGlobalsearchoption;
	@FindBy(xpath = "(//input[@inputmode='decimal'])")
	List<WebElement> decimalInputFields;
	@FindBy(xpath = "//label[text()=\"Sold To Address\"]")
	WebElement SelectSoldToaddress;
	@FindBy(xpath = "//button[text()=\"OK\"]")
	WebElement clickok;
	@FindBy(xpath = "//lightning-combobox[@data-name='Sales_Issue_SoldTo_Contact__c']//lightning-base-combobox-item[2]")
	WebElement SelectSoldToContactSecond;
	@FindBy(xpath = "//label[text()=\"Freight Type\"]")
	WebElement ClickonFrightType;
	@FindBy(xpath = "//span[@title='Intel Managed Freight']")
	WebElement SelectFrightTypeIMF;
	@FindBy(xpath = "//span[@title='Customer Routed Freight']")
	WebElement SelectFrightTypeCMF;
	@FindBy(xpath = "(//input[@inputmode=\"decimal\"])[1]") // To Enter Return Quantity To all field
	WebElement enterquantityfirst1;
	@FindBy(xpath = "//button[text()=\"Submit\"]")
	WebElement ClickSubmit;
	@FindBy(xpath = "//div[@aria-hidden='true']//img[@title='Case']")
	WebElement SelectglobalCase;
	@FindBy(xpath = "//span[normalize-space()='Accept']")
	WebElement Clickacceptbutton;
	@FindBy(xpath = "//li//button[contains(text(),'Save for Later')]/..//button[contains(text(),'Next')]")
	WebElement ClickNextAfterEdit;

	@FindBy(xpath = "//span[normalize-space()='Edit']")
	WebElement ClickEdit;

	@FindBy(xpath = "//c-r4c_-a-g_-case-header//lightning-combobox[@data-name='Sales_Issue_Return_Reason__c']//div//button[@name='Select one']")
	WebElement ClickSSR;

	@FindBy(xpath = "//span[@title='Standard Stock Rotation']")
	WebElement SelectSSR;

	public void ClickSSR() {
		commonclick.scrollAndClick(ClickSSR);

	}

	public void SelectSSR() {
		commonclick.scrollAndClick(SelectSSR);

	}

	public void UploadDrop() {
		commonclick.scrollAndClick(UploadDrop);
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

	public void clicknextbutton() throws InterruptedException {
		Thread.sleep(000);
		commonclick.scrollAndClick(clicknextbutton);
	}

	public void Clickoncontactdropdown() {
		clickoncontactdropdown.click();
	}

	public void SelectDropdownOption_Contacts() {
		SelectContacts.click();
	}

	public void clickondropdown() {
		clickViewDropdown.click();
	}

	public void SelectTestContact() {
		SelectRecentViewcontact.click();
	}

	public void EnterTextGlobaly() {
		commonclick.scrollAndClick(EnterTextGolbarsearch);
		EnterTextGolbarsearch.sendKeys("Sarah");
	}

	public void EntercontactNameintosearchfield(String Name) {
		commonclick.scrollAndClick(EnterSearchcontact);
		EnterSearchcontact.sendKeys(Name); // To enter Text into search field
		EnterSearchcontact.sendKeys(Keys.RETURN); // To Click on ENter Button
	}

	public void selecttestcontact() {
		commonclick.scrollAndClick(selecttextcontact);
		selecttextcontact.click();
	}

	public void clickonR4CCaseButton() throws InterruptedException {
		commonclick.scrollAndClick(ClickonNewR4CCaseButton);
	}

	public void selectserviceType() {
		commonclick.scrollAndClick(clickonservicetype);
	}

	public void clickoncreatebutton() {
		commonclick.scrollAndClick(clickoncreatebutton);
	}

	public void EnterSoldTo() throws InterruptedException {
		commonclick.scrollAndClick(EnterSoldto);
		EnterSoldto.sendKeys("6006683685");
	}

	public void EnterSoldToNumber(String string) throws InterruptedException {
		Thread.sleep(1000);
		commonclick.scrollAndClick(EnterSoldto);
		Thread.sleep(2000);
		EnterSoldto.sendKeys(string);

	}

	public void enterquantity(String string) {
		enterquantityfirst1.sendKeys(string);

	}

	public void EnterSoldToOptIn() throws InterruptedException {
		commonclick.scrollAndClick(EnterSoldto);
		EnterSoldto.sendKeys("500908");
	}

	public void Selectsearchedcontact() {
		commonclick.scrollAndClick(Clickonsoldtocontacts);
	}

	public void clickonreturnreson() {
		commonclick.scrollAndClick(ClickonReturnreasondropdown);
	}

	public void selectstockrotation() {
		commonclick.scrollAndClick(selectStandardStockRotation);
	}

	public void clickonnectaftersold() {
		commonclick.scrollAndClick(clickonnextaftersuldto);
	}

	public void clickonPORadiobutton() {
		commonclick.scrollAndClick(ClickonPO);
	}

	public void clickonnextaftersuldto2() {
		commonclick.scrollAndClick(clickonnextaftersuldto2);
	}

	public void EnterPONumber(String PONumber) {
		commonclick.scrollAndClick(enterPOnumber);
		enterPOnumber.sendKeys(PONumber);
	}

	public void clickonsearch() {
		commonclick.scrollAndClick(Clickonsearch);
	}
	public void clickonsearchonly() {
		commonclick.scrollAndClick(Clickonsearch);
		Clickonsearch.click();
	}
	

	public void selectallcheckbox() {
		commonclick.scrollAndClick(selectAllcheckbox);
	}

	public void clickonnextPO() {
		commonclick.scrollAndClick(AfterPONumberclickonNext);
	}

	public void clickonproductvalidation() {
		commonclick.scrollAndClick(ProductvalidationButton);
	}

	public void clickonnextafterPO() {
		commonclick.scrollAndClick(ClickonNextAfterProductvalidation);
	}

	public void enterQuantityfirst() {
		commonclick.scrollAndClick(enterquantityfirst);
		enterquantityfirst.sendKeys("1");
	}

	public void EnterMore10000Qty() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			// Wait for the price input field to be visible and clickable
			wait.until(ExpectedConditions.visibilityOf(enterquantityfirst));
			wait.until(ExpectedConditions.elementToBeClickable(enterquantityfirst));

			// Scroll and click if needed
			commonclick.scrollAndClick(enterquantityfirst);

			// Clear and enter price
			enterquantityfirst.clear();
			enterquantityfirst.sendKeys("100000");
		} catch (NoSuchElementException e) {
			System.out.println("Element not found: " + e.getMessage());
			// Proceed to the next step, element not found
		} catch (TimeoutException e) {
			System.out.println("Element not available within the specified time: " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Element not interactable: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error: " + e.getMessage());
		}
	}

	public void clickongetcreditprice() {
		commonclick.scrollAndClick(Clickongetcreditprice);
	}

	public void EnterPrice() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			// Wait for the price input field to be visible and clickable
			wait.until(ExpectedConditions.visibilityOf(EnterPrice));
			wait.until(ExpectedConditions.elementToBeClickable(EnterPrice));
			// Scroll and click if needed
			commonclick.scrollAndClick(EnterPrice);
			// Clear and enter price
			EnterPrice.clear();
			EnterPrice.sendKeys("100");
		} catch (NoSuchElementException e) {
			System.out.println("Element not found: " + e.getMessage());
			// Proceed to the next step, element not found
		} catch (TimeoutException e) {
			System.out.println("Element not available within the specified time: " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Element not interactable: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error: " + e.getMessage());
		}
	}

	public void entertextintoreasonfield() {
		commonclick.scrollAndClick(EnterText);
		EnterText.sendKeys("Validated Reason Filed ");
	}

	public void entertextintoreasonfieldexceptions() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			// Wait for the price input field to be visible and clickable
			wait.until(ExpectedConditions.visibilityOf(EnterText));
			wait.until(ExpectedConditions.elementToBeClickable(EnterText));
			// Scroll and click if needed
			commonclick.scrollAndClick(EnterText);
			// Clear and enter price
			EnterText.clear();
			EnterText.sendKeys("Validated Text");
		} catch (NoSuchElementException e) {
			System.out.println("Element not found: " + e.getMessage());
			// Proceed to the next step, element not found
		} catch (TimeoutException e) {
			System.out.println("Element not available within the specified time: " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Element not interactable: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error: " + e.getMessage());
		}
	}

	public void EnterPriceandhandleexceptions() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			// Wait for the price input field to be visible and clickable
			wait.until(ExpectedConditions.visibilityOf(EnterPrice));
			wait.until(ExpectedConditions.elementToBeClickable(EnterPrice));
			// Scroll and click if needed
			commonclick.scrollAndClick(EnterPrice);
			// Clear and enter price
			EnterPrice.clear();
			EnterPrice.sendKeys("100");
		} catch (NoSuchElementException e) {
			System.out.println("Element not found: " + e.getMessage());
			// Proceed to the next step, element not found
		} catch (TimeoutException e) {
			System.out.println("Element not available within the specified time: " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Element not interactable: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error: " + e.getMessage());
		}
	}

	public void EnterPriceZero() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			// Wait for the price input field to be visible and clickable
			wait.until(ExpectedConditions.visibilityOf(EnterPrice));
			wait.until(ExpectedConditions.elementToBeClickable(EnterPrice));
			// Scroll and click if needed
			commonclick.scrollAndClick(EnterPrice);
			// Clear and enter price
			EnterPrice.clear();
			EnterPrice.sendKeys("0");
		} catch (NoSuchElementException e) {
			System.out.println("Element not found: " + e.getMessage());
			// Proceed to the next step, element not found
		} catch (TimeoutException e) {
			System.out.println("Element not available within the specified time: " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Element not interactable: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error: " + e.getMessage());
		}
	}

	public void pricelessthan25k() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			// Wait for the price input field to be visible and clickable
			wait.until(ExpectedConditions.visibilityOf(EnterPrice));
			wait.until(ExpectedConditions.elementToBeClickable(EnterPrice));
			// Scroll and click if needed
			commonclick.scrollAndClick(EnterPrice);
			// Clear and enter price
			EnterPrice.clear();
			EnterPrice.sendKeys("24000");
		} catch (NoSuchElementException e) {
			System.out.println("Element not found: " + e.getMessage());
			// Proceed to the next step, element not found
		} catch (TimeoutException e) {
			System.out.println("Element not available within the specified time: " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Element not interactable: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error: " + e.getMessage());
		}
	}

	public void PricerGreterThan25K() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			// Wait for the price input field to be visible and clickable
			wait.until(ExpectedConditions.visibilityOf(EnterPrice));
			wait.until(ExpectedConditions.elementToBeClickable(EnterPrice));
			// Scroll and click if needed
			commonclick.scrollAndClick(EnterPrice);
			// Clear and enter price
			EnterPrice.clear();
			EnterPrice.sendKeys("29000");
		} catch (NoSuchElementException e) {
			System.out.println("Element not found: " + e.getMessage());
			// Proceed to the next step, element not found
		} catch (TimeoutException e) {
			System.out.println("Element not available within the specified time: " + e.getMessage());
		} catch (ElementNotInteractableException e) {
			System.out.println("Element not interactable: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error: " + e.getMessage());
		}
	}

	public void AfterCreditpriceNext() {
		commonclick.scrollAndClick(AfterCreditpriceNext);
	}

	public void validateallownace() {
		commonclick.scrollAndClick(ValidateAllownce);
	}

	public void clicksavesummery() {
		commonclick.scrollAndClick(SaveSummary);
	}

	public void ClickonSubmitAftersummery() {
		commonclick.scrollAndClick(ClickonsubmitafterSave);
	}

	public void clickonNextAccept() {
		commonclick.scrollAndClick(clickonNextAccept);
	}

	public void EnterSONumber(String SOnumber) {
		commonclick.scrollAndClick(EnterSONumber);
		EnterSONumber.sendKeys(SOnumber);
	}

	public void ReturnResonePSR() {
		commonclick.scrollAndClick(ReturnReasonPSR);
	}

	public void clickonProductRadioButton() {
		commonclick.scrollAndClick(ClickonProductradioButton);
	}

	public void SelectMMRadioButton() {
		commonclick.scrollAndClick(ClickOnMMRadioButton);
	}

	public void EnterMM(String MMID) {
		commonclick.scrollAndClick(EnterMMNumber);
		EnterMMNumber.sendKeys(MMID);
	}

	public void ClickOnSearchAfterMM() {
		commonclick.scrollAndClick(ClickonSearchButtonAfterMM);
	}

	public void SoldToIdContact() {
		commonclick.scrollAndClick(SoldToIdContact);
	}

	public void ReturnPSRselect() {
		commonclick.scrollAndClick(SelectPSR);
	}

	public void clickOnPOHistory() {
		commonclick.scrollAndClick(POHistoryButton);
	}

	public void clickonNextAfterPOHistory() {
		commonclick.scrollAndClick(POHistoryNext);
	}

	public void ClickonBulkUpload() {
		commonclick.scrollAndClick(BulkUploadRadioButton);
	}

	public void clickonUploadfileButton(String string2) throws InterruptedException {
		Thread.sleep(5000);
		UploadFile.click();
		Thread.sleep(4000);

	}

	public void uploadfile() {
		commonclick.scrollAndClick(UploadFile);
	}

	public void ValidateAfterUpload() {
		commonclick.scrollAndClick(ClickonValidate);
	}

	public void ClickonCPN() {
		commonclick.scrollAndClick(ClickOnCPN);
	}

	public void EnterCPN() {
		EnterCPN.sendKeys("4244594");
	}

	public void EnterCPNValue(String string) {
		commonclick.scrollAndClick(EnterCPN);

		EnterCPN.sendKeys(string);
	}

	public void EnterCPNvalue(String string) {
		commonclick.scrollAndClick(EnterCPN);
		EnterCPN.sendKeys(string);
	}

	public void SearchCPN() {
		commonclick.scrollAndClick(AfterCPNSearch);
	}

	public void SelectOPNradiobutton() {
		commonclick.scrollAndClick(ClickonOPNRadiobutton);
	}

	public void EnterOPN(String OPN) {
		commonclick.scrollAndClick(EnterOPN);
		EnterOPN.sendKeys(OPN);
	}

	public void ClickonSaveforlater() {
		commonclick.scrollAndClick(MMSaveforlater);
	}

	public void ClickonOKButton() {
		commonclick.scrollAndClick(ClickonOkButton);
	}

	public String StatusValidation() {
		waitUtils.waitForElementVisibility(getSavedstatustext, 30); // Wait for 30
		return getSavedstatustext.getText();
	}

	public void selectL3User() {
		commonclick.scrollAndClick(SelectL3User);
	}

	public void clickonL3Select() {
		commonclick.scrollAndClick(L3agent);
	}

	public void selectL3agent() {
		commonclick.scrollAndClick(SelectL3user);
	}

	public void ClickonAcceptButton() throws AWTException, InterruptedException {

		WebElement xpath = driver.findElement(By.xpath("//ul[contains(.,'Post')]/li/a[@title='Accept']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonAccept));
		Actions actions = new Actions(driver);
		actions.moveToElement(xpath).build().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ClickonAccept);
		js.executeScript("arguments[0].click();", ClickonAccept);

	}

	public void ClickOnCaseEdit() {
		commonclick.scrollAndClick(ClickonEdit);
	}

	public void selectsoldToContact() {
		commonclick.scrollAndClick(SoldTOcontactSelect);
	}

	public void clickoncancelIMF() {
		commonclick.scrollAndClick(IMFCancel);
	}

	public void ClickOnFirstSearch() {
		commonclick.scrollAndClick(ClickOnFirstSearch);
	}

	public void clickononIMF() {
		commonclick.scrollAndClick(ClickOnOKIMF);
	}

	public void clickonsoldtobox(String sold) {
		commonclick.scrollAndClick(clickonsoldtobox);
		clickonsoldtobox.sendKeys(sold);
	}

	public void Entersearchthistext() {
		Entertext.sendKeys("Amy Adamo");
	}

	public void selectsarah() {
		Entertext.sendKeys("Sarah Aggelidis");
	}

	public void selectsearchcontacts() {
		commonclick.scrollAndClick(selectsearchcontacts);
	}

	public void selecttext() {
		commonclick.scrollAndClick(selecttext);
	}

	public void clickonreturnreason() {
		commonclick.scrollAndClick(Clickonreason);
	}

	public void ClickOnRCA() {
		commonclick.scrollAndClick(ClickonCRA);
	}

	public void selectRCA() {
		commonclick.scrollAndClick(SelectCRA);
	}

	public void ClickonCA() {
		commonclick.scrollAndClick(ClickCA);
	}

	public void SelectCA() {
		commonclick.scrollAndClick(SelectCA);
	}

	public void clickonRCC() {
		commonclick.scrollAndClick(ClickonRCC);
	}

	public void selectRCC() {
		commonclick.scrollAndClick(SelectRCC);
	}

	public void ClickonCC() {
		commonclick.scrollAndClick(ClickonCollectionContact);
	}

	public void SelectCC() {
		commonclick.scrollAndClick(SelectCollectionContacts);
	}

	public void clickonnextIMF() throws InterruptedException {
		Thread.sleep(2000);
		commonclick.scrollAndClick(clickonNextIMF);
	}

	public void clickonnextafteredit() {
		commonclick.scrollAndClick(clickonnextafteredit);
	}

	public void ClickonNextAfterEdit() {
		commonclick.scrollAndClick(ClickonNextAfterEdit);

	}

	public void ClickonRelated() {
		commonclick.scrollAndClick(ClickonRelated);

	}

	public void ClickonALLcase() {
		commonclick.scrollAndClick(ClickonALLcases);
	}

	public void globaltextenter() {
		globaltextenter.sendKeys("78263786");

	}

	public void ClickonFilter() {
		commonclick.scrollAndClick(ClickOnfilter);
	}

	public void EnterCaseintofield(String Case) {
		commonclick.scrollAndClick(EnterTextIntocasefield);
		EnterTextIntocasefield.sendKeys(Case);
	}

	public void ClickOnAppy() {
		commonclick.scrollAndClick(Clickonapply);

	}

	public void SelectSearchedcase() throws InterruptedException {
		// commonclick.scrollAndClick(SelectCase);
		SelectCase.click();
		// Actions actions = new Actions(driver); // Initialize Actions class
		// actions.doubleClick(SelectCase).perform();

	}

	public void Clickonextedit() {
		commonclick.scrollAndClick(Clicknextedit);
	}

	public void clickGlobal() {

		commonclick.scrollAndClick(clickGlobal);
	}

	public void EnterTextGlobalfield(String string) {
		commonclick.scrollAndClick(EnterTextGlobalfield);
		EnterTextGlobalfield.sendKeys(string);

	}

	public void SelectGlobalsearch() throws InterruptedException {
		commonclick.scrollAndClick(SelectGlobalsearch);

	}

	public void statusOpenUn() {
		String actualText = statusOpenUn.getText();
		actualText.equals("Open, Unsubmitted");
		Assert.assertEquals(actualText, "Open, Unsubmitted");
	}

	public void enterUserName(String userName) {
		commonclick.scrollAndClick(EnterTextGlobalfield);
		EnterTextGlobalfield.sendKeys(userName);
	}

	public void enterSoldTo(String soldTo) {
		commonclick.scrollAndClick(clickonsoldtobox);
		clickonsoldtobox.sendKeys(soldTo);
	}

	public void SelectFirstRCA() {
		commonclick.scrollAndClick(SelectFirstRCA);
	}

	public void SelectFirstCA() {
		commonclick.scrollAndClick(SelectFirstCA);
	}

	public void SelectFirstRCC() {
		commonclick.scrollAndClick(SelectFirstRCC);
	}

	public void SelectFirstcc() {
		commonclick.scrollAndClick(SelectFirstcc);
	}

	public void PrintActiveMMIds() {
		for (WebElement mmId : PrintActiveMMIds) {
			String MMId = mmId.getText();
			System.out.println("Active MMId: " + MMId);
		}
	}

	public void enterValueInDecimalFields() {
		// Loop through each input field and enter the value "1"
		for (WebElement inputField : decimalInputFields) {
			inputField.clear(); // Optional: clear any existing value
			inputField.sendKeys("5"); // Enter the value "100"
		}

	}

	public void enterValueInDecimalField(String string) {
		// Loop through each input field and enter the value "1"
		for (WebElement inputField : decimalInputFields) {
			inputField.clear(); // Optional: clear any existing value
			inputField.sendKeys(string);
		}

	}

	public void EnterPriceIntoAllFields() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			// Loop through each input field and enter the value "100"
			for (WebElement inputField : EnterPriceIntoAllFields) {
				try {
					// Wait for each input field to be visible and clickable
					wait.until(ExpectedConditions.visibilityOf(inputField));
					wait.until(ExpectedConditions.elementToBeClickable(inputField));
					inputField.clear(); // Clear any existing value
					inputField.sendKeys("100"); // Enter the value "100"
				} catch (NoSuchElementException e) {
					System.out.println("Element not found: " + e.getMessage());
					// Skip this element and continue with the next
				} catch (TimeoutException e) {
					System.out.println("Element not available within the specified time: " + e.getMessage());
				} catch (ElementNotInteractableException e) {
					System.out.println("Element not interactable: " + e.getMessage());
				}
			}
		} catch (Exception e) {
			System.out.println("Unexpected error: " + e.getMessage());
		}
	}

	public void EnterReasonintoAllFields() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			// Loop through each input field and enter the value "IMF Reason"
			for (WebElement inputField : EnterReasonintoAllfileds) {
				try {
					// Wait for each input field to be visible and clickable
					wait.until(ExpectedConditions.visibilityOf(inputField));
					wait.until(ExpectedConditions.elementToBeClickable(inputField));

					inputField.clear(); // Clear any existing value
					inputField.sendKeys("IMF Reason"); // Enter the value "IMF Reason"
				} catch (NoSuchElementException e) {
					System.out.println("Element not found: " + e.getMessage());
					// Skip this element and continue with the next
				} catch (TimeoutException e) {
					System.out.println("Element not available within the specified time: " + e.getMessage());
				} catch (ElementNotInteractableException e) {
					System.out.println("Element not interactable: " + e.getMessage());
				}
			}
		} catch (Exception e) {
			System.out.println("Unexpected error: " + e.getMessage());
		}
	}

	public void ClickGetCreditPrice() {
		commonclick.scrollAndClick(ClickGetCreditPrice);
	}

	public void CLickNextAfterPO() throws InterruptedException {

		Thread.sleep(5000);
		Actions actions = new Actions(ldriver);
		actions.moveToElement(CLickNextAfterPO).build().perform();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", CLickNextAfterPO);
		js.executeScript("arguments[0].click();", CLickNextAfterPO);
		Thread.sleep(5000);
	}

	public void SelectGlobalsearchoption() {
		commonclick.scrollAndClick(SelectGlobalsearchoption);
	}

	public void SelectShipToContact() {
		commonclick.scrollAndClick(SelectShipToContact);
	}

	public void ShipTocontact() {
		commonclick.scrollAndClick(ShipTocontact);
	}

	public void SelectSoldToaddress() {
		commonclick.scrollAndClick(SelectSoldToaddress);
	}

	public void SelectSoldToaddressoption() {
		commonclick.scrollAndClick(SelectSoldToaddressoption);
	}

	public void clicksalesarea() {
		commonclick.scrollAndClick(clicksalesarea);
	}

	public void clicksalesareaselect()

	{
		commonclick.scrollAndClick(clicksalesareaselect);
	}

	By SelectDate = By.xpath("//label[text()='Collection Date']");

	public void SelectDate() {
		// Get today's date
	//LocalDate today = LocalDate.now();
		// Format today's date as MM/dd/yyyy
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		//String formattedDate = today.format(formatter);
		// Locate the input field for the Collection Date
		WebElement dateInput = driver.findElement(SelectDate);
		// Use JavaScriptExecutor to set today's date in the input field
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].value='" + formattedDate + "';", dateInput);
	}

	public void SelectSoldToContactSecond() {
		commonclick.scrollAndClick(SelectSoldToContactSecond);

	}

	public void ClickonFrightType() {
		commonclick.scrollAndClick(ClickonFrightType);

	}

	public void SelectFrightTypeIMF() {
		commonclick.scrollAndClick(SelectFrightTypeIMF);
	}

	public void SelectFrightTypeCMF() {
		commonclick.scrollAndClick(SelectFrightTypeCMF);

	}

	public void clickok() {

		commonclick.scrollAndClick(clickok);
	}

	public void ClickOnCancel() {

		commonclick.scrollAndClick(ClickOnCancel);

	}

	public void ClickSubmit() {

		commonclick.scrollAndClick(ClickSubmit);
	}

	public void SelectglobalCase() {
		commonclick.scrollAndClick(SelectglobalCase);

	}

	public void ClickEdit() {
		commonclick.scrollAndClick(ClickEdit);
	}

	public void ClickNextAfterEdit() {
		commonclick.scrollAndClick(ClickNextAfterEdit);

	}

	public void Clickacceptbutton() {
		commonclick.scrollAndClick(Clickacceptbutton);

	}

}
