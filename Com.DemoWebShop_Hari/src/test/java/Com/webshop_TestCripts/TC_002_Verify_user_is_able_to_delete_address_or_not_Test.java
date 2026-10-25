package Com.webshop_TestCripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.DemoWebshop_POM.Addresses_Page;
import Com.Webshop_GenericUtility.BaseTest;

public class TC_002_Verify_user_is_able_to_delete_address_or_not_Test extends BaseTest {

	@Test

	public void deleteAddress() throws IOException, InterruptedException {

		System.out.println("Delete Address Test Script");
		webDriverUtility.JavaScriptScrollTillEelement(driver, homePage.getAddressBtn());
		homePage.getAddressBtn().click();

		Addresses_Page addressPage = new Addresses_Page(driver);
		addressPage.getDeleteAdressBtn().get(0).click();

		webDriverUtility.javaScriptPopupaccept(driver);

		Thread.sleep(3000);
		driver.navigate().refresh();

		Thread.sleep(2000);
		webDriverUtility.webPageScreenshot(driver);

	}

}
