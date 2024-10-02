package utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class CommonUtils {
	 WebDriver driver;
	    WebDriverWait wait;

	    // Constructor
	    public CommonUtils(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Set timeout for waits
	    }

	    // Method to scroll to an element and click using JavaScriptExecutor with robustness
	    public void scrollAndClick(WebElement element) {
	        try {
	            // Wait for the element to be visible and clickable
	            wait.until(ExpectedConditions.visibilityOf(element));
	            wait.until(ExpectedConditions.elementToBeClickable(element));

	            // Scroll the element into view
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	            
	            // Wait a little after scrolling (in case rendering takes time)
	            Thread.sleep(1000);

	            // Click the element using JavaScriptExecutor
	            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	            
	            System.out.println("Clicked on the element successfully.");

	        } catch (StaleElementReferenceException e) {
	            // Handle stale element case, retrying the click if necessary
	            System.out.println("StaleElementReferenceException occurred. Retrying the click...");
	            retryClick(element);

	        } catch (Exception e) {
	            // Log any other exceptions
	            System.out.println("Exception occurred while scrolling and clicking: " + e.getMessage());
	        }
	    }

	    // Retry clicking the element in case of a StaleElementReferenceException
	    private void retryClick(WebElement element) {
	        try {
	            // Wait for the element to be visible and clickable again
	            wait.until(ExpectedConditions.visibilityOf(element));
	            wait.until(ExpectedConditions.elementToBeClickable(element));

	            // Scroll and click again
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

	            System.out.println("Retried and clicked the element successfully.");
	        } catch (Exception e) {
	            // Log if retry fails as well
	            System.out.println("Retrying failed. Exception: " + e.getMessage());
	        }
	    }
}
