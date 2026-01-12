package pageObjects.elementsDemoQa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageObjects.BasePage;
import utilities.JSUtils;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	private By elementsMenu = By.xpath("//h5[text()='Elements']");
	private By formsMenu = By.xpath("//h5[text()='Forms']");
	private By alertsFrameWindowsMenu = By.xpath("//h5[text()='Alerts, Frame & Windows']");
	private By widgetsMenu = By.xpath("//h5[text()='Widgets']");
	private By interactionsMenu = By.xpath("//h5[text()='Interactions']");
	private By bookStoreApplicationMenu = By.xpath("//h5[text()='Book Store Application']");
	
	
	public void navigateToElementsMenu() {
		JSUtils.scrollToElementJS(elementsMenu);
		clickElement(elementsMenu);
	}
	public void navigateToFormsMenu() {
		JSUtils.scrollToElementJS(formsMenu);
		clickElement(formsMenu);
	}
	public void navigateToalertsFrameWindowsMenu() {
		JSUtils.scrollToElementJS(alertsFrameWindowsMenu);
		clickElement(alertsFrameWindowsMenu);
	}
	public void navigateToWidgetMenu() {
		JSUtils.scrollToElementJS(widgetsMenu);
		clickElement(widgetsMenu);
	}
	public void navigateToInteractionsMenu() {
		JSUtils.scrollToElementJS(interactionsMenu);
		clickElement(interactionsMenu);
	}
	public void navigateTBookStoreApplicationsMenu() {
		JSUtils.scrollToElementJS(bookStoreApplicationMenu);
		clickElement(bookStoreApplicationMenu);
	}

}
