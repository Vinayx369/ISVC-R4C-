package PageObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;
import utils.CommonUtils;
import utils.WaitUtils;
import utils.waitUtilsZ;

public class Admin {
	public WebDriver ldriver;
	public WebDriver driver;
	public WaitHelper waitHelper;
	public WaitUtils waitUtils;
	public waitUtilsZ waitUtilsZ;
	public CommonUtils commonclick;

	// private WebDriver rdriver;
	public Admin(WebDriver rdriver) {

		// Assign the passed WebDriver instance to the class variable
		ldriver = rdriver;
		// Initialize all PageFactory elements on this page using the WebDriver instance
		PageFactory.initElements(rdriver, this);
		waitUtils = new WaitUtils(ldriver); // Initialize wait utility
		waitHelper = new WaitHelper(ldriver); // Initialize WaitHelper
		waitUtilsZ = new waitUtilsZ(ldriver);
		commonclick = new CommonUtils(ldriver);

	}

	@FindBy(xpath = "//span[@part='label'][normalize-space()='Admin']/..//span[@part='indicator']")
	WebElement SelectServiceTypeAdmin;

	public void SelectServiceTypeAdmin() {
		try {
			Thread.sleep(2000);
			commonclick.scrollAndClick(SelectServiceTypeAdmin);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FindBy(xpath = "//span[@title='Duplicate order']")
	WebElement SelectReasonDuplicateOrder;

	public void SelectReasonDuplicateOrder() {
		commonclick.scrollAndClick(SelectReasonDuplicateOrder);
	}

	@FindBy(xpath = "//span[@title='Incorrect Labeling']")
	WebElement SelectReasonIncorrectLabeling;

	public void SelectReasonIncorrectLabeling() {
		commonclick.scrollAndClick(SelectReasonIncorrectLabeling);
	}

	@FindBy(xpath = "//span[@title='Mixed Product']")
	WebElement SelectMixedProduct;

	public void SelectMixedProduct() {
		commonclick.scrollAndClick(SelectMixedProduct);
	}

	@FindBy(xpath = "//span[@title='Overship']")
	WebElement SelectOvership;

	public void SelectOvership() {
		commonclick.scrollAndClick(SelectOvership);
	}

	@FindBy(xpath = "//span[@title='Sample']")
	WebElement Sample;

	public void Sample() {
		commonclick.scrollAndClick(Sample);
	}

	@FindBy(xpath = "//span[@title='Shortship']")
	WebElement SelectShortship;

	public void SelectShortship() {
		commonclick.scrollAndClick(SelectShortship);
	}

	@FindBy(xpath = "//span[@title='Wrong Destination']")
	WebElement SelectWrongDestination;

	public void SelectWrongDestination() {
		commonclick.scrollAndClick(SelectWrongDestination);
	}

	@FindBy(xpath = "//span[@title='Wrong Product']")
	WebElement SelectWrongProduct;

	public void SelectWrongProduct() {
		commonclick.scrollAndClick(SelectWrongProduct);
	}

	@FindBy(xpath = "//span[@title='Wrong Ship date']")
	WebElement SelectWrongShipdate;

	public void SelectWrongShipdate() {
		commonclick.scrollAndClick(SelectWrongShipdate);
	}

	@FindBy(xpath = "//span[@title='Lost Shipment']")
	WebElement SelectLostShipment;

	public void SelectLostShipment() {
		commonclick.scrollAndClick(SelectLostShipment);
	}

	@FindBy(xpath = "//input[@placeholder='Enter CIRS Number']")
	WebElement EnterCIRS;

	public void EnterCIRS(String sting) {
		commonclick.scrollAndClick(EnterCIRS);
		EnterCIRS.sendKeys(sting);
	}

	public void EnterCIRS() {

		// Path to the Excel file
		String excelFilePath = "C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate (1) - Copy - Copy.xlsx";

		try {
			FileInputStream excelFile = new FileInputStream(new File(excelFilePath));
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheetAt(0); // Assuming values are in the first sheet

			// Skip the header row
			Iterator<Row> iterator = sheet.iterator();
			if (iterator.hasNext()) {
				iterator.next(); // Skip the header row
			}

			// Variable to store the third column data
			String thirdColumnData = "";

			if (iterator.hasNext()) {
				Row currentRow = iterator.next(); // Get the next row (first data row)

				// Get value from the third column (index 2)
				Cell thirdColumnCell = currentRow.getCell(8); // Third column (index starts from 0)

				if (thirdColumnCell != null) {
					switch (thirdColumnCell.getCellType()) {
					case STRING:
						thirdColumnData = thirdColumnCell.getStringCellValue().trim();
						break;
					case NUMERIC:
						thirdColumnData = String.valueOf((int) thirdColumnCell.getNumericCellValue());
						break;
					case BOOLEAN:
						thirdColumnData = String.valueOf(thirdColumnCell.getBooleanCellValue());
						break;
					case FORMULA:
						thirdColumnData = thirdColumnCell.getCellFormula();
						break;
					case BLANK:
						thirdColumnData = "";
						break;
					default:
						thirdColumnData = thirdColumnCell.toString().trim();
					}

					System.out.println("Third column data: " + thirdColumnData);

					// Enter the third column data into the global text field
					if (!thirdColumnData.isEmpty()) {
						// clickGlobal.click();
						EnterCIRS.clear(); // Clear any existing value
						EnterCIRS.sendKeys(thirdColumnData); // Enter the third column data
					}
				}
			}

			workbook.close();
			excelFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@FindBy(xpath = "//span[normalize-space()='SO Number']//following::input[@placeholder='Enter SO Number (use commas between multiple values)']") // Enter
	WebElement EnterSONumber;

	public void EnterSO() {

		// Path to the Excel file
		String excelFilePath = "C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate (1) - Copy - Copy.xlsx";

		try {
			FileInputStream excelFile = new FileInputStream(new File(excelFilePath));
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheetAt(0); // Assuming values are in the first sheet

			// Skip the header row
			Iterator<Row> iterator = sheet.iterator();
			if (iterator.hasNext()) {
				iterator.next(); // Skip the header row
			}

			// Variable to store the third column data
			String thirdColumnData = "";

			if (iterator.hasNext()) {
				Row currentRow = iterator.next(); // Get the next row (first data row)

				// Get value from the third column (index 2)
				Cell thirdColumnCell = currentRow.getCell(4); // Third column (index starts from 0)

				if (thirdColumnCell != null) {
					switch (thirdColumnCell.getCellType()) {
					case STRING:
						thirdColumnData = thirdColumnCell.getStringCellValue().trim();
						break;
					case NUMERIC:
						thirdColumnData = String.valueOf((int) thirdColumnCell.getNumericCellValue());
						break;
					case BOOLEAN:
						thirdColumnData = String.valueOf(thirdColumnCell.getBooleanCellValue());
						break;
					case FORMULA:
						thirdColumnData = thirdColumnCell.getCellFormula();
						break;
					case BLANK:
						thirdColumnData = "";
						break;
					default:
						thirdColumnData = thirdColumnCell.toString().trim();
					}

					System.out.println("Third column data: " + thirdColumnData);

					// Enter the third column data into the global text field
					if (!thirdColumnData.isEmpty()) {
						// clickGlobal.click();
						EnterSONumber.clear(); // Clear any existing value
						EnterSONumber.sendKeys(thirdColumnData); // Enter the third column data
					}
				}
			}

			workbook.close();
			excelFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@FindBy(xpath = "//input[@placeholder='Enter PO Number (use commas between multiple values)']")
	WebElement enterPOnumber;

	public void enterPOnumber() {

		// Path to the Excel file
		String excelFilePath = "C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate (1) - Copy - Copy.xlsx";

		try {
			FileInputStream excelFile = new FileInputStream(new File(excelFilePath));
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheetAt(0); // Assuming values are in the first sheet

			// Skip the header row
			Iterator<Row> iterator = sheet.iterator();
			if (iterator.hasNext()) {
				iterator.next(); // Skip the header row
			}

			// Variable to store the third column data
			String thirdColumnData = "";

			if (iterator.hasNext()) {
				Row currentRow = iterator.next(); // Get the next row (first data row)

				// Get value from the third column (index 2)
				Cell thirdColumnCell = currentRow.getCell(5); // Third column (index starts from 0)

				if (thirdColumnCell != null) {
					switch (thirdColumnCell.getCellType()) {
					case STRING:
						thirdColumnData = thirdColumnCell.getStringCellValue().trim();
						break;
					case NUMERIC:
						thirdColumnData = String.valueOf((int) thirdColumnCell.getNumericCellValue());
						break;
					case BOOLEAN:
						thirdColumnData = String.valueOf(thirdColumnCell.getBooleanCellValue());
						break;
					case FORMULA:
						thirdColumnData = thirdColumnCell.getCellFormula();
						break;
					case BLANK:
						thirdColumnData = "";
						break;
					default:
						thirdColumnData = thirdColumnCell.toString().trim();
					}

					System.out.println("Third column data: " + thirdColumnData);

					// Enter the third column data into the global text field
					if (!thirdColumnData.isEmpty()) {
						// clickGlobal.click();
						enterPOnumber.clear(); // Clear any existing value
						enterPOnumber.sendKeys(thirdColumnData); // Enter the third column data
					}
				}
			}

			workbook.close();
			excelFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@FindBy(xpath = "//button[normalize-space()='Reset']//preceding::input[@placeholder='Enter the CPN']") // To Enter
	WebElement EnterCPN;

	public void EnterCPNyhroughExcel() {
		// Path to the Excel file
		String excelFilePath = "C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate (1) - Copy - Copy.xlsx";

		try {
			FileInputStream excelFile = new FileInputStream(new File(excelFilePath));
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheetAt(0); // Assuming values are in the first sheet

			// Skip the header row
			Iterator<Row> iterator = sheet.iterator();
			if (iterator.hasNext()) {
				iterator.next(); // Skip the header row
			}

			// Variable to store the third column data
			String thirdColumnData = "";

			if (iterator.hasNext()) {
				Row currentRow = iterator.next(); // Get the next row (first data row)

				// Get value from the third column (index 2)
				Cell thirdColumnCell = currentRow.getCell(7); // Third column (index starts from 0)

				if (thirdColumnCell != null) {
					switch (thirdColumnCell.getCellType()) {
					case STRING:
						thirdColumnData = thirdColumnCell.getStringCellValue().trim();
						break;
					case NUMERIC:
						thirdColumnData = String.valueOf((int) thirdColumnCell.getNumericCellValue());
						break;
					case BOOLEAN:
						thirdColumnData = String.valueOf(thirdColumnCell.getBooleanCellValue());
						break;
					case FORMULA:
						thirdColumnData = thirdColumnCell.getCellFormula();
						break;
					case BLANK:
						thirdColumnData = "";
						break;
					default:
						thirdColumnData = thirdColumnCell.toString().trim();
					}

					System.out.println("Third column data: " + thirdColumnData);

					// Enter the third column data into the global text field
					if (!thirdColumnData.isEmpty()) {
						// clickGlobal.click();
						EnterCPN.clear(); // Clear any existing value
						EnterCPN.sendKeys(thirdColumnData); // Enter the third column data
					}
				}
			}

			workbook.close();
			excelFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@FindBy(xpath = "//span[text()=\"Damage in transit\"]")
	WebElement Damangeintransit;

	public void Damangeintransit() {

		commonclick.scrollAndClick(Damangeintransit);
	}

}
