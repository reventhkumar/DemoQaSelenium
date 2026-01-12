package tests.baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pageObjects.BasePage;
import pageObjects.elementsDemoQa.BrokenLinksImagePage;
import pageObjects.elementsDemoQa.ButtonPage;
import pageObjects.elementsDemoQa.CheckBoxPage;
import pageObjects.elementsDemoQa.HomePage;
import pageObjects.elementsDemoQa.LinksPage;
import pageObjects.elementsDemoQa.RadioButtonPage;
import pageObjects.elementsDemoQa.TextBoxPage;
import pageObjects.elementsDemoQa.WebTablesPage;
import utilities.AutoUtilities;
import utilities.ChromeConfigurations;


public class BaseTest {
	private WebDriver driver;
	private String baseUrl = "https://demoqa.com/";
	protected TextBoxPage textBoxPage;
	protected BasePage basePage;
	protected CheckBoxPage checkBox;
	protected RadioButtonPage radioButton;
	protected AutoUtilities utils;
	protected HomePage homePage;
	protected WebTablesPage webTables;
	protected ButtonPage buttonPage;
	protected LinksPage linksPage;
	protected BrokenLinksImagePage brokenLinksImagePage;

	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver(ChromeConfigurations.setDefaultDownloadLocation());
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void ObjectsInitialization() {
		driver.get(baseUrl);
		basePage = new BasePage(driver);
		homePage = new HomePage(driver);
		textBoxPage = new TextBoxPage(driver);
		checkBox = new CheckBoxPage(driver);
		radioButton = new RadioButtonPage(driver);
		webTables = new WebTablesPage(driver);
		buttonPage = new ButtonPage(driver);
		linksPage = new LinksPage(driver);
		brokenLinksImagePage = new BrokenLinksImagePage(driver);
		
	}
	
	@AfterMethod
	public void resetTest() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	
}
