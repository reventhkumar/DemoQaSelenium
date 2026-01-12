package tests;

import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.baseTest.BaseTest;


public class CheckBoxTest extends BaseTest{
	
	
	@Test
	public void selectHomeCheckBox() {
		homePage.navigateToElementsMenu();
		checkBox.navigateToCheckBox();
		checkBox.selectHome();
		
		List<String> ExpectedCheckBoxSelections = List.of("home", "desktop", "notes", "commands", "documents" ,"workspace","react", "angular", "veu", "office"
			,"public", "private", "classified" , "general", "downloads", "wordFile","excelFile" );

		//Assertion
		Assert.assertEquals(checkBox.resulttexts(), ExpectedCheckBoxSelections);
	
	}
	
	@Test
	public void selectDesktopCheckBox() {
		homePage.navigateToElementsMenu();
		checkBox.navigateToCheckBox();
		checkBox.expandHome();
		checkBox.selectDesktop();
		
		List<String> ExpectedCheckBoxSelections = List.of("desktop", "notes", "commands");
		
		//Assertion
		Assert.assertEquals(checkBox.resulttexts(), ExpectedCheckBoxSelections);
	}
	
	@Test
	public void selectDocumentCheckBox() {
		homePage.navigateToElementsMenu();
		checkBox.navigateToCheckBox();
		checkBox.expandHome();
		checkBox.selectDocuments();
		
		List<String> ExpectedCheckBoxSelections = List.of("documents" ,"workspace","react", "angular", "veu", "office"
				,"public", "private", "classified" , "general");
		
		//Assertion
		Assert.assertEquals(checkBox.resulttexts(), ExpectedCheckBoxSelections);
	}
	
	@Test
	public void selectDownloadCheckBox() {
		homePage.navigateToElementsMenu();
		checkBox.navigateToCheckBox();
		checkBox.expandHome();
		checkBox.selectDownloads();

		List<String> ExpectedCheckBoxSelections = List.of("downloads", "wordFile","excelFile");
		
		//Assertion
		Assert.assertEquals(checkBox.resulttexts(), ExpectedCheckBoxSelections);
	}
}
