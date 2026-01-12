package pageObjects.elementsDemoQa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageObjects.BasePage;

public class LinksPage extends BasePage {
	
	public LinksPage(WebDriver driver) {
		super(driver);
	}
	
	private By linksMenu = By.xpath("//span[text()='Links']");
	private By homeLink = By.id("simpleLink");
	private By DynamicHomeLink = By.id("dynamicLink");
	private By createdLink = By.id("created");
	private By noContentLink = By.id("no-content");
	private By movedLink = By.id("moved");
	private By badRequest = By.id("bad-request");
	private By unauthorized = By.id("unauthorized");
	
	private By forbiddenLink = By.id("forbidden");
	private By notFoundLink = By.id("invalid-url");
	
	private By linkResponse = By.id("linkResponse");
	
	
	public void navigateToLinksMenu() {
		clickElement(linksMenu);
	}
	
	public void clickHomeLink() {
		clickElement(homeLink);
	}
	
	public String getNewWindowURL() {
		String currentWindowHandle = getCurrentURL();
		switchWindow(currentWindowHandle);
		return getCurrentURL();
	}
	
	public void clickDynamicHomeLink() {
		clickElement(DynamicHomeLink);
	}
	
	public void clickcreatedLink() {
		clickElement(createdLink);
	}
	
	public void clicknoContentLink() {
		clickElement(noContentLink);
	}
	
	public void clickmovedLink() {
		clickElement(movedLink);
	}
	
	public void clickBadRequestLink() {
		clickElement(badRequest);
	}
	
	public void clickforbiddenLink() {
		clickElement(forbiddenLink);
	}
	
	public void clickunauthorizedLink() {
		clickElement(unauthorized);
	}
	
	public void clicknotFoundLink() {
		clickElement(notFoundLink);
	}
	
	public String statusMessage() {
		return getElement(linkResponse).getText();
	}
	

}
