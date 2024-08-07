/*package testscripts;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import automation_core.Base;
import constants.Constants;
import constants.Messages;
import pages.LoginPage;
import pages.ManagePagesPage;
import utilities.ExcelUtility;

public class ManagePagesTest extends Base {
	@Test
	public void verifyUserAbleToFindARow() {
		String username=ExcelUtility.readStringData(0, 0, Constants.LOGINPAGE);
		String password=ExcelUtility.readStringData(0, 1, Constants.LOGINPAGE) ;
		LoginPage loginpage= new LoginPage(driver);
	    loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
	    loginpage.isHomePageNavigated();
	    ManagePagesPage managepagespage = new ManagePagesPage(driver);
	    managepagespage.verifyPageNavigation();
	    managepagespage.verifyRowSelected();
	    boolean isRowThere= managepagespage.isRowDisplayed();
	    assertTrue(isRowThere, Messages.ROW_NOT_DISPLAYED);
	}
	
	@Test
	public void verifyUserNotAbleToAddAnExistingUser() {
		String username=ExcelUtility.readStringData(0, 0, Constants.LOGINPAGE);
		String password=ExcelUtility.readStringData(0, 1, Constants.LOGINPAGE) ;
		String enterTitleField=ExcelUtility.readStringData(0, 0, Constants.MANAGE_FIELD);
		String pageTitleField=ExcelUtility.readStringData(0, 1, Constants.MANAGE_FIELD);
		LoginPage loginpage= new LoginPage(driver);
	    loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
	    loginpage.isHomePageNavigated();
	    ManagePagesPage managepagespage = new ManagePagesPage(driver);
	    managepagespage.verifyPageNavigation();
	    managepagespage.verifyNewButton();
	    managepagespage.verifyTitle(enterTitleField);
	    managepagespage.verifyGetEnterTitle();
	    managepagespage.verifyPageTitle(pageTitleField);
	    managepagespage.verifyGetPageTitle();
	    managepagespage.verifySaveButton();
	   // managepagespage.getAlert(driver);
	 boolean isAlertBoxDisplayed = managepagespage.isAlertDisplayed();
	   assertTrue(isAlertBoxDisplayed, Messages.DELETE_FAILED);
		
	}*/
	
	
	/*@Test
	public void verifyUserNotAbleToDeleteARowByClickingCancelAlert() {
		String username=ExcelUtility.readStringData(0, 0, Constants.LOGINPAGE);
		String password=ExcelUtility.readStringData(0, 1, Constants.LOGINPAGE) ;
		String titleField=ExcelUtility.readStringData(0, 0, Constants.MANAGE_FIELD);
		LoginPage loginpage= new LoginPage(driver);
	    loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
	    loginpage.isHomePageNavigated();
	    ManagePagesPage managepagespage = new ManagePagesPage(driver);
	    managepagespage.verifyPageNavigation();
	    managepagespage.isSearchedRowDisplayed();
	    managepagespage.verifyDeleteButton();
	    managepagespage.verifyGetAlert();
	    managepagespage.verifyDismissAlert();
	    managepagespage.verifySearchRow();
	    managepagespage.verifyRowField(titleField);
	    managepagespage.verifyTitleField();
	    managepagespage.verifySearchSubmit();
	    boolean isTitleDisplayed= managepagespage.isRowDisplayed();
	    assertTrue(isTitleDisplayed, Messages.DELETE_FAILED);
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Test
	public void UserAbleToEditARow() {
		String username=ExcelUtility.readStringData(0, 0, Constants.LOGINPAGE);
		String password=ExcelUtility.readStringData(0, 1, Constants.LOGINPAGE) ;
		//String editField=ExcelUtility.readStringData(0, 0, Constants.MANAGE_FIELD);
		//String pageField=ExcelUtility.readStringData(0, 1, Constants.MANAGE_FIELD);
		String editField="preethi";
		String pageField="7maart";
		LoginPage loginpage= new LoginPage(driver);
	    loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
	    loginpage.isHomePageNavigated();
	    ManagePagesPage managepagespage = new ManagePagesPage(driver);
	    managepagespage.verifyPageNavigation();
	    managepagespage.verifyEditRowSelected();
	    managepagespage.verifyEditButton();
	    managepagespage.verifyEditedTitleField(editField);
	    managepagespage.verifyGetTitleField();
	    managepagespage.verifyPageField(pageField);
	    managepagespage.verifyGetPageField();
	    managepagespage.verifyUpdateButton();
	    managepagespage.verifySearchRow();
	    managepagespage.verifyEditTitleField(editField);
	    managepagespage.verifyGetEditedTitleField();
	    managepagespage.verifySearchSubmit();
	    boolean isEditedTitleVanished= managepagespage.isEditedRowDisplayed();
	    assertTrue(isEditedTitleVanished, Messages.EDIT_FAILED);
	    
	}*/

//}
