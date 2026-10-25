package Com.DemoWebshop_POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addresses_Page {

	public Addresses_Page(WebDriver Driver) {
		PageFactory.initElements(Driver, this);
	}

	@FindBy(xpath = "//input[@value='Add new']")
	private WebElement addNewAddressBtn;

	@FindBy(xpath = "//input[@value='Delete']")
	private List<WebElement> DeleteAdressBtn;

	public WebElement getAddNewAddressBtn() {
		return addNewAddressBtn;
	}

	public List<WebElement> getDeleteAdressBtn() {
		return DeleteAdressBtn;
	}

}
