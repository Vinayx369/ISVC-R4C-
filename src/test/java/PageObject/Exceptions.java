package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;
import utils.CommonUtils;
import utils.WaitUtils;
import utils.waitUtilsZ;

public class Exceptions {
	public WebDriver ldriver;
	public WebDriver driver;
	public WaitHelper waitHelper;
	public WaitUtils waitUtils;
	public waitUtilsZ waitUtilsZ;
	public CommonUtils commonclick;
	
	public Exceptions(WebDriver rdriver) {

		// Assign the passed WebDriver instance to the class variable
		ldriver = rdriver;
		// Initialize all PageFactory elements on this page using the WebDriver instance
		PageFactory.initElements(rdriver, this);
		waitUtils = new WaitUtils(ldriver); // Initialize wait utility
		waitHelper = new WaitHelper(ldriver); // Initialize WaitHelper
		waitUtilsZ = new waitUtilsZ(ldriver);
		commonclick = new CommonUtils(ldriver);

	}
	
	@FindBy(xpath ="//span[@class='slds-form-element__label'][normalize-space()='Exception']/..//span[@class='slds-radio_faux']")
	WebElement SelectServiceTypeException;
	public void SelectServiceTypeException() {
		
		commonclick.scrollAndClick(SelectServiceTypeException);
		
		}
	
	@FindBy(xpath="//div[@class='slds-listbox slds-listbox_vertical slds-dropdown slds-dropdown_fluid slds-dropdown_left slds-dropdown_length-with-icon-7']//span[@title='GRL Exception Return'][normalize-space()='GRL Exception Return']/../../..//span[@title='Exception Return'][normalize-space()='Exception Return']")
	WebElement ExceptionReturn;
	public void ExceptionReturn() 
	{
		commonclick.scrollAndClick(ExceptionReturn);
	}
	
	@FindBy(xpath="//section[@aria-expanded='true']//section[@role='tabpanel']//lightning-input[@data-name='Sales_Issue_Return_Reason_Justification__c']//input")
	WebElement Justification;
	public void Justification() 
	{
		commonclick.scrollAndClick(Justification);
		Justification.sendKeys("QA Validation R4C Test");
			
	}
	@FindBy(xpath="//span[text()=\"select box condition\"]")
	WebElement SelectBoxCondition;
	@FindBy(xpath="//span[text()=\"Outer Box Open - Product Sealed\"]")
	WebElement ProductSealed;
	
	public void SelectBoxCondition() 
	{
	
		commonclick.scrollAndClick(SelectBoxCondition);
		commonclick.scrollAndClick(ProductSealed);
	}
	
	@FindBy(xpath="//span[text()=\"GRL Exception Return\"]")
	WebElement SelectGRLException;

	@FindBy(xpath="//span[@title='Quarterly Exception']")
	WebElement QuaterlyException;
	
	
	public void SelectGRLException () 
	{commonclick.scrollAndClick(SelectGRLException);}
	public void QuaterlyException () 
	{commonclick.scrollAndClick(QuaterlyException);}
	
	
	
}
