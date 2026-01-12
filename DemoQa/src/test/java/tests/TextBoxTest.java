package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.baseTest.BaseTest;

public class TextBoxTest extends BaseTest {
	
	private String fullName = "John Doe";
	private String email = "john.Doe@example.com";
	private String currentAddress = "123 Main St, Springfield";
	private String permanentAddress = "456 Elm St, Sshelbyville";
	private String PageTitle = "Text Box";

	@Test
	public void navigateToTextBoxForm() {
		homePage.navigateToElementsMenu();
		textBoxPage.navigateToTextBoxForm();
		
		//Assert
		Assert.assertEquals(textBoxPage.getPageTitle(), PageTitle);
	}
	
	
	@Test
	public void fillTextBoxFormTest() {
		homePage.navigateToElementsMenu();
		textBoxPage.navigateToTextBoxForm();
		textBoxPage.fillFullName(fullName);
		textBoxPage.fillEmail(email);
		textBoxPage.fillCurrentAddress(currentAddress);
		textBoxPage.fillPermanentAddress(permanentAddress);
		textBoxPage.clickSubmitButton();
		
		Assert.assertTrue(textBoxPage.actualName().trim().contains(fullName));
		Assert.assertTrue(textBoxPage.actualEmail().trim().contains(email));
		Assert.assertTrue(textBoxPage.actualCurrentAddress().trim().contains(currentAddress));
		Assert.assertTrue(textBoxPage.actualPermanentAddress().trim().contains(permanentAddress));
	}

}
