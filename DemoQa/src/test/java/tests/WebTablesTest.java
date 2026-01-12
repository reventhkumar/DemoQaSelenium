package tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import tests.baseTest.BaseTest;

public class WebTablesTest extends BaseTest{
	
	private String firstName = "Reventh";
	private String lastName = "Kumar";
	private String email = "Reventh.kumar@test.com";
	private String age = "27";
	private String Salary = "100";
	private String department = "QA";
	private String editDepartment = "Dev";
	private List<String> newRecordExpectedResult = List.of(firstName,lastName,age,email,Salary,department);
	private List<String> editRecordExpectedResult = List.of(firstName,lastName,age,email,Salary,editDepartment);
	
	
	@Test
	public void enterNewRecord() {
		homePage.navigateToElementsMenu();
		webTables.navigateToWebTables();
		webTables.addNewRecord(firstName,lastName,email,age,Salary,department);
		
		//Assertion
		Assert.assertEquals(webTables.getRecordValues(firstName), newRecordExpectedResult);
	}
	
	
	@Test
	public void editExistingRecord() {
		enterNewRecord();
		webTables.editRecord(firstName);
		webTables.setDepartment(editDepartment);
		
		//Assertion
		Assert.assertEquals(webTables.getRecordValues(firstName), editRecordExpectedResult);
	}

}
