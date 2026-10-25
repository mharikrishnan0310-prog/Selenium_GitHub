package Com.DemoWebshop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewAddress_Page {

	
	public AddNewAddress_Page(WebDriver Driver) {
		PageFactory.initElements(Driver, this);
		
	}
	
	@FindBy(id = "Address_FirstName")
	private WebElement FirstNameTextField;
	
	@FindBy(id = "Address_LastName")
	private WebElement LastNameTextField;
	
	@FindBy(id = "Address_Email")
	private WebElement EmailTextField;
	
	@FindBy(id = "Address_CountryId")
	private WebElement countryDropdown;
	
	@FindBy(id = "Address_City")
	private WebElement cityTextField;
	
	@FindBy( id = "Address_Address1")
	private WebElement Address1textField;
	
	@FindBy( id = "Address_ZipPostalCode")
	private WebElement zipcodeTextField;
	
	@FindBy( id = "Address_PhoneNumber")
	private WebElement PhoneNumberTextField;
	
	@FindBy (xpath  = "//input[@value = 'Save']")
	private WebElement saveButton;
	
	
	

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public void setCountryDropdown(WebElement countryDropdown) {
		this.countryDropdown = countryDropdown;
	}

	public WebElement getCityTextField() {
		return cityTextField;
	}

	public void setCityTextField(WebElement cityTextField) {
		this.cityTextField = cityTextField;
	}

	public WebElement getAddress1textField() {
		return Address1textField;
	}

	public void setAddress1textField(WebElement address1textField) {
		Address1textField = address1textField;
	}

	public WebElement getZipcodeTextField() {
		return zipcodeTextField;
	}

	public void setZipcodeTextField(WebElement zipcodeTextField) {
		this.zipcodeTextField = zipcodeTextField;
	}

	public WebElement getPhoneNumberTextField() {
		return PhoneNumberTextField;
	}

	public void setPhoneNumberTextField(WebElement phoneNumberTextField) {
		PhoneNumberTextField = phoneNumberTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public void setSaveButton(WebElement saveButton) {
		this.saveButton = saveButton;
	}

	public void setFirstNameTextField(WebElement firstNameTextField) {
		FirstNameTextField = firstNameTextField;
	}

	public void setLastNameTextField(WebElement lastNameTextField) {
		LastNameTextField = lastNameTextField;
	}

	public void setEmailTextField(WebElement emailTextField) {
		EmailTextField = emailTextField;
	}

	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	
	}
	
	
	

