package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import tests.baseTest.BaseTest;

public class LinksTest extends BaseTest{
	
	private String homeLinkUrl = "https://demoqa.com/";
	
	private String createdLinkResponse = "Link has responded with staus 201 and status text Created";
	private String noContentLinkResponse = "Link has responded with staus 204 and status text No Content";
	private String movedLinkResponse = "Link has responded with staus 301 and status text Moved Permanently";
	private String badRequestLinkResponse = "Link has responded with staus 400 and status text Bad Request";
	private String unAuthorisedLinkResponse = "Link has responded with staus 401 and status text Unauthorized";
	private String ForbiddenLinkResponse = "Link has responded with staus 403 and status text Forbidden";
	private String notFoundLinkResponse = "Link has responded with staus 404 and status text Not Found";

	@Test
	public void clickHome() {
		homePage.navigateToElementsMenu();
		linksPage.navigateToLinksMenu();
		linksPage.clickHomeLink();
		
		//Assertion
		assertEquals(linksPage.getNewWindowURL(), homeLinkUrl);	
	}
	
	@Test
	public void clickDynamicHome() {
		homePage.navigateToElementsMenu();
		linksPage.navigateToLinksMenu();
		linksPage.clickDynamicHomeLink();
		
		//Assertion
		assertEquals(linksPage.getNewWindowURL(), homeLinkUrl);	
	}
	
	@Test
	public void clickCreatedLink() {
		homePage.navigateToElementsMenu();
		linksPage.navigateToLinksMenu();
		linksPage.clickcreatedLink();
		
		//Assertion
		assertEquals(linksPage.statusMessage(), createdLinkResponse);	
	}
	
	@Test
	public void clicknoContentLink() {
		homePage.navigateToElementsMenu();
		linksPage.navigateToLinksMenu();
		linksPage.clicknoContentLink();
		//Assertion
		assertEquals(linksPage.statusMessage(), noContentLinkResponse);	
	}
	
	@Test
	public void clickMovedLink() {
		homePage.navigateToElementsMenu();
		linksPage.navigateToLinksMenu();
		linksPage.clickmovedLink();
		//Assertion
		assertEquals(linksPage.statusMessage(), movedLinkResponse);	
	}
	
	@Test
	public void clickBadRequestLink() {
		homePage.navigateToElementsMenu();
		linksPage.navigateToLinksMenu();
		linksPage.clickBadRequestLink();
		//Assertion
		assertEquals(linksPage.statusMessage(), badRequestLinkResponse);	
	}
	@Test
	public void clickUnauthorisedLink() {
		homePage.navigateToElementsMenu();
		linksPage.navigateToLinksMenu();
		linksPage.clickunauthorizedLink();
		//Assertion
		assertEquals(linksPage.statusMessage(), unAuthorisedLinkResponse);	
	}
	@Test
	public void clickForbiddenLink() {
		homePage.navigateToElementsMenu();
		linksPage.navigateToLinksMenu();
		linksPage.clickforbiddenLink();
		//Assertion
		assertEquals(linksPage.statusMessage(), ForbiddenLinkResponse);	
	}
	@Test
	public void clickNotFoundLink() {
		homePage.navigateToElementsMenu();
		linksPage.navigateToLinksMenu();
		linksPage.clicknotFoundLink();
		//Assertion
		assertEquals(linksPage.statusMessage(), notFoundLinkResponse);	
	}
	
}
