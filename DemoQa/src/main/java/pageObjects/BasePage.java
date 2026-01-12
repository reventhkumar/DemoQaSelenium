package pageObjects;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.AutoUtilities;
import utilities.WaitUtils;



public class BasePage {
	
	private WebDriver driver;
	private Actions action;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.action = new Actions(driver);
		new AutoUtilities(driver);
	}

	public WebElement getElement(By locator) {
		WaitUtils.waitForElement(locator);
		return driver.findElement(locator);
	}
	
	public List<WebElement> getElements(By Locator) {
		WaitUtils.waitForElement(Locator);
		List<WebElement> elements = driver.findElements(Locator);
		return elements;
	
	}
	
	public void setElement(By locator, String value) {
		WaitUtils.waitForElementToBeClickable(locator);
		WebElement element = getElement(locator);
		element.clear();
		if(element.getText() != null || element.getText() != "") {
			element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		}
		element.sendKeys(value);
	}
	
	
	public void clickElement(By locator) {
		WaitUtils.waitForElementToBeClickable(locator);
		getElement(locator).click();
	}
	
	public void rightClickElement(By locator) {
//		actions = new Actions(driver);
		action.contextClick(getElement(locator)).perform();;
	}
	
	public void doubleClickElement(By locator) {
		action.doubleClick(getElement(locator)).perform();
	}
	
	public String getCurrentURL() {
//		WaitUtils.implicitWait(2);
		return driver.getCurrentUrl();
	}
	
	public void switchWindow(String currentWindowHandle) {
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		for(String s : allWindowHandles) {
			if(s != currentWindowHandle) {
				driver.switchTo().window(s);
			}
		}
	}
	
	public Boolean isFileDownloaded(String expectedFileName) {
		WaitUtils.fluentWait(null, 0, 0);
			    File dir = new File("./downloads");
			    File[] files = dir.listFiles((f, name) -> name.contains(expectedFileName) && !name.endsWith(".crdownload"));
			    return files != null && files.length > 0 && files[0].length() > 0; // Exists and has size;
	}
}
