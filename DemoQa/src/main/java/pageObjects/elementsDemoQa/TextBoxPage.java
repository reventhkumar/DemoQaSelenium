package pageObjects.elementsDemoQa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageObjects.BasePage;
import utilities.JSUtils;

public class TextBoxPage extends BasePage {
	public TextBoxPage(WebDriver driver) {
		super(driver);
	}
	private By textBoxMenu = By.xpath("//span[@class='text' and text()='Text Box']");

	private By fullNameInput = By.id("userName");
	private By emailInput = By.id("userEmail");
	private By currentAddressInput = By.id("currentAddress");
	private By permanentAddressInput = By.id("permanentAddress");
	private By submitButton = By.id("submit");
	
	private By ValidateNameText = By.id("name");
	private By ValidateEmailText = By.xpath("//p[@id ='email']");	
	private By ValidateCurrentAddress = By.xpath("//p[@id ='currentAddress']");
	private By ValidatePermanentAddress = By.xpath("//p[@id ='permanentAddress']");
	
	private By textBoxPageTitle = By.xpath("//h1[text()='Text Box']");
	
	public void navigateToTextBoxForm() {
		clickElement(textBoxMenu);
	}
	
	public void fillFullName(String fullName) {
		setElement(fullNameInput, fullName);
	}
	
	public void fillEmail(String email) {
		setElement(emailInput, email);
	}
	
	public void fillCurrentAddress(String currentAddress) {
		setElement(currentAddressInput, currentAddress);
	}
	
	public void fillPermanentAddress(String permanentAddress) {
		setElement(permanentAddressInput, permanentAddress);
	}
	
	public void clickSubmitButton() {
		JSUtils.scrollToElementJS(submitButton);
		JSUtils.clickElementJS(submitButton);
	}

	//Assert Methods
	public String actualName() {return getElement(ValidateNameText).getText();}
	public String actualEmail() {return getElement(ValidateEmailText).getText();}
	public String actualCurrentAddress() {return getElement(ValidateCurrentAddress).getText();}
	public String actualPermanentAddress() {return getElement(ValidatePermanentAddress).getText();}
	public String getPageTitle() {return getElement(textBoxPageTitle).getText();
	
	}
}
