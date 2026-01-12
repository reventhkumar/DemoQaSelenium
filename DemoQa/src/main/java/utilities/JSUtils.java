package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSUtils extends AutoUtilities {
	
	
	public JSUtils(WebDriver driver) {
		super(driver);
	}

	static String jsScriptScrollIntoView = "arguments[0].scrollIntoView(true);";
	static String jsScriptClick= "arguments[0].click();";

	public static void scrollToElementJS (By locator) {
		WaitUtils.waitForElement(locator);
		((JavascriptExecutor)driver).executeScript(jsScriptScrollIntoView,AutoUtilities.driver.findElement(locator));;
	}
	
	public static void clickElementJS (By locator) {
		WaitUtils.waitForElementToBeClickable(locator);
		((JavascriptExecutor) AutoUtilities.driver).executeScript(jsScriptClick,AutoUtilities.driver.findElement(locator));
	}
	
	public static Boolean isImageDisplayed(WebElement image) {
		Boolean imageLoaded = (Boolean) ((JavascriptExecutor) driver).executeScript(
			    "return arguments[0].complete && typeof arguments[0].naturalWidth != 'undefined' && arguments[0].naturalWidth > 0", 
			    image
			);
		return imageLoaded;
	}
}
