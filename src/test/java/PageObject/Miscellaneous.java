package PageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.WaitHelper;
import utils.CommonUtils;
import utils.WaitUtils;
import utils.waitUtilsZ;

public class Miscellaneous {

	public WebDriver ldriver;
	public WebDriver driver;
	public WaitHelper waitHelper;
	public WaitUtils waitUtils;
	public waitUtilsZ waitUtilsZ;
	public CommonUtils commonclick;

	public Miscellaneous(WebDriver rdriver) {

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
	 * Author: Omkar Yadav Change:Miscellaneous Case Creation
	 */

	@FindBy(xpath = "//span[@part='label'][normalize-space()='Miscellaneous']/..//span[@part='indicator']")
	WebElement SelectServiceTypeMiscellaneous;
	@FindBy(xpath = "//b[normalize-space()='Miscellaneous Intake']")
	WebElement Selecttype;
	@FindBy(xpath = "//b[normalize-space()='Price & Profile Masking']")
	WebElement SelecttypePM;
	
	@FindBy(xpath = "//span[@title='Return Only']")
	WebElement ReasonReturn;
	@FindBy(xpath = "//span[@title='Free of Charge Sample']")
	WebElement ReasonFOCS;
	@FindBy(xpath = "//button[text()=\"Validate Product\"]")
	WebElement ClickValidateProduct;
	@FindBy(xpath = "//span[text()='select box condition']")
	List<WebElement> dropdownOpeners;
	@FindBy(xpath = "//button[text()=\"Next\"]")
	WebElement ClickNEXT;
	@FindBy(xpath = "//button[@title='App Launcher']")
	WebElement CLickAPP;
	@FindBy(xpath = "//span[@title='Box Closed - Factory Sealed']")
	WebElement optionToSelect;
	@FindBy(xpath = "//input[@placeholder='Search apps and items...']")
	WebElement Entertext;
	String optionXPath = "//span[@title='Box Closed - Factory Sealed']";
	@FindBy(xpath="//button[text()=\"Cancel\"]")
	WebElement ClickCancel;
	@FindBy(xpath="//span[text()=\"Internal Company Return\"]")
	WebElement SelectInternalreturn;
	public void SelectServiceTypeMiscellaneous() {
		commonclick.scrollAndClick(SelectServiceTypeMiscellaneous);

	}

	public void ReasonReturn() {

		commonclick.scrollAndClick(ReasonReturn);
	}

	public void ReasonFOCS() {
		commonclick.scrollAndClick(ReasonFOCS);

	}

	public void selectBoxConditionForAll() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		for (WebElement dropdown : dropdownOpeners) {
			dropdown.click(); // Open each dropdown
			Thread.sleep(1000);
			WebElement optionToSelect1 = wait.until(ExpectedConditions.elementToBeClickable(
					// driver.findElement(By.xpath(optionXPath))
					optionToSelect

			)); // Wait for option to be clickable
			Thread.sleep(2000);
			optionToSelect1.click(); // Select the option
		}

	}

	public void ClickNEXT() {
		commonclick.scrollAndClick(ClickNEXT);
	}

	public void CLickAPP() {
		commonclick.scrollAndClick(CLickAPP);
	}

	public void EnterText() {
		commonclick.scrollAndClick(Entertext);
		Entertext.sendKeys("miscellaneous intake");

	}
	public void EnterTextPriceMasking() {
		commonclick.scrollAndClick(Entertext);
		Entertext.sendKeys("Price & Profile Masking");

	}

	public void SelectTypePM() {
		commonclick.scrollAndClick(SelecttypePM);
	}
	
	public void SelectType() {
		commonclick.scrollAndClick(Selecttype);
	}

	public void ClickValidateProduct() {
		commonclick.scrollAndClick(ClickValidateProduct);

	}
	
	public void ClickCancel() 
	{
		commonclick.scrollAndClick(ClickCancel);
	}
	
	public void SelectInternalreturn() 
	{
		commonclick.scrollAndClick(SelectInternalreturn);
	}
	
	
	
}
