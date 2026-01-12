package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils extends AutoUtilities {
	
	public WaitUtils(WebDriver driver) {
		super(driver);
	}

	static WebDriverWait implicitWait = new WebDriverWait( driver, Duration.ofSeconds(10));
	static Wait<WebDriver> fulentWait;
	
	public static void waitForElement(By locator) {
		implicitWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void waitForElementToBeClickable(By locator) {
		implicitWait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	public static void fluentWait(WebElement element, int waitInSeconds, int pollinginSecond) {
		fulentWait= new FluentWait<>(driver)
			    .withTimeout(Duration.ofSeconds(waitInSeconds)) // Max wait time: 30 seconds
			    .pollingEvery(Duration.ofSeconds(pollinginSecond)) // Check every 5 seconds
			    .ignoring(NoSuchElementException.class); // Ignore this exception

			fulentWait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
