package PageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;
import io.cucumber.java.en.When;

public class ContactPage_R4C_CaseCreation {
	public WebDriver ldriver;
	public WaitHelper waitHelper;
	public WebDriver driver;

	public ContactPage_R4C_CaseCreation(WebDriver rdriver) {
		// Assign the passed WebDriver instance to the class variable
		ldriver = rdriver;
		// Initialize all PageFactory elements on this page using the WebDriver instance
		PageFactory.initElements(rdriver, this);
		waitHelper = new WaitHelper(driver);
	}

	@FindBy(xpath = "//button[@title=\"Show Navigation Menu\"]")
	WebElement clickoncontactdropdown;

	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity'][normalize-space()='Contacts']")
	WebElement SelectContacts;

	@FindBy(xpath = "//span[@class='triggerLinkText selectedListView slds-page-header__title slds-truncate slds-p-right--xx-small lst-temp-slds-lineHeight uiOutputText']")
	WebElement clickViewDropdown;

	@FindBy(xpath = "//span[@class=' virtualAutocompleteOptionText'][normalize-space()='Recently Viewed Contacts']")
	WebElement SelectRecentViewcontact;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/force-list-view-manager-search-bar[1]/div[1]/lightning-input[1]/lightning-primitive-input-simple[1]/div[1]/div[1]/input[1]")
	WebElement EnterSearchcontact;

	@FindBy(xpath = "//button[normalize-space()='Search...']")
	WebElement EnterTextGolbarsearch;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/th[1]/span[1]/a[1]")
	WebElement selecttextcontact;

	@FindBy(xpath = "//button[normalize-space()='New R4C Case']") // Click on the CreateR4CCase button
	WebElement ClickonNewR4CCaseButton;

	@FindBy(xpath = "//span[@part='label'][normalize-space()='Stock Rotation']/..//span[@part='indicator']") // To
																												// Select
																												// service
																												// Type
																												// as a
																												// "Stock
																												// Rotation"
	WebElement clickonservicetype;

	@FindBy(xpath = "//button[normalize-space()='Create']") // To click on the create button
	WebElement clickoncreatebutton;
// By Using Axes Sibbling
	@FindBy(xpath = "//label[text()='Sold To']/following-sibling::div//input")
	WebElement EnterSoldto; // Enter Sold To id into fields

	@FindBy(xpath = "//span[text()='6006683685-ALSO Deutschland GmbH']/ancestor::li") // To select searched contact
	WebElement Clickonsoldtocontacts; // Click on sild to detils on dropdown

	@FindBy(xpath = "//label[text()='Return Reason']/following-sibling::div")
	WebElement ClickonReturnreasondropdown; // To click on the return reason Dropdown

	@FindBy(xpath = "//span[text()='Standard Stock Rotation']/ancestor::lightning-base-combobox-item")
	WebElement selectStandardStockRotation; // To select Stock Rotation from from dropdown

	@FindBy(xpath = "//button[normalize-space()='Next']")
	WebElement clickonnextaftersuldto;

	@FindBy(xpath = "//span[contains(text(),'Purchase/Sales Order')]/..//span[@class='slds-radio_faux']")
	WebElement ClickonPO; // To click PO radio button

	@FindBy(xpath = "//span[normalize-space()='PO Number']//following::input[@placeholder='Enter PO Number (use commas between multiple values)']")
	WebElement enterPOnumber; // To Enter PO number into the test field

	@FindBy(xpath = "//button[normalize-space()='Reset']//following::button[normalize-space()='Search']")
	WebElement Clickonsearch;

	@FindBy(xpath = "//a[normalize-space()='MM']/../..//span[@part='indicator']")
	WebElement selectAllcheckbox;

	@FindBy(xpath = "//button[normalize-space()='Cancel']//following::button[contains(text(),'Next')]")
	WebElement AfterPONumberclickonNext;

	@FindBy(xpath = "//button[normalize-space()='Product Validation']")
	WebElement ProductvalidationButton;

	@FindBy(xpath = "//button[normalize-space()='Save for Later']//preceding::button[contains(text(),'Next')]")
	WebElement ClickonNextAfterProductvalidation; // To click on the next button after Product validation check box

	@FindBy(xpath = "(//input[@inputmode=\"decimal\"])[1]") // To Enter Return Quantity To all field
	WebElement enterquantityfirst;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/c-r4c_-a-g_-case-header[1]/div[2]/lightning-card[1]/article[1]/div[2]/slot[1]/div[3]/div[1]/c-r4c_-a-g_-p-o-search[1]/div[1]/div[1]/div[2]/c-r4c_-a-g_-line-items-result-table[1]/div[3]/div[1]/lightning-button[4]/button[1]")
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

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/c-r4c_-a-g_-case-header[1]/div[2]/lightning-card[1]/article[1]/div[2]/slot[1]/div[3]/div[1]/c-r4c_-a-g_-p-o-search[1]/div[1]/div[1]/div[2]/c-r4c_-a-g_-line-items-result-table[1]/div[3]/div[1]/lightning-button[3]/button[1]")
	WebElement ValidateAllownce;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/c-r4c_-a-g_-case-header[1]/div[2]/lightning-card[1]/article[1]/div[2]/slot[1]/div[3]/div[1]/c-r4c_-a-g_-p-o-search[1]/div[1]/div[1]/div[2]/c-r4c_-a-g_-line-items-result-table[1]/div[3]/div[1]/lightning-button[4]/button[1]")
	WebElement SaveSummary;
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/c-r4c_-a-g_-case-header[1]/c-r4c_-a-g_-view-summary[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/lightning-button[3]/button[1]")
	WebElement ClickonsubmitafterSave;
	// --------------------------Scenario 2 Xpath Element----------

	@FindBy(xpath = "//span[normalize-space()='SO Number']//following::input[@placeholder='Enter SO Number (use commas between multiple values)']") // Enter
	WebElement EnterSONumber;
	// --------------------------Scenario 3 Xpath Element----------
@FindBy(xpath="//span[contains(text(),'6006683685-ALSO Deutschland GmbH')]")
WebElement SoldToIdContact;
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/c-r4c_-a-g_-case-header[1]/div[2]/lightning-card[1]/article[1]/div[2]/slot[1]/div[1]/div[1]/c-r4c_-a-g_-shipping-details[1]/lightning-layout[6]/slot[1]/lightning-layout-item[1]/slot[1]/div[1]/lightning-combobox[1]/div[1]/div[1]/lightning-base-combobox[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
	WebElement ReturnReasonPSR;
	@FindBy(xpath="//span[@title='Promotional Stock Rotation']")
	WebElement SelectPSR;
	@FindBy(xpath = "//span[normalize-space()='Search By:']//following::span[contains(text(),'Product')]")
	WebElement ClickonProductradioButton;
	@FindBy(xpath = "//span[contains(text(),'MM')]/..//span[contains(text(),'MM')]")
	WebElement ClickOnMMRadioButton;
	@FindBy(xpath = "//button[normalize-space()='Reset']//preceding::input[@placeholder='Enter the MM']")
	WebElement EnterMMNumber;
	@FindBy(xpath = "//button[normalize-space()='Reset']//following::button[normalize-space()='Search']")
	WebElement ClickonSearchButtonAfterMM;

	
	@FindBy(xpath="//button[normalize-space()='Cancel']//preceding::button[normalize-space()='PO History']")
	WebElement POHistoryButton;
	
	@FindBy(xpath="//button[normalize-space()='Cancel']//following::button[contains(text(),'Next')]")
	WebElement POHistoryNext;
	// --------------------------Scenario 3 Xpath Element----------

// Action Methods
	public String getPageTitle() {
		return ldriver.getTitle();
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
		EnterTextGolbarsearch.sendKeys("Sarah");
	}

	public void EntercontactNameintosearchfield(String Name) {
		EnterSearchcontact.sendKeys(Name); // To enter Text into search field
		EnterSearchcontact.sendKeys(Keys.RETURN); // To Click on ENter Button
	}

	public void selecttestcontact() {
		selecttextcontact.click();
	}

	public void clickonR4CCaseButton() throws InterruptedException {
		ClickonNewR4CCaseButton.click();
	}

	public void selectserviceType() {
		clickonservicetype.click();
	}

	public void clickoncreatebutton() {
		clickoncreatebutton.click();
	}

	public void EnterSoldTo() throws InterruptedException {
		EnterSoldto.click();
		EnterSoldto.sendKeys("6006683685");
	}

	public void Selectsearchedcontact() {
		Clickonsoldtocontacts.click();
	}

	public void clickonreturnreson() {
		ClickonReturnreasondropdown.click();
	}

	public void selectstockrotation() {
		selectStandardStockRotation.click();
	}

	public void clickonnectaftersold() {
		clickonnextaftersuldto.click();
	}

	public void clickonPORadiobutton() {
		ClickonPO.click();
	}

	public void EnterPONumber(String PONumber) {
		enterPOnumber.sendKeys(PONumber);
	}

	public void clickonsearch() {
		Clickonsearch.click();
	}

	public void selectallcheckbox() {
		selectAllcheckbox.click();
	}

	public void clickonnextPO() {
		AfterPONumberclickonNext.click();
	}

	public void clickonproductvalidation() {
		ProductvalidationButton.click();
	}

	public void clickonnextafterPO() {
		ClickonNextAfterProductvalidation.click();
	}

	public void enterQuantityfirst() {
		enterquantityfirst.sendKeys("10");
	}

	public void clickongetcreditprice() {
		Clickongetcreditprice.click();
	}

	public void EnterPrice() {
		EnterPrice.sendKeys("100");
	}

	public void entertextintoreasonfield() {
		EnterText.sendKeys("Test Case ");
	}

	public void AfterCreditpriceNext() {
		AfterCreditpriceNext.click();
	}

	public void validateallownace() {
		ValidateAllownce.click();
	}

	public void clicksavesummery() {
		SaveSummary.click();
	}

	public void ClickonSubmitAftersummery() {
		ClickonsubmitafterSave.click();
	}

// Scenario 2

	public void EnterSONumber(String SOnumber) {
		EnterSONumber.sendKeys(SOnumber);

	}
	// Scenario 3

	public void ReturnResonePSR() {
		ReturnReasonPSR.click();
	}

	public void clickonProductRadioButton() {
		ClickonProductradioButton.click();
	}

	public void SelectMMRadioButton() {
		ClickOnMMRadioButton.click();
	}
	public void EnterMM(String MMID) 
	{
		EnterMMNumber.sendKeys(MMID);
	}

	public void ClickOnSearchAfterMM() {
		ClickonSearchButtonAfterMM.click();
	}

	
	public void SoldToIdContact() 
	{
		SoldToIdContact.click();
	}
	
	public void ReturnPSRselect() 
	{
		SelectPSR.click();
	}
	
	public void clickOnPOHistory() 
	{
		POHistoryButton.click();	
	}
	public void clickonNextAfterPOHistory() 
	{
		POHistoryNext.click();
	}
	
	
	
}
