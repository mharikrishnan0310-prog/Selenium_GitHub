package Com.webshop_TestCripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.DemoWebshop_POM.Books_Page;
import Com.DemoWebshop_POM.Checkout_Page;
import Com.DemoWebshop_POM.ShoppingCart_Page;
import Com.Webshop_GenericUtility.BaseTest;

public class TC_003_Verify_user_is_able_to_place_order_or_Not_Test extends BaseTest {

	@Test

	public void placeOrder() throws IOException, InterruptedException {
		System.out.println("place Order");

		homePage.getSearchTextField().sendKeys(fileUtility.readDatafromPropertyFile("productName"));
		homePage.getSearchBtn().click();

		Books_Page bookPage = new Books_Page(driver);
		webDriverUtility.JavaScriptClick(driver, bookPage.getAddtoCartBtn());

		Thread.sleep(3000);
		homePage.getShppingCartBtn().click();

		ShoppingCart_Page cartPage = new ShoppingCart_Page(driver);
		cartPage.getTermsofServiceBtn().click();
		cartPage.getCheckOutBtn().click();

		Checkout_Page checkOutPage = new Checkout_Page(driver);
		checkOutPage.getContinueBtn().get(0).click();
		checkOutPage.getContinueBtn().get(1).click();
		checkOutPage.getContinueBtn().get(2).click();
		checkOutPage.getContinueBtn().get(3).click();
		checkOutPage.getContinueBtn().get(4).click();

		checkOutPage.getConfirmBtn().click();
		Thread.sleep(2000);
		webDriverUtility.webPageScreenshot(driver);
	}

}
