package Com.webshop_TestCripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Com.DemoWebshop_POM.AddNewAddress_Page;
import Com.DemoWebshop_POM.Addresses_Page;
import Com.Webshop_GenericUtility.BaseTest;

public class TC_001_verify_user_is_able_to_add_address_or_not_Test extends BaseTest {


	@Test

	public void addAddress() throws EncryptedDocumentException, IOException, InterruptedException {
		System.out.println("Add Address Test Script");

		webDriverUtility.JavaScriptScrollTillEelement(driver, homePage.getAddressBtn());
		homePage.getAddressBtn().click();

		Addresses_Page addressPage = new Addresses_Page(driver);
		addressPage.getAddNewAddressBtn().click();

		AddNewAddress_Page newAddressPage = new AddNewAddress_Page(driver);
		newAddressPage.getFirstNameTextField().sendKeys(fileUtility.readDatafromExcelFile("Sheet1", 1, 0));
		newAddressPage.getLastNameTextField().sendKeys(fileUtility.readDatafromExcelFile("Sheet1", 1, 1));
		newAddressPage.getEmailTextField().sendKeys(fileUtility.readDatafromExcelFile("Sheet1", 1, 2));

		webDriverUtility.selectByvisibleText(newAddressPage.getCountryDropdown(),
				fileUtility.readDatafromExcelFile("sheet1", 1, 3));

		newAddressPage.getCityTextField().sendKeys(fileUtility.readDatafromExcelFile("Sheet1", 1, 4));
		newAddressPage.getAddress1textField().sendKeys(fileUtility.readDatafromExcelFile("Sheet1", 1, 5));
		newAddressPage.getZipcodeTextField().sendKeys(fileUtility.readDatafromExcelFile("Sheet1", 1, 6));
		newAddressPage.getPhoneNumberTextField().sendKeys(fileUtility.readDatafromExcelFile("Sheet1", 1, 7));
		newAddressPage.getSaveButton().click();

		Thread.sleep(3000);
		webDriverUtility.webPageScreenshot(driver);

	}
}