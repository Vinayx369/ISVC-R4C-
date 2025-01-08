package PageObject_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;
import utils.CommonUtils;
import utils.WaitUtils;
import utils.waitUtilsZ;

public class Web_Query_SR_Product_Status_Check {


	public WebDriver ldriver;
	public WaitHelper waitHelper;
	public WebDriver driver;
	public WaitUtils waitUtils;
	public waitUtilsZ waitUtilsZ;
	public CommonUtils commonclick;

	public Web_Query_SR_Product_Status_Check(WebDriver rdriver) {
		// Assign the passed WebDriver instance to the class variable
		ldriver = rdriver;
		// Initialize all PageFactory elements on this page using the WebDriver instance
		PageFactory.initElements(rdriver, this);
		waitHelper = new WaitHelper(ldriver);
		waitUtils = new WaitUtils(ldriver); // Initialize wait utility
		waitUtilsZ = new waitUtilsZ(ldriver);
		commonclick = new CommonUtils(ldriver);

	}
	
	/*Date: 23-12-2024
	 * Author: Vinay Kumar Ganji 
	 */
	
	@FindBy(xpath = "//span[normalize-space()='Stock Rotation Product Status Check']")
	WebElement ClickSRProductStatusCheck ;
	@FindBy(xpath = "//input[@placeholder='Please enter MM']")
	WebElement MMID ;
	@FindBy(xpath = "(//input[@placeholder='Select one'])[1]")
	WebElement SalesOrganization ;
	@FindBy(xpath = "//lightning-primitive-icon[@size='small']//*[name()='svg']")
	WebElement SelectSalesOrganization ;
	@FindBy(xpath = "//input[@placeholder='Select one']")
	WebElement DistributionChannel ;
	@FindBy(xpath = "//lightning-primitive-icon[@size='small']//*[name()='svg']")
	WebElement SelectDistributionChannel ;
	@FindBy(xpath = "//span[text()=\"Bulk Upload\"]")
	WebElement BulkUpload ;
	@FindBy(xpath = "//span[normalize-space()=\"Or drop files\"]")    //span[@part=\"button\"]
	WebElement UploadFiles ;
	@FindBy(xpath = "//button[@title='Export to Excel']")
	WebElement ExportToExcelButton ;
	@FindBy(xpath = "//button[text()=\"Search\"]")
	WebElement Searchbtn;
	
	
	
	public void ClickSRProductStatusCheck() {
		commonclick.scrollAndClick(ClickSRProductStatusCheck);

	}
	
	public void EnterMMID(String string) {
		commonclick.scrollAndClick(MMID);
		MMID.sendKeys(string);
	}
	
	public void SelectSalesOrganization(String string) throws InterruptedException {
		commonclick.scrollAndClick(SalesOrganization);
		SalesOrganization.click();
		SalesOrganization.sendKeys(string);
		Thread.sleep(2000);
		SelectSalesOrganization.click();
		commonclick.scrollAndClick(SelectSalesOrganization);
		//driver.findElement(By.xpath("//li[@title='AM03 - Intel Americas,Inc']")).click();
	}
	
	public void SelectDistributionChannel(String string) throws InterruptedException {
		commonclick.scrollAndClick(DistributionChannel);
		DistributionChannel.click();
		DistributionChannel.sendKeys(string);
		Thread.sleep(2000);
		SelectDistributionChannel.click();
		//commonclick.scrollAndClick(SelectDistributionChannel);
		//driver.findElement(By.xpath("//div//ul//li[@title='02 - Industrial Disti']")).click();
	}
	
	public void ClickonBulkUpload() {
		commonclick.scrollAndClick(BulkUpload);

	}
	
	public void ClickonUploadFile() {
		commonclick.scrollAndClick(UploadFiles);

	}
	
	public void ClickExportToExcelButton() {
		commonclick.scrollAndClick(ExportToExcelButton);

	}
	
	public void ClickSearchbtn() {
		commonclick.scrollAndClick(Searchbtn);
	}
	
	
}