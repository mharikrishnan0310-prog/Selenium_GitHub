package Com.DemoWebshop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	public Home_Page(WebDriver Driver) {
		PageFactory.initElements(Driver, this);
		
		
	}
	@FindBy(partialLinkText = "Log out")
	private WebElement LogoutBtn;
	
	@FindBy(id ="small-searchterms")
	private WebElement searchTextField;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchBtn;
	
	@FindBy(partialLinkText = "Addresses")
	private WebElement AddressBtn;
	
	@FindBy (xpath = "//span[text()='Shopping cart']")
	private WebElement ShppingCartBtn;
	

	public WebElement getShppingCartBtn() {
		return ShppingCartBtn;
	}

	public void setShppingCartBtn(WebElement shppingCartBtn) {
		ShppingCartBtn = shppingCartBtn;
	}

	public WebElement getLogoutBtn() {
		return LogoutBtn;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getAddressBtn() {
		return AddressBtn;
	}

	
	
	
	
}
