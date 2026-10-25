package Com.DemoWebshop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public Login_Page(WebDriver Driver) {
		PageFactory.initElements(Driver, this);
	}
	
	@FindBy(id="Email")
	private WebElement emailTextFiled;
	

	
	@FindBy(id = "Password")
	private WebElement PasswordtextField;
	
	@FindBy(xpath = "//input[@value='Log in']")
    private WebElement LoginButton;

	public WebElement getEmailTextFiled() {
		return emailTextFiled;
	}

	public WebElement getPasswordtextField() {
		return PasswordtextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	

}
