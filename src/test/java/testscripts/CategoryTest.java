package testscripts;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import automation_core.Base;
import constants.Constants;
import constants.Messages;
import pages.CategoryPages;
import pages.LoginPage;
import utilities.ExcelUtility;

public class CategoryTest extends Base{
	@Test
	public void verifyUserAbleToSearchAnInactiveList() {
		String username=ExcelUtility.readStringData(0, 0, Constants.LOGINPAGE);
		String password=ExcelUtility.readStringData(0, 1, Constants.LOGINPAGE) ;
		String category=ExcelUtility.readStringData(0, 0, Constants.CATEGORY_FIELD);
		LoginPage loginpage= new LoginPage(driver);
	    loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
	    loginpage.isHomePageNavigated();
	    CategoryPages categorypages= new CategoryPages(driver);
	    categorypages.verifyPageNavigation();
	    categorypages.verifyClickSearchButton();
	    categorypages.verifyCategoryField(category);
	    categorypages.verifyClickSubmitButton();
	    boolean isTitleFound= categorypages.isRowDisplayed();
	    assertTrue(isTitleFound, Messages.INACTIVE_LIST_NOTFOUND);
	}
	
	@Test
	public void verifyUserAbleToSelectARow() {
		String username=ExcelUtility.readStringData(0, 0, Constants.LOGINPAGE);
		String password=ExcelUtility.readStringData(0, 1, Constants.LOGINPAGE);
		LoginPage loginpage= new LoginPage(driver);
	    loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
	    loginpage.isHomePageNavigated();
	    CategoryPages categorypages= new CategoryPages(driver);
	    categorypages.verifyPageNavigation();
	    categorypages.verifyRowSelected();
	    boolean isTitleFound= categorypages.isRowDisplayed();
	    assertTrue(isTitleFound, Messages.ROW_NOT_DISPLAYED);
}
}


















