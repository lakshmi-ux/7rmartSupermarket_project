package testscripts;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import pages.AdminUsersPage;
import pages.LoginPage;

public class AdminUsersTest extends Base {
    @Test
    public void verifyWhetherUserAbleToFindTheSearchedElementInAdminUsers() {
        String username = "admin";
        String password = "admin";
        String adminUsername = "AldoAdmin";
        LoginPage loginpage= new LoginPage(driver);
        loginpage.enterUsernameOnUsernameField(username);
        loginpage.enterPasswordOnPasswordField(password);
        loginpage.clickOnSignInButton();
        loginpage.verifyHomePageNavigated();
        AdminUsersPage adminuserspage = new AdminUsersPage(driver);
        adminuserspage.verifyAdminUsersNavigated();
        adminuserspage.clickOnSearchButton();
        adminuserspage.enterAdminUsernameOnUsernameField(adminUsername);
        adminuserspage.clickOnSubmitSearchButton();
        boolean isUserFound = adminuserspage.verifySearchedAdminUser();
        assertTrue(isUserFound, "The searched admin user was not found in the search results.");
    }
   /* @Test
    public void verifyWhetherUserAbleToFindTheSearchedElementInManagePages() {
    	String username = "admin";
        String password = "admin";
        String titleName ="muhsina";
        SearchPage searchpage = new SearchPage(driver);
        searchpage.enterUsernameOnUsernameField(username);
        searchpage.enterPasswordOnPasswordField(password);
        searchpage.clickSignInButton();
        boolean isNavigatedToHomePage = searchpage.verifyHomePageNavigated();
        assertTrue(isNavigatedToHomePage, "User is not navigated to the Home Page after sign in.");
        searchpage.verifyManagePagesNavigated();
        searchpage.clickOnManageSearchButton();
        searchpage.enterTitleOnTitleField(titleName);
        searchpage.clickOnManageSubmitSearchButton();
    	boolean isTieleFound= searchpage.verifySearchedTitle();
    	assertTrue(isTieleFound, "The searched title not found in the searched results");
    }*/
    
    @Test
    public void verifyWhetherUserAbleToResetTheSearchedElement() {
        String username = "admin";
        String password = "admin";
        String adminUsername = "Ramu";
        LoginPage loginpage= new LoginPage(driver);
        loginpage.enterUsernameOnUsernameField(username);
        loginpage.enterPasswordOnPasswordField(password);
        loginpage.clickOnSignInButton();
        loginpage.verifyHomePageNavigated();
        AdminUsersPage adminuserspage = new AdminUsersPage(driver);
        adminuserspage.verifyAdminUsersNavigated();
        adminuserspage.clickOnSearchButton();
        adminuserspage.enterAdminUsernameOnUsernameField(adminUsername);
        adminuserspage.clickOnResetButton();
        boolean isResetDone = adminuserspage.verifyUserGotReset();
        assertTrue(isResetDone, "User not able to reset an searched user");        
   }
    
    @Test
    public void verifyWhetherUserAbleToAddANewUser() {
    	String username = "admin";
        String password = "admin";
        String newUser ="Nila";
        String newUserPassword="thara123";
        LoginPage loginpage= new LoginPage(driver);
        loginpage.enterUsernameOnUsernameField(username);
        loginpage.enterPasswordOnPasswordField(password);
        loginpage.clickOnSignInButton();
        loginpage.verifyHomePageNavigated();
        AdminUsersPage adminuserspage = new AdminUsersPage(driver);
        adminuserspage.verifyAdminUsersNavigated();
        adminuserspage.clcikOnNewButton();
        adminuserspage.enterNewAdminUsername(newUser);
        adminuserspage.enterNewAdminPassword(newUserPassword);
        adminuserspage.clcikOnSaveButton();
       boolean isAddingDone = adminuserspage.verifyNewUserGotAdded();
       assertTrue(isAddingDone, "User not able to add a new user");
       boolean isAddingDoneThroughPassword = adminuserspage.verifyNewUserGotAddedThroughPassword();
       assertTrue(isAddingDoneThroughPassword, "User not able to add a new user");
   }
}
