package pageObjects.elementsDemoQa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageObjects.BasePage;
import utilities.JSUtils;

public class RadioButtonPage extends BasePage{
	
	public RadioButtonPage(WebDriver driver) {
		super(driver);
	}

	private By radioButtonMenu = By.xpath("//span[text()='Radio Button']/..");
	private By yesRadioButton = By.xpath("//label[@for='yesRadio']");
	private By impressiveRadioButton = By.xpath("//label[@for='impressiveRadio']");
	private By noRadioButton = By.xpath("//label[@for='noRadio']");
	private By selectedButton = By.xpath("//span[@class='text-success']");
	
	
	
	public void navigateToRadioButtonmenu() {
		clickElement(radioButtonMenu);
	}
	
	public void selectYesButton() {
		JSUtils.clickElementJS(yesRadioButton);
	}
	
	public void selectImpressiveButton() {
		clickElement(impressiveRadioButton);
	}
	
	public void selectNoRadioButton() {
		clickElement(noRadioButton);
	}
	
	public String getSelectedValue() {
		JSUtils.scrollToElementJS(selectedButton);
		return getElement(selectedButton).getText();
	}
	
	public boolean isNoRadioButtonEnabled() {
		JSUtils.scrollToElementJS(noRadioButton);
		return getElement(noRadioButton).isSelected();
	}

}
