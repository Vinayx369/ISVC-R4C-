package PageObject_Web;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.ConfigReader;
import Utilities.ExcelUtils;
import Utilities.WaitHelper;
import utils.CommonUtils;
import utils.WaitUtils;
import utils.waitUtilsZ;

public class Web_Query_ProductWarrenty {

	public WebDriver ldriver;
	public WaitHelper waitHelper;
	public WebDriver driver;
	public WaitUtils waitUtils;
	public waitUtilsZ waitUtilsZ;
	public CommonUtils commonclick;

	public Web_Query_ProductWarrenty(WebDriver rdriver) {
		// Assign the passed WebDriver instance to the class variable
		this.ldriver = rdriver;
		// Initialize all PageFactory elements on this page using the WebDriver instance
		PageFactory.initElements(rdriver, this);
		waitHelper = new WaitHelper(ldriver);
		waitUtils = new WaitUtils(ldriver); // Initialize wait utility
		waitUtilsZ = new waitUtilsZ(ldriver);
		commonclick = new CommonUtils(ldriver);

	}

	/*
	 * Date: 17-12-2024 Author: Omkar Yadav Change:Search Product&Warrenty
	 */
	@FindBy(xpath = "//span[@data-name='query-product-and-warranty-information']")
	WebElement ClickProductWarrenty;
	@FindBy(xpath = "//input[@placeholder='Please enter a search text']")
	WebElement EnterMMIds;

	@FindBy(xpath = "//tbody/tr[1]/th[2]")
	WebElement CheckText;
	@FindBy(xpath = "//label[@for='productCPNSearch-16']//span[2]")
	WebElement ClickOnCPNRadioBtn;

	@FindBy(xpath = "//label[@for='productOPNSearch-16']//span[2]")
	WebElement ClickOnOPNRadioBtn;

	@FindBy(xpath = "//label[@for='productCodeSearch-16']//span[2]")
	WebElement ClickOnProductCodeBtn;

	@FindBy(xpath = "//label[@for='ultSearch-16']//span[2]")
	WebElement ClickOnULTRadiobutton;

	@FindBy(xpath = "//label[@for='serviceType-16']//following::button[@name='serviceType']")
	WebElement ClickServiceType;

	@FindBy(xpath = "//span[@title='Technical']")
	WebElement ClickServiceTypeTech;
	@FindBy(xpath = "//button[@name='remedy']")
	WebElement ClickOnRemedy;

	@FindBy(xpath = "//span[@title='Credit']")
	WebElement ClickOnRemedyCredit;

	@FindBy(xpath = "//button[@name='returnReason']")
	WebElement ClickOnreason;

	@FindBy(xpath = "//span[@title='Failed at Customer Factory Site']")
	WebElement SelectFCF;

	@FindBy(xpath = "//span[@part='button']")
	WebElement ClickUploaddropbutton;

	@FindBy(xpath = "//label[@for='ultSNSingleSearch-16']//span[2]")
	WebElement ClickPUIbutton;

	@FindBy(xpath = "//input[@placeholder='Please enter a search text']")
	WebElement EnterULTs;
	@FindBy(xpath = "//span[@title='NPR-Credit']")
	WebElement CLickOnNPR;

	@FindBy(xpath = "//span[@title='Quality']")
	WebElement SelectQuality;
	@FindBy(xpath = "//span[@title='Exception']")
	WebElement SelectException;

	public void SelectException() {
		commonclick.scrollAndClick(SelectException);
	}

	public void SelectQuality() {
		commonclick.scrollAndClick(SelectQuality);
	}

	public void CLickOnNPR() {
		commonclick.scrollAndClick(CLickOnNPR);
	}

	public void EnterULTs() throws InterruptedException {
		// Retrieve the Excel file path from the config file
		String excelFilePath = ConfigReader.getProperty("excelFilePath");
		// Retrieve data from the desired cell
		String MMColumnData = ExcelUtils.getCellData(excelFilePath, 0, 1, 3); // 0 = sheetIndex, 1 = rowIndex, 9 =
		System.out.println("Third column data: " + MMColumnData);
		// Enter the data into the text field if it's not empty
		if (!MMColumnData.isEmpty()) {
			// EnterMRB.clear();
			commonclick.scrollAndClick(EnterULTs);
			Thread.sleep(4000);
			EnterULTs.sendKeys(MMColumnData); // Enter the data
		}

	}

	public void ClickPUIbutton() {
		commonclick.scrollAndClick(ClickPUIbutton);
	}

	public void ClickUploaddropbutton() {
		ClickUploaddropbutton.click();
		//commonclick.scrollAndClick(ClickUploaddropbutton);
	}

	public void SelectFCF() {
		commonclick.scrollAndClick(SelectFCF);
	}

	public void ClickOnreason() {
		commonclick.scrollAndClick(ClickOnreason);
	}

	public void ClickOnRemedyCredit() {
		commonclick.scrollAndClick(ClickOnRemedyCredit);
	}

	public void ClickOnRemedy() {
		commonclick.scrollAndClick(ClickOnRemedy);
	}

	public void ClickServiceTypeTech() {
		commonclick.scrollAndClick(ClickServiceTypeTech);

	}

	public void ClickServiceType() {
		commonclick.scrollAndClick(ClickServiceType);

	}

	public void ClickOnULTRadiobutton() {
		commonclick.scrollAndClick(ClickOnULTRadiobutton);
	}

	public void ClickOnProductCodeBtn() {
		commonclick.scrollAndClick(ClickOnProductCodeBtn);
	}

	public void ClickOnOPNRadioBtn() {
		commonclick.scrollAndClick(ClickOnOPNRadioBtn);
	}

	public void ClickOnCPNRadioBtn() {
		commonclick.scrollAndClick(ClickOnCPNRadioBtn);
	}

	public void CheckText() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait until SSRText element is visible
		WebElement MMIDsElement = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/th[2]")));
		String MMIDS = MMIDsElement.getText();
		System.out.println(MMIDS);

	}

	public void ClickProductWarrenty() {
		commonclick.scrollAndClick(ClickProductWarrenty);

	}

	public void EnterMMIds() throws InterruptedException {
		// Retrieve the Excel file path from the config file
		String excelFilePath = ConfigReader.getProperty("excelFilePath");
		// Retrieve data from the desired cell
		String MMColumnData = ExcelUtils.getCellData(excelFilePath, 0, 1, 2); // 0 = sheetIndex, 1 = rowIndex, 9 =
		System.out.println("Third column data: " + MMColumnData);
		// Enter the data into the text field if it's not empty
		if (!MMColumnData.isEmpty()) {
			// EnterMRB.clear();
			commonclick.scrollAndClick(EnterMMIds);
			Thread.sleep(4000);
			EnterMMIds.sendKeys(MMColumnData); // Enter the data
		}

	}

	public void EnterCPN() throws InterruptedException {
		// Retrieve the Excel file path from the config file
		String excelFilePath = ConfigReader.getProperty("excelFilePath");
		// Retrieve data from the desired cell
		String MMColumnData = ExcelUtils.getCellData(excelFilePath, 0, 1, 7); // 0 = sheetIndex, 1 = rowIndex, 9 =
		System.out.println("Third column data: " + MMColumnData);
		// Enter the data into the text field if it's not empty
		if (!MMColumnData.isEmpty()) {
			// EnterMRB.clear();
			commonclick.scrollAndClick(EnterMMIds);
			Thread.sleep(4000);
			EnterMMIds.sendKeys(MMColumnData); // Enter the data
		}

	}

	public void EnterProductcode() throws InterruptedException {
		// Retrieve the Excel file path from the config file
		String excelFilePath = ConfigReader.getProperty("excelFilePath");
		// Retrieve data from the desired cell
		String MMColumnData = ExcelUtils.getCellData(excelFilePath, 0, 1, 14); // 0 = sheetIndex, 1 = rowIndex, 9 =
		System.out.println("Third column data: " + MMColumnData);
		// Enter the data into the text field if it's not empty
		if (!MMColumnData.isEmpty()) {
			// EnterMRB.clear();
			commonclick.scrollAndClick(EnterMMIds);
			Thread.sleep(4000);
			EnterMMIds.sendKeys(MMColumnData); // Enter the data
		}

	}

	public void EnterOPN() throws InterruptedException {
		// Retrieve the Excel file path from the config file
		String excelFilePath = ConfigReader.getProperty("excelFilePath");
		// Retrieve data from the desired cell
		String MMColumnData = ExcelUtils.getCellData(excelFilePath, 0, 1, 6); // 0 = sheetIndex, 1 = rowIndex, 9 =
		System.out.println("Third column data: " + MMColumnData);
		// Enter the data into the text field if it's not empty
		if (!MMColumnData.isEmpty()) {
			// EnterMRB.clear();
			commonclick.scrollAndClick(EnterMMIds);
			Thread.sleep(4000);
			EnterMMIds.sendKeys(MMColumnData); // Enter the data
		}

	}

}
