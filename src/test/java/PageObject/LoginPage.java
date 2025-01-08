package PageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Baseclass1;
import Utilities.WaitHelper;
import utils.CommonUtils;
import utils.WaitUtils;

public class LoginPage extends Baseclass1 {
	public WebDriver ldriver;
	public WebDriver driver;
	public WaitHelper waitHelper;
	public WaitUtils waitUtils;
	public CommonUtils commonclick;


	    //private WebDriver rdriver;
	public LoginPage(WebDriver rdriver) {
		// Assign the passed WebDriver instance to the class variable
		ldriver = rdriver;
		// Initialize all PageFactory elements on this page using the WebDriver instance
		PageFactory.initElements(rdriver, this);
		waitUtils = new WaitUtils(ldriver);
		waitHelper = new WaitHelper(driver); // Initialize WaitHelper
        commonclick = new CommonUtils(ldriver);

	}
	/*
	 *  Authur: Omkar Yadav
	 *  Change:LogInpage Case Creation
	 *  Description:
	 */
	
	@FindBy(xpath = "//input[@id=\"username\"]")
	WebElement textEmail;    // TO Enter Email id into text field
	@FindBy(xpath = "//input[@id=\"password\"]")
	WebElement textPassword; // To Enter Password into Text field
	@FindBy(xpath = "//input[@id=\"Login\"]")
	WebElement Clickonlogin; // To click on Login button
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/section[1]/header[1]/div[2]/span[1]/div[2]/ul[1]/li[7]/span[1]/div[1]/button[1]/div[1]/span[1]/div[1]/span[1]")
	WebElement ClickonIcon; // To click on Menu icon
	@FindBy(xpath = "//a[normalize-space()='Log Out']")
	WebElement Clickonlogout; // To click on Log out option
	@FindBy(xpath = "//input[@id=\"username\"]")
	WebElement emailField;
	@FindBy(xpath = "//input[@id=\"password\"]")
	WebElement passwordField;
	@FindBy(xpath = "//input[@id=\"Login\"]")
	WebElement loginButton;

	public void SetUserName(String uname) {
		commonclick.scrollAndClick(textEmail);
		textEmail.sendKeys(uname);
	}

	public void SetPassword(String Password) {
		commonclick.scrollAndClick(textPassword);
		textPassword.sendKeys(Password);
	}

	public void Clickonlogin() {
		//commonclick.scrollAndClick(Clickonlogin);
		commonclick.ClickByView(Clickonlogin);

	}

	public void clickonmenuicon() {
		ClickonIcon.click();
	}

	public void clickonlogout() {
		Clickonlogout.click();
	}

	public void enterEmail(String email) {
		commonclick.scrollAndClick(emailField);
		emailField.sendKeys(email);
	}

	public void enterPassword(String password) {
		commonclick.scrollAndClick(passwordField);
		passwordField.sendKeys(password);
	}

	public void clickLogin() {
		commonclick.scrollAndClick(loginButton);

	}
public void enterCredentialsAndLogin() throws Exception {
        String decryptedUsername = getDecryptedUsername();
        String decryptedPassword = getDecryptedPassword();
        emailField.sendKeys(decryptedUsername);
        passwordField.sendKeys(decryptedPassword); // Use masked password for display
 
    }
	
	
	
	
	
	

}
