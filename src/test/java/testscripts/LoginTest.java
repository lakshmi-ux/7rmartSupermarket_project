package testscripts;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends Base{
@Test
	
	public void verifyWhetherUserAbleToLoginUsingValidUsernameAndPassword() {
		String usernameValue= "admin";
		String passwordValue= "admin";
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(usernameValue);
		loginpage.enterPasswordOnPasswordField(passwordValue);
		loginpage.clickOnSignInButton();
		boolean isNavigatedToHomePage= loginpage.verifyHomePageNavigated();
		assertTrue(isNavigatedToHomePage, "Homepage not displayed even username and password is valid");
}
@Test
   public void verifyWhetherUserUnableToLoginWithInvalidUsernameAndValidPassword() {
	    String usernameValue= "adminology";
		String passwordValue= "admin";
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(usernameValue);
		loginpage.enterPasswordOnPasswordField(passwordValue);
		loginpage.clickOnSignInButton();
		boolean isNavigatedToSignInPage= loginpage.verifyHomePageNotNavigated();
		assertTrue(isNavigatedToSignInPage, "User navigated to homepage even username is invalid and password is valid");
   }
@Test
   public void verifyWhetherUserUnableToLoginWithValidUsernameAndInvalidPassword() {
	        String usernameValue= "admin";
	 		String passwordValue= "admin12333";
	 		LoginPage loginpage= new LoginPage(driver);
	 		loginpage.enterUsernameOnUsernameField(usernameValue);
	 		loginpage.enterPasswordOnPasswordField(passwordValue);
	 		loginpage.clickOnSignInButton();
	 		boolean isNavigatedToSignInPage= loginpage.verifyHomePageNotNavigated();
	 		assertTrue(isNavigatedToSignInPage, "User navigated to homepage even password is invalid and username is valid");
	}
@Test
   public void verifyWhetherUserUnableToLoginWithBothInvalidUsernameAndPassword(){
	    String usernameValue= "admin0000";
		String passwordValue= "admin12333";
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(usernameValue);
		loginpage.enterPasswordOnPasswordField(passwordValue);
		loginpage.clickOnSignInButton();
		boolean isNavigatedToSignInPage= loginpage.verifyHomePageNotNavigated();
		assertTrue(isNavigatedToSignInPage, "User navigated to homepage even both username and password is invalid");
	   
   }

}
