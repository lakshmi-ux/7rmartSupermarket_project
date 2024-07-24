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
        loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
        loginpage.verifyHomePageNavigated();
        AdminUsersPage adminuserspage = new AdminUsersPage(driver);
        adminuserspage.verifyAdminUsersNavigated().clickOnSearchButton().enterAdminUsernameOnUsernameField(adminUsername).clickOnSubmitSearchButton();
        boolean isUserFound = adminuserspage.verifySearchedAdminUser();
        assertTrue(isUserFound, "The searched admin user was not found in the search results.");
    }
  
     @Test
    public void verifyWhetherUserAbleToResetTheSearchedElement() {
        String username = "admin";
        String password = "admin";
        String adminUsername = "Ramu";
        LoginPage loginpage= new LoginPage(driver);
        loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
        loginpage.verifyHomePageNavigated();
        AdminUsersPage adminuserspage = new AdminUsersPage(driver);
        adminuserspage.verifyAdminUsersNavigated().clickOnSearchButton().enterAdminUsernameOnUsernameField(adminUsername).clickOnResetButton();
        boolean isResetDone = adminuserspage.verifyUserGotReset();
        assertTrue(isResetDone, "User not able to reset an searched user");        
   }
    
    @Test
    public void verifyWhetherUserAbleToAddANewUser() {
    	String username = "admin";
        String password = "admin";
        String newUser ="Nila";
        String newUserPassword="thara123";
        String dropDownOption="Staff";
        LoginPage loginpage= new LoginPage(driver);
        loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
        loginpage.verifyHomePageNavigated();
        AdminUsersPage adminuserspage = new AdminUsersPage(driver);
        adminuserspage.verifyAdminUsersNavigated().clcikOnNewButton().enterNewAdminUsername(username).enterNewAdminPassword(newUserPassword).selectAnOption(dropDownOption).clcikOnSaveButton();
        boolean isAddingDone = adminuserspage.verifyNewUserGotAdded();
        assertTrue(isAddingDone, "User not able to add a new user");
        boolean isAddingDoneThroughPassword = adminuserspage.verifyNewUserGotAddedThroughPassword();
        assertTrue(isAddingDoneThroughPassword, "User not able to add a new user");
   }
}
