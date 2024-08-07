package testscripts;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import automation_core.Base;
import constants.Constants;
import constants.Messages;
import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class AdminUsersTest extends Base {
    @Test(groups="sanity")
    public void verifyWhetherUserAbleToFindTheSearchedElementInAdminUsers() {
    	String username=ExcelUtility.readStringData(0, 0, Constants.LOGINPAGE);
		String password=ExcelUtility.readStringData(0, 1, Constants.LOGINPAGE) ;
        String adminUsername = ExcelUtility.readStringData(0, 0, Constants.ADMINUSER_PAGE);
        LoginPage loginpage= new LoginPage(driver);
        loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
        loginpage.isHomePageNavigated();
        AdminUsersPage adminuserspage = new AdminUsersPage(driver);
        adminuserspage.verifyAdminUsersNavigated().clickOnSearchButton().enterAdminUsernameOnUsernameField(adminUsername).clickOnSubmitSearchButton();
        boolean isUserFound = adminuserspage.isSearchedAdminUser();
        assertTrue(isUserFound, Messages.SEARCH_FAIL);
    }
  
     @Test(groups={"smoke","sanity"})
    public void verifyWhetherUserAbleToResetTheSearchedElement() {
    	String username=ExcelUtility.readStringData(0, 0, Constants.LOGINPAGE);
 		String password=ExcelUtility.readStringData(0, 1, Constants.LOGINPAGE) ;
 		 String adminUsername = ExcelUtility.readStringData(0, 1, Constants.ADMINUSER_PAGE);
        LoginPage loginpage= new LoginPage(driver);
        loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
        loginpage.isHomePageNavigated();
        AdminUsersPage adminuserspage = new AdminUsersPage(driver);
        adminuserspage.verifyAdminUsersNavigated().clickOnSearchButton().enterAdminUsernameOnUsernameField(adminUsername).clickOnResetButton();
        boolean isResetDone = adminuserspage.isUserGotReset();
        assertTrue(isResetDone, Messages.RESET_FAIL);        
   }
    
    @Test
    public void verifyWhetherUserAbleToAddANewUser() {
    	String username=ExcelUtility.readStringData(0, 0, Constants.LOGINPAGE);
 		String password=ExcelUtility.readStringData(0, 1, Constants.LOGINPAGE) ;
        String newUser =RandomDataUtility.getNewUserName();
        String newUserPassword=RandomDataUtility.getNewUserPassword();
        LoginPage loginpage= new LoginPage(driver);
        loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
        loginpage.isHomePageNavigated();
        AdminUsersPage adminuserspage = new AdminUsersPage(driver);
        adminuserspage.verifyAdminUsersNavigated().clcikOnNewButton().enterNewAdminUsername(newUser).enterNewAdminPassword(newUserPassword).selectAnOption();
        adminuserspage.clcikOnSaveButton();
        adminuserspage.clickOnSearchButton();
        adminuserspage.enterAdminUsernameOnUsernameField(newUser);
        adminuserspage.clickOnSubmitSearchButton();
        adminuserspage.getTableValue();
        boolean isTableValueCorrect= adminuserspage.isValueDisplayed();
        assertTrue(isTableValueCorrect, Messages.ADD_FAIL);
   }
    
    @Test
    public void verifyUserAbleToFindALockedUser() {
    	String username=ExcelUtility.readStringData(0, 0, Constants.LOGINPAGE);
 		String password=ExcelUtility.readStringData(0, 1, Constants.LOGINPAGE);
 		 String searchUsername = ExcelUtility.readStringData(0, 2, Constants.ADMINUSER_PAGE);
        LoginPage loginpage= new LoginPage(driver);
        loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
        loginpage.isHomePageNavigated();
        AdminUsersPage adminuserspage = new AdminUsersPage(driver);
        adminuserspage.verifyAdminUsersNavigated();
        adminuserspage.clickOnSearchButton();
        adminuserspage.enterAdminUsernameOnUsernameField(searchUsername);
        adminuserspage.clickOnSubmitSearchButton();
        boolean isUserFound = adminuserspage.isSearchedAdminUser();
        assertTrue(isUserFound, Messages.SEARCH_FAIL);
    }
}
