package pageObjects.elementsDemoQa;


import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class CheckBoxPage extends BasePage{
	
	public CheckBoxPage(WebDriver driver) {
		super(driver);
	}

	private By checkBoxMenu = By.xpath("//span[text() ='Check Box']/..");
	
	private By expandHome = By.xpath("//span[text() = 'Home']/../preceding-sibling::button");
	private By selectHome = By.xpath("//span[text() = 'Home']/..");
	
	private By expandDesktop = By.xpath("//span[text() = 'Desktop']/../preceding-sibling::button");
	private By selectDesktop = By.xpath("//span[text() = 'Desktop']/..");
	private By selectNotes = By.xpath("//span[text() = 'Notes']/..");
	private By selectCommands = By.xpath("//span[text() = 'Commands']/..");
	
	private By expandDocuments = By.xpath("//span[text() = 'Documents']/../preceding-sibling::button");
	private By selectDocuments = By.xpath("//span[text() = 'Documents']/..");
	private By selectWorkSpace = By.xpath("//span[text() = 'WorkSpace']/..");
	private By selectOffice = By.xpath("//span[text() = 'Office']/..");
	
	private By expandDownloads = By.xpath("//span[text() = 'Downloads']/../preceding-sibling::button");
	private By selectDownloads = By.xpath("//span[text() = 'Downloads']/..");
	private By selectWorkdFileDocs= By.xpath("//span[text() = 'Word File.doc']/..");
	private By selectExcelFileDocs= By.xpath("//span[text() = 'Excel File.doc']/..");
	
	private By SelectedHomeResult = By.xpath("//div[@id='result']/span[@class='text-success']");
	
	
	 public void navigateToCheckBox(){
		 clickElement(checkBoxMenu);
	 }
	 
	 public void expandHome(){clickElement(expandHome);}
	 public void selectHome(){ clickElement(selectHome);}
	 public void selectDesktop(){clickElement(selectDesktop);}
	 public void expandDesktop(){clickElement(expandDesktop);}
	 public void selectNotes(){clickElement(selectNotes);}
	 public void selectCommands(){clickElement(selectCommands);}
	 public void expandDocuments(){clickElement(expandDocuments);}
	 public void selectDocuments(){clickElement(selectDocuments);}
	 public void selectWorkSpace(){clickElement(selectWorkSpace);}
	 public void selectOffice(){clickElement(selectOffice);}
	 public void expandDownloads(){clickElement(expandDownloads);}
	 public void selectDownloads(){clickElement(selectDownloads);}
	 public void selectWorkdFileDocs(){clickElement(selectWorkdFileDocs);}
	 public void selectExcelFileDocs(){clickElement(selectExcelFileDocs);}
	 
	 //Assert Methods
	 

	public List<String> resulttexts(){
		 List<WebElement> selectionList = getElements(SelectedHomeResult);
		 List<String> selectedCheckBoxes = new ArrayList<>();;
		 for(WebElement element: selectionList) {
			 selectedCheckBoxes.add(element.getText());
		 }
		 return selectedCheckBoxes;
	 }
	 
}
