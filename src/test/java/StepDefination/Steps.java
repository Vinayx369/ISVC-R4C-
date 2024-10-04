package StepDefination;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.interactions.Actions;
import PageObject.Exceptions;
import PageObject.Admin;
import PageObject.ContactPage_R4C_CaseCreation;
import PageObject.Technical;
import PageObject.LoginPage;
import PageObject.Quality;
import Utilities.WaitHelper;
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

public class Steps extends BaseClass  {
	public WebDriver rdriver;
	public LoginPage lp;
	public ContactPage_R4C_CaseCreation contacts;
	public Technical Technical;
	public Quality quality;
	public Admin admin;
	public Exceptions exceptions;
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
// Contact - R4C-New case creation
// Scenario No-1

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
		Thread.sleep(2000);
		contacts.clickonsearch();
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
		Thread.sleep(10000);
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
		Thread.sleep(2000);
		contacts.clickongetcreditprice();
	}

	@When("Click on the Next button After credit Price")
	public void click_on_the_next_button_after_credit_price() throws InterruptedException {
	}

	@When("Enter Credit price")
	public void enter_credit_price() throws InterruptedException {
		contacts.EnterPriceZero();
		contacts.entertextintoreasonfield();
	}

	@When("Enter Credit price Zero")
	public void enter_credit_price_zero() {

		contacts.entertextintoreasonfield();
	}

	@When("Enter Credit price All fields")
	public void enter_credit_price_all_fields() {
		contacts.EnterPriceIntoAllFields();
		contacts.EnterReasonintoAllfileds();

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
//		try {
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Create a WebDriverWait object
//			WebElement element = wait
//					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"Submit\"]")));
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
		Thread.sleep(2000);
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

// Scenario No- 2
// Freight type as IMF using SO Search

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

// scenario no 3
// Verify the Case creation for Stock Rotation & Return Reason as Promotional
// Stock Rotation with Freight type as CRF using MM Search

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

	@When("Clickon Product radiobutton and enter MM Number {string}")
	public void clickon_product_radiobutton_and_enter_mm_number(String string) throws InterruptedException {
		contacts.clickonProductRadioButton();
		contacts.EnterMM(string);
	}

	@When("Click on search button after Entering MM Number")
	public void click_on_search_button_after_entering_mm_number() throws InterruptedException {
		contacts.ClickOnSearchAfterMM();
		Thread.sleep(2000);
		contacts.selectallcheckbox();
	}

	@When("Clickon PO History")
	public void clickon_po_history() throws InterruptedException {
		contacts.clickOnPOHistory();
		contacts.clickonNextAfterPOHistory();
	}

// scenario no 4
// Verify the Case creation for Stock Rotation & Return Reason as Promotional
// Stock Rotation with Freight type as IMF using Bulk Upload

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

	@Then("Click On Validate Button")
	public void click_on_validate_button() throws InterruptedException {
		Thread.sleep(2000);
		contacts.ValidateAfterUpload();
	}

	// Scenario 5 PO Search Function
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
//Scenario 9 OPN Search

	@Then("Click on Order Part Number radio button")
	public void click_on_order_part_number_radio_button() throws InterruptedException {
		contacts.SelectOPNradiobutton();
	}

	@When("Enter OPN into search box {string}")
	public void enter_opn_into_search_box(String string) throws InterruptedException {
		contacts.EnterOPN(string);
	}

//Scenario 12-----------
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

// Scenario 13----------------------

	@When("Enter Credit price <25K")
	public void enter_credit_price_25k() throws InterruptedException {
		contacts.pricelessthan25k();
		contacts.entertextintoreasonfield();
	}

//Scenario 14-------

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

// Scenario 15-Edit Case Open Unsaved
	@When("Click On Accept")
	public void click_on_accept() throws InterruptedException, AWTException {
		contacts.ClickonAcceptButton();
	}

	@When("Click on edit")
	public void click_on_edit() {
		contacts.ClickOnCaseEdit();
	}
// Opt in ok-----------

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
// Scenario 16-Opt In Cancel------

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

// Scenario 17Optin/Out Ok---------

	@When("Click on Ok buttton")
	public void click_on_ok_buttton() {
		contacts.clickononIMF();
	}
// Scenario 18 Optin/Out GEO ---------

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
		contacts.ShipTocontact();
		contacts.SelectShipToContact();
	}

	@Then("Select Ship To contact second Option")
	public void select_ship_to_contact_second_option() {

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

	@When("Click On Warranty Entitlement Check")
	public void click_on_warranty_entitlement_check() throws InterruptedException {
		Technical.ClickOnWarrentyEntitlement();

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
		Thread.sleep(5000);
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
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		contacts.ClickonBulkUpload();
		Thread.sleep(2000);
		contacts.clickonUploadfileButton(string);
		Thread.sleep(4000);
		Robot upload = new Robot();
		upload.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\OneDrive - Intel Corporation\\Desktop\\ULT Bulk Upload Sheet\\MMCPN_BulkUploadTemplate (3).csv");
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
				"C:\\Users\\oyadavx\\OneDrive - Intel Corporation\\Desktop\\ULT Bulk Upload Sheet\\ULT_BulkUpload.csv");
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
				"C:\\Users\\oyadavx\\OneDrive - Intel Corporation\\Desktop\\Automation Test Data\\Admin Bulk Upload\\MMCPN_BulkUploadTemplate.csv");
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
		Thread.sleep(5000);
		contacts.ClickonBulkUpload();
		Thread.sleep(5000);
		contacts.clickonUploadfileButton(string);
		Thread.sleep(5000);
		Robot upload = new Robot();
		upload.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\OneDrive - Intel Corporation\\Desktop\\ULT Bulk Upload Sheet\\MMCPNQuality.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		// Thread.sleep(2000);
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
		Technical.Selectfirst();
	}

	@When("Click Next button after All Item selection")
	public void click_next_button_after_all_item_selection() throws InterruptedException {
		// Thread.sleep(4000);
		Technical.NextAfterCheckAll();
	}

//------------>100K Price Override
	@When("Enter Credit price <100K")
	public void enter_credit_price_100k() throws InterruptedException {
		Technical.PricerGreterThan100K();
		// Thread.sleep(4000);
		contacts.entertextintoreasonfield();
	}
//----------------NPR Bulk upload---------------------------

	@When("Click On create button and select remedy and select reason")
	public void click_on_create_button_and_select_remedy_and_select_reason() throws InterruptedException {
		// Thread.sleep(3000);
		contacts.clickoncreatebutton();
		// Thread.sleep(3000);
		contacts.EnterSoldTo();
		// Thread.sleep(3000);
		contacts.SoldToIdContact();
		// Thread.sleep(5000);
		Technical = new Technical(driver);
		// Thread.sleep(3000);
		Technical.SelectNPR();
		// Thread.sleep(3000);
		Technical.ClickOnNPR();
		// Thread.sleep(3000);
		Technical.SelectReason();
		// Thread.sleep(3000);
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
		// contacts.SelectGlobalsearchoption();
		driver.findElement(
				By.xpath("//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']"))
				.click();
		// Thread.sleep(5000);
		// contacts.EnterSoldTo();
		// contacts.SoldToIdContact();
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
		Technical.Selectfirst();

	}
//------------------NPR Case creation with MM Search

	@When("Click On create button and select remedy and select reason  Warranty Service\\/Software")
	public void click_on_create_button_and_select_remedy_and_select_reason_warranty_service_software()
			throws InterruptedException {
		// Thread.sleep(2000);
		contacts.clickoncreatebutton();
		// Thread.sleep(2000);
		contacts.EnterSoldTo();
		// Thread.sleep(2000);
		contacts.SoldToIdContact();
		// Thread.sleep(5000);
		Technical = new Technical(driver);
		Technical.SelectNPR();
		// Thread.sleep(2000);
		Technical.ClickOnNPR();
		// Thread.sleep(2000);
		Technical.SelectReason();
		// Thread.sleep(2000);
		Technical.SelectWarrentyService();
	}

//----------------NPR case creation Using OPN
	@When("Click On create button and select remedy and select reason  Simple")
	public void click_on_create_button_and_select_remedy_and_select_reason_simple() throws InterruptedException {
		// Thread.sleep(2000);
		contacts.clickoncreatebutton();
		// Thread.sleep(2000);
		contacts.EnterSoldTo();
		// Thread.sleep(2000);
		contacts.SoldToIdContact();
		// Thread.sleep(5000);
		Technical = new Technical(driver);
		Technical.SelectNPR();
		// Thread.sleep(2000);
		Technical.ClickOnNPR();
		// Thread.sleep(2000);
		Technical.SelectReason();
		// Thread.sleep(2000);
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

	@When("Upload Bulk File {string} ULT")
	public void upload_bulk_file_ult(String string) throws AWTException, InterruptedException {

		Thread.sleep(2000);
		contacts.ClickonBulkUpload();
		Thread.sleep(2000);
		contacts.clickonUploadfileButton(string);
		Robot upload = new Robot();
		upload.delay(3000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\OneDrive - Intel Corporation\\Desktop\\ULT Bulk Upload Sheet\\ULT_BulkUpload.csv");
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

	// Bulk Upload File POC

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
		Thread.sleep(2000);
		contacts.EnterSoldToNumber(string);
		Thread.sleep(2000);
		// contacts.SelectGlobalsearchoption();
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
		Thread.sleep(4000);
		contacts.clickGlobal();
		Thread.sleep(4000);
		contacts.EnterTextGlobalfield(string);
		Thread.sleep(2000);
		contacts.SelectGlobalsearch();
		Thread.sleep(1000);
	}

	@Then("Select Contact from list and enter Case no into search field {string}")
	public void select_contact_from_list_and_enter_cacse_no_into_search_field(String string)
			throws InterruptedException {

		contacts = new ContactPage_R4C_CaseCreation(driver);
		Thread.sleep(2000);
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
		contacts.clickonPORadiobutton();
		contacts.clickonProductRadioButton();
		Technical = new Technical(driver);
		Technical.ClickMMTextbox();

	}

	@When("Enter ULT IDs")
	public void enter_ult_i_ds() throws InterruptedException {
		Technical.EnterULTs();
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
					"C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\Config.properties");
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
		// Thread.sleep(4000);

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
		//Thread.sleep(2000);
		Technical.enterSlodToExcel();
		Thread.sleep(2000);
		//Technical.selectSoldtoOption();
		driver.findElement(
				By.xpath("//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']"))
				.click();

	}
	
	@Then("Select Service Type Exception and Click create button enter Sold through Excel file")
	public void select_service_type_exception_and_click_create_button_enter_sold_through_excel_file() throws InterruptedException {
	    
		exceptions=new Exceptions(driver);
		Thread.sleep(2000);
		exceptions.SelectServiceTypeException();
		
		contacts.clickoncreatebutton();
		Technical = new Technical(driver);
		//Thread.sleep(2000);
		Technical.enterSlodToExcel();
		Thread.sleep(2000);
		//Technical.selectSoldtoOption();
		driver.findElement(
				By.xpath("//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']"))
				.click();

		
	
		
	}
	@Then("Select Exception Return Reason")
	public void select_exception_return_reson() {
		
		Technical.SelectReason();
		exceptions.ExceptionReturn();
		
	    
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
	
	
	
	
	
	

//Select First Address for all
	@Then("Select RCA address first")
	public void select_rca_address_first() throws InterruptedException {
		// Thread.sleep(4000);
		// ---------------------------
		// Thread.sleep(5000);
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

	}

	@Then("Select Return customer contact first")
	public void select_return_customer_contact_first() throws InterruptedException {
		// Thread.sleep(8000);
		contacts.clickonRCC();
		// Thread.sleep(5000);
		contacts.SelectFirstRCC();

	}

	@Then("Select CA Address first")
	public void select_ca_address_first() throws InterruptedException {
		// Thread.sleep(2000);
		contacts.ClickonCA();
		// Thread.sleep(5000);
		contacts.SelectFirstCA();

	}

	@When("select Collection Contact first")
	public void select_collection_contact_first() throws InterruptedException {
		// Thread.sleep(4000);
		contacts.ClickonCC();
		// Thread.sleep(4000);
		contacts.SelectFirstcc();
		// Thread.sleep(4000);

	}

	@When("Print Active MM Ids into console")
	public void print_active_mm_ids_into_console() {
		contacts.PrintActiveMMIds();
	}

	@When("Enter Quantity into All fields")
	public void enter_quantity_into_all_fields() {
		contacts.enterValueInDecimalFields();
	}

	@When("Enter Price Into All Fields")
	public void enter_price_into_all_fields() {
		contacts.EnterPriceIntoAllFields();
	}

	@When("Enter Reason into All Fields")
	public void enter_reason_into_all_fields() {
		contacts.EnterReasonintoAllfileds();
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

	@Then("Enter SoldTo and select {string}")
	public void enter_sold_to_and_select(String string) throws InterruptedException {
		Thread.sleep(2000);
		contacts.EnterSoldToNumber(string);
		Thread.sleep(2000);
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
		// Thread.sleep(6000);
		Technical.SelectNPR();
		// Thread.sleep(5000);
		Technical.CreditOption();
		// Thread.sleep(5000);
		Technical.SelectReason();
		// Thread.sleep(5000);
		quality = new Quality(driver);
		quality.ReasonQAN();
	}

	@When("Select Start Date and End Date")
	public void select_start_date_and_end_date() throws InterruptedException {
		Thread.sleep(2000);
		quality = new Quality(driver);
		quality.selectDateRange();
		Thread.sleep(3000);

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

	@Then("Select All other detils")
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
		Thread.sleep(4000);
		contacts.ClickonBulkUpload();
		Thread.sleep(4000);
		contacts.clickonUploadfileButton(string);
		System.out.println("Print path from Featute file" + string);
		Thread.sleep(4000);
		Robot upload = new Robot();
		upload.delay(4000);

		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\OneDrive - Intel Corporation\\Desktop\\ULT Bulk Upload Sheet\\ULT_BulkUploadQuality.csv");
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
		contacts.ClickOnCancel();
		// contacts.clickok();

	}

	@Then("Select Fright Type CMF")
	public void select_fright_type_cmf() {

		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.ClickonFrightType();
		contacts.SelectFrightTypeIMF();
		// contacts.ClickOnCancel();
		contacts.clickok();

	}

	// Admin Steps

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
		contacts.ClickOnCancel();
	}

	@Then("Select Return overship")
	public void select_return_overship() {
		Technical.SelectReason();
		admin.SelectOvership();
		contacts.clickok();
		
	}

	@Then("Select Return Reson dsample")
	public void select_return_reson_dsample() {
		Technical.SelectReason();
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
		//contacts.clickok();
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
	
	//Exception--------------------------------
	
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
		StringSelection stringSelection = new StringSelection("C:\\Users\\oyadavx\\OneDrive - Intel Corporation\\Desktop\\Automation Test Data\\Exception Bulk Upload\\MMCPN_BulkUploadT_Exception.csv"
				);
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
	    Technical.EnterULTs();
	}
	
}
