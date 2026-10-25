package Com.DemoWebshop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart_Page {

	public ShoppingCart_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "termsofservice")
	private WebElement termsofServiceBtn;

	@FindBy(id = "checkout")
	private WebElement checkOutBtn;

	public WebElement getTermsofServiceBtn() {
		return termsofServiceBtn;
	}

	public WebElement getCheckOutBtn() {
		return checkOutBtn;
	}

}
