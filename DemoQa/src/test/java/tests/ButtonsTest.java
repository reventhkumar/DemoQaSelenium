package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import tests.baseTest.BaseTest;

public class ButtonsTest extends BaseTest{
	
	private String doublesuccessmessage = "You have done a double click";
	private String rightsuccessmessage = "You have done a right click";
	private String clicksuccessmessage = "You have done a dynamic click";
	
	@Test
	public void doubleClickButton() {
		homePage.navigateToElementsMenu();
		buttonPage.navigateToButtonsMenu();
		buttonPage.doubleClickButton();
		
		//Assertion
		Assert.assertEquals(buttonPage.getDoubleClickMessage(), doublesuccessmessage);
	}
	
	@Test
	public void rightClickButton() {
		homePage.navigateToElementsMenu();
		buttonPage.navigateToButtonsMenu();
		buttonPage.rightClickButton();
		
		//Assertion
		Assert.assertEquals(buttonPage.getrightClickMessage(), rightsuccessmessage);
	}
	
	@Test
	public void ClickButton() {
		homePage.navigateToElementsMenu();
		buttonPage.navigateToButtonsMenu();
		buttonPage.clickButton();
		
		//Assertion
		Assert.assertEquals(buttonPage.getClickMessage(), clicksuccessmessage);
	}

}
