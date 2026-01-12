package pageObjects.elementsDemoQa;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BasePage;

public class WebTablesPage extends BasePage{

	public WebTablesPage(WebDriver driver) {
		super(driver);
	}

	private By webTablesMenu = By.xpath("//span[text() ='Web Tables']/..");
	private By addButton = By.id("addNewRecordButton");
	private By firstName = By.id("firstName");
	private By lastName = By.id("lastName");
	private By email = By.id("userEmail");
	private By age = By.id("age");
	private By salary = By.id("salary");
	private By department = By.id("department");
	private By submit = By.id("submit");
	private By searchBox = By.id("#searchBox");
	private By searchButton = By.id("basic-addon2");
	
	
	public void navigateToWebTables() {
		clickElement(webTablesMenu);
	}
	
	public void addNewRecord(String vFirstName,String vLastName,String vEmail,String vAge,String vSalary, String vDepartment) {
		clickElement(addButton);
		setElement(firstName,vFirstName);
		setElement(lastName,vLastName);
		setElement(email,vEmail);
		setElement(age,vAge);
		setElement(salary,vSalary);
		setElement(department,vDepartment);
		clickElement(submit);
	}
	
	public void editRecord(String firstname) {
		clickElement(By.xpath("//div[text() = '"+ firstname +"']/../div/div/span[@title='Edit']"));
	}
	
	public List<String> getRecordValues(String firstName) {
		List<String> values = new ArrayList<>();
		List<WebElement> elements = new ArrayList<>();
		elements = getElements(By.xpath("//div[text()='"+firstName+"']/../div"));
		elements.remove(elements.size()-1);
		for(WebElement s : elements) {
			values.add(s.getText());
		}
		return values;
	}
	

	public String  getFirstName() {
		return getElement(firstName).getText();
	}

	public void setFirstName(String vfirstName) {
		 setElement(firstName,vfirstName);
		 clickElement(submit);
	}

	public String getLastName() {
		return getElement(lastName).getText();
	}

	public void setLastName(String vlastName) {
		 setElement(lastName,vlastName);
		 clickElement(submit);
	}

	public String getEmail() {
		return getElement(email).getText();
	}

	public void setEmail(String vemail) {
		setElement(email,vemail);
		 clickElement(submit);
	}

	public String getAge() {
		return getElement(age).getText();
	}

	public void setAge(String vAge) {
		setElement(age,vAge);
		 clickElement(submit);
	}

	public String getSalary() {
		return getElement(salary).getText();
	}

	public void setSalary(String vSalary) {
		setElement(salary,vSalary);
		 clickElement(submit);
	}

	public String getDepartment() {
		return getElement(department).getText();
	}

	public void setDepartment(String vDepartment) {
		setElement(department,vDepartment);
		 clickElement(submit);
	}

	public void findRecord(String searchValue) {
		setElement(searchBox, searchValue);
		clickElement(searchButton);
	}
	
}
