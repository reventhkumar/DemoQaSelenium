package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import tests.baseTest.BaseTest;

public class RadioButtonTest extends BaseTest{

	@Test
	public void selectYesRadioButton() {
		homePage.navigateToElementsMenu();
		radioButton.navigateToRadioButtonmenu();
		radioButton.selectYesButton();
		
		//Assertion
		Assert.assertEquals(radioButton.getSelectedValue(), "Yes");
	}
	
	@Test
	public void selectImpressiveRadioButton() {
		homePage.navigateToElementsMenu();
		radioButton.navigateToRadioButtonmenu();
		radioButton.selectImpressiveButton();
		
		//Assertion
		Assert.assertEquals(radioButton.getSelectedValue(), "Impressive");
	}
	
	@Test
	public void validateNoRadioButtonIsDisabled() {
		homePage.navigateToElementsMenu();
		radioButton.navigateToRadioButtonmenu();
		
		//Assertion
		Assert.assertFalse(radioButton.isNoRadioButtonEnabled());
	}
}
