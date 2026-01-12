package pageObjects.elementsDemoQa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageObjects.BasePage;
import utilities.JSUtils;

public class BrokenLinksImagePage extends BasePage{
	
	public BrokenLinksImagePage(WebDriver driver) {
		super(driver);
	}

	
	private By brokenLinksImageMenu = By.xpath("//span[text()='Broken Links - Images']");
	private By brokenImage = By.xpath("//p[text()='Broken image']/following-sibling::img");
	private By validImage= By.xpath("//p[text()='Valid image']/following-sibling::img[@src='/images/Toolsqa.jpg']");
	private By validLink =By.xpath("//a[text()='Click Here for Valid Link']");
	private By brokenLink = By.xpath("//a[text()='Click Here for Broken Link']");
	
	
	public void navigateToBrokenLinksImageMenu() {
		clickElement(brokenLinksImageMenu);
	}
	
	public Boolean isBrokenImageDisplayed() {
			return JSUtils.isImageDisplayed(getElement(brokenImage));
	}
	
	public Boolean isValidImageDisplayed() {
		return JSUtils.isImageDisplayed(getElement(validImage));
	}
	
	public void clickValidLink() {
		clickElement(validLink);
	}
	
	public void clickBrokenLink() {
		clickElement(brokenLink);
	}
	
	public String getPageURL() {
		return getCurrentURL();
	}
	
	

}
