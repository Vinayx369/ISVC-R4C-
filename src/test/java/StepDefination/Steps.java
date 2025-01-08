package StepDefination;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.interactions.Actions;
import PageObject.Exceptions;
import PageObject.Admin;
import PageObject.CaseDateFieldsValidation;
import PageObject.ContactPage_R4C_CaseCreation;
import PageObject.Technical;
import PageObject_Web.Web_Portal_Quality;
import PageObject_Web.Web_Portal_StockRotation;
import PageObject_Web.Web_Portal_Technical;
import PageObject_Web.Web_Query_SR_Product_Status_Check;
import PageObject_Web.Web_Query_Search;
import PageObject.LoginPage;
import PageObject.Miscellaneous;
import PageObject.ProfileMasking;
import PageObject.Quality;
import Utilities.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.chrome.ChromeOptions;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.ElementNotInteractableException;

public class Steps extends BaseClass {
	public WebDriver rdriver;
	public LoginPage lp;
	public ContactPage_R4C_CaseCreation contacts;
	public Technical Technical;
	public Quality quality;
	public Admin admin;
	public Exceptions exceptions;
	public Miscellaneous miscellaneous;
	public Web_Portal_StockRotation WebSR;
	public Web_Portal_Technical WebTech;
	public Web_Portal_Quality WebQuality;
	public Web_Query_Search Query;
	public Web_Query_SR_Product_Status_Check QuerySRProductStatusCheck;
	public ProfileMasking ProfileMask;
	public CaseDateFieldsValidation CaseDateFieldsValidate;
	

	/*
	 * Author: Omkar Yadav Change:LogIn Page ISVC R4C Description: Launch browser
	 */
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		ChromeOptions options = new ChromeOptions();
		// options.addArguments("--headless"); // Run in headless mode
		// options.addArguments("--disable-gpu"); // Disable GPU (optional)
		// options.addArguments("--window-size=1920,1080"); // Set window size
		// (optional)

		options.addArguments("--start-maximized"); // Start browser maximized
		options.addArguments("--disable-notifications"); // Disable notifications
		options.addArguments("--incognito"); // Open in incognito mode
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-infobars");
		options.addArguments("--no-sandbox"); // Bypass OS security model (use cautiously)
		options.addArguments("--disable-dev-shm-usage"); // Overcomes limited resource problems in some environments
		options.addArguments("--remote-allow-origins=*"); // Addresses some CORS issues

		driver = new ChromeDriver(options);
		lp = new LoginPage(driver);
	}

	@When("User open url {string}")
	public void user_open_url(String string) throws InterruptedException {
		driver.get(string);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	@When("User Enter Email {string} as and pass {string}")
	public void user_enter_email_as_and_pass(String email, String password) throws InterruptedException {
		lp = new LoginPage(driver);
		lp.SetUserName(email);
		lp.SetPassword(password);
	}

	@When("Click on login")
	public void click_on_login() throws InterruptedException {
		lp.Clickonlogin();
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String string) {
		String Title = driver.getTitle();
		System.out.println("Actual title" + Title);
	}

	@When("User Click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {
		lp.clickonmenuicon();
		lp.clickonlogout();
	}

	@Then("Close brower")
	public void close_brower() {
		driver.close();
	}

	/*
	 * Author: Omkar Yadav Change:Case Creation Contact - R4C-New case creation
	 */

	@Given("User is logged in and on the Dashboard page")
	public void user_is_logged_in_and_on_the_dashboard_page() {
		contacts = new ContactPage_R4C_CaseCreation(driver);
		String Title = contacts.getPageTitle();
		System.out.println(Title);
		Assert.assertEquals(Title, Title);
	}

	@When("User Click on Contact menu")
	public void user_click_on_contact_menu() throws InterruptedException {
		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.Clickoncontactdropdown(); // TO click on contacts dropdown
	}

	@When("Select Contact from list and enter Text into search field {string}")
	public void select_contact_from_list_and_enter_text_into_search_field(String string) throws InterruptedException {
		contacts.SelectDropdownOption_Contacts(); // To select contact option
		contacts.clickondropdown(); // To click on List view Dropdown
		contacts.SelectTestContact(); // clickon recent view dropdown option
		contacts.EntercontactNameintosearchfield(string); // To Enter Text into search field- RecentView
		contacts.selecttestcontact(); // To click on searched contact
		contacts.EnterTextGlobaly(); // Enter Text Into global fields
	}

	@When("Click on the New R4C case creation button")
	public void click_on_the_new_r4c_case_creation_button() throws InterruptedException {
		contacts = new ContactPage_R4C_CaseCreation(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("All value enterd into fields with golbaly and recent search");
		Thread.sleep(2000);
		contacts.clickonR4CCaseButton();
		Thread.sleep(2000);
	}

	@Then("User can view New R4C Case popup")
	public void user_can_view_new_r4c_case_popup() {
		System.out.println("User Are Able to see New R4C Popup");
	}

	@Then("Select service type as {string}")
	public void select_service_type_as(String string) throws InterruptedException {
		try {
			contacts.selectserviceType();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("Click on the create button")
	public void click_on_the_create_button() throws InterruptedException {
		contacts.clickoncreatebutton();
	}

	@When("User enter Sold to and other details")
	public void user_enter_sold_to_and_other_details() throws InterruptedException {
		contacts.EnterSoldTo();
		contacts.Selectsearchedcontact();
		contacts.clickonreturnreson();
		contacts.selectstockrotation();
	}

	@When("Click on the Next button After Sold To")
	public void click_on_the_next_button_after_sold_to() throws InterruptedException {
		Thread.sleep(2000);
		contacts.clickonnectaftersold();
	}

	@When("Select Purchase\\/Sales Order button and Enter PO Number {string}")
	public void select_purchase_sales_order_button_and_enter_po_number(String string) throws InterruptedException {
		contacts.clickonPORadiobutton();
		contacts.EnterPONumber(string);
	}

	@When("Select Purchase\\/Sales Order button and Enter PO Number Through Excel")
	public void select_purchase_sales_order_button_and_enter_po_number_through_excel() {
		contacts.clickonPORadiobutton();
		admin = new Admin(driver);
		admin.enterPOnumber();
	}

	@Then("Click on the search button")
	public void click_on_the_search_button() throws InterruptedException {
		contacts.clickonsearch();
		//contacts.clickonsearchonly();
	}
	@Then("Click on the search button web")
	public void click_on_the_search_buttonweb() throws InterruptedException {
		contacts.clickonsearch();
		contacts.clickonsearchonly();
	}


	@Then("Select All Line items")
	public void select_all_line_items() throws InterruptedException {
		contacts.selectallcheckbox();
	}

	@Then("Click on the Next button after All Line Items")
	public void click_on_the_next_button_after_all_line_items() throws InterruptedException {
		contacts.clickonnextPO();
	}

	@Then("Click on Product Validation and Next button")
	public void click_on_product_validation_and_next_button() throws InterruptedException {
		contacts.clickonproductvalidation();
		contacts.clickonnextafterPO();
	}

	@When("Click on Product Validation")
	public void click_on_product_validation() throws InterruptedException {
		contacts.clickonproductvalidation();
	}

	@When("Click on Next cases edit")
	public void click_on_next_cases_edit() throws InterruptedException {

		WebElement Clickon = driver.findElement(By.xpath("(//button[contains(text(),'Next')])[3]"));
		Clickon.click();
	}

	@When("Click On Next Accept Edit")
	public void click_on_next_accept_edit() throws InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Create a WebDriverWait object
			WebElement element = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=\"Next\"])[2]")));
			JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll the element into view
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			Actions actions = new Actions(driver); // Focus on the element
			actions.moveToElement(element).perform();
			js.executeScript("arguments[0].click();", element); // Click the element using JavaScript
		} catch (TimeoutException e) {
			System.out.println("Element not found or not clickable within the specified time");
		} finally {
			System.out.println("Element still not clickable");
		}
	}

	@When("Click on next Case Validation")
	public void click_on_next_case_validation() throws InterruptedException {
		WebElement click = driver.findElement(By.xpath(
				"//section[@aria-expanded='true']//section[@role='tabpanel']//button[@title='Save for Later'][normalize-space()='Save for Later']/../..//button[@title='Next'][normalize-space()='Next']"));
		click.click();

	}

	@When("Enter Return Quantity")
	public void enter_return_quantity() throws InterruptedException {
		contacts.enterQuantityfirst();
		System.out.println("Enterd all values Into the Return Fields");
	}

	@When("Click on the Get credit price")
	public void click_on_the_get_credit_price() throws InterruptedException {
		contacts.clickongetcreditprice();
	}

	@When("Click on the Next button After credit Price")
	public void click_on_the_next_button_after_credit_price() throws InterruptedException {
	}

	@When("Enter Credit price")
	public void enter_credit_price() throws InterruptedException {
		contacts.EnterPriceandhandleexceptions();
		contacts.entertextintoreasonfieldexceptions();

	}

	@When("Enter Credit price Zero")
	public void enter_credit_price_zero() {
		contacts.EnterPriceZero();
		contacts.entertextintoreasonfield();
	}

	@When("Enter Credit price All fields")
	public void enter_credit_price_all_fields() {
		contacts.EnterPriceIntoAllFields();
		contacts.EnterReasonintoAllFields();

	}

	@When("Click on the Next button After Credit")
	public void click_on_the_next_button_after_credit() throws InterruptedException {
		contacts.AfterCreditpriceNext();
		System.out.println("------------Clicked after Entering reason-------------------");
	}

	@When("Click on the Validate Allowance")
	public void click_on_the_validate_allowance() throws InterruptedException {
		contacts.validateallownace();
	}

	@When("Click on the Save and Summary button")
	public void click_on_the_save_and_summary_button() throws InterruptedException {
		contacts.clicksavesummery();
	}

	@When("Click on submit button After Summary")
	public void click_on_submit_button_after_summary() throws InterruptedException {

		Thread.sleep(1000);
		contacts.ClickSubmit();

	}

	@Then("User can view Case creation Popup message")
	public void user_can_view_case_creation_popup_message() {
		System.out.println("PopUp Window Displayed");
	}

	@Then("Click on the Submit button")
	public void click_on_the_submit_button() {

	}

	@Then("User can view Successful message")
	public void user_can_view_successful_message() {

	}

	@Then("Close browser")
	public void close_browser() {
		driver.close();
	}

	@When("Select Purchase\\/Sales Order button and Enter SO Number {string}")
	public void select_purchase_sales_order_button_and_enter_so_number(String string) throws InterruptedException {
		contacts.clickonPORadiobutton();
		contacts.EnterSONumber(string);
	}

	@When("Select Purchase\\/Sales Order button and Enter SO Number through Excel")
	public void select_purchase_sales_order_button_and_enter_so_number_through_excel() {

		contacts.clickonPORadiobutton();
		admin = new Admin(driver);
		admin.EnterSO();
		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.clickonPORadiobutton();

	}

	@Then("Select service type as a {string}")
	public void select_service_type_as_a(String string) throws InterruptedException {
		contacts.selectserviceType();
		contacts.clickoncreatebutton();
		contacts.EnterSoldTo();
		contacts.SoldToIdContact();
		contacts.ReturnResonePSR();
		contacts.ReturnPSRselect();
		contacts.clickonnectaftersold();

	}

	@When("Click on next only")
	public void click_next() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		contacts.clickonnextaftersuldto2();

	}

	@When("Clickon Product radiobutton and enter MM Number {string}")
	public void clickon_product_radiobutton_and_enter_mm_number(String string) throws InterruptedException {
		contacts.clickonProductRadioButton();
		contacts.EnterMM(string);
	}

	@When("Click on search button after Entering MM Number")
	public void click_on_search_button_after_entering_mm_number() throws InterruptedException {
		contacts.ClickOnSearchAfterMM();
	}

	@And("Clickon PO History")
	public void clickon_po_history() throws InterruptedException {
		contacts.clickOnPOHistory();
		contacts.clickonNextAfterPOHistory();
	}

	@When("Clickon PO History only")
	public void clickon_po_historyonly() throws InterruptedException {
		contacts.clickOnPOHistory();
	}

	@Then("Select service type as a Promotional Stock Rotation and Upload Bulk File {string}")
	public void select_service_type_as_a_promotional_stock_rotation_and_upload_bulk_file(String string)
			throws InterruptedException, AWTException {
		contacts.selectserviceType();
		contacts.clickoncreatebutton();
		contacts.EnterSoldTo();
		contacts.SoldToIdContact();
		contacts.ReturnResonePSR();
		contacts.ReturnPSRselect();
		contacts.clickonnectaftersold();
		contacts.ClickonBulkUpload();
		contacts.clickonUploadfileButton(string);
		Robot upload = new Robot(); // To use robot class to handle file upload
		upload.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);

	}

	@When("Click On Bulk upload {string}")
	public void click_on_bulk_upload(String string) throws InterruptedException, AWTException {
		Thread.sleep(3000);
		contacts.ClickonBulkUpload();
		Thread.sleep(3000);
		contacts.clickonUploadfileButton(string);
		Thread.sleep(5000);

		Robot upload = new Robot();
		upload.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("Click On Bulk upload SR MMCPN {string}")
	public void click_on_bulk_uploadSR(String string) throws InterruptedException, AWTException {
		Thread.sleep(3000);
		contacts.ClickonBulkUpload();
		Thread.sleep(3000);
		contacts.clickonUploadfileButton(string);
		Thread.sleep(5000);

		Robot upload = new Robot();
		upload.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate (17).csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);
	}

	@Then("Click On Validate Button")
	public void click_on_validate_button() throws InterruptedException {
		contacts.ValidateAfterUpload();
	}

	@Then("Select service type as a Promotional Stock Rotation")
	public void select_service_type_as_a_promotional_stock_rotation() throws InterruptedException {
		contacts.selectserviceType();
		contacts.clickoncreatebutton();
		contacts.EnterSoldTo();
		contacts.SoldToIdContact();
		contacts.ReturnResonePSR();
		contacts.ReturnPSRselect();
		contacts.clickonnectaftersold();
	}

	@Then("Select service type as a Promotional Stock Rotations")
	public void select_service_type_as_a_promotional_stock_rotations() throws InterruptedException {
		contacts.selectserviceType();
		contacts.clickoncreatebutton();
		contacts.EnterSoldTo();
		contacts.SoldToIdContact();
		contacts.ReturnResonePSR();
		contacts.ReturnPSRselect();
	}

	@Then("Select service type as Stock roatation")
	public void select_service_type_as_stock_roatation() throws InterruptedException {
		contacts.selectserviceType();
		contacts.clickoncreatebutton();
	}

	@Then("Enter Sold To details")
	public void enter_sold_to_details() throws InterruptedException {
		contacts.EnterSoldTo();
		contacts.SoldToIdContact();
	}

	@Then("Select Promotional Stock option")
	public void select_promotional_stock_option() throws InterruptedException {
		Technical = new Technical(driver);
		Technical.SelectReason();
		Technical.SelectPromationalStockRoatation();

	}

	@When("Select Return Reason FCF")
	public void select_return_reasonFCF() throws InterruptedException {
		Technical = new Technical(driver);
		Technical.SelectReason();
		Technical.SelectRSFaildAtCustomerFactory();
	}

	@Then("click on Product radio button")
	public void click_on_product_radio_button() throws InterruptedException {
		contacts.clickonProductRadioButton();
	}

	@Then("Select CPN Radio button")
	public void select_cpn_radio_button() throws InterruptedException {
		contacts.ClickonCPN();
	}

	@When("Enter CPN number")
	public void enter_cpn_number() throws InterruptedException {
		contacts.EnterCPN();
	}

	@Then("Enter CPN Number through Excel")
	public void enter_cpn_number_through_excel() {

		admin = new Admin(driver);
		admin.EnterCPNyhroughExcel();
	}

	@When("Enter CPN Numbervalue {string}")
	public void enter_cpn_numbervalue(String string) {
		contacts.EnterCPNValue(string);
	}

	@When("Enter CPN number {string}")
	public void enter_cpn_number(String string) {
		contacts.EnterCPNvalue(string);
	}

	@When("click on search button")
	public void click_on_search_button() {
		contacts.SearchCPN();

	}

	@Then("Click on Order Part Number radio button")
	public void click_on_order_part_number_radio_button() throws InterruptedException {
		contacts.SelectOPNradiobutton();
	}

	@When("Enter OPN into search box {string}")
	public void enter_opn_into_search_box(String string) throws InterruptedException {
		contacts.EnterOPN(string);
	}

	@When("Enter OPN into search box through excel")
	public void Enter_OPN_into_search_box_through_excel() throws InterruptedException {
		Technical.enteropn();
	}

	@When("Clickon PO History button")
	public void clickon_po_history_button() throws InterruptedException {
		contacts.clickOnPOHistory();
	}

	@When("Click on Save for later button")
	public void click_on_save_for_later_button() throws InterruptedException {
		contacts.ClickonSaveforlater();
		contacts.ClickonOKButton();
		Thread.sleep(3000);
	}

	@When("Check Status")
	public void check_status(String Text) {
		Assert.assertEquals("Open, Unsubmitted", Text, "Text does not match!");
		System.out.println(Text + "Getting Status From WebPage");
	}

	@When("Enter Credit price <25K")
	public void enter_credit_price_25k() throws InterruptedException {
		contacts.pricelessthan25k();
		contacts.entertextintoreasonfield();
	}

	@When("Enter Credit price >25K")
	public void enter_credit_price_G25k() throws InterruptedException {
		contacts.PricerGreterThan25K();
		contacts.entertextintoreasonfield();
	}

	@When("User Slect L3 Agent Selection")
	public void user_slect_l3_agent_selection() throws InterruptedException {
		contacts.selectL3User();
	}

	@When("Click on Select Button")
	public void click_on_select_button() throws InterruptedException {
		contacts.clickonL3Select();
		contacts.selectL3agent();
	}

	/*
	 * Author: Omkar Yadav Change:LogIn Page ISVC R4C Description:Edit Flow Updated
	 */
	@When("Click On Accept")
	public void click_on_accept() throws InterruptedException, AWTException {
		contacts.ClickonAcceptButton();
	}

	@When("Click on edit")
	public void click_on_edit() {
		contacts.ClickOnCaseEdit();
	}

	@Then("Enter Sold To details for opt inout {string}")
	public void enter_sold_to_details_for_opt_inout(String string) throws InterruptedException {
		contacts.clickonsoldtobox(string);
	}

	@Then("Select return reason Standard Stock roatation")
	public void select_return_reason_standard_stock_roatation() throws InterruptedException {
		contacts.clickonreturnreason();

	}

	@When("Select Contact from list")
	public void select_contact_from_list() throws InterruptedException {
		contacts.SelectDropdownOption_Contacts(); // To select contact option
	}

	@When("Select recentview dropdown")
	public void select_recentview_dropdown() throws InterruptedException {
		contacts.clickondropdown(); // To click on List view Dropdown
		contacts.SelectTestContact(); // clickon recent view dropdown option
	}

	@When("Enter Contact name and select")
	public void enter_contact_name_and_select() throws InterruptedException {
		contacts.Entersearchthistext();
		contacts.selectsearchcontacts();
		contacts.selectsearchcontacts();
	}

	@When("Click on Contacts name")
	public void click_on_contacts_name() throws InterruptedException {
		contacts.selecttext();
	}

	/*
	 * Auth0r: Omkar Yadav Change:LogIn Page ISVC R4C
	 * 
	 */
	@When("Select Service Type Stock Rotation and Click on Create button")
	public void select_service_type_stock_rotation_and_click_on_create_button() throws InterruptedException {
		contacts.selectserviceType();
		contacts.clickoncreatebutton();

	}

	@When("Select return Reason Standard stock rotation")
	public void select_return_reason_standard_stock_rotation() throws InterruptedException {
		WebElement Clickstandardstock = driver.findElement(By.xpath(
				"//c-r4c_-a-g_-case-header//lightning-combobox[@data-name='Sales_Issue_Return_Reason__c']//div//button[@name='Select one']"));
		Clickstandardstock.click();

		WebElement Selectstandardstock = driver.findElement(By.xpath("//span[@title='Standard Stock Rotation']"));
		Selectstandardstock.click();
	}

	@When("Select Standard stock rotation")
	public void SelectSSR() throws InterruptedException {
		contacts.ClickSSR();
		contacts.SelectSSR();
	}

	@When("Enter Sold To Number")
	public void enter_sold_to_number() throws InterruptedException {
		contacts.EnterSoldToOptIn();
		contacts.selectsoldToContact();
	}

	@When("Click on Cancel buttton")
	public void click_on_cancel_buttton() throws InterruptedException {
		contacts.clickoncancelIMF();
	}

	@When("Select Freight Type")
	public void select_freight_type() throws InterruptedException {
		contacts.ReturnResonePSR();
		contacts.ReturnPSRselect();
		contacts.clickonnectaftersold();
	}

	@When("Select Contact from list and enter Text into search field {string} and select")
	public void select_contact_from_list_and_enter_text_into_search_field_and_select(String string)
			throws InterruptedException {
		contacts.SelectDropdownOption_Contacts(); // To select contact option
		contacts.clickondropdown(); // To click on List view Dropdown
		contacts.SelectTestContact(); // clickon recent view dropdown option
		contacts.EntercontactNameintosearchfield(string); // To Enter Text into search field- RecentView
		contacts.ClickOnFirstSearch();
	}

	/*
	 * Auth0r: Omkar Yadav Change:LogIn Page ISVC R4C Description:Click On Button
	 * added
	 */
	@When("Click on Ok buttton")
	public void click_on_ok_buttton() {
		contacts.clickononIMF();
	}

	@When("Enter Sold To Number case edit")
	public void enter_sold_to_number_case_edit() throws InterruptedException {
		contacts.EnterSoldTo();
		contacts.SoldToIdContact();
		contacts.ReturnResonePSR();
		contacts.ReturnPSRselect();
	}

	@When("Enter Sold To Number case")
	public void enter_sold_to_number_case() throws InterruptedException {
		contacts.EnterSoldTo();
		contacts.SoldToIdContact();
	}

	@When("Select  Reason as Standard Stock Rotation")
	public void select_reason_as_standard_stock_rotation() throws InterruptedException {
		Technical = new Technical(driver);
		Technical.SelectReason();
		Technical.SelectPromationalStockRoatation();
	}

	@When("Select RCA address")
	public void select_rca_address() throws InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Create a WebDriverWait object
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"//button[@aria-label='Return to Customer Address']/..//button[@aria-label='Return to Customer Address']")));
			JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll the element into view
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			Actions actions = new Actions(driver); // Focus on the element
			actions.moveToElement(element).perform();
			js.executeScript("arguments[0].click();", element); // Click the element using JavaScript
		} catch (TimeoutException e) {
			System.out.println("Element not found or not clickable within the specified time");
		} finally {
			System.out.println("Element still not clickable");
		}
		contacts.selectRCA();
	}

	@Then("Select Ship To contact")
	public void select_ship_to_contact() throws InterruptedException {

		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.ShipTocontact();
		contacts.SelectShipToContact();
	}

	@Then("Select Ship To contact second Option")
	public void select_ship_to_contact_second_option() {
		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.ShipTocontact();
		contacts.SelectSoldToContactSecond();

	}

	@When("Select RCA CMF Type address")
	public void select_rca_cmf_type_address() throws InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Create a WebDriverWait object
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"//button[@aria-label='Return to Customer Address']/..//button[@aria-label='Return to Customer Address']")));
			JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll the element into view
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			Actions actions = new Actions(driver); // Focus on the element
			actions.moveToElement(element).perform();
			js.executeScript("arguments[0].click();", element); // Click the element using JavaScript
		} catch (TimeoutException e) {
			System.out.println("Element not found or not clickable within the specified time");
		} finally {
			System.out.println("Element still not clickable");
		}

		driver.findElement(By.xpath("//span[@title='Lange Wende 43,Soest,Nordrhein-Westfalen,Germany,59494']")).click();

	}

	@When("Select RCA CMF Type address for QA")
	public void select_rca_cmftype_address() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			// Wait for the 'Return to Customer Address' button to be visible
			WebElement returnAddressButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"//button[@aria-label='Return to Customer Address']/..//button[@aria-label='Return to Customer Address']")));

			// Scroll the button into view
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", returnAddressButton);

			// Move focus to the element
			Actions actions = new Actions(driver);
			actions.moveToElement(returnAddressButton).perform();

			// Click the button using JavaScript
			js.executeScript("arguments[0].click();", returnAddressButton);

			// Wait for the address element to be clickable before clicking
			WebElement addressElement = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//span[@title='Lange Wende 43,Soest,Nordrhein-Westfalen,Germany,59494']")));

			// Click on the address element
			addressElement.click();

		} catch (TimeoutException e) {
			System.out.println("Element not found or not clickable within the specified time");
		} finally {
			System.out.println("Attempted to select the address.");
		}
	}

	@When("Select CA Address")
	public void select_ca_address() throws InterruptedException {
		contacts.ClickonCA();
		contacts.SelectCA();
	}

	@When("Select Return customer contact")
	public void select_return_customer_contact() throws InterruptedException {
		contacts.clickonRCC();
		contacts.selectRCC();

	}

	@When("select Collection Contact")
	public void select_collection_contact() throws InterruptedException {
		contacts.ClickonCC();
		contacts.SelectCC();
	}

	@When("Click on next")
	public void click_on_next() throws InterruptedException {
		contacts.clickonnextIMF();
	}

	// Scenario-24
	@When("Enter Return Quantity >=100K")
	public void enter_return_quantity_100k() throws InterruptedException {
		contacts.EnterMore10000Qty();
	}
//-----------------Technical Scenarios----------------------	

	@When("Select Service Type Technical and Click on Create button")
	public void select_service_type_technical_and_click_on_create_button() throws InterruptedException {
		contacts.clickoncreatebutton();
		contacts.EnterSoldTo();
		contacts.SoldToIdContact();
		contacts.ReturnResonePSR();
	}

	@When("Select Return Reason")
	public void select_return_reason() throws InterruptedException {
		Technical = new Technical(driver);
		Technical.SelectRSFaildAtCustomerFactory();
	}

	@When("Select Return Reason FEC web")
	public void select_return_reasonweb() throws InterruptedException {
		Technical = new Technical(driver);
		Technical.SelectReason();
		Technical.FailedatEndCustomer();
	}

	@When("Click On Warranty Entitlement Check")
	public void click_on_warranty_entitlement_check() throws InterruptedException {
		Technical.ClickOnWarrentyEntitlement();

	}
	@When("Click On Warranty Entitlement Check Web")
	public void click_on_warranty_entitlement_checkWeb() throws InterruptedException {
		Technical.ClickOnWarrentyEntitlement();
		Technical.clickOnWarrantyEntitlementClick();
	}

	@When("Enter ProductUniqueID {string}")
	public void enter_product_unique_id(String prefix) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> textBoxes = wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//input[@placeholder='Enter Product Unique Id']"))); // Get

		// Loop through the text boxes and enter the values
		for (int i = 0; i < textBoxes.size(); i++) {
			String value = prefix + (i + 1);
			textBoxes.get(i).sendKeys(value);
		}

	}

	@When("click accelept")
	public void click_accelept() throws InterruptedException {
//		try {
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Create a WebDriverWait object
//			WebElement element = wait.until(
//					ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Accept']")));
//
//			JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll the element into view
//			js.executeScript("arguments[0].scrollIntoView(true);", element);
//			Actions actions = new Actions(driver); // Focus on the element
//			actions.moveToElement(element).perform();
//			js.executeScript("arguments[0].click();", element); // Click the element using JavaScript
//		} catch (TimeoutException e) {
//			System.out.println("Element not found or not clickable within the specified time");
//		} finally {
//			System.out.println("Element still not clickable");
//		}
		contacts.Clickacceptbutton();

	}

// -----------------Case Edit TC-1-------------

	@When("Click On Edit Option")
	public void click_on_edit_option() throws InterruptedException {
		// Thread.sleep(5000);
//		try {
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Create a WebDriverWait object
//			WebElement element = wait
//					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Edit']")));
//
//			JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll the element into view
//			js.executeScript("arguments[0].scrollIntoView(true);", element);
//			Actions actions = new Actions(driver); // Focus on the element
//			actions.moveToElement(element).perform();
//			js.executeScript("arguments[0].click();", element); // Click the element using JavaScript
//		} catch (TimeoutException e) {
//			System.out.println("Element not found or not clickable within the specified time");
//		} finally {
//			//System.out.println("Element still not clickable");
//		}
		// Thread.sleep(2000);
		contacts.ClickEdit();
	}

	@When("Click On Next after edit")
	public void click_on_next_after_edit() throws InterruptedException {
		contacts.clickonnextafteredit();
	}

	@When("Click On Next after edit Case edit")
	public void click_on_next_after_edit_case_edit() throws InterruptedException {
		Thread.sleep(8000);

//		try {
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Create a WebDriverWait object
//			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
//					By.xpath("//li//button[contains(text(),'Save for Later')]/..//button[contains(text(),'Next')]")));
//			JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll the element into view
//			js.executeScript("arguments[0].scrollIntoView(true);", element);
//			Actions actions = new Actions(driver); // Focus on the element
//			actions.moveToElement(element).perform();
//			js.executeScript("arguments[0].click();", element); // Click the element using JavaScript
//		} catch (TimeoutException e) {
//			System.out.println("Element not found or not clickable within the specified time");
//		} finally {
//			System.out.println("Element still not clickable");
//		}

		contacts.ClickNextAfterEdit();

	}

// -----------------Case Edit TC-Submitted Pending Action-------------

	@When("Click on Related option")
	public void click_on_related_option() throws InterruptedException {
		contacts.ClickonRelated();
	}

	@When("Click on View All cases option")
	public void click_on_view_all_cases_option() {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Create a WebDriverWait object
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"//body/div/div[@aria-hidden='false']/section/div/div/div/div[@role='main']/section[@role='tabpanel']/div/div/section[@role='tabpanel']/div/div/div/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-contact_-record_-page1___-contact___-v-i-e-w/forcegenerated-flexipage_contact_record_page1_contact__view_js[@data-page-type='RecordPage']/record_flexipage-desktop-record-page-decorator/div/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div/div/slot[@name='main']/flexipage-component2[@data-component-id='flexipage_tabset']/slot/flexipage-tabset2/div/lightning-tabset/div/slot/slot[@name='tabs']/flexipage-tab2[@role='tabpanel']/slot/flexipage-component2[@data-component-id='force_relatedListContainer']/slot/lst-related-list-container/div/div/lst-related-list-single-container/laf-progressive-container[@aria-busy='false']/slot/lst-related-list-single-app-builder-mapper/article[@aria-label='Cases']/lst-related-list-view-manager/a/span[1]")));

			JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll the element into view
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			Actions actions = new Actions(driver); // Focus on the element
			actions.moveToElement(element).perform();
			js.executeScript("arguments[0].click();", element); // Click the element using JavaScript
		} catch (TimeoutException e) {
			System.out.println("Element not found or not clickable within the specified time");
		} finally {
		}

	}

	@When("click on case is Submitted Pending Action")
	public void click_on_case_is_submitted_pending_action() throws InterruptedException {
		// Locate the rows in the table
		List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
		// Iterate through each row
		for (WebElement row : rows) {
			// Get the status from the status column
			WebElement statusElement = row.findElement(By.xpath("//td[@data-label='Status']"));
			String status = statusElement.getText().trim();
			System.out.println(status + "Printed Status----------------------");
			// Check if the status is "Open" or "Unsubmitted"
			if (status.equals("Open") || status.equals("Unsubmitted")) {
				// Click on the corresponding case in the case column
				WebElement caseElement = row.findElement(By.xpath("//th[@data-label='Case']"));
				System.out.println(caseElement + "Printed Case number-------------------");
				caseElement.click();

				break;
			}
		}

	}

	@When("Click On FilterIcon")
	public void click_on_filter_icon() throws InterruptedException {
		contacts.ClickonFilter();
	}

	@When("Enter CAse No into text field {string}")
	public void enter_c_ase_no_into_text_field(String string) throws InterruptedException {
		contacts.EnterCaseintofield(string);
	}

	@When("Click On Apply button")
	public void click_on_apply_button() throws InterruptedException {
		Thread.sleep(3000);
		contacts.ClickOnAppy();
	}

	@When("Select searched case")
	public void select_searched_case() throws InterruptedException {
		Thread.sleep(3000);
		contacts.SelectSearchedcase();
	}

	@When("Click On Next after edit button")
	public void click_on_next_after_edit_button() throws InterruptedException {
		contacts.Clickonextedit();
	}

//Technical Case Creation Scenario 1

	@When("Clickon PO History check button")
	public void clickon_po_history_check_button() throws InterruptedException {
		Technical.POhistoryCheck();

	}

	@When("Click on PO Change popup Ok button")
	public void click_on_po_change_popup_ok_button() throws InterruptedException {
		Technical.clickonOkButton();

	}

	@When("Click on Next After PO history check")
	public void click_on_next_after_po_history_check() throws InterruptedException {
		Technical = new Technical(driver);
		Technical.clickonNext();
	}

	@When("Click on next button")
	public void click_on_next_button() throws InterruptedException {
		contacts.clicknextbutton();

	}

	@When("Click On Credit price Validation")
	public void click_on_credit_price_validation() throws InterruptedException {
		Technical.ClickOnCreditpriceValidation();

	}

	@When("Select All Line items check box")
	public void select_all_line_items_check_box() throws InterruptedException {
		Technical.Unselectallcheckbox();
	}

	@When("Select First Check box")
	public void select_first_check_box() throws InterruptedException {
		Technical.SelectFirstCheckbox();
	}

//Technical Case Creation Scenario 2

	@When("Select Remedy type is credit")
	public void select_remedy_type_is_credit() {
	}

	@When("Select Return Reason Faild at End Customer")
	public void select_return_reason_faild_at_end_customer() throws InterruptedException {
		Technical = new Technical(driver);
		Technical.ReturnReasonFaildEndCustomer();
	}
//--------Technical test 3 case PO search functionality

	@When("Select ReTurnTo Customer address")
	public void slect_reurn_to_customer_address() throws InterruptedException {
		Technical.RCA();
		Technical.SelectRCA();
	}

	@Then("Select RCA for OptIn\\/Out")
	public void select_rca_for_opt_in_out() throws InterruptedException {
		Technical.RCA();
		Technical.SelectRCAOptinOut();
	}

	@When("Select Collection address")
	public void select_collection_address() throws InterruptedException {
		Technical.ClickCA();
		Technical.SelectCA();
	}

	@When("Return to Customer Contact name")
	public void return_to_customer_contact_name() throws InterruptedException {
		Technical.ClickRCC();
		Technical.selectRCC();
	}
//-------------Technical BulkUpload----------

	@When("Upload Bulk File {string}\"")
	public void upload_bulk_file(String string) throws AWTException, InterruptedException {
		contacts.ClickonBulkUpload();
		contacts.clickonUploadfileButton(string);
		Thread.sleep(4000);
		Robot upload = new Robot();
		upload.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Quality Upload File\\MMCPNQualitya.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);

	}

	@When("Upload Bulk File Technical {string}\"")
	public void upload_bulk_fileT(String string) throws AWTException, InterruptedException {
		contacts.ClickonBulkUpload();
		contacts.clickonUploadfileButton(string);
		Thread.sleep(4000);
		Robot upload = new Robot();
		upload.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Technical Upload File\\MMCPNTechsample.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);

	}

	@When("Upload Bulk File Technical MMCPN Bulk Upload {}")
	public void upload_bulk(String string) throws AWTException, InterruptedException {
		Thread.sleep(2000);
		contacts.ClickonBulkUpload();
		Thread.sleep(2000);
		contacts.clickonUploadfileButton(string);
		Thread.sleep(4000);
		Robot upload = new Robot();
		upload.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Technical Upload File\\TechnicalMMCPNBulkUpload.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);

	}

	@Then("Upload Bulk File {string} NPR-Credit")
	public void upload_bulk_file_npr_credit(String string) throws InterruptedException, AWTException {
		Thread.sleep(2000);
		contacts.ClickonBulkUpload();
		Thread.sleep(2000);
		contacts.clickonUploadfileButton(string);
		Thread.sleep(3000);
		Robot upload = new Robot();
		upload.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Technical Upload File Web\\TechnicalULTBulkUpload.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);
	}

	@Then("Upload Bulk File With MM IDS {string}")
	public void upload_bulk_file_with_mm_ids1(String string) throws InterruptedException, AWTException {
		Thread.sleep(2000);
		contacts.ClickonBulkUpload();
		Thread.sleep(2000);
		contacts.clickonUploadfileButton(string);
		Thread.sleep(3000);
		Robot upload = new Robot();
		upload.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Admin Upload File\\MMCPNULTBulkAdmin.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);

	}

	@Then("Upload Miscellaneous Return Bulk File With MM IDS {string}")
	public void upload_bulklReturn(String string) throws InterruptedException, AWTException {
		Thread.sleep(2000);
		contacts.ClickonBulkUpload();
		Thread.sleep(2000);
		contacts.clickonUploadfileButton(string);
		Thread.sleep(3000);
		Robot upload = new Robot();
		upload.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\TestCases\\MiscellaneousReturnBulkUpload.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);

	}

	@Then("Upload Internal Miscellaneous Return Bulk File With MM IDS {string}")
	public void upload_bulklReturninternal(String string) throws InterruptedException, AWTException {
		Thread.sleep(2000);
		contacts.ClickonBulkUpload();
		Thread.sleep(2000);
		contacts.clickonUploadfileButton(string);
		Thread.sleep(3000);
		Robot upload = new Robot();
		upload.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\TestCases\\MiscellaneousinternalBulkUpload.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);

	}

	@Then("Upload Miscellaneous Bulk File With MM IDS {string}")
	public void upload_bulkl(String string) throws InterruptedException, AWTException {
		Thread.sleep(2000);
		contacts.ClickonBulkUpload();
		Thread.sleep(2000);
		contacts.clickonUploadfileButton(string);
		Thread.sleep(3000);
		Robot upload = new Robot();
		upload.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Misc Upload File\\MiscellaneousBulkUpload.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);

	}

	@When("Upload Bulk File {string} quality MMCPN")
	public void upload_bulk_file_quality_mmcpn(String string) throws InterruptedException, AWTException {
		contacts.ClickonBulkUpload();
		Thread.sleep(2000);
		contacts.clickonUploadfileButton(string);
		Thread.sleep(3000);
		Robot upload = new Robot();
		upload.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Quality Upload File\\MMCPNQualitya.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);
	}

//---------->25k----------------

	@When("Select Service Type Technical and Click on Create buttons only")
	public void select_service_type_technical_and_click_on_create_buttons_only() throws InterruptedException {
		contacts.clickoncreatebutton();
		contacts.EnterSoldTo();
		contacts.SoldToIdContact();
	}

	@When("Select Remedy credit")
	public void select_remedy_credit() throws InterruptedException {
		Technical = new Technical(driver);
		Technical.SelectNPR();
		Technical.CreditOption();
		Technical.SelectReason();
		Technical.SelectreasonFCFS();
	}

	@When("Select Remedy credit and reason")
	public void select_remedy_credit_and_reason() throws InterruptedException {
		Technical = new Technical(driver);
		Technical.SelectNPR();
		Technical.CreditOption();
		Technical.SelectReason();
		Technical.SelectFailedatCustomerFactorySite();
	}

	@When("Select Remedy credit and reason Fail Customer End")
	public void select_remedy_credit_and_reason_fail_customer_end() throws InterruptedException {
		Technical = new Technical(driver);
		Technical.SelectNPR();
		Technical.CreditOption();
		Technical.SelectReason();
		Technical.FailedatEndCustomer();
	}

	@When("Select Reason FOCS")
	public void Selectreason() throws InterruptedException {
		Technical = new Technical(driver);
		Technical.SelectReason();
		miscellaneous = new Miscellaneous(driver);
		miscellaneous.ReasonFOCS();

	}

	@When("Select Reason Internal return")
	public void SelectInternalreturn() throws InterruptedException {
		Technical = new Technical(driver);
		Technical.SelectReason();
		miscellaneous = new Miscellaneous(driver);
		miscellaneous.SelectInternalreturn();

	}

	@When("select checkbox")
	public void select_Checkbox() throws InterruptedException {
		Technical.SelectCheckbox();
	}

	@When("Select Remedy credit and reason SSR")
	public void select_remedy_credit_and_reason_ssr() throws InterruptedException {
		Technical = new Technical(driver);
		Technical.SelectNPR();
		Technical.CreditOption();

	}

	@When("Select Return Reason Failed at Customer Factory Site")
	public void select_return_reason_failed_at_customer_factory_site() throws InterruptedException {

	}
//------------<25 k-------------------

	@When("Select All Line items with RM")
	public void select_all_line_items_with_rm() throws InterruptedException {
		Technical = new Technical(driver);
		Technical.ClickOnAll();
		// Technical.Selectfirst();
	}

	@When("Click Next button after All Item selection")
	public void click_next_button_after_all_item_selection() throws InterruptedException {
		Technical.NextAfterCheckAll();
	}

//------------>100K Price Override
	@When("Enter Credit price <100K")
	public void enter_credit_price_100k() throws InterruptedException {
		Technical.PricerGreterThan100K();
		contacts.entertextintoreasonfield();
	}
//----------------NPR Bulk upload---------------------------

	@When("Click On create button and select remedy and select reason")
	public void click_on_create_button_and_select_remedy_and_select_reason() throws InterruptedException {
		contacts.clickoncreatebutton();
		contacts.EnterSoldTo();
		contacts.SoldToIdContact();
		Technical = new Technical(driver);
		Technical.SelectNPR();
		Technical.ClickOnNPR();
		Technical.SelectReason();
		Technical.SelectreasonFCFS();
	}
//-----------------NPR BulkIpload with ULT

	@When("Click On create button and select remedy and select reason customer site")
	public void click_on_create_button_and_select_remedy_and_select_reason_customer_site() throws InterruptedException {
		contacts.clickoncreatebutton();
		contacts.EnterSoldTo();
		contacts.SoldToIdContact();
		Technical = new Technical(driver);
		Technical.SelectNPR();
		Technical.ClickOnNPR();
		Technical.SelectReason();
		Technical.SelectFailcustomer();

	}

	@Then("Click On create button and select remedy and select reason customer site- SoldTo {string}")
	public void click_on_create_button_and_select_remedy_and_select_reason_customer_site_sold_to(String string)
			throws InterruptedException {

		contacts.clickoncreatebutton();
		contacts.EnterSoldToNumber(string);
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']"))
				.click();
		Technical = new Technical(driver);
		Technical.SelectNPR();
		Technical.ClickOnNPR();
		Technical.SelectReason();
		Technical.SelectFailcustomer();

	}
//-------------------NPR CPN case creation

	@When("Select First Item")
	public void select_first_item() throws InterruptedException {
		// Thread.sleep(3000);
		// contacts.selectallcheckbox();
		Technical.Selectfirst();

	}

	@When("Select ALL")
	public void select_ALL() throws InterruptedException {
		Thread.sleep(1000);
		contacts.selectallcheckbox();

	}

//------------------NPR Case creation with MM Search

	@When("Click On create button and select remedy and select reason  Warranty Service\\/Software")
	public void click_on_create_button_and_select_remedy_and_select_reason_warranty_service_software()
			throws InterruptedException {
		contacts.clickoncreatebutton();

		contacts.EnterSoldTo();
		contacts.SoldToIdContact();
		Technical = new Technical(driver);
		Technical.SelectNPR();
		Technical.ClickOnNPR();
		Technical.SelectReason();
		Technical.SelectWarrentyService();
	}

//----------------NPR case creation Using OPN
	@When("Click On create button and select remedy and select reason  Simple")
	public void click_on_create_button_and_select_remedy_and_select_reason_simple() throws InterruptedException {
		contacts.clickoncreatebutton();
		contacts.EnterSoldTo();
		contacts.SoldToIdContact();
		Technical = new Technical(driver);
		Technical.SelectNPR();
		Technical.ClickOnNPR();
		Technical.SelectReason();
		Technical.SelectSimpleReason();

	}

	@Then("Select Remedy credit and reason Tech Simple")
	public void select_remedy_credit_and_reason_tech_simple() throws InterruptedException {
		Technical = new Technical(driver);
		Technical.SelectNPR();
		Technical.CreditOption();
		Technical.SelectReason();
		driver.findElement(By.xpath("//span[@title='Technical Sample']")).click();
	}
//-------------------With ULT using MM

	@When("Enter ULT Number {string}")
	public void enter_ult_number(String string) throws InterruptedException {
		Technical.EnterULT(string);
	}

// ------------------with ULT is not mandatory

	@When("Select Service Type Technical and Click on Create button select remedy credit")
	public void select_service_type_technical_and_click_on_create_button_select_remedy_credit()
			throws InterruptedException {
		contacts.clickoncreatebutton();
		contacts.EnterSoldTo();
		contacts.SoldToIdContact();
		Technical = new Technical(driver);
		Technical.SelectNPR();
		Technical.Selectcredit();
		Technical.SelectReason();
		Technical.SelectFailcustomer();

	}
//-------------ULT Bulk Upload

	@When("User Click on Download ULT Template")
	public void user_click_on_download_ult_template() {
		Technical.ClickOnULTDownload();
	}

	@When("Enter Return Quantity {string}")
	public void enter_return_quantity(String string) {
		contacts.enterquantity(string);
	}

	@When("Upload Bulk File {string} ULT")
	public void upload_bulk_file_ult(String string) throws AWTException, InterruptedException {

		Thread.sleep(2000);
		contacts.ClickonBulkUpload();
		Thread.sleep(2000);
		contacts.clickonUploadfileButton(string);
		Robot upload = new Robot();
		upload.delay(3000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Quality Upload File\\ULT_BulkUploadQuality.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		Thread.sleep(2000);
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);

	}

	@When("Upload ULT Bulk File {string}")
	public void Upload_ULT(String string) throws InterruptedException, AWTException {
		Thread.sleep(2000);
		contacts.ClickonBulkUpload();
		Thread.sleep(2000);
		contacts.clickonUploadfileButton(string);
		Robot upload = new Robot();
		upload.delay(3000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Technical Exchange Upload File\\ULT_BuilkTechnicalExchange.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		Thread.sleep(2000);
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);

	}
	
	@When("Upload ULT Bulk File {string} Technical")
	public void Upload_ULTtech(String string) throws InterruptedException, AWTException {
		Thread.sleep(2000);
		contacts.ClickonBulkUpload();
		Thread.sleep(2000);
		contacts.clickonUploadfileButton(string);
		Robot upload = new Robot();
		upload.delay(3000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Technical Upload File\\ULT_BuilkTechnical.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		Thread.sleep(2000);
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);

	}

	@When("Select Contact from list and enter Text into search field {string} and select Contacts")
	public void select_contact_from_list_and_enter_text_into_search_field_and_select_contacts(String string)
			throws InterruptedException {
		contacts.SelectDropdownOption_Contacts(); // To select contact option
		contacts.clickondropdown(); // To click on List view Dropdown
		contacts.SelectTestContact(); // clickon recent view dropdown option
		contacts.EntercontactNameintosearchfield(string); // To Enter Text into search field- RecentView
		driver.findElement(By.xpath("//tbody/tr/td[1]/span[1]//following::th[@scope='row']")).click();
	}

	@When("Upload Bulk File {string}\" with MM Ids")
	public void upload_bulk_file_with_mm_ids(String string) throws InterruptedException, AWTException {
		contacts.ClickonBulkUpload();
		contacts.clickonUploadfileButton(string);
		Robot upload = new Robot();
		upload.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"\"C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate (1) - Copy.csv\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("Select Service Type Technical and Click on Create buttons and Enter Sold To {string}")
	public void select_service_type_technical_and_click_on_create_buttons_and_enter_sold_to(String string)
			throws InterruptedException {
		contacts.clickoncreatebutton();
		contacts.EnterSoldToNumber(string);
		// contacts.SelectGlobalsearchoption();
		driver.findElement(
				By.xpath("//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']"))
				.click();
	}

	@Then("Select Service Type Technical Exchange and Click on Create buttons and enter sold to")
	public void select_Technicalexchange() throws InterruptedException {
		contacts.clickoncreatebutton();
		Technical.enterSlodToExcel();
		Thread.sleep(2000);
		// Technical.selectSoldtoOption();
		driver.findElement(
				By.xpath("//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']"))
				.click();

	}

	@Then("Select Service Type Miscellaneous and Click on Create buttons and enter sold to")
	public void select_Miscellaneous() throws InterruptedException {

		miscellaneous = new Miscellaneous(driver);
		miscellaneous.SelectServiceTypeMiscellaneous();
		contacts.clickoncreatebutton();
		Technical.enterSlodToExcel();
		Thread.sleep(2000);
		// Technical.selectSoldtoOption();
		driver.findElement(
				By.xpath("//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']"))
				.click();

	}

	@Then("Select Internal Case Creation Option")
	public void entername() throws InterruptedException {
		miscellaneous = new Miscellaneous(driver);
		miscellaneous.CLickAPP();
		miscellaneous.EnterText();
		miscellaneous.SelectType();
		Technical = new Technical(driver);
		Thread.sleep(2000);
		Technical.enterSlodToExcel();
		Thread.sleep(2000);
		// Technical.selectSoldtoOption();
		driver.findElement(
				By.xpath("//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']"))
				.click();

	}

	@Then("Select credit")
	public void select_credit() {
		Technical = new Technical(driver);
		Technical.SelectNPR();
		Technical.CreditOption();
	}

	@Then("Select Return Only")
	public void select_Return() {
		Technical = new Technical(driver);
		Technical.SelectNPR();
		exceptions = new Exceptions(driver);
		miscellaneous.ReasonReturn();

	}

	@When("Select Service Type SR and Click on Create buttons and Enter Sold To {string}")
	public void select_service_type_sr_and_click_on_create_buttons_and_enter_sold_to(String string)
			throws InterruptedException {

		contacts.selectserviceType();
		contacts.clickoncreatebutton();
		contacts.EnterSoldToNumber(string);
		driver.findElement(
				By.xpath("//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']"))
				.click();
	}

	@When("Enter text global and select {string}")
	public void enter_text_global_and_select(String string) throws InterruptedException {
		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.clickGlobal();
		contacts.EnterTextGlobalfield(string);
		contacts.SelectGlobalsearch();

	}

	@Then("Select Contact from list and enter Case no into search field {string}")
	public void select_contact_from_list_and_enter_cacse_no_into_search_field(String string)
			throws InterruptedException {

		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.clickGlobal();
		Thread.sleep(2000);
		contacts.EnterTextGlobalfield(string);
		Thread.sleep(3000);
		contacts.SelectglobalCase();

	}

//-------------------Case Edit Technical
	@When("Click Next After Selection of Check boxes")
	public void click_next_after_selection_of_check_boxes() throws InterruptedException {
		Technical = new Technical(driver);
		Technical.ClickOnNEXTAfterEditfirst();
		Technical.ClickOnNEXTAfterEditsecond();
		Technical.ClickOnNEXTAfterEditthird();

	}

	@When("Check RMA status")
	public void check_rma_status() throws InterruptedException {
		Technical.checkRMAStatus();

	}

	@When("Click Next after EDIT Accept")
	public void click_next_after_edit_accept() {
		driver.findElement(By.xpath("")).click();
	}

	@When("Enter MMIDs By using Excel Sheet")
	public void enter_mmi_ds_by_using_excel_sheet() throws InterruptedException {
		// contacts.clickonPORadiobutton();
		contacts.clickonProductRadioButton();
		Technical = new Technical(driver);
		Technical.ClickMMTextbox();
	}

	@When("Enter ULT IDs")
	public void enter_ult_i_ds() throws InterruptedException {
		Thread.sleep(2000);
		Technical.EnterULTs();
	}

	@When("Enter ULTs from excel")
	public void EnterULTS() throws InterruptedException {

		Technical.EnterULTsForExchange();
		Technical.ClickSearch();

	}

	@When("Click Ok button")
	public void click_ok_button() throws InterruptedException {
		Technical = new Technical(driver);
		Technical.ClickonOk();
	}

	@When("Validate the Status")
	public void validate_the_status() {
		List<WebElement> elements = driver
				.findElements(By.xpath("//span[@class='slds-grid slds-grid_align-center slds-truncate']"));

		// Iterate through the list and print the text of each element
		for (WebElement element : elements) {
			System.out.println(element.getText());
		}
	}

//Opt in And Out Technical

	@When("Select Return Reason as a Failed at Customer Factory Site")
	public void select_return_reason_as_a_failed_at_customer_factory_site() throws InterruptedException {
		contacts.ReturnResonePSR();
		Technical = new Technical(driver);
		Technical.faildatcustomersite();
	}

	@When("User Should Get IMF Freight type {string}")
	public void user_should_get_imf_freight_type(String string) throws InterruptedException {
		Technical.IMFType();
	}

	@When("User Should Get CRF Freight")
	public void user_should_get_crf_freight() {
		Technical.CRFType();
	}

//Test PropFile
	Properties prop = new Properties();

	public Steps() {
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\VGANJIX\\OneDrive - Intel Corporation\\Documents\\Vinay\\Automation Practice\\Intel_ISVC\\Intel_ISVC_R4C\\src\\test\\java\\config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	LoginPage loginPage = new LoginPage(driver);

	@When("User open URL")
	public void user_open_url() {

		String url = prop.getProperty("url");
		driver.get(url);
	}

	@Then("User Enter Email Address and pass PassWord")
	public void user_enter_email_address_and_pass_pass_word() {

		String email = prop.getProperty("username");
		String password = prop.getProperty("password");
		lp.enterEmail(email);
		lp.enterPassword(password);
	}

	@Then("User Enter Email Address and pass PassWord Encripted")
	public void user_enter_email_address_and_pass_pass_word_encripted() throws Exception {
		lp = new LoginPage(driver);
		lp.enterCredentialsAndLogin();
		// loginPage.enterCredentialsAndLogin();

	}

	@When("Check Status Open Unsubmitted")
	public void check_status_open_unsubmitted() throws InterruptedException {
		Thread.sleep(2000); // Need wait because element not loading
		contacts.statusOpenUn();
	}

	@Then("Enter text global")
	public void enter_text_global() throws InterruptedException {
		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.clickGlobal();

		String userName = prop.getProperty("userName");
		contacts.enterUserName(userName);
		contacts.SelectGlobalsearch();
	}

	@Then("Select Service Type Technical and Click on Create buttons and Enter Sold")
	public void select_service_type_technical_and_click_on_create_buttons_and_enter_sold() throws InterruptedException {
		// Thread.sleep(4000);
		contacts.clickoncreatebutton();
		// Thread.sleep(4000);
		String soldTo = prop.getProperty("soldTo");
		contacts.enterSoldTo(soldTo);
	}

//Global search Excel
	/*
	 * Author: Omkar Yadav Date: 10 Nov 2022 Description:Customer WebPortalFlow
	 */
	@Then("Enter text global excel")
	public void enter_text_global_excel() throws InterruptedException {
		contacts = new ContactPage_R4C_CaseCreation(driver);
		Thread.sleep(2000);
		contacts.clickGlobal();
		Technical = new Technical(driver);
		Thread.sleep(2000);
		Technical.EnterGlobalTextthrouhExcel();
		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.SelectGlobalsearch();
		Thread.sleep(2000);
	}

	@Then("Select Service Type Technical and Click on Create buttons and Enter Sold through Excel")
	public void select_service_type_technical_and_click_on_create_buttons_and_enter_sold_through_excel()
			throws InterruptedException, IOException {
		contacts = new ContactPage_R4C_CaseCreation(driver);
		Thread.sleep(2000);
		contacts.clickoncreatebutton();
		Technical = new Technical(driver);
		Thread.sleep(2000);
		Technical.enterSlodToExcel();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']"))
				.click();

	}

	@Then("Select Service Type Admin and Click create button enter Sold through Excel file")
	public void select_service_type_admin_and_click_create_button_enter_sold_through_excel_file()
			throws InterruptedException, IOException {
		Thread.sleep(2000);
		admin = new Admin(driver);
		admin.SelectServiceTypeAdmin();
		contacts.clickoncreatebutton();
		Technical = new Technical(driver);
		// Thread.sleep(2000);
		Technical.enterSlodToExcel();
		Thread.sleep(2000);
		// Technical.selectSoldtoOption();
		driver.findElement(
				By.xpath("//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']"))
				.click();

	}

	@Then("Select Service Type Exception and Click create button enter Sold through Excel file")
	public void select_service_type_exception_and_click_create_button_enter_sold_through_excel_file()
			throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		exceptions = new Exceptions(driver);
		exceptions.SelectServiceTypeException();
		contacts.clickoncreatebutton();
		Technical = new Technical(driver);
		Technical.enterSlodToExcel();
		driver.findElement(
				By.xpath("//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']"))
				.click();

	}

	@Then("Select Exception Return Reason")
	public void select_exception_return_reson() {

		Technical.SelectReason();
		exceptions.ExceptionReturn();

	}

	@Then("Select Exception Return Reason and click ok")
	public void select_exception_return_reason_and_click_ok() {
		Technical.SelectReason();
		exceptions.ExceptionReturn();
		contacts.clickok();
	}

	@Then("Select Exception Return Reason and click cancel")
	public void select_exception_return_reason_and_click_cancel() {
		Technical.SelectReason();
		exceptions.ExceptionReturn();
		contacts.ClickOnCancel();
	}

	@Then("Select Cancel")
	public void select_exception_return_reason_and_click_cancels() {

		contacts.ClickOnCancel();
	}

	@Then("Select Ok")
	public void select_exception_return_reason_and_click_oks() {

		contacts.clickok();
	}

	@When("Click Cancel")
	public void Clickcancel() {
		miscellaneous = new Miscellaneous(driver);
		miscellaneous.ClickCancel();

	}

	@Then("Select GRL Exception Reason")
	public void select_grl_exception_reason() {
		Technical.SelectReason();
		exceptions.SelectGRLException();

	}

	@Then("Select Quarterly Exception")
	public void select_quarterly_exception() {
		Technical.SelectReason();
		exceptions.QuaterlyException();
	}

	@Then("Enter Justification")
	public void enter_justification() {
		exceptions.Justification();
	}

	@Then("Select RCA address first")
	public void select_rca_address_first() throws InterruptedException {
		// ---------------------------
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Create a WebDriverWait object
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"//button[@aria-label='Return to Customer Address']/..//button[@aria-label='Return to Customer Address']")));
			JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll the element into view
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			Actions actions = new Actions(driver); // Focus on the element
			actions.moveToElement(element).perform();
			js.executeScript("arguments[0].click();", element); // Click the element using JavaScript
		} catch (TimeoutException e) {
			System.out.println("Element not found or not clickable within the specified time");
		} finally {
			System.out.println("Element still not clickable");
		}
		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.SelectFirstRCA();

	}

	@Then("Select RCA address first and click ok")
	public void select_rca_address_firstok() throws InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Create a WebDriverWait object
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"//button[@aria-label='Return to Customer Address']/..//button[@aria-label='Return to Customer Address']")));
			JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll the element into view
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			Actions actions = new Actions(driver); // Focus on the element
			actions.moveToElement(element).perform();
			js.executeScript("arguments[0].click();", element); // Click the element using JavaScript
		} catch (TimeoutException e) {
			System.out.println("Element not found or not clickable within the specified time");
		} finally {
			System.out.println("Element still not clickable");
		}
		contacts.SelectFirstRCA();
		contacts.clickok();
	}

	@Then("Select RCA address first and click cancel")
	public void select_rca_address_firstcancel() throws InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Create a WebDriverWait object
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"//button[@aria-label='Return to Customer Address']/..//button[@aria-label='Return to Customer Address']")));
			JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll the element into view
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			Actions actions = new Actions(driver); // Focus on the element
			actions.moveToElement(element).perform();
			js.executeScript("arguments[0].click();", element); // Click the element using JavaScript
		} catch (TimeoutException e) {
			System.out.println("Element not found or not clickable within the specified time");
		} finally {
			System.out.println("Element still not clickable");
		}
		// Thread.sleep(4000);
		contacts.SelectFirstRCA();
		contacts.ClickOnCancel();
	}

	@Then("Select Return customer contact first")
	public void select_return_customer_contact_first() throws InterruptedException {
		contacts.clickonRCC();
		contacts.SelectFirstRCC();

	}

	@Then("Select CA Address first")
	public void select_ca_address_first() throws InterruptedException {
		contacts.ClickonCA();
		contacts.SelectFirstCA();

	}

	@When("select Collection Contact first")
	public void select_collection_contact_first() throws InterruptedException {
		contacts.ClickonCC();
		contacts.SelectFirstcc();

	}

	@When("Print Active MM Ids into console")
	public void print_active_mm_ids_into_console() {
		contacts.PrintActiveMMIds();
	}

	@When("Enter Quantity into All fields")
	public void enter_quantity_into_all_fields() {
		contacts.enterValueInDecimalFields();
	}

	@When("Enter Quantity into All fields {string}")
	public void enter_quantity_into_all_fields(String string) {

		contacts.enterValueInDecimalField(string);

	}

	@When("Enter Quantity into All fields through excel")
	public void enter_quantity_into_all_fields_through_excel() throws InterruptedException {
		exceptions = new Exceptions(driver);
		exceptions.enterQuantityCount();
		// Technical.EnterQuantity();

	}

	@When("Enter Price Into All Fields")
	public void enter_price_into_all_fields() {
		contacts.EnterPriceIntoAllFields();
	}

	@When("Enter Reason into All Fields")
	public void enter_reason_into_all_fields() {
		contacts.EnterReasonintoAllFields();
	}

	@When("Click Next button After PO")
	public void click_next_button_after_po() throws InterruptedException {
		contacts.CLickNextAfterPO();
	}

	@When("Print Case No into Console")
	public void print_case_no_into_console() throws InterruptedException {
		Thread.sleep(4000);
		Technical = new Technical(driver);
		Technical.PrintCaseNo();
	}

	@When("Print Case No into Console SR")
	public void print_case_no_into_console_sr() throws InterruptedException {
		Technical = new Technical(driver);
		Thread.sleep(2000);
		Technical.PrintCaseNoSR();
	}

//---------------------Quality-----------------------------

	@Then("Select Service Type Quality and Click create button")
	public void select_service_type_quality_and_click_create_button() throws InterruptedException {
		Thread.sleep(3000);
		quality = new Quality(driver);
		quality.SelectServiceTypeQuality();
		Thread.sleep(3000);
		contacts.clickoncreatebutton();
		Thread.sleep(2000);

	}

	@Then("Select Service Type Quality and Click create button enter Sold through Excel file")
	public void select_service_type_quality_and_click_create_button_enter_sold_through_excel_file()
			throws InterruptedException {
		Thread.sleep(1000);
		quality = new Quality(driver);
		quality.SelectServiceTypeQuality();
		Thread.sleep(1000);
		contacts.clickoncreatebutton();
		Technical = new Technical(driver);
		Technical.enterSlodToExcel();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']"))
				.click();

	}

	@Then("Select Service Type Technical and Click create button enter Sold through Excel file")

	public void select_Technical() throws InterruptedException {

		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.clickoncreatebutton();
		Technical = new Technical(driver);
		Technical.enterSlodToExcel();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']"))
				.click();

	}

	@Then("Select Service Type SR and Click create button enter Sold through Excel file")

	public void select_TechnicalSR() throws InterruptedException {

		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.selectserviceType();
		contacts.clickoncreatebutton();
		Technical = new Technical(driver);
		Technical.enterSlodToExcel();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']"))
				.click();

	}

	@Then("Select Service Type SR and Click create button enter Sold through Excel file for portal")

	public void select_TechnicalSRPortal() throws InterruptedException {

		// contacts = new ContactPage_R4C_CaseCreation(driver);
		// contacts.selectserviceType();

		WebSR = new Web_Portal_StockRotation(driver);
		WebSR.SelectSR();
		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.clickoncreatebutton();
		Technical = new Technical(driver);
		Technical.enterSlodToExcel();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']"))
				.click();

	}

	@Then("Enter SoldTo and select {string}")
	public void enter_sold_to_and_select(String string) throws InterruptedException {
		Thread.sleep(1000);
		contacts.EnterSoldToNumber(string);
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']"))
				.click();
	}

	@Then("Select credit NPR")
	public void select_credit_npr() {
		Technical.SelectNPR();
		Technical.ClickOnNPR();
	}

	@Then("Select Remedy and reason")
	public void select_remedy_and_reason() throws InterruptedException {
		Technical = new Technical(driver);
		Technical.SelectNPR();
		Technical.CreditOption();
		//Technical.SelectReason();   // Commented Because we don't have any other dropdown
		//quality = new Quality(driver);
		//quality.ReasonQAN();
	}

	@When("Select Start Date and End Date")
	public void select_start_date_and_end_date() throws InterruptedException {
		Thread.sleep(1000);
		quality = new Quality(driver);
		quality.selectDateRange();
		Thread.sleep(2000);

	}
//----------------Test Multiple contact ai a time case creation--------

	@Then("Enter text global {string}")
	public void enter_text_global(String string) throws InterruptedException {
		contacts = new ContactPage_R4C_CaseCreation(driver);
		Thread.sleep(4000);
		contacts.clickGlobal();
		Technical = new Technical(driver);
		Thread.sleep(4000);
		Technical.EnterOutinecontactName(string);
		Thread.sleep(4000);
		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.SelectGlobalsearch();

	}

	@Then("Select Service Type Technical and Click on Create buttons and Enter {string}")
	public void select_service_type_technical_and_click_on_create_buttons_and_enter(String string)
			throws InterruptedException {
		Thread.sleep(2000);
		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.clickoncreatebutton();
		Thread.sleep(4000);
		Technical = new Technical(driver);
		Technical.EnterSoldToOutline(string);
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']"))
				.click();
	}

	@When("Enter MMIDs {string}")
	public void enter_mmi_ds(String string) throws InterruptedException {
		contacts.clickonPORadiobutton();
		contacts.clickonProductRadioButton();
		Technical = new Technical(driver);
		Technical.EnterMMIdsOutline(string);

	}

	@When("Enter ULTS Value")
	public void enter_ults_value(io.cucumber.datatable.DataTable dataTable) {
		String ULts = dataTable.cell(1, 5); // ULts are in the 6th column (index 5)
		Technical.EnterULTsBulkUpload(ULts); // Call the method to handle bulk ULT upload
	}

	@When("Enter MRB into All fields {string}")
	public void enter_mrb_into_all_fields(String string) {
		quality.EnterMRBIntoAllfields(string);
	}

	@When("Enter MRB into All fields through Excel")
	public void enter_mrb_into_all_fields_through_excel() {

		exceptions = new Exceptions(driver);
		exceptions.EnterMRB();

	}

	@Then("Select All other details")
	public void select_all_other_detils() {

		contacts.SelectSoldToaddress();
		contacts.SelectSoldToaddressoption();
		contacts.clicksalesarea();
		contacts.clicksalesareaselect();
	}

	@When("Select Collection Date")
	public void select_collection_date() {
		contacts.SelectDate();
	}
//Quality NPR Bulk Upload

	@Then("Click On create button and select remedy NPR credit and select reason")
	public void click_on_create_button_and_select_remedy_npr_credit_and_select_reason() {
		Technical = new Technical(driver);
		Technical.SelectNPR();
		Technical.ClickOnNPR();
		Technical.SelectReason();
		quality = new Quality(driver);
		quality.ReasonQAN();

	}

	@Then("Upload Bulk File {string} NPR ULT Upload")
	public void upload_bulk_file_npr_ult_upload(String string) throws InterruptedException, AWTException {
		contacts.ClickonBulkUpload();
		Thread.sleep(2000);
		contacts.clickonUploadfileButton(string);
		System.out.println("Print path from Featute file" + string);
		Thread.sleep(2000);
		Robot upload = new Robot();
		upload.delay(3000);

		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Quality Upload File\\MMCPNULTBulkQuality.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);
	}

	@Then("Select Sold To Contact")
	public void select_sold_to_contact() {
		Technical.soldtocontact();
		Technical.selectsoldtocontact();

	}

	@Then("Select Sold To Contact second option")
	public void select_sold_to_contact_second_option() {
		Technical.soldtocontact();
		Technical.SelectSoldToContact();

	}

	@Then("Select Fright Type IMF")
	public void select_fright_type_imf() {
		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.ClickonFrightType();
		contacts.SelectFrightTypeIMF();
		contacts.ClickOnCancel(); // Try to click on Cancel if available

	}

	@Then("Select Fright Type IMF without cancel")
	public void select_fright_type_imf_withoutcancel() {
		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.ClickonFrightType();
		contacts.SelectFrightTypeIMF();

	}

	@Then("Select Fright Type IMF and click ok")
	public void select_fright_type_imfok() {
		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.ClickonFrightType();
		contacts.SelectFrightTypeIMF();
		contacts.clickok();

	}

	@Then("Select Fright Type CMF")
	public void select_fright_type_cmf() {

		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.ClickonFrightType();
		contacts.SelectFrightTypeIMF();
		// contacts.ClickOnCancel();
		contacts.clickok();

	}

	@Then("Click Ok")
	public void ClickOk() {
		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.clickok();

	}
//	@Then("Click Cancel")
//	public void Cliccancel() {
//		contacts = new ContactPage_R4C_CaseCreation(driver);
//		contacts.clickoncancelIMF();
//
//	}


	/*
	 * Author: Omkar Yadav Date: 2 Oct 2022 Description:Customer WebPortalFlow
	 */

	@Then("Select Service Type Admin and Click create button")
	public void select_service_type_admin_and_click_create_button() {
		admin = new Admin(driver);
		admin.SelectServiceTypeAdmin();
		contacts.clickoncreatebutton();

	}

	@Then("Enter CIRS {string}")
	public void enter_cirs(String string) {
		admin.EnterCIRS(string);
	}

	@Then("Enter CIRS Through Excel")
	public void enter_cirs_through_excel() {
		admin = new Admin(driver);
		admin.EnterCIRS();
	}

	@Then("Select Return Reson duplicate order")
	public void select_return_reson_duplicate_order() {
		Technical = new Technical(driver);
		Technical.SelectReason();
		admin.SelectReasonDuplicateOrder();
		contacts.ClickOnCancel();

	}

	@Then("Select Return Reson Incorrect labeling")
	public void select_return_reson_incorrect_labeling() {
		Technical.SelectReason();
		admin.SelectReasonIncorrectLabeling();
		contacts.clickok();

	}

	@Then("Select Return Reson mixed product")
	public void select_return_reson_mixed_product() {
		Technical.SelectReason();
		admin.SelectMixedProduct();
		// contacts.ClickOnCancel();
	}

	@Then("Select Return overship")
	public void select_return_overship() {
		Technical.SelectReason();
		admin.SelectOvership();
		contacts.clickok();

	}

	@Then("Select Return Reson sample")
	public void select_return_reson_dsample() {
		Technical.SelectReason();
		admin = new Admin(driver);
		admin.Sample();
	}

	@Then("Select Return shortship")
	public void select_return_shortship() {
		Technical.SelectReason();
		admin.SelectShortship();
		contacts.ClickOnCancel();
	}

	@Then("Select Return Reson Wrong Dest")
	public void select_return_reson_wrong_dest() {
		Technical.SelectReason();
		admin.SelectWrongDestination();
	}

	@Then("Select Return Reson wrong product")
	public void select_return_reson_wrong_product() {
		Technical.SelectReason();
		admin.SelectWrongProduct();
		contacts.ClickOnCancel();
	}

	@Then("Select Wrong Ship Date")
	public void select_wrong_ship_date() {
		Technical.SelectReason();
		admin.SelectWrongShipdate();
		contacts.clickok();
	}

	@Then("Select Lost Shipment")
	public void select_lost_shipment() {
		Technical.SelectReason();
		admin.SelectLostShipment();
		// contacts.clickok();
		contacts.ClickOnCancel();

	}

	@Then("Select Damage In Transit")
	public void select_damage_in_transit() {
		Technical.SelectReason();
		admin.Damangeintransit();
		contacts.clickok();
	}

	@When("Click on the Get credit price button")
	public void click_on_the_get_credit_price_button() {
		contacts.ClickGetCreditPrice();
	}

	/*
	 * Author: Omkar Yadav Date: 10 Oct 2022 Description:Customer WebPortalFlow
	 */

	@When("Select Box Condition")
	public void select_box_condition() {
		exceptions.SelectBoxCondition();

	}

	@When("Upload Bulk File With MM IDS {string} Exception")
	public void upload_bulk_file_with_mm_ids_exception(String string) throws InterruptedException, AWTException {

		Thread.sleep(2000);
		contacts.ClickonBulkUpload();
		Thread.sleep(2000);
		contacts.clickonUploadfileButton(string);
		Thread.sleep(3000);
		Robot upload = new Robot();
		upload.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Exception Upload File\\MMCPNULTBulkException.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);

	}

	@When("Enter ULTs from Excel")
	public void enter_ul_ts_from_excel() throws InterruptedException {
		Technical.EnterULT();
	}

	@When("Validate Fright type as a CMF")
	public void validate_fright_type_as_a_cmf() {
		exceptions = new Exceptions(driver);
		exceptions.VerifyCMF();

	}

	@When("Validate Fright type as a IMF")
	public void validate_fright_type_as_a_imf() {
		exceptions = new Exceptions(driver);
		exceptions.VerifyIMF();
	}

	@When("Enter Case No into text field through excel")
	public void Enter_Case_No_into_text_field_through_excel() {
		exceptions = new Exceptions(driver);
		exceptions.entercaseno();

	}

	@When("Select Remedy credit Exchange")
	public void select_Exhange() throws InterruptedException {
		Technical = new Technical(driver);
		Technical.SelectNPR();
		Technical.SelectExchange();
//		Technical.SelectReason();
//		Technical.SelectreasonSWRTL();	
	}

	@When("Select SWRTL")
	public void select_ExhangeSWRTL() throws InterruptedException {

		Technical.SelectReason();
		Technical.SelectreasonSWRTL();
	}

	@When("Select AWRTL")
	public void select_ExhangeAWRTL() throws InterruptedException {

		Technical.SelectReason();
		Technical.SelectAWRTL();
	}

	@When("Select SWRTLF")
	public void select_ExhangeSWRTLF() throws InterruptedException {
		Technical.SelectReason();
		Technical.SelectSWRTF();
	}

	@When("Select AWETF")
	public void select_ExhangeAWETF() throws InterruptedException {

		Technical.SelectReason();
		Technical.SelectAWETF();
	}

	@When("Enter Case text global and select")
	public void select_and_searchcase() throws InterruptedException {
		contacts = new ContactPage_R4C_CaseCreation(driver);
		Thread.sleep(2000);
		contacts.clickGlobal();
		Technical = new Technical(driver);
		Thread.sleep(2000);
		Technical.EnterGlobalcasethrouhExcel();
		Technical.SelectCase();
	}

	@When("Enter R4E Number")
	public void R4E() {

		Technical.EnterR4E();
		Technical.ClickNEXT();

	}

	@When("Select BoxCondition")
	public void Boxcondition() throws InterruptedException {
		miscellaneous = new Miscellaneous(driver);
		miscellaneous.selectBoxConditionForAll();
	}

	@When("Click Product Validate")
	public void Product() {
		miscellaneous = new Miscellaneous(driver);
		miscellaneous.ClickValidateProduct();
	}

	@When("Click on next after selection")
	public void next() {
		miscellaneous = new Miscellaneous(driver);
		miscellaneous.ClickNEXT();

	}

//------------------WEB Page----------------------------------------------

	/*
	 * Author: Omkar Yadav Date: 10 Nov 2022 Description:Customer WebPortalFlow
	 */

	@When("User open URL Web")
	public void user_open_urlweb() {
		String url = prop.getProperty("urlweb");
		driver.get(url);
	}

	@And("Click Create Case button")
	public void Create_Case() {
		WebSR = new Web_Portal_StockRotation(driver);
		WebSR.ClickCreatecasebutton();

	}

	@And("Click Edit Case button")
	public void Create_CaseButton() {
		WebSR = new Web_Portal_StockRotation(driver);
		WebSR.CaseViewAndEdit();
		WebSR.OpenUnsubmitButton();

	}

	@When("Print All Case details")
	public void CaseDetails() {
		WebSR.ClickOpenUnsubmittedcases();
		WebSR.printAllCaseDetails();

	}

	@When("Click on case number")
	public void CaseNumber_Web() {
		WebSR.clickCaseNumberForStockRotation();

	}
	@When("Click on Edit Button")
	public void CaseEdit() {
		WebSR.ClickEdit();

	}

	@When("Select ALL Web")
	public void select_ALLweb() throws InterruptedException {
		Thread.sleep(1000);
		WebSR.SelectAllCheckbox();
	}

	@Then("Select RCA address first web")
	public void select_return_customer_contact_firstweb() throws InterruptedException {
		// ---------------------------
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Create a WebDriverWait object
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"//button[@aria-label='Return to Customer Address']/..//button[@aria-label='Return to Customer Address']")));
			JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll the element into view
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			Actions actions = new Actions(driver); // Focus on the element
			actions.moveToElement(element).perform();
			js.executeScript("arguments[0].click();", element); // Click the element using JavaScript
		} catch (TimeoutException e) {
			System.out.println("Element not found or not clickable within the specified time");
		} finally {
			System.out.println("Element still not clickable");
		}
		WebSR.SelectRCCCRF();

	}

	@When("Print Case No into Console Web")
	public void print_case_no_into_console_srweb() throws InterruptedException {
		Thread.sleep(3000);
		WebSR.GetCaseNo();
		WebSR.PrintCaseNoSRweb();

	}

	@When("Check Status open unsubmited")
	public void Open_Un() throws InterruptedException {
		WebSR.checkstatus();

	}

	@When("Select NPR reason")
	public void Open_UnReason() throws InterruptedException {

		Technical = new Technical(driver);
		Technical.SelectNPR();
		Technical.ClickOnNPR();
	}

	@When("Select Return Reason Warrenty service web")
	public void warrenty_service() throws InterruptedException {

		Technical = new Technical(driver);
		Technical.SelectReason();
		Technical.SelectWarrentyService();
	}
	
	
	@And("Click I Agree Buttion")
	public void ClickAgreeButtion() {
		WebTech = new Web_Portal_Technical(driver);
		WebTech.ClickAgree();

	}
	@When("Select Remedy credit and Technical Exchange")
	public void select_remedy_credit_and_reasonexchange() throws InterruptedException {
		Technical = new Technical(driver);
		Technical.SelectNPR();
		Technical.SelectExchange();
		
	}	
	
	@Then("Select Service Type Quality and Click create button enter Sold through Excel file for portal")
	public void select_Quality() throws InterruptedException {

		// contacts = new ContactPage_R4C_CaseCreation(driver);
		// contacts.selectserviceType();

		WebQuality=new Web_Portal_Quality(driver);
		WebQuality.SelectQuality();
		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.clickoncreatebutton();
		Technical = new Technical(driver);
		Technical.enterSlodToExcel();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']"))
				.click();

	}
	
	@When("Upload Bulk File {string} Quality Portal")
	public void uploadbulk_file_quality_Portal(String string) throws InterruptedException, AWTException {
		contacts.ClickonBulkUpload();
		Thread.sleep(2000);
		contacts.clickonUploadfileButton(string);
		Thread.sleep(3000);
		Robot upload = new Robot();
		upload.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Quality Upload File web\\Credit_BulkuploadQualityportal.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("Upload Bulk File {string} NPR ULT Portal")
	public void upload_bulk_file_ultportal(String string) throws AWTException, InterruptedException {

		Thread.sleep(2000);
		contacts.ClickonBulkUpload();
		Thread.sleep(2000);
		contacts.clickonUploadfileButton(string);
		Robot upload = new Robot();
		upload.delay(3000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Quality Upload File web\\NPRCredit_ULT_BuilkUploadportal.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		Thread.sleep(2000);
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);

	}
	
//------------------Query Part 1 Search Steps--------------------------------------------------------------------------------------------------------------------------------------------	
	
	
	
	@And("Click Search Query")
	public void Clickquery() {
		Query = new Web_Query_Search(driver);
		Query.ClickSearchQuery();

	}
	
	@And("Enter RMA Number Into Text field")
	public void EnterRMA() {
		Query.EnterRMANumber();

	}
	
	@Then("Enter RMA Number {string}")
	public void enter_rma_no(String string) {
		Query.EnterRMANo(string);
	    
	}
	
	@And("Click on Search button")
	public void ClickSearchbtn() {
		Query.ClickSearchbtn();
	}
	
	@And("Click on RMANumber")
	public void click_on_rma_number() {
		Query.ClickonRMANumber();
	    
	}
	@Then("Validate the RMANumber")
	public void validate_the_rma_number() throws InterruptedException {
		Query.ValidateRMANumber(driver);
	    
	}
	
	
	@Then("Enter Sold To {string}")
	public void enter_sold_to(String string) throws InterruptedException {
		Query.EnterSoldToNo(string);   
	}
	
	@Then("Select Start Date as {string}")
	public void select_start_date_as(String string) {
		Query.SelectStartDate(string);
	    
	}
	
	@Then("Select End Date as {string}")
	public void select_end_date_as(String string) {
		Query.SelectEndDate(string);
	    
	}
	
	@Then("Enter Customer PO Number {string}")
	public void enter_customer_po_number(String string) {
	    Query.EnterCustomerPONumber(string);
	}
	
	@Then("Enter Return PO Number {string}")
	public void enter_return_po_number(String string) {
	    Query.EnterReturnPONumber(string);
	}
	
	@Then("Enter Serial Number {string}")
	public void enter_serial_number(String string) {
	    Query.EnterSerialNumber(string);
	}
	
	@Then("Enter VisId {string}")
	public void enter_visid(String string) {
	    Query.EnterVisId(string);
	}
	
	@Then("Enter MM {string}")
	public void enter_mm(String string) {
	    Query.EnterMm(string);
	}
	
	@Then("Enter CPN {string}")
	public void enter_cpn(String string) {
	    Query.EnterCpn(string);
	}
	
	@Then("Enter Credit Note Number {string}")
	public void enter_credit_note_number(String string) {
	    Query.EnterCreditNoteNumber(string);
	}
	
	@Then("Select Created by as Intel User {string}")
	public void select_created_by_as_intel_user(String string) throws InterruptedException {
	    Query.SelectCreatedByAsIntelUser(string);
	}
	
	@Then("Select Created by as Customer {string}")
	public void select_created_by_as_customer(String string) throws InterruptedException {
	    Query.SelectCreatedByAsCustomer(string);
	}
	
	@Then("Select Service Type as Technical")
	public void select_service_type_as_technical() {
		Query.SelectServiceTypeAsTechnical();
	}
	
	@Then("Select Service Type as Stock Rotation")
	public void select_service_type_as_stock_rotation() {
		Query.SelectServiceTypeAsStockRotation();
	}
	
	@Then("Select Service Type as Quality")
	public void select_service_type_as_quality() {
		Query.SelectServiceTypeAsQuality();
	}
	
	@Then("Select Service Type as Admin")
	public void select_service_type_as_admin() {
		Query.SelectServiceTypeAsAdmin();
	}
	
	@Then("Select Service Type as Exception")
	public void select_service_type_as_exception() {
		Query.SelectServiceTypeAsException();
	}
	
	@Then("Select Service Type as Miscellaneous")
	public void select_service_type_as_miscellaneous() {
		Query.SelectServiceTypeAsMiscellaneous();
	}
	
	@Then("Select Remedy as Credit")
	public void select_remedy_as_credit() {
		Query.SelectRemedyAsCredit();
	}
	
	@Then("Select Remedy as NPRCredit")
	public void select_remedy_as_nprcredit() {
		Query.SelectRemedyAsNPRCredit();
	}
	
	@Then("Select Remedy as Exchange")
	public void select_remedy_as_exchange() {
		Query.SelectRemedyAsExchange();
	}
	
	@Then("Select Remedy as Return Only")
	public void select_remedy_as_return_only() {
		Query.SelectRemedyAsReturnOnly();
	}
	
	@Then("Select Return Reason as Failed at Customer Factory Site for Credit")
	public void select_return_reason_as_failed_at_customer_factory_site_for_credit() {
		Query.SelectReturnReasonAsFailedAtCustomerFactorySiteForCredit();
	}
	
	@Then("Select Return Reason as Failed at End Customer for Credit")
	public void select_return_reason_as_failed_at_end_customer_for_credit() {
		Query.SelectReturnReasonAsFailedAtEndCustomerForCredit();
	}
	
	@Then("Select Return Reason as Technical Sample for Credit")
	public void select_return_reason_as_technical_sample_for_credit() {
		Query.SelectReturnReasonAsTechnicalSampleForCredit();
	}
	
	@Then("Select Return Reason as SWR Technical Line for Exchange")
	public void select_return_reason_as_swr_technical_line_for_credit() {
		Query.SelectReturnReasonAsSWRTechnicalLineForExchange();
	}
	
	@Then("Select Return Reason as AWR Technical Line for Exchange")
	public void select_return_reason_as_awr_technical_line_for_credit() {
		Query.SelectReturnReasonAsAWRTechnicalLineForExchange();
	}
	
	@Then("Select Return Reason as SWR Technical Field for Exchange")
	public void select_return_reason_as_swr_technical_field_for_credit() {
		Query.SelectReturnReasonAsSWRTechnicalFieldForExchange();
	}
	
	@Then("Select Return Reason as AWR Technical Field for Exchange")
	public void select_return_reason_as_awr_technical_field_for_credit() {
		Query.SelectReturnReasonAsAWRTechnicalFieldForExchange();
	}
	
	@Then("Select Return Reason as Sample for NPRCredit")
	public void select_return_reason_as_sample_for_nprcredit() {
		Query.SelectReturnReasonAsNPRCreditForNPRCredit();
	}
	
	
//-----------------------Query Part 2 Search Steps-------
	
	
	
	
//----------------Query SR Product Status Check----------	
	
	@Then("Click Query SR Product Status Check")
	public void click_query_sr_product_status_check() {
		QuerySRProductStatusCheck = new Web_Query_SR_Product_Status_Check(driver);
		QuerySRProductStatusCheck.ClickSRProductStatusCheck();
	    
	}
	@Then("Enter MMID {string}")
	public void enter_mmid(String string) {
		QuerySRProductStatusCheck.EnterMMID(string);
	    
	}
	@Then("Select Sales Organization as {string}")
	public void select_sales_organization_as(String string) throws InterruptedException {
		QuerySRProductStatusCheck.SelectSalesOrganization(string);
	    
	}
	@Then("Select Distribution Channel as {string}")
	public void select_distribution_channel_as(String string) throws InterruptedException {
		QuerySRProductStatusCheck.SelectDistributionChannel(string);
		
	}
	
	@And("Click on the Search button")
	public void click_on_the_search_btn() {
		QuerySRProductStatusCheck.ClickSearchbtn();
	}
	
	@Then("Click on Bulk Upload option")
	public void click_on_bulk_upload_option() {
		QuerySRProductStatusCheck.ClickonBulkUpload();
	}
	@Then("Click on Upload Files button")
	public void click_on_upload_files_button() throws InterruptedException, AWTException {
		QuerySRProductStatusCheck.ClickonUploadFile();
		Thread.sleep(2000);
		Robot upload = new Robot();
		upload.delay(3000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\VGANJIX\\OneDrive - Intel Corporation\\Documents\\Vinay\\Automation Practice\\Intel_ISVC\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Query Upload part 1\\MM_BulkSearchTemplate1.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("RMA File Uploaded Succesfully");
	    
	}
	
	@Then("Click on Upload Files button2")
	public void click_on_upload_files_button2() throws InterruptedException, AWTException {
		QuerySRProductStatusCheck.ClickonUploadFile();
		Thread.sleep(2000);
		Robot upload = new Robot();
		upload.delay(3000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\VGANJIX\\OneDrive - Intel Corporation\\Documents\\Vinay\\Automation Practice\\Intel_ISVC\\Intel_ISVC_R4C\\src\\test\\java\\TestData\\Query Upload part 1\\MM_BulkSearchTemplate1.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("RMA File Uploaded Succesfully");
	    
	}
	
	
	
	@Then("Click on Export to Excel button")
	public void click_on_export_to_excel_button() {
		QuerySRProductStatusCheck.ClickExportToExcelButton();
		
	}
	
	
	
	//--------------------Profile Masking----------------------
	
	

	@Then("Enter {string} in AppLauncher & open it")
	public void enter_in_app_launcher_open_it(String string) throws InterruptedException {
		ProfileMask = new ProfileMasking(driver);
		ProfileMask.OpenPriceProfileMasking(string);
	}
	
	@Then("Click on Profile Masking & go to Next")
	public void click_on_profile_masking_go_to_next() {
	    ProfileMask.ProfileMaskingbutton();
	}
	@Then("Click on User Profile Masking & go to Next")
	public void click_on_user_profile_masking_go_to_next() {
		ProfileMask.UserProfileMaskingbutton();
	}
	@Then("Enter First Name as {string}")
	public void enter_first_name_as(String string) {
		ProfileMask.EnterFirstName(string);
	}
	@Then("Click on Search")
	public void click_on_search() {
	    ProfileMask.Searchbutton();
	}
	
	@Then("Enter Last Name as {string}")
	public void enter_last_name_as(String string) {
		ProfileMask.EnterLastName(string);
	}
	
	@Then("Enter Email as {string}")
	public void enter_email_name_as(String string) {
		ProfileMask.EnterEmail(string);
	}
	
	@Then("Enter Login Name as {string}")
	public void enter_login_name_as(String string) {
		ProfileMask.EnterLoginName(string);
	}

	@Then("Select Check box for any contact & click on Save button")
	public void select_check_box_for_any_contact_click_on_save_button() {
		ProfileMask.ApplyUserProfileMask();
	}

	@Then("Global Search the Contact {string} and open it")
	public void global_search_the_contact_and_open_it(String string) throws InterruptedException {
		ProfileMask = new ProfileMasking(driver);
		ProfileMask.GlobalSearchContact(string);
	}
	
	@Then("Click on Log in to Experience as User button in contact")
	public void click_on_log_in_to_experience_as_user_button_in_contact() {
	    ProfileMask.LogintoExperienceasUserButton();
	}
	
	@Then("Validate the Error message at Homepage")
	public void validate_the_error_message_at_homepage()  {
	    ProfileMask.ValidateErrorMessage(driver);
	}
	
	@Then("Click on Gear icon for any of the Contact")
	public void click_on_gear_icon_for_any_of_the_contact() throws InterruptedException {
	    ProfileMask.ClickGearIconAtContact();
	}
	
	@Then("Click on Gear icon for any of the Sold To")
	public void click_on_gear_icon_for_any_of_the_sold_to() throws InterruptedException {
	    ProfileMask.ClickGearIconAtSoldTo();
	}
	
	@Then("Select Create Mask Check box for any Sold To & click on Save button")
	public void select_create_mask_check_box_for_any_sold_to_click_on_save_button() {
	    ProfileMask.UserProfileMaskSoldToCreateMask();
	}
	
	@Then("Select View Mask Check box for any Sold To & click on Save button")
	public void select_view_mask_check_box_for_any_sold_to_click_on_save_button() {
	    ProfileMask.UserProfileMaskSoldToViewMask();
	}
	
	@Then("Select Create Mask Check box for any Ship To & click on Save button")
	public void select_create_mask_check_box_for_any_ship_to_click_on_save_button() {
	    ProfileMask.UserProfileMaskShipToCreateMask();
	}
	
	@Then("Select View Mask Check box for any Ship To & click on Save button")
	public void select_view_mask_check_box_for_any_ship_to_click_on_save_button() {
	    ProfileMask.UserProfileMaskShipToViewMask();
	}
	
	@Then("Click on Create Case button & create Technical Case")
	public void click_on_create_case_button_create_technical_case() {
	    ProfileMask.ClickTechnicalCaseCreatebtn();
	}
	
	@Then("Enter Sold To in Case creation {string} & Validate the Sold To")
	public void enter_sold_to_in_case_creation_validate_the_sold_to(String string) {
		ProfileMask.ValidateSoldTo(string);		
	}
	
	@Then("Enter Sold To in Query Search {string} & Validate the Sold To")
	public void enter_sold_to_in_query_search_validate_the_sold_to(String string) {
		ProfileMask.ValidateSoldTo(string);		
	}
	
	@Then("Click on Download icon for any of the Contact in Export Masking Data column")
	public void click_on_download_icon_for_any_of_the_contact_in_export_masking_data_colimn() {
	    ProfileMask.ClickExportMaskingDataForContact();
	}
	
	@Then("Click on Download icon for any of the Sold To in Export Masking Data column")
	public void click_on_download_icon_for_any_of_the_sold_to_in_export_masking_data_colimn() {
	    ProfileMask.ClickExportMaskingDataForSoldTo();
	}
	
	@Then("Click on Customer Profile Masking & go to Next")
	public void click_on_customer_profile_masking_go_to_next() {
		ProfileMask.CustomerProfileMaskingbutton();
	}
	@Then("Enter Sold To as {string}")
	public void enter_sold_to_as(String string) {
		ProfileMask.EnterSoldTo(string);
	}
	
	@Then("Enter Sold To name as {string}")
	public void enter_sold_to_name_as(String string) {
		ProfileMask.EnterSoldToName(string);
	}
	
	@Then("Select Create Mask Check box for Sold To & click on Save button")
	public void select_create_mask_check_box_for_sold_to_click_on_save_button() {
		ProfileMask.CustomerProfileMaskSoldToCreateMask();
	}
	
	@Then("Select View Mask Check box for Sold To & click on Save button")
	public void select_view_mask_check_box_for_sold_to_click_on_save_button() {
		ProfileMask.CustomerProfileMaskSoldToViewMask();
	}
	
	@Then("Select Create Mask Check box for Ship To & click on Save button")
	public void select_create_mask_check_box_for_ship_to_click_on_save_button() {
		ProfileMask.CustomerProfileMaskShipToCreateMask();
	}
	
	@Then("Select View Mask Check box for Ship To & click on Save button")
	public void select_view_mask_check_box_for_ship_to_click_on_save_button() {
		ProfileMask.CustomerProfileMaskShipToViewMask();
	}
	
	
	
	//-------------R4C Case Date fields Validation-------------
	
	@Then("click on any of the Line item in R4C Case Header")
	public void click_on_any_of_the_line_item_in_r4c_case_header() {
		CaseDateFieldsValidate.ClickOnLineItem();
	}
	
	@Then("click on Header record link in Line item")
	public void click_on_header_record_link_in_line_item() throws InterruptedException {
		CaseDateFieldsValidate.ClickOnHeaderRecord();
	}
	
	@Then("Enter Case number {string} in Global Search and open the case")
	public void enter_case_number_in_global_search_and_open_the_case(String string) {
		CaseDateFieldsValidate = new CaseDateFieldsValidation(driver);
		CaseDateFieldsValidate.clickGlobalSearch();
		CaseDateFieldsValidate.EnterTextGlobalSearch(string);
		CaseDateFieldsValidate.SelectGlobalSearchCase();
	}
	
	@Then("Validate the Case Expiry Date field in Header Record")
	public void validate_the_case_expiry_date_field_in_header_record() {
		CaseDateFieldsValidate.ValidateCaseExpiryDate();
	}
	
	@Then("Validate the Day21st After RMA Approval field in Header Record")
	public void validate_the_day21st_after_rma_approval_field_in_header_record() {
		CaseDateFieldsValidate.Validate21stDateAfterRMAApproval();
	}
	
	@Then("Validate the Day14th After RMA Approval field in Header Record")
	public void validate_the_day14th_after_rma_approval_field_in_header_record() {
		CaseDateFieldsValidate.Validate14thDateAfterRMAApproval();
	}
	
	@Then("Validate the Approved Date field in Header Record")
	public void validate_the_approved_date_field_in_header_record() {
		CaseDateFieldsValidate.ValidateApprovedDate();
	}
	
	@Then("Validate the Collection Date field in Header Record")
	public void validate_the_collection_date_field_in_header_record() {
		CaseDateFieldsValidate.ValidateCollectionDate();
	}
	
	@Then("Validate the Created Date field in Header Record")
	public void validate_the_created_date_field_in_header_record() {
		CaseDateFieldsValidate.ValidateCreatedDate();
	}
	
	@Then("Validate the Case Submitted Date field in Header Record")
	public void validate_the_case_submitted_date_field_in_header_record() {
		CaseDateFieldsValidate.ValidateCaseSubmittedDate();
	}
	
	@Then("Validate the International Commerce Term field in Header Record")
	public void validate_the_international_commerce_term_field_in_header_record() {
		CaseDateFieldsValidate.ValidateInternationalCommerceTerm();
	}
	
	
	
}
