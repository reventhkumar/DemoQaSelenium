package pageObjects.elementsDemoQa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageObjects.BasePage;

public class ButtonPage extends BasePage{

	public ButtonPage(WebDriver driver) {
		super(driver);
	}

	private By buttonsMenu = By.xpath("//span[text()='Buttons']/..");
	private By doubleClickMeButton = By.id("doubleClickBtn");
	private By righClickMeButton = By.id("rightClickBtn");
	private By clickMeButton = By.xpath("//button[text()='Click Me']");
	
	private By doubleClickMessage = By.id("doubleClickMessage");
	private By rightClickMessage = By.id("rightClickMessage");
	private By ClickMessage = By.id("dynamicClickMessage");
	
	 public void navigateToButtonsMenu() {
		 clickElement(buttonsMenu);
	 }
	 
	 public void doubleClickButton() {
		 doubleClickElement(doubleClickMeButton);
	 }
	 
	 public void rightClickButton() {
		 rightClickElement(righClickMeButton);
	 }
	 
	 public void clickButton() {
		 clickElement(clickMeButton);
	 }
	 
	 public String getDoubleClickMessage() {
		 return getElement(doubleClickMessage).getText();
	 }
	 
	 public String getrightClickMessage() {
		 return getElement(rightClickMessage).getText();
	 }
	 
	 public String getClickMessage() {
		 return getElement(ClickMessage).getText();
	 }
	 
	
}
