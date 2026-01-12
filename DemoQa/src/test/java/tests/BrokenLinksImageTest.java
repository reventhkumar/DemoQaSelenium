package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import tests.baseTest.BaseTest;

public class BrokenLinksImageTest extends BaseTest{
	
	private String validLink = "https://demoqa.com/";
	private String inValidLink = "https://the-internet.herokuapp.com/status_codes/500";
	
	@Test
	public void isImageValid() {
		homePage.navigateToElementsMenu();
		brokenLinksImagePage.navigateToBrokenLinksImageMenu();
		brokenLinksImagePage.isValidImageDisplayed();
		
		//Assertion
		Assert.assertTrue(brokenLinksImagePage.isValidImageDisplayed());
		
	}
	
	@Test
	public void isImageInValid() {
		homePage.navigateToElementsMenu();
		brokenLinksImagePage.navigateToBrokenLinksImageMenu();
		brokenLinksImagePage.isBrokenImageDisplayed();
		
		//Assertion
		Assert.assertFalse(brokenLinksImagePage.isBrokenImageDisplayed());
	}
	
	@Test
	public void isValidLinkDisplayed() {
		homePage.navigateToElementsMenu();
		brokenLinksImagePage.navigateToBrokenLinksImageMenu();
		brokenLinksImagePage.clickValidLink();
		
		//Assertion
		Assert.assertEquals(brokenLinksImagePage.getPageURL(),validLink);
		
	}
	
	@Test
	public void isInValidLinkDisplayed() {
		homePage.navigateToElementsMenu();
		brokenLinksImagePage.navigateToBrokenLinksImageMenu();
		brokenLinksImagePage.clickBrokenLink();
		
		//Assertion
		Assert.assertEquals(brokenLinksImagePage.getPageURL(),inValidLink);
		
	}

}
